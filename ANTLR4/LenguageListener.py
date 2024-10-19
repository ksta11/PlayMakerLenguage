# Generated from Lenguage.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .LenguageParser import LenguageParser
else:
    from LenguageParser import LenguageParser

# This class defines a complete listener for a parse tree produced by LenguageParser.
class LenguageListener(ParseTreeListener):

    # Enter a parse tree produced by LenguageParser#root.
    def enterRoot(self, ctx:LenguageParser.RootContext):
        pass

    # Exit a parse tree produced by LenguageParser#root.
    def exitRoot(self, ctx:LenguageParser.RootContext):
        pass


    # Enter a parse tree produced by LenguageParser#inss.
    def enterInss(self, ctx:LenguageParser.InssContext):
        pass

    # Exit a parse tree produced by LenguageParser#inss.
    def exitInss(self, ctx:LenguageParser.InssContext):
        pass


    # Enter a parse tree produced by LenguageParser#ins.
    def enterIns(self, ctx:LenguageParser.InsContext):
        pass

    # Exit a parse tree produced by LenguageParser#ins.
    def exitIns(self, ctx:LenguageParser.InsContext):
        pass


    # Enter a parse tree produced by LenguageParser#input_.
    def enterInput_(self, ctx:LenguageParser.Input_Context):
        pass

    # Exit a parse tree produced by LenguageParser#input_.
    def exitInput_(self, ctx:LenguageParser.Input_Context):
        pass


    # Enter a parse tree produced by LenguageParser#output_.
    def enterOutput_(self, ctx:LenguageParser.Output_Context):
        pass

    # Exit a parse tree produced by LenguageParser#output_.
    def exitOutput_(self, ctx:LenguageParser.Output_Context):
        pass


    # Enter a parse tree produced by LenguageParser#condition.
    def enterCondition(self, ctx:LenguageParser.ConditionContext):
        pass

    # Exit a parse tree produced by LenguageParser#condition.
    def exitCondition(self, ctx:LenguageParser.ConditionContext):
        pass


    # Enter a parse tree produced by LenguageParser#while_.
    def enterWhile_(self, ctx:LenguageParser.While_Context):
        pass

    # Exit a parse tree produced by LenguageParser#while_.
    def exitWhile_(self, ctx:LenguageParser.While_Context):
        pass


    # Enter a parse tree produced by LenguageParser#siz.
    def enterSiz(self, ctx:LenguageParser.SizContext):
        pass

    # Exit a parse tree produced by LenguageParser#siz.
    def exitSiz(self, ctx:LenguageParser.SizContext):
        pass


    # Enter a parse tree produced by LenguageParser#procDef.
    def enterProcDef(self, ctx:LenguageParser.ProcDefContext):
        pass

    # Exit a parse tree produced by LenguageParser#procDef.
    def exitProcDef(self, ctx:LenguageParser.ProcDefContext):
        pass


    # Enter a parse tree produced by LenguageParser#proc.
    def enterProc(self, ctx:LenguageParser.ProcContext):
        pass

    # Exit a parse tree produced by LenguageParser#proc.
    def exitProc(self, ctx:LenguageParser.ProcContext):
        pass


    # Enter a parse tree produced by LenguageParser#assign.
    def enterAssign(self, ctx:LenguageParser.AssignContext):
        pass

    # Exit a parse tree produced by LenguageParser#assign.
    def exitAssign(self, ctx:LenguageParser.AssignContext):
        pass


    # Enter a parse tree produced by LenguageParser#paramsId.
    def enterParamsId(self, ctx:LenguageParser.ParamsIdContext):
        pass

    # Exit a parse tree produced by LenguageParser#paramsId.
    def exitParamsId(self, ctx:LenguageParser.ParamsIdContext):
        pass


    # Enter a parse tree produced by LenguageParser#paramsExpr.
    def enterParamsExpr(self, ctx:LenguageParser.ParamsExprContext):
        pass

    # Exit a parse tree produced by LenguageParser#paramsExpr.
    def exitParamsExpr(self, ctx:LenguageParser.ParamsExprContext):
        pass


    # Enter a parse tree produced by LenguageParser#consult.
    def enterConsult(self, ctx:LenguageParser.ConsultContext):
        pass

    # Exit a parse tree produced by LenguageParser#consult.
    def exitConsult(self, ctx:LenguageParser.ConsultContext):
        pass


    # Enter a parse tree produced by LenguageParser#agregado.
    def enterAgregado(self, ctx:LenguageParser.AgregadoContext):
        pass

    # Exit a parse tree produced by LenguageParser#agregado.
    def exitAgregado(self, ctx:LenguageParser.AgregadoContext):
        pass


    # Enter a parse tree produced by LenguageParser#lista.
    def enterLista(self, ctx:LenguageParser.ListaContext):
        pass

    # Exit a parse tree produced by LenguageParser#lista.
    def exitLista(self, ctx:LenguageParser.ListaContext):
        pass


    # Enter a parse tree produced by LenguageParser#Mod.
    def enterMod(self, ctx:LenguageParser.ModContext):
        pass

    # Exit a parse tree produced by LenguageParser#Mod.
    def exitMod(self, ctx:LenguageParser.ModContext):
        pass


    # Enter a parse tree produced by LenguageParser#Tactic.
    def enterTactic(self, ctx:LenguageParser.TacticContext):
        pass

    # Exit a parse tree produced by LenguageParser#Tactic.
    def exitTactic(self, ctx:LenguageParser.TacticContext):
        pass


    # Enter a parse tree produced by LenguageParser#Mul.
    def enterMul(self, ctx:LenguageParser.MulContext):
        pass

    # Exit a parse tree produced by LenguageParser#Mul.
    def exitMul(self, ctx:LenguageParser.MulContext):
        pass


    # Enter a parse tree produced by LenguageParser#Var.
    def enterVar(self, ctx:LenguageParser.VarContext):
        pass

    # Exit a parse tree produced by LenguageParser#Var.
    def exitVar(self, ctx:LenguageParser.VarContext):
        pass


    # Enter a parse tree produced by LenguageParser#Parens.
    def enterParens(self, ctx:LenguageParser.ParensContext):
        pass

    # Exit a parse tree produced by LenguageParser#Parens.
    def exitParens(self, ctx:LenguageParser.ParensContext):
        pass


    # Enter a parse tree produced by LenguageParser#Num.
    def enterNum(self, ctx:LenguageParser.NumContext):
        pass

    # Exit a parse tree produced by LenguageParser#Num.
    def exitNum(self, ctx:LenguageParser.NumContext):
        pass


    # Enter a parse tree produced by LenguageParser#sz.
    def enterSz(self, ctx:LenguageParser.SzContext):
        pass

    # Exit a parse tree produced by LenguageParser#sz.
    def exitSz(self, ctx:LenguageParser.SzContext):
        pass


    # Enter a parse tree produced by LenguageParser#Lt.
    def enterLt(self, ctx:LenguageParser.LtContext):
        pass

    # Exit a parse tree produced by LenguageParser#Lt.
    def exitLt(self, ctx:LenguageParser.LtContext):
        pass


    # Enter a parse tree produced by LenguageParser#Sum.
    def enterSum(self, ctx:LenguageParser.SumContext):
        pass

    # Exit a parse tree produced by LenguageParser#Sum.
    def exitSum(self, ctx:LenguageParser.SumContext):
        pass


    # Enter a parse tree produced by LenguageParser#String.
    def enterString(self, ctx:LenguageParser.StringContext):
        pass

    # Exit a parse tree produced by LenguageParser#String.
    def exitString(self, ctx:LenguageParser.StringContext):
        pass


    # Enter a parse tree produced by LenguageParser#lst.
    def enterLst(self, ctx:LenguageParser.LstContext):
        pass

    # Exit a parse tree produced by LenguageParser#lst.
    def exitLst(self, ctx:LenguageParser.LstContext):
        pass


    # Enter a parse tree produced by LenguageParser#Eq.
    def enterEq(self, ctx:LenguageParser.EqContext):
        pass

    # Exit a parse tree produced by LenguageParser#Eq.
    def exitEq(self, ctx:LenguageParser.EqContext):
        pass


    # Enter a parse tree produced by LenguageParser#Gt.
    def enterGt(self, ctx:LenguageParser.GtContext):
        pass

    # Exit a parse tree produced by LenguageParser#Gt.
    def exitGt(self, ctx:LenguageParser.GtContext):
        pass


    # Enter a parse tree produced by LenguageParser#Div.
    def enterDiv(self, ctx:LenguageParser.DivContext):
        pass

    # Exit a parse tree produced by LenguageParser#Div.
    def exitDiv(self, ctx:LenguageParser.DivContext):
        pass


    # Enter a parse tree produced by LenguageParser#Min.
    def enterMin(self, ctx:LenguageParser.MinContext):
        pass

    # Exit a parse tree produced by LenguageParser#Min.
    def exitMin(self, ctx:LenguageParser.MinContext):
        pass


    # Enter a parse tree produced by LenguageParser#consul.
    def enterConsul(self, ctx:LenguageParser.ConsulContext):
        pass

    # Exit a parse tree produced by LenguageParser#consul.
    def exitConsul(self, ctx:LenguageParser.ConsulContext):
        pass


    # Enter a parse tree produced by LenguageParser#Get.
    def enterGet(self, ctx:LenguageParser.GetContext):
        pass

    # Exit a parse tree produced by LenguageParser#Get.
    def exitGet(self, ctx:LenguageParser.GetContext):
        pass


    # Enter a parse tree produced by LenguageParser#Let.
    def enterLet(self, ctx:LenguageParser.LetContext):
        pass

    # Exit a parse tree produced by LenguageParser#Let.
    def exitLet(self, ctx:LenguageParser.LetContext):
        pass


    # Enter a parse tree produced by LenguageParser#Neq.
    def enterNeq(self, ctx:LenguageParser.NeqContext):
        pass

    # Exit a parse tree produced by LenguageParser#Neq.
    def exitNeq(self, ctx:LenguageParser.NeqContext):
        pass



del LenguageParser