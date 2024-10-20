# Generated from Lenguage.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .LenguageParser import LenguageParser
else:
    from LenguageParser import LenguageParser

# This class defines a complete generic visitor for a parse tree produced by LenguageParser.

class LenguageVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by LenguageParser#root.
    def visitRoot(self, ctx:LenguageParser.RootContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#inss.
    def visitInss(self, ctx:LenguageParser.InssContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#ins.
    def visitIns(self, ctx:LenguageParser.InsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#input_.
    def visitInput_(self, ctx:LenguageParser.Input_Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#output_.
    def visitOutput_(self, ctx:LenguageParser.Output_Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#condition.
    def visitCondition(self, ctx:LenguageParser.ConditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#while_.
    def visitWhile_(self, ctx:LenguageParser.While_Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#siz.
    def visitSiz(self, ctx:LenguageParser.SizContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#tactics.
    def visitTactics(self, ctx:LenguageParser.TacticsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#tacticName.
    def visitTacticName(self, ctx:LenguageParser.TacticNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#position.
    def visitPosition(self, ctx:LenguageParser.PositionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#procDef.
    def visitProcDef(self, ctx:LenguageParser.ProcDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#proc.
    def visitProc(self, ctx:LenguageParser.ProcContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#assign.
    def visitAssign(self, ctx:LenguageParser.AssignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#paramsId.
    def visitParamsId(self, ctx:LenguageParser.ParamsIdContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#paramsExpr.
    def visitParamsExpr(self, ctx:LenguageParser.ParamsExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#consult.
    def visitConsult(self, ctx:LenguageParser.ConsultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#add.
    def visitAdd(self, ctx:LenguageParser.AddContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#lista.
    def visitLista(self, ctx:LenguageParser.ListaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#Mod.
    def visitMod(self, ctx:LenguageParser.ModContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#Mul.
    def visitMul(self, ctx:LenguageParser.MulContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#Var.
    def visitVar(self, ctx:LenguageParser.VarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#Parens.
    def visitParens(self, ctx:LenguageParser.ParensContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#Num.
    def visitNum(self, ctx:LenguageParser.NumContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#sz.
    def visitSz(self, ctx:LenguageParser.SzContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#Lt.
    def visitLt(self, ctx:LenguageParser.LtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#Sum.
    def visitSum(self, ctx:LenguageParser.SumContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#String.
    def visitString(self, ctx:LenguageParser.StringContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#lst.
    def visitLst(self, ctx:LenguageParser.LstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#Eq.
    def visitEq(self, ctx:LenguageParser.EqContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#Gt.
    def visitGt(self, ctx:LenguageParser.GtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#Div.
    def visitDiv(self, ctx:LenguageParser.DivContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#Float.
    def visitFloat(self, ctx:LenguageParser.FloatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#Min.
    def visitMin(self, ctx:LenguageParser.MinContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#consul.
    def visitConsul(self, ctx:LenguageParser.ConsulContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#Get.
    def visitGet(self, ctx:LenguageParser.GetContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#Let.
    def visitLet(self, ctx:LenguageParser.LetContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LenguageParser#Neq.
    def visitNeq(self, ctx:LenguageParser.NeqContext):
        return self.visitChildren(ctx)



del LenguageParser