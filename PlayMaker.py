import sys
from antlr4 import *
from ANTLR4.LenguageLexer import LenguageLexer
from ANTLR4.LenguageParser import LenguageParser
from ANTLR4.LenguageVisitor import LenguageVisitor

class EvalVisitor(LenguageVisitor):

    def __init__(self):
        super().__init__()
        self.variables = {}  # Diccionario para almacenar variables
        self.procedures = {}  # Diccionario para procedimientos

    # Visit a parse tree produced by LenguageParser#root.
    def visitRoot(self, ctx: LenguageParser.RootContext):
        return self.visitChildren(ctx)
    

    # Visit a parse tree produced by LenguageParser#assign.
    def visitAssign(self, ctx: LenguageParser.AssignContext):
        var_name = ctx.VAR().getText()
        value = self.visit(ctx.expr())
        self.variables[var_name] = value
        return value

    # Visit a parse tree produced by LenguageParser#input_.
    def visitInput_(self, ctx: LenguageParser.Input_Context):
        var_name = ctx.VAR().getText()
        value = input(f"Input value for {var_name}: ")
        self.variables[var_name] = value
        return value

    # Visit a parse tree produced by LenguageParser#output_.
    def visitOutput_(self, ctx: LenguageParser.Output_Context):
        results = [self.visit(expr) for expr in ctx.expr()]
        print("Output:", *results)
        return results

    # Visit a parse tree produced by LenguageParser#condition.
    def visitCondition(self, ctx: LenguageParser.ConditionContext):
        condition_result = self.visit(ctx.expr())
        if not isinstance(condition_result, bool):
            raise CondicionalError("Error: La condición debe ser booleana")

        if condition_result:
            self.visit(ctx.inss(0))
        elif ctx.ELSE():
            self.visit(ctx.inss(1))

    # Visit a parse tree produced by LenguageParser#while_.
    def visitWhile_(self, ctx: LenguageParser.While_Context):
        condition_result = self.visit(ctx.expr())
        if not isinstance(condition_result, bool):
            raise IteracionError("Error: La condición del bucle debe ser booleana")
        
        while condition_result:
            self.visit(ctx.inss())
            condition_result = self.visit(ctx.expr())
            
    # Visit a parse tree produced by LenguageParser#expr (Sum).
    def visitSum(self, ctx: LenguageParser.SumContext):
        left = self.visit(ctx.expr(0))
        right = self.visit(ctx.expr(1))
        return left + right

    # Visit a parse tree produced by LenguageParser#expr (Min).
    def visitMin(self, ctx: LenguageParser.MinContext):
        left = self.visit(ctx.expr(0))
        right = self.visit(ctx.expr(1))
        return left - right

    # Visit a parse tree produced by LenguageParser#expr (Eq).
    def visitEq(self, ctx: LenguageParser.EqContext):
        left = self.visit(ctx.expr(0))
        right = self.visit(ctx.expr(1))
        return left == right

    # Visit a parse tree produced by LenguageParser#expr (Neq).
    def visitNeq(self, ctx: LenguageParser.NeqContext):
        left = self.visit(ctx.expr(0))
        right = self.visit(ctx.expr(1))
        return left != right

    def visitTactics(self, ctx: LenguageParser.TacticsContext):
        play = []
        previous = None

        name = ctx.tacticName().getText()
        # Suponiendo que tienes una lista de posiciones que el usuario ingresó separadas por comas
        for position in ctx.position():  # Asegúrate de que estás accediendo a la lista de posiciones
            if previous is not None:
                move = (previous, position.getText())
                play.append(move)  # Agrega la jugada
            previous = position.getText()
        print(name, play)

    # Visit a parse tree produced by LenguageParser#proc.
    def visitProc(self, ctx: LenguageParser.ProcContext):
        proc_name = ctx.PROCNAME().getText()
        if proc_name not in self.procedures:
            raise ProcedimientoNoDefinidoError(f"Error: Procedimiento '{proc_name}' no definido")
        
        args = [self.visit(e) for e in ctx.paramsExpr().expr()]
        params, inss = self.procedures[proc_name]
        if len(args) != len(params):
            raise NumeroParametrosIncorrectoError(f"Error: Número de parámetros incorrecto para '{proc_name}'")

        old_vars = self.variables.copy()
        for param, arg in zip(params, args):
            self.variables[param] = arg

        for ins in inss:
            self.visit(ins)

        self.variables = old_vars

    # Visit a parse tree produced by LenguageParser#num.
    def visitNum(self, ctx: LenguageParser.NumContext):
        value = int(ctx.NUM().getText())
        return value

    # Visit a parse tree produced by LenguageParser#float.
    def visitFloat(self, ctx: LenguageParser.FloatContext):
        return float(ctx.FLOAT().getText())

    # Visit a parse tree produced by LenguageParser#var.
    def visitVar(self, ctx: LenguageParser.VarContext):
        var_name = ctx.getText()
        return self.variables.get(var_name, 0)

    # Visit a parse tree produced by LenguageParser#div.
    def visitDiv(self, ctx: LenguageParser.DivContext):
        left = self.visit(ctx.expr(0))
        right = self.visit(ctx.expr(1))
        if right == 0:
            raise DivisionPorCeroError("Error: División por cero no permitida")
        return left / right

    # Visit a parse tree produced by LenguageParser#mul.
    def visitMul(self, ctx:LenguageParser.MulContext):
        left = self.visit(ctx.expr(0))
        right = self.visit(ctx.expr(1))
        if not isinstance(left, (int, float)) or not isinstance(right, (int, float)):
            raise OperacionAritmeticaError("Error: Operación aritmética solo permitida con números")
        return left * right

    def visitIns(self, ctx: LenguageParser.InsContext):
        return self.visitChildren(ctx)

    def visitParamsId(self, ctx: LenguageParser.ParamsIdContext):
        return [param.getText() for param in ctx.VAR()]

    def visitParamsExpr(self, ctx: LenguageParser.ParamsExprContext):
        return [self.visit(expr) for expr in ctx.expr()]

    def visitConsult(self, ctx: LenguageParser.ConsultContext):
        var_name = ctx.VAR().getText()
        
        # Verificamos que la variable sea una lista
        if var_name not in self.variables or not isinstance(self.variables[var_name], list):
            raise Exception(f"La variable '{var_name}' no es una lista o no está definida.")

        # Evaluamos el índice usando la expresión interna
        index = self.visit(ctx.expr())

        if not isinstance(index, int):
            raise Exception(f"El índice '{index}' no es un entero.")

        lista = self.variables[var_name]

        # Controlamos que el índice esté dentro de los límites de la lista
        if index < 0 or index >= len(lista):
            raise IndexError(f"Índice fuera de rango: {index}")

        return lista[index]

    def visitConsul(self, ctx: LenguageParser.ExprContext):
        return self.visitConsult(ctx.consult())

    def visitAdd(self, ctx: LenguageParser.AddContext):
        lista = self.variables[ctx.VAR().getText()]
        elemento = self.visit(ctx.expr())
        lista.append(elemento)
        return lista

    def visitLista(self, ctx: LenguageParser.ListaContext):
        return [self.visit(expr) for expr in ctx.expr()]

    def visitLst(self, ctx: LenguageParser.LstContext):
        return self.visit(ctx.lista())
    
    def visitSiz(self, ctx: LenguageParser.SizContext):
        variable = ctx.VAR().getText()
        return len(self.variables.get(variable, []))

    def visitSz(self, ctx: LenguageParser.SzContext):
        return self.visit(ctx.siz())

    def visitMod(self, ctx: LenguageParser.ModContext):
        return self.visit(ctx.expr(0)) % self.visit(ctx.expr(1))

    def visitLt(self, ctx: LenguageParser.LtContext):
        left = self.visit(ctx.expr(0))
        right = self.visit(ctx.expr(1))
        if not isinstance(left, (int, float)) or not isinstance(right, (int, float)):
            raise OperacionRelacionalError("Error: Operación relacional solo permitida con números")
        return left < right

    def visitGt(self, ctx: LenguageParser.GtContext):
        left = self.visit(ctx.expr(0))
        right = self.visit(ctx.expr(1))
        if not isinstance(left, (int, float)) or not isinstance(right, (int, float)):
            raise OperacionRelacionalError("Error: Operación relacional solo permitida con números")
        return left > right

    def visitLet(self, ctx: LenguageParser.LetContext):
        left = self.visit(ctx.expr(0))
        right = self.visit(ctx.expr(1))
        if not isinstance(left, (int, float)) or not isinstance(right, (int, float)):
            raise OperacionRelacionalError("Error: Operación relacional solo permitida con números")
        return left <= right

    def visitGet(self, ctx: LenguageParser.GetContext):
        left = self.visit(ctx.expr(0))
        right = self.visit(ctx.expr(1))
        if not isinstance(left, (int, float)) or not isinstance(right, (int, float)):
            raise OperacionRelacionalError("Error: Operación relacional solo permitida con números")
        return left >= right

    def visitParens(self, ctx: LenguageParser.ParensContext):
        return self.visit(ctx.expr())

    def visitString(self, ctx: LenguageParser.StringContext):
        return ctx.STRING().getText().strip('"')


