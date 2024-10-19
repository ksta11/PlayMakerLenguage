# Generated from Lenguaje.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .LenguajeParser import LenguajeParser
else:
    from LenguajeParser import LenguajeParser

# This class defines a complete listener for a parse tree produced by LenguajeParser.
class LenguajeListener(ParseTreeListener):

    # Enter a parse tree produced by LenguajeParser#root.
    def enterRoot(self, ctx:LenguajeParser.RootContext):
        pass

    # Exit a parse tree produced by LenguajeParser#root.
    def exitRoot(self, ctx:LenguajeParser.RootContext):
        pass


    # Enter a parse tree produced by LenguajeParser#inss.
    def enterInss(self, ctx:LenguajeParser.InssContext):
        pass

    # Exit a parse tree produced by LenguajeParser#inss.
    def exitInss(self, ctx:LenguajeParser.InssContext):
        pass


    # Enter a parse tree produced by LenguajeParser#ins.
    def enterIns(self, ctx:LenguajeParser.InsContext):
        pass

    # Exit a parse tree produced by LenguajeParser#ins.
    def exitIns(self, ctx:LenguajeParser.InsContext):
        pass


    # Enter a parse tree produced by LenguajeParser#input_.
    def enterInput_(self, ctx:LenguajeParser.Input_Context):
        pass

    # Exit a parse tree produced by LenguajeParser#input_.
    def exitInput_(self, ctx:LenguajeParser.Input_Context):
        pass


    # Enter a parse tree produced by LenguajeParser#output_.
    def enterOutput_(self, ctx:LenguajeParser.Output_Context):
        pass

    # Exit a parse tree produced by LenguajeParser#output_.
    def exitOutput_(self, ctx:LenguajeParser.Output_Context):
        pass


    # Enter a parse tree produced by LenguajeParser#condition.
    def enterCondition(self, ctx:LenguajeParser.ConditionContext):
        pass

    # Exit a parse tree produced by LenguajeParser#condition.
    def exitCondition(self, ctx:LenguajeParser.ConditionContext):
        pass


    # Enter a parse tree produced by LenguajeParser#while_.
    def enterWhile_(self, ctx:LenguajeParser.While_Context):
        pass

    # Exit a parse tree produced by LenguajeParser#while_.
    def exitWhile_(self, ctx:LenguajeParser.While_Context):
        pass


    # Enter a parse tree produced by LenguajeParser#siz.
    def enterSiz(self, ctx:LenguajeParser.SizContext):
        pass

    # Exit a parse tree produced by LenguajeParser#siz.
    def exitSiz(self, ctx:LenguajeParser.SizContext):
        pass


    # Enter a parse tree produced by LenguajeParser#procDef.
    def enterProcDef(self, ctx:LenguajeParser.ProcDefContext):
        pass

    # Exit a parse tree produced by LenguajeParser#procDef.
    def exitProcDef(self, ctx:LenguajeParser.ProcDefContext):
        pass


    # Enter a parse tree produced by LenguajeParser#proc.
    def enterProc(self, ctx:LenguajeParser.ProcContext):
        pass

    # Exit a parse tree produced by LenguajeParser#proc.
    def exitProc(self, ctx:LenguajeParser.ProcContext):
        pass


    # Enter a parse tree produced by LenguajeParser#assign.
    def enterAssign(self, ctx:LenguajeParser.AssignContext):
        pass

    # Exit a parse tree produced by LenguajeParser#assign.
    def exitAssign(self, ctx:LenguajeParser.AssignContext):
        pass


    # Enter a parse tree produced by LenguajeParser#paramsId.
    def enterParamsId(self, ctx:LenguajeParser.ParamsIdContext):
        pass

    # Exit a parse tree produced by LenguajeParser#paramsId.
    def exitParamsId(self, ctx:LenguajeParser.ParamsIdContext):
        pass


    # Enter a parse tree produced by LenguajeParser#paramsExpr.
    def enterParamsExpr(self, ctx:LenguajeParser.ParamsExprContext):
        pass

    # Exit a parse tree produced by LenguajeParser#paramsExpr.
    def exitParamsExpr(self, ctx:LenguajeParser.ParamsExprContext):
        pass


    # Enter a parse tree produced by LenguajeParser#consult.
    def enterConsult(self, ctx:LenguajeParser.ConsultContext):
        pass

    # Exit a parse tree produced by LenguajeParser#consult.
    def exitConsult(self, ctx:LenguajeParser.ConsultContext):
        pass


    # Enter a parse tree produced by LenguajeParser#agregado.
    def enterAgregado(self, ctx:LenguajeParser.AgregadoContext):
        pass

    # Exit a parse tree produced by LenguajeParser#agregado.
    def exitAgregado(self, ctx:LenguajeParser.AgregadoContext):
        pass


    # Enter a parse tree produced by LenguajeParser#lista.
    def enterLista(self, ctx:LenguajeParser.ListaContext):
        pass

    # Exit a parse tree produced by LenguajeParser#lista.
    def exitLista(self, ctx:LenguajeParser.ListaContext):
        pass


    # Enter a parse tree produced by LenguajeParser#Mod.
    def enterMod(self, ctx:LenguajeParser.ModContext):
        pass

    # Exit a parse tree produced by LenguajeParser#Mod.
    def exitMod(self, ctx:LenguajeParser.ModContext):
        pass


    # Enter a parse tree produced by LenguajeParser#Tactic.
    def enterTactic(self, ctx:LenguajeParser.TacticContext):
        pass

    # Exit a parse tree produced by LenguajeParser#Tactic.
    def exitTactic(self, ctx:LenguajeParser.TacticContext):
        pass


    # Enter a parse tree produced by LenguajeParser#Mul.
    def enterMul(self, ctx:LenguajeParser.MulContext):
        pass

    # Exit a parse tree produced by LenguajeParser#Mul.
    def exitMul(self, ctx:LenguajeParser.MulContext):
        pass


    # Enter a parse tree produced by LenguajeParser#Var.
    def enterVar(self, ctx:LenguajeParser.VarContext):
        pass

    # Exit a parse tree produced by LenguajeParser#Var.
    def exitVar(self, ctx:LenguajeParser.VarContext):
        pass


    # Enter a parse tree produced by LenguajeParser#Parens.
    def enterParens(self, ctx:LenguajeParser.ParensContext):
        pass

    # Exit a parse tree produced by LenguajeParser#Parens.
    def exitParens(self, ctx:LenguajeParser.ParensContext):
        pass


    # Enter a parse tree produced by LenguajeParser#Num.
    def enterNum(self, ctx:LenguajeParser.NumContext):
        pass

    # Exit a parse tree produced by LenguajeParser#Num.
    def exitNum(self, ctx:LenguajeParser.NumContext):
        pass


    # Enter a parse tree produced by LenguajeParser#sz.
    def enterSz(self, ctx:LenguajeParser.SzContext):
        pass

    # Exit a parse tree produced by LenguajeParser#sz.
    def exitSz(self, ctx:LenguajeParser.SzContext):
        pass


    # Enter a parse tree produced by LenguajeParser#Lt.
    def enterLt(self, ctx:LenguajeParser.LtContext):
        pass

    # Exit a parse tree produced by LenguajeParser#Lt.
    def exitLt(self, ctx:LenguajeParser.LtContext):
        pass


    # Enter a parse tree produced by LenguajeParser#Sum.
    def enterSum(self, ctx:LenguajeParser.SumContext):
        pass

    # Exit a parse tree produced by LenguajeParser#Sum.
    def exitSum(self, ctx:LenguajeParser.SumContext):
        pass


    # Enter a parse tree produced by LenguajeParser#String.
    def enterString(self, ctx:LenguajeParser.StringContext):
        pass

    # Exit a parse tree produced by LenguajeParser#String.
    def exitString(self, ctx:LenguajeParser.StringContext):
        pass


    # Enter a parse tree produced by LenguajeParser#lst.
    def enterLst(self, ctx:LenguajeParser.LstContext):
        pass

    # Exit a parse tree produced by LenguajeParser#lst.
    def exitLst(self, ctx:LenguajeParser.LstContext):
        pass


    # Enter a parse tree produced by LenguajeParser#Eq.
    def enterEq(self, ctx:LenguajeParser.EqContext):
        pass

    # Exit a parse tree produced by LenguajeParser#Eq.
    def exitEq(self, ctx:LenguajeParser.EqContext):
        pass


    # Enter a parse tree produced by LenguajeParser#Gt.
    def enterGt(self, ctx:LenguajeParser.GtContext):
        pass

    # Exit a parse tree produced by LenguajeParser#Gt.
    def exitGt(self, ctx:LenguajeParser.GtContext):
        pass


    # Enter a parse tree produced by LenguajeParser#Div.
    def enterDiv(self, ctx:LenguajeParser.DivContext):
        pass

    # Exit a parse tree produced by LenguajeParser#Div.
    def exitDiv(self, ctx:LenguajeParser.DivContext):
        pass


    # Enter a parse tree produced by LenguajeParser#Min.
    def enterMin(self, ctx:LenguajeParser.MinContext):
        pass

    # Exit a parse tree produced by LenguajeParser#Min.
    def exitMin(self, ctx:LenguajeParser.MinContext):
        pass


    # Enter a parse tree produced by LenguajeParser#consul.
    def enterConsul(self, ctx:LenguajeParser.ConsulContext):
        pass

    # Exit a parse tree produced by LenguajeParser#consul.
    def exitConsul(self, ctx:LenguajeParser.ConsulContext):
        pass


    # Enter a parse tree produced by LenguajeParser#Get.
    def enterGet(self, ctx:LenguajeParser.GetContext):
        pass

    # Exit a parse tree produced by LenguajeParser#Get.
    def exitGet(self, ctx:LenguajeParser.GetContext):
        pass


    # Enter a parse tree produced by LenguajeParser#Let.
    def enterLet(self, ctx:LenguajeParser.LetContext):
        pass

    # Exit a parse tree produced by LenguajeParser#Let.
    def exitLet(self, ctx:LenguajeParser.LetContext):
        pass


    # Enter a parse tree produced by LenguajeParser#Neq.
    def enterNeq(self, ctx:LenguajeParser.NeqContext):
        pass

    # Exit a parse tree produced by LenguajeParser#Neq.
    def exitNeq(self, ctx:LenguajeParser.NeqContext):
        pass



del LenguajeParser