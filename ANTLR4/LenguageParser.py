# Generated from Lenguage.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,36,214,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,1,0,
        5,0,42,8,0,10,0,12,0,45,9,0,1,0,1,0,1,1,5,1,50,8,1,10,1,12,1,53,
        9,1,1,2,1,2,3,2,57,8,2,1,2,1,2,1,2,1,2,3,2,63,8,2,1,2,1,2,3,2,67,
        8,2,1,3,1,3,1,3,1,4,1,4,5,4,74,8,4,10,4,12,4,77,9,4,1,5,1,5,1,5,
        1,5,1,5,1,5,1,5,1,5,1,5,1,5,3,5,89,8,5,1,6,1,6,1,6,1,6,1,6,1,6,1,
        7,1,7,1,7,1,8,1,8,1,8,1,8,1,8,1,8,1,8,5,8,107,8,8,10,8,12,8,110,
        9,8,1,8,1,8,1,8,1,9,1,9,1,10,1,10,1,11,1,11,1,11,1,11,1,11,1,11,
        1,12,1,12,1,12,1,13,1,13,1,13,1,13,1,14,5,14,133,8,14,10,14,12,14,
        136,9,14,1,15,5,15,139,8,15,10,15,12,15,142,9,15,1,16,1,16,1,16,
        1,16,1,16,1,17,1,17,1,17,1,17,1,18,1,18,5,18,155,8,18,10,18,12,18,
        158,9,18,1,18,1,18,1,19,1,19,1,19,1,19,1,19,1,19,1,19,1,19,1,19,
        1,19,1,19,1,19,3,19,174,8,19,1,19,1,19,1,19,1,19,1,19,1,19,1,19,
        1,19,1,19,1,19,1,19,1,19,1,19,1,19,1,19,1,19,1,19,1,19,1,19,1,19,
        1,19,1,19,1,19,1,19,1,19,1,19,1,19,1,19,1,19,1,19,1,19,1,19,1,19,
        5,19,209,8,19,10,19,12,19,212,9,19,1,19,0,1,38,20,0,2,4,6,8,10,12,
        14,16,18,20,22,24,26,28,30,32,34,36,38,0,0,226,0,43,1,0,0,0,2,51,
        1,0,0,0,4,66,1,0,0,0,6,68,1,0,0,0,8,71,1,0,0,0,10,78,1,0,0,0,12,
        90,1,0,0,0,14,96,1,0,0,0,16,99,1,0,0,0,18,114,1,0,0,0,20,116,1,0,
        0,0,22,118,1,0,0,0,24,124,1,0,0,0,26,127,1,0,0,0,28,134,1,0,0,0,
        30,140,1,0,0,0,32,143,1,0,0,0,34,148,1,0,0,0,36,152,1,0,0,0,38,173,
        1,0,0,0,40,42,3,22,11,0,41,40,1,0,0,0,42,45,1,0,0,0,43,41,1,0,0,
        0,43,44,1,0,0,0,44,46,1,0,0,0,45,43,1,0,0,0,46,47,5,0,0,1,47,1,1,
        0,0,0,48,50,3,4,2,0,49,48,1,0,0,0,50,53,1,0,0,0,51,49,1,0,0,0,51,
        52,1,0,0,0,52,3,1,0,0,0,53,51,1,0,0,0,54,57,3,10,5,0,55,57,3,12,
        6,0,56,54,1,0,0,0,56,55,1,0,0,0,57,67,1,0,0,0,58,63,3,6,3,0,59,63,
        3,8,4,0,60,63,3,24,12,0,61,63,3,26,13,0,62,58,1,0,0,0,62,59,1,0,
        0,0,62,60,1,0,0,0,62,61,1,0,0,0,63,67,1,0,0,0,64,67,3,34,17,0,65,
        67,3,16,8,0,66,56,1,0,0,0,66,62,1,0,0,0,66,64,1,0,0,0,66,65,1,0,
        0,0,67,5,1,0,0,0,68,69,5,1,0,0,69,70,5,32,0,0,70,7,1,0,0,0,71,75,
        5,2,0,0,72,74,3,38,19,0,73,72,1,0,0,0,74,77,1,0,0,0,75,73,1,0,0,
        0,75,76,1,0,0,0,76,9,1,0,0,0,77,75,1,0,0,0,78,79,5,9,0,0,79,80,3,
        38,19,0,80,81,5,15,0,0,81,82,3,2,1,0,82,88,5,16,0,0,83,84,5,10,0,
        0,84,85,5,15,0,0,85,86,3,2,1,0,86,87,5,16,0,0,87,89,1,0,0,0,88,83,
        1,0,0,0,88,89,1,0,0,0,89,11,1,0,0,0,90,91,5,3,0,0,91,92,3,38,19,
        0,92,93,5,15,0,0,93,94,3,2,1,0,94,95,5,16,0,0,95,13,1,0,0,0,96,97,
        5,8,0,0,97,98,5,32,0,0,98,15,1,0,0,0,99,100,5,4,0,0,100,101,5,15,
        0,0,101,102,3,18,9,0,102,103,5,17,0,0,103,108,3,20,10,0,104,105,
        5,5,0,0,105,107,3,20,10,0,106,104,1,0,0,0,107,110,1,0,0,0,108,106,
        1,0,0,0,108,109,1,0,0,0,109,111,1,0,0,0,110,108,1,0,0,0,111,112,
        5,18,0,0,112,113,5,16,0,0,113,17,1,0,0,0,114,115,5,35,0,0,115,19,
        1,0,0,0,116,117,5,11,0,0,117,21,1,0,0,0,118,119,5,12,0,0,119,120,
        3,28,14,0,120,121,5,15,0,0,121,122,3,2,1,0,122,123,5,16,0,0,123,
        23,1,0,0,0,124,125,5,12,0,0,125,126,3,30,15,0,126,25,1,0,0,0,127,
        128,5,32,0,0,128,129,5,13,0,0,129,130,3,38,19,0,130,27,1,0,0,0,131,
        133,5,32,0,0,132,131,1,0,0,0,133,136,1,0,0,0,134,132,1,0,0,0,134,
        135,1,0,0,0,135,29,1,0,0,0,136,134,1,0,0,0,137,139,3,38,19,0,138,
        137,1,0,0,0,139,142,1,0,0,0,140,138,1,0,0,0,140,141,1,0,0,0,141,
        31,1,0,0,0,142,140,1,0,0,0,143,144,5,32,0,0,144,145,5,19,0,0,145,
        146,3,38,19,0,146,147,5,20,0,0,147,33,1,0,0,0,148,149,5,32,0,0,149,
        150,5,14,0,0,150,151,3,38,19,0,151,35,1,0,0,0,152,156,5,6,0,0,153,
        155,3,38,19,0,154,153,1,0,0,0,155,158,1,0,0,0,156,154,1,0,0,0,156,
        157,1,0,0,0,157,159,1,0,0,0,158,156,1,0,0,0,159,160,5,7,0,0,160,
        37,1,0,0,0,161,162,6,19,-1,0,162,174,5,33,0,0,163,174,5,34,0,0,164,
        174,5,32,0,0,165,174,5,35,0,0,166,174,3,36,18,0,167,174,3,14,7,0,
        168,174,3,32,16,0,169,170,5,17,0,0,170,171,3,38,19,0,171,172,5,18,
        0,0,172,174,1,0,0,0,173,161,1,0,0,0,173,163,1,0,0,0,173,164,1,0,
        0,0,173,165,1,0,0,0,173,166,1,0,0,0,173,167,1,0,0,0,173,168,1,0,
        0,0,173,169,1,0,0,0,174,210,1,0,0,0,175,176,10,12,0,0,176,177,5,
        23,0,0,177,209,3,38,19,13,178,179,10,11,0,0,179,180,5,24,0,0,180,
        209,3,38,19,12,181,182,10,10,0,0,182,183,5,25,0,0,183,209,3,38,19,
        11,184,185,10,9,0,0,185,186,5,21,0,0,186,209,3,38,19,10,187,188,
        10,8,0,0,188,189,5,22,0,0,189,209,3,38,19,9,190,191,10,7,0,0,191,
        192,5,28,0,0,192,209,3,38,19,8,193,194,10,6,0,0,194,195,5,30,0,0,
        195,209,3,38,19,7,196,197,10,5,0,0,197,198,5,29,0,0,198,209,3,38,
        19,6,199,200,10,4,0,0,200,201,5,31,0,0,201,209,3,38,19,5,202,203,
        10,3,0,0,203,204,5,26,0,0,204,209,3,38,19,4,205,206,10,2,0,0,206,
        207,5,27,0,0,207,209,3,38,19,3,208,175,1,0,0,0,208,178,1,0,0,0,208,
        181,1,0,0,0,208,184,1,0,0,0,208,187,1,0,0,0,208,190,1,0,0,0,208,
        193,1,0,0,0,208,196,1,0,0,0,208,199,1,0,0,0,208,202,1,0,0,0,208,
        205,1,0,0,0,209,212,1,0,0,0,210,208,1,0,0,0,210,211,1,0,0,0,211,
        39,1,0,0,0,212,210,1,0,0,0,14,43,51,56,62,66,75,88,108,134,140,156,
        173,208,210
    ]