class DivisionPorCeroError(Exception):
    pass

class ProcedimientoNoDefinidoError(Exception):
    pass

class NumeroParametrosIncorrectoError(Exception):
    pass

class OperacionAritmeticaError(Exception):
    pass

class OperacionRelacionalError(Exception):
    pass

class CondicionalError(Exception):
    pass

class IteracionError(Exception):
    pass

# Función principal para evaluar el archivo de entrada
def main():
    try:
        input_stream = InputStream(input("Ingrese una expresión: "))
        lexer = LenguageLexer(input_stream)
        stream = CommonTokenStream(lexer)
        parser = LenguageParser(stream)
        tree = parser.root()

        print(f"Árbol de análisis: {tree.toStringTree(recog=parser)}")

        visitor = EvalVisitor()
        visitor.visit(tree)


    except DivisionPorCeroError as e:
        print(e)
    except ProcedimientoNoDefinidoError as e:
        print(e)
    except NumeroParametrosIncorrectoError as e:
        print(e)
    except OperacionAritmeticaError as e:
        print(e)
    except OperacionRelacionalError as e:
        print(e)
    except CondicionalError as e:
        print(e)
    except IteracionError as e:
        print(e)
    except Exception as e:
        print("Error inesperado:", e)

if __name__ == '__main__':
    main()