class LenguageParser ( Parser ):

    grammarFileName = "Lenguage.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'<i>'", "'<o>'", "'while'", "'tactic'", 
                     "','", "'{'", "'}'", "'#'", "'if'", "'else'", "<INVALID>", 
                     "<INVALID>", "'::'", "'<-'", "'<<'", "'>>'", "'('", 
                     "')'", "'['", "']'", "'+'", "'-'", "'*'", "'/'", "'%'", 
                     "'='", "'/='", "'>'", "'<'", "'>='", "'<='" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "SIZE", "IF", "ELSE", "POSITION", "PROCNAME", "ASSIGN", 
                      "ADD", "LB", "RB", "LP", "RP", "LS", "RS", "SUM", 
                      "MIN", "MUL", "DIV", "MOD", "EQ", "NEQ", "GT", "LT", 
                      "GET", "LET", "VAR", "NUM", "FLOAT", "STRING", "WS" ]

    RULE_root = 0
    RULE_inss = 1
    RULE_ins = 2
    RULE_input_ = 3
    RULE_output_ = 4
    RULE_condition = 5
    RULE_while_ = 6
    RULE_siz = 7
    RULE_tactics = 8
    RULE_tacticName = 9
    RULE_position = 10
    RULE_procDef = 11
    RULE_proc = 12
    RULE_assign = 13
    RULE_paramsId = 14
    RULE_paramsExpr = 15
    RULE_consult = 16
    RULE_add = 17
    RULE_lista = 18
    RULE_expr = 19

    ruleNames =  [ "root", "inss", "ins", "input_", "output_", "condition", 
                   "while_", "siz", "tactics", "tacticName", "position", 
                   "procDef", "proc", "assign", "paramsId", "paramsExpr", 
                   "consult", "add", "lista", "expr" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    SIZE=8
    IF=9
    ELSE=10
    POSITION=11
    PROCNAME=12
    ASSIGN=13
    ADD=14
    LB=15
    RB=16
    LP=17
    RP=18
    LS=19
    RS=20
    SUM=21
    MIN=22
    MUL=23
    DIV=24
    MOD=25
    EQ=26
    NEQ=27
    GT=28
    LT=29
    GET=30
    LET=31
    VAR=32
    NUM=33
    FLOAT=34
    STRING=35
    WS=36

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class RootContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(LenguageParser.EOF, 0)

        def procDef(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguageParser.ProcDefContext)
            else:
                return self.getTypedRuleContext(LenguageParser.ProcDefContext,i)


        def getRuleIndex(self):
            return LenguageParser.RULE_root

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitRoot" ):
                return visitor.visitRoot(self)
            else:
                return visitor.visitChildren(self)




    def root(self):

        localctx = LenguageParser.RootContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_root)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 43
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==12:
                self.state = 40
                self.procDef()
                self.state = 45
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 46
            self.match(LenguageParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class InssContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ins(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguageParser.InsContext)
            else:
                return self.getTypedRuleContext(LenguageParser.InsContext,i)


        def getRuleIndex(self):
            return LenguageParser.RULE_inss

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInss" ):
                return visitor.visitInss(self)
            else:
                return visitor.visitChildren(self)




    def inss(self):

        localctx = LenguageParser.InssContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_inss)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 51
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 4294971934) != 0):
                self.state = 48
                self.ins()
                self.state = 53
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class InsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def condition(self):
            return self.getTypedRuleContext(LenguageParser.ConditionContext,0)


        def while_(self):
            return self.getTypedRuleContext(LenguageParser.While_Context,0)


        def input_(self):
            return self.getTypedRuleContext(LenguageParser.Input_Context,0)


        def output_(self):
            return self.getTypedRuleContext(LenguageParser.Output_Context,0)


        def proc(self):
            return self.getTypedRuleContext(LenguageParser.ProcContext,0)


        def assign(self):
            return self.getTypedRuleContext(LenguageParser.AssignContext,0)


        def add(self):
            return self.getTypedRuleContext(LenguageParser.AddContext,0)


        def tactics(self):
            return self.getTypedRuleContext(LenguageParser.TacticsContext,0)


        def getRuleIndex(self):
            return LenguageParser.RULE_ins

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIns" ):
                return visitor.visitIns(self)
            else:
                return visitor.visitChildren(self)




    def ins(self):

        localctx = LenguageParser.InsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_ins)
        try:
            self.state = 66
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,4,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 56
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [9]:
                    self.state = 54
                    self.condition()
                    pass
                elif token in [3]:
                    self.state = 55
                    self.while_()
                    pass
                else:
                    raise NoViableAltException(self)

                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 62
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [1]:
                    self.state = 58
                    self.input_()
                    pass
                elif token in [2]:
                    self.state = 59
                    self.output_()
                    pass
                elif token in [12]:
                    self.state = 60
                    self.proc()
                    pass
                elif token in [32]:
                    self.state = 61
                    self.assign()
                    pass
                else:
                    raise NoViableAltException(self)

                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 64
                self.add()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 65
                self.tactics()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Input_Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VAR(self):
            return self.getToken(LenguageParser.VAR, 0)

        def getRuleIndex(self):
            return LenguageParser.RULE_input_

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInput_" ):
                return visitor.visitInput_(self)
            else:
                return visitor.visitChildren(self)




    def input_(self):

        localctx = LenguageParser.Input_Context(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_input_)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 68
            self.match(LenguageParser.T__0)
            self.state = 69
            self.match(LenguageParser.VAR)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Output_Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguageParser.ExprContext)
            else:
                return self.getTypedRuleContext(LenguageParser.ExprContext,i)


        def getRuleIndex(self):
            return LenguageParser.RULE_output_

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOutput_" ):
                return visitor.visitOutput_(self)
            else:
                return visitor.visitChildren(self)




    def output_(self):

        localctx = LenguageParser.Output_Context(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_output_)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 71
            self.match(LenguageParser.T__1)
            self.state = 75
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,5,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 72
                    self.expr(0) 
                self.state = 77
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,5,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ConditionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IF(self):
            return self.getToken(LenguageParser.IF, 0)

        def expr(self):
            return self.getTypedRuleContext(LenguageParser.ExprContext,0)


        def LB(self, i:int=None):
            if i is None:
                return self.getTokens(LenguageParser.LB)
            else:
                return self.getToken(LenguageParser.LB, i)

        def inss(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguageParser.InssContext)
            else:
                return self.getTypedRuleContext(LenguageParser.InssContext,i)


        def RB(self, i:int=None):
            if i is None:
                return self.getTokens(LenguageParser.RB)
            else:
                return self.getToken(LenguageParser.RB, i)

        def ELSE(self):
            return self.getToken(LenguageParser.ELSE, 0)

        def getRuleIndex(self):
            return LenguageParser.RULE_condition

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCondition" ):
                return visitor.visitCondition(self)
            else:
                return visitor.visitChildren(self)




    def condition(self):

        localctx = LenguageParser.ConditionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_condition)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 78
            self.match(LenguageParser.IF)
            self.state = 79
            self.expr(0)
            self.state = 80
            self.match(LenguageParser.LB)
            self.state = 81
            self.inss()
            self.state = 82
            self.match(LenguageParser.RB)
            self.state = 88
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==10:
                self.state = 83
                self.match(LenguageParser.ELSE)
                self.state = 84
                self.match(LenguageParser.LB)
                self.state = 85
                self.inss()
                self.state = 86
                self.match(LenguageParser.RB)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class While_Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(LenguageParser.ExprContext,0)


        def LB(self):
            return self.getToken(LenguageParser.LB, 0)

        def inss(self):
            return self.getTypedRuleContext(LenguageParser.InssContext,0)


        def RB(self):
            return self.getToken(LenguageParser.RB, 0)

        def getRuleIndex(self):
            return LenguageParser.RULE_while_

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitWhile_" ):
                return visitor.visitWhile_(self)
            else:
                return visitor.visitChildren(self)




    def while_(self):

        localctx = LenguageParser.While_Context(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_while_)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 90
            self.match(LenguageParser.T__2)
            self.state = 91
            self.expr(0)
            self.state = 92
            self.match(LenguageParser.LB)
            self.state = 93
            self.inss()
            self.state = 94
            self.match(LenguageParser.RB)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SizContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SIZE(self):
            return self.getToken(LenguageParser.SIZE, 0)

        def VAR(self):
            return self.getToken(LenguageParser.VAR, 0)

        def getRuleIndex(self):
            return LenguageParser.RULE_siz

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSiz" ):
                return visitor.visitSiz(self)
            else:
                return visitor.visitChildren(self)




    def siz(self):

        localctx = LenguageParser.SizContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_siz)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 96
            self.match(LenguageParser.SIZE)
            self.state = 97
            self.match(LenguageParser.VAR)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TacticsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LB(self):
            return self.getToken(LenguageParser.LB, 0)

        def tacticName(self):
            return self.getTypedRuleContext(LenguageParser.TacticNameContext,0)


        def LP(self):
            return self.getToken(LenguageParser.LP, 0)

        def position(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguageParser.PositionContext)
            else:
                return self.getTypedRuleContext(LenguageParser.PositionContext,i)


        def RP(self):
            return self.getToken(LenguageParser.RP, 0)

        def RB(self):
            return self.getToken(LenguageParser.RB, 0)

        def getRuleIndex(self):
            return LenguageParser.RULE_tactics

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTactics" ):
                return visitor.visitTactics(self)
            else:
                return visitor.visitChildren(self)




    def tactics(self):

        localctx = LenguageParser.TacticsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_tactics)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 99
            self.match(LenguageParser.T__3)
            self.state = 100
            self.match(LenguageParser.LB)
            self.state = 101
            self.tacticName()
            self.state = 102
            self.match(LenguageParser.LP)
            self.state = 103
            self.position()
            self.state = 108
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==5:
                self.state = 104
                self.match(LenguageParser.T__4)
                self.state = 105
                self.position()
                self.state = 110
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 111
            self.match(LenguageParser.RP)
            self.state = 112
            self.match(LenguageParser.RB)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TacticNameContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRING(self):
            return self.getToken(LenguageParser.STRING, 0)

        def getRuleIndex(self):
            return LenguageParser.RULE_tacticName

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTacticName" ):
                return visitor.visitTacticName(self)
            else:
                return visitor.visitChildren(self)




    def tacticName(self):

        localctx = LenguageParser.TacticNameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_tacticName)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 114
            self.match(LenguageParser.STRING)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PositionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def POSITION(self):
            return self.getToken(LenguageParser.POSITION, 0)

        def getRuleIndex(self):
            return LenguageParser.RULE_position

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPosition" ):
                return visitor.visitPosition(self)
            else:
                return visitor.visitChildren(self)




    def position(self):

        localctx = LenguageParser.PositionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_position)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 116
            self.match(LenguageParser.POSITION)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ProcDefContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PROCNAME(self):
            return self.getToken(LenguageParser.PROCNAME, 0)

        def paramsId(self):
            return self.getTypedRuleContext(LenguageParser.ParamsIdContext,0)


        def LB(self):
            return self.getToken(LenguageParser.LB, 0)

        def inss(self):
            return self.getTypedRuleContext(LenguageParser.InssContext,0)


        def RB(self):
            return self.getToken(LenguageParser.RB, 0)

        def getRuleIndex(self):
            return LenguageParser.RULE_procDef

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProcDef" ):
                return visitor.visitProcDef(self)
            else:
                return visitor.visitChildren(self)




    def procDef(self):

        localctx = LenguageParser.ProcDefContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_procDef)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 118
            self.match(LenguageParser.PROCNAME)
            self.state = 119
            self.paramsId()
            self.state = 120
            self.match(LenguageParser.LB)
            self.state = 121
            self.inss()
            self.state = 122
            self.match(LenguageParser.RB)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ProcContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PROCNAME(self):
            return self.getToken(LenguageParser.PROCNAME, 0)

        def paramsExpr(self):
            return self.getTypedRuleContext(LenguageParser.ParamsExprContext,0)


        def getRuleIndex(self):
            return LenguageParser.RULE_proc

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProc" ):
                return visitor.visitProc(self)
            else:
                return visitor.visitChildren(self)




    def proc(self):

        localctx = LenguageParser.ProcContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_proc)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 124
            self.match(LenguageParser.PROCNAME)
            self.state = 125
            self.paramsExpr()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssignContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VAR(self):
            return self.getToken(LenguageParser.VAR, 0)

        def ASSIGN(self):
            return self.getToken(LenguageParser.ASSIGN, 0)

        def expr(self):
            return self.getTypedRuleContext(LenguageParser.ExprContext,0)


        def getRuleIndex(self):
            return LenguageParser.RULE_assign

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAssign" ):
                return visitor.visitAssign(self)
            else:
                return visitor.visitChildren(self)




    def assign(self):

        localctx = LenguageParser.AssignContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_assign)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 127
            self.match(LenguageParser.VAR)
            self.state = 128
            self.match(LenguageParser.ASSIGN)
            self.state = 129
            self.expr(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParamsIdContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VAR(self, i:int=None):
            if i is None:
                return self.getTokens(LenguageParser.VAR)
            else:
                return self.getToken(LenguageParser.VAR, i)

        def getRuleIndex(self):
            return LenguageParser.RULE_paramsId

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParamsId" ):
                return visitor.visitParamsId(self)
            else:
                return visitor.visitChildren(self)




    def paramsId(self):

        localctx = LenguageParser.ParamsIdContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_paramsId)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 134
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==32:
                self.state = 131
                self.match(LenguageParser.VAR)
                self.state = 136
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParamsExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguageParser.ExprContext)
            else:
                return self.getTypedRuleContext(LenguageParser.ExprContext,i)


        def getRuleIndex(self):
            return LenguageParser.RULE_paramsExpr

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParamsExpr" ):
                return visitor.visitParamsExpr(self)
            else:
                return visitor.visitChildren(self)




    def paramsExpr(self):

        localctx = LenguageParser.ParamsExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_paramsExpr)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 140
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,9,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 137
                    self.expr(0) 
                self.state = 142
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,9,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ConsultContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VAR(self):
            return self.getToken(LenguageParser.VAR, 0)

        def LS(self):
            return self.getToken(LenguageParser.LS, 0)

        def expr(self):
            return self.getTypedRuleContext(LenguageParser.ExprContext,0)


        def RS(self):
            return self.getToken(LenguageParser.RS, 0)

        def getRuleIndex(self):
            return LenguageParser.RULE_consult

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitConsult" ):
                return visitor.visitConsult(self)
            else:
                return visitor.visitChildren(self)




    def consult(self):

        localctx = LenguageParser.ConsultContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_consult)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 143
            self.match(LenguageParser.VAR)
            self.state = 144
            self.match(LenguageParser.LS)
            self.state = 145
            self.expr(0)
            self.state = 146
            self.match(LenguageParser.RS)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AddContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VAR(self):
            return self.getToken(LenguageParser.VAR, 0)

        def ADD(self):
            return self.getToken(LenguageParser.ADD, 0)

        def expr(self):
            return self.getTypedRuleContext(LenguageParser.ExprContext,0)


        def getRuleIndex(self):
            return LenguageParser.RULE_add

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAdd" ):
                return visitor.visitAdd(self)
            else:
                return visitor.visitChildren(self)




    def add(self):

        localctx = LenguageParser.AddContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_add)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 148
            self.match(LenguageParser.VAR)
            self.state = 149
            self.match(LenguageParser.ADD)
            self.state = 150
            self.expr(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ListaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguageParser.ExprContext)
            else:
                return self.getTypedRuleContext(LenguageParser.ExprContext,i)


        def getRuleIndex(self):
            return LenguageParser.RULE_lista

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLista" ):
                return visitor.visitLista(self)
            else:
                return visitor.visitChildren(self)




    def lista(self):

        localctx = LenguageParser.ListaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_lista)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 152
            self.match(LenguageParser.T__5)
            self.state = 156
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 64424640832) != 0):
                self.state = 153
                self.expr(0)
                self.state = 158
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 159
            self.match(LenguageParser.T__6)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return LenguageParser.RULE_expr

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)


    class ModContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguageParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguageParser.ExprContext)
            else:
                return self.getTypedRuleContext(LenguageParser.ExprContext,i)

        def MOD(self):
            return self.getToken(LenguageParser.MOD, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMod" ):
                return visitor.visitMod(self)
            else:
                return visitor.visitChildren(self)


    class MulContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguageParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguageParser.ExprContext)
            else:
                return self.getTypedRuleContext(LenguageParser.ExprContext,i)

        def MUL(self):
            return self.getToken(LenguageParser.MUL, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMul" ):
                return visitor.visitMul(self)
            else:
                return visitor.visitChildren(self)


    class VarContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguageParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def VAR(self):
            return self.getToken(LenguageParser.VAR, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVar" ):
                return visitor.visitVar(self)
            else:
                return visitor.visitChildren(self)


    class ParensContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguageParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def LP(self):
            return self.getToken(LenguageParser.LP, 0)
        def expr(self):
            return self.getTypedRuleContext(LenguageParser.ExprContext,0)

        def RP(self):
            return self.getToken(LenguageParser.RP, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParens" ):
                return visitor.visitParens(self)
            else:
                return visitor.visitChildren(self)


    class NumContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguageParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def NUM(self):
            return self.getToken(LenguageParser.NUM, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNum" ):
                return visitor.visitNum(self)
            else:
                return visitor.visitChildren(self)


    class SzContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguageParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def siz(self):
            return self.getTypedRuleContext(LenguageParser.SizContext,0)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSz" ):
                return visitor.visitSz(self)
            else:
                return visitor.visitChildren(self)


    class LtContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguageParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguageParser.ExprContext)
            else:
                return self.getTypedRuleContext(LenguageParser.ExprContext,i)

        def LT(self):
            return self.getToken(LenguageParser.LT, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLt" ):
                return visitor.visitLt(self)
            else:
                return visitor.visitChildren(self)


    class SumContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguageParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguageParser.ExprContext)
            else:
                return self.getTypedRuleContext(LenguageParser.ExprContext,i)

        def SUM(self):
            return self.getToken(LenguageParser.SUM, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSum" ):
                return visitor.visitSum(self)
            else:
                return visitor.visitChildren(self)


    class StringContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguageParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def STRING(self):
            return self.getToken(LenguageParser.STRING, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitString" ):
                return visitor.visitString(self)
            else:
                return visitor.visitChildren(self)


    class LstContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguageParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def lista(self):
            return self.getTypedRuleContext(LenguageParser.ListaContext,0)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLst" ):
                return visitor.visitLst(self)
            else:
                return visitor.visitChildren(self)


    class EqContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguageParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguageParser.ExprContext)
            else:
                return self.getTypedRuleContext(LenguageParser.ExprContext,i)

        def EQ(self):
            return self.getToken(LenguageParser.EQ, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitEq" ):
                return visitor.visitEq(self)
            else:
                return visitor.visitChildren(self)


    class GtContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguageParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguageParser.ExprContext)
            else:
                return self.getTypedRuleContext(LenguageParser.ExprContext,i)

        def GT(self):
            return self.getToken(LenguageParser.GT, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitGt" ):
                return visitor.visitGt(self)
            else:
                return visitor.visitChildren(self)


    class DivContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguageParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguageParser.ExprContext)
            else:
                return self.getTypedRuleContext(LenguageParser.ExprContext,i)

        def DIV(self):
            return self.getToken(LenguageParser.DIV, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDiv" ):
                return visitor.visitDiv(self)
            else:
                return visitor.visitChildren(self)


    class FloatContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguageParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def FLOAT(self):
            return self.getToken(LenguageParser.FLOAT, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFloat" ):
                return visitor.visitFloat(self)
            else:
                return visitor.visitChildren(self)


    class MinContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguageParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguageParser.ExprContext)
            else:
                return self.getTypedRuleContext(LenguageParser.ExprContext,i)

        def MIN(self):
            return self.getToken(LenguageParser.MIN, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMin" ):
                return visitor.visitMin(self)
            else:
                return visitor.visitChildren(self)


    class ConsulContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguageParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def consult(self):
            return self.getTypedRuleContext(LenguageParser.ConsultContext,0)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitConsul" ):
                return visitor.visitConsul(self)
            else:
                return visitor.visitChildren(self)


    class GetContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguageParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguageParser.ExprContext)
            else:
                return self.getTypedRuleContext(LenguageParser.ExprContext,i)

        def GET(self):
            return self.getToken(LenguageParser.GET, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitGet" ):
                return visitor.visitGet(self)
            else:
                return visitor.visitChildren(self)


    class LetContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguageParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguageParser.ExprContext)
            else:
                return self.getTypedRuleContext(LenguageParser.ExprContext,i)

        def LET(self):
            return self.getToken(LenguageParser.LET, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLet" ):
                return visitor.visitLet(self)
            else:
                return visitor.visitChildren(self)


    class NeqContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguageParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguageParser.ExprContext)
            else:
                return self.getTypedRuleContext(LenguageParser.ExprContext,i)

        def NEQ(self):
            return self.getToken(LenguageParser.NEQ, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNeq" ):
                return visitor.visitNeq(self)
            else:
                return visitor.visitChildren(self)



    def expr(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = LenguageParser.ExprContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 38
        self.enterRecursionRule(localctx, 38, self.RULE_expr, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 173
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,11,self._ctx)
            if la_ == 1:
                localctx = LenguageParser.NumContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx

                self.state = 162
                self.match(LenguageParser.NUM)
                pass

            elif la_ == 2:
                localctx = LenguageParser.FloatContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 163
                self.match(LenguageParser.FLOAT)
                pass

            elif la_ == 3:
                localctx = LenguageParser.VarContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 164
                self.match(LenguageParser.VAR)
                pass

            elif la_ == 4:
                localctx = LenguageParser.StringContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 165
                self.match(LenguageParser.STRING)
                pass

            elif la_ == 5:
                localctx = LenguageParser.LstContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 166
                self.lista()
                pass

            elif la_ == 6:
                localctx = LenguageParser.SzContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 167
                self.siz()
                pass

            elif la_ == 7:
                localctx = LenguageParser.ConsulContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 168
                self.consult()
                pass

            elif la_ == 8:
                localctx = LenguageParser.ParensContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 169
                self.match(LenguageParser.LP)
                self.state = 170
                self.expr(0)
                self.state = 171
                self.match(LenguageParser.RP)
                pass


            self._ctx.stop = self._input.LT(-1)
            self.state = 210
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,13,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 208
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,12,self._ctx)
                    if la_ == 1:
                        localctx = LenguageParser.MulContext(self, LenguageParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 175
                        if not self.precpred(self._ctx, 12):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 12)")
                        self.state = 176
                        self.match(LenguageParser.MUL)
                        self.state = 177
                        self.expr(13)
                        pass

                    elif la_ == 2:
                        localctx = LenguageParser.DivContext(self, LenguageParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 178
                        if not self.precpred(self._ctx, 11):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 11)")
                        self.state = 179
                        self.match(LenguageParser.DIV)
                        self.state = 180
                        self.expr(12)
                        pass

                    elif la_ == 3:
                        localctx = LenguageParser.ModContext(self, LenguageParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 181
                        if not self.precpred(self._ctx, 10):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 10)")
                        self.state = 182
                        self.match(LenguageParser.MOD)
                        self.state = 183
                        self.expr(11)
                        pass

                    elif la_ == 4:
                        localctx = LenguageParser.SumContext(self, LenguageParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 184
                        if not self.precpred(self._ctx, 9):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 9)")
                        self.state = 185
                        self.match(LenguageParser.SUM)
                        self.state = 186
                        self.expr(10)
                        pass

                    elif la_ == 5:
                        localctx = LenguageParser.MinContext(self, LenguageParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 187
                        if not self.precpred(self._ctx, 8):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 8)")
                        self.state = 188
                        self.match(LenguageParser.MIN)
                        self.state = 189
                        self.expr(9)
                        pass

                    elif la_ == 6:
                        localctx = LenguageParser.GtContext(self, LenguageParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 190
                        if not self.precpred(self._ctx, 7):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 7)")
                        self.state = 191
                        self.match(LenguageParser.GT)
                        self.state = 192
                        self.expr(8)
                        pass

                    elif la_ == 7:
                        localctx = LenguageParser.GetContext(self, LenguageParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 193
                        if not self.precpred(self._ctx, 6):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 6)")
                        self.state = 194
                        self.match(LenguageParser.GET)
                        self.state = 195
                        self.expr(7)
                        pass

                    elif la_ == 8:
                        localctx = LenguageParser.LtContext(self, LenguageParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 196
                        if not self.precpred(self._ctx, 5):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 5)")
                        self.state = 197
                        self.match(LenguageParser.LT)
                        self.state = 198
                        self.expr(6)
                        pass

                    elif la_ == 9:
                        localctx = LenguageParser.LetContext(self, LenguageParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 199
                        if not self.precpred(self._ctx, 4):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 4)")
                        self.state = 200
                        self.match(LenguageParser.LET)
                        self.state = 201
                        self.expr(5)
                        pass

                    elif la_ == 10:
                        localctx = LenguageParser.EqContext(self, LenguageParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 202
                        if not self.precpred(self._ctx, 3):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 3)")
                        self.state = 203
                        self.match(LenguageParser.EQ)
                        self.state = 204
                        self.expr(4)
                        pass

                    elif la_ == 11:
                        localctx = LenguageParser.NeqContext(self, LenguageParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 205
                        if not self.precpred(self._ctx, 2):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                        self.state = 206
                        self.match(LenguageParser.NEQ)
                        self.state = 207
                        self.expr(3)
                        pass

             
                self.state = 212
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,13,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[19] = self.expr_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expr_sempred(self, localctx:ExprContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 12)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 11)
         

            if predIndex == 2:
                return self.precpred(self._ctx, 10)
         

            if predIndex == 3:
                return self.precpred(self._ctx, 9)
         

            if predIndex == 4:
                return self.precpred(self._ctx, 8)
         

            if predIndex == 5:
                return self.precpred(self._ctx, 7)
         

            if predIndex == 6:
                return self.precpred(self._ctx, 6)
         

            if predIndex == 7:
                return self.precpred(self._ctx, 5)
         

            if predIndex == 8:
                return self.precpred(self._ctx, 4)
         

            if predIndex == 9:
                return self.precpred(self._ctx, 3)
         

            if predIndex == 10:
                return self.precpred(self._ctx, 2)
         




