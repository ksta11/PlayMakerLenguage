# Generated from Lenguaje.g4 by ANTLR 4.13.2
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO


def serializedATN():
    return [
        4,0,33,214,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,
        2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,
        13,7,13,2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,
        19,2,20,7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,
        26,7,26,2,27,7,27,2,28,7,28,2,29,7,29,2,30,7,30,2,31,7,31,2,32,7,
        32,1,0,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,2,1,2,1,2,1,3,1,3,1,3,1,3,1,
        3,1,4,1,4,1,4,1,4,1,4,1,4,1,5,1,5,1,6,1,6,1,7,1,7,1,8,1,8,1,8,1,
        8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,
        8,1,8,1,8,1,8,1,8,3,8,120,8,8,1,9,1,9,5,9,124,8,9,10,9,12,9,127,
        9,9,1,10,1,10,1,10,1,11,1,11,1,11,1,12,1,12,1,12,1,13,1,13,1,13,
        1,14,1,14,1,15,1,15,1,16,1,16,1,17,1,17,1,18,1,18,1,19,1,19,1,20,
        1,20,1,21,1,21,1,22,1,22,1,23,1,23,1,24,1,24,1,24,1,25,1,25,1,26,
        1,26,1,27,1,27,1,27,1,28,1,28,1,28,1,29,1,29,5,29,176,8,29,10,29,
        12,29,179,9,29,1,30,3,30,182,8,30,1,30,4,30,185,8,30,11,30,12,30,
        186,1,30,1,30,4,30,191,8,30,11,30,12,30,192,3,30,195,8,30,1,31,1,
        31,1,31,1,31,5,31,201,8,31,10,31,12,31,204,9,31,1,31,1,31,1,32,4,
        32,209,8,32,11,32,12,32,210,1,32,1,32,0,0,33,1,1,3,2,5,3,7,4,9,5,
        11,6,13,7,15,8,17,9,19,10,21,11,23,12,25,13,27,14,29,15,31,16,33,
        17,35,18,37,19,39,20,41,21,43,22,45,23,47,24,49,25,51,26,53,27,55,
        28,57,29,59,30,61,31,63,32,65,33,1,0,7,1,0,65,90,4,0,48,57,65,90,
        95,95,97,122,2,0,65,90,97,122,3,0,48,57,65,90,97,122,1,0,48,57,2,
        0,34,34,92,92,3,0,9,10,13,13,32,32,232,0,1,1,0,0,0,0,3,1,0,0,0,0,
        5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,0,11,1,0,0,0,0,13,1,0,0,0,0,15,
        1,0,0,0,0,17,1,0,0,0,0,19,1,0,0,0,0,21,1,0,0,0,0,23,1,0,0,0,0,25,
        1,0,0,0,0,27,1,0,0,0,0,29,1,0,0,0,0,31,1,0,0,0,0,33,1,0,0,0,0,35,
        1,0,0,0,0,37,1,0,0,0,0,39,1,0,0,0,0,41,1,0,0,0,0,43,1,0,0,0,0,45,
        1,0,0,0,0,47,1,0,0,0,0,49,1,0,0,0,0,51,1,0,0,0,0,53,1,0,0,0,0,55,
        1,0,0,0,0,57,1,0,0,0,0,59,1,0,0,0,0,61,1,0,0,0,0,63,1,0,0,0,0,65,
        1,0,0,0,1,67,1,0,0,0,3,71,1,0,0,0,5,75,1,0,0,0,7,78,1,0,0,0,9,83,
        1,0,0,0,11,89,1,0,0,0,13,91,1,0,0,0,15,93,1,0,0,0,17,119,1,0,0,0,
        19,121,1,0,0,0,21,128,1,0,0,0,23,131,1,0,0,0,25,134,1,0,0,0,27,137,
        1,0,0,0,29,140,1,0,0,0,31,142,1,0,0,0,33,144,1,0,0,0,35,146,1,0,
        0,0,37,148,1,0,0,0,39,150,1,0,0,0,41,152,1,0,0,0,43,154,1,0,0,0,
        45,156,1,0,0,0,47,158,1,0,0,0,49,160,1,0,0,0,51,163,1,0,0,0,53,165,
        1,0,0,0,55,167,1,0,0,0,57,170,1,0,0,0,59,173,1,0,0,0,61,181,1,0,
        0,0,63,196,1,0,0,0,65,208,1,0,0,0,67,68,5,60,0,0,68,69,5,105,0,0,
        69,70,5,62,0,0,70,2,1,0,0,0,71,72,5,60,0,0,72,73,5,111,0,0,73,74,
        5,62,0,0,74,4,1,0,0,0,75,76,5,105,0,0,76,77,5,102,0,0,77,6,1,0,0,
        0,78,79,5,101,0,0,79,80,5,108,0,0,80,81,5,115,0,0,81,82,5,101,0,
        0,82,8,1,0,0,0,83,84,5,119,0,0,84,85,5,104,0,0,85,86,5,105,0,0,86,
        87,5,108,0,0,87,88,5,101,0,0,88,10,1,0,0,0,89,90,5,123,0,0,90,12,
        1,0,0,0,91,92,5,125,0,0,92,14,1,0,0,0,93,94,5,35,0,0,94,16,1,0,0,
        0,95,96,5,76,0,0,96,120,5,68,0,0,97,98,5,67,0,0,98,120,5,68,0,0,
        99,100,5,67,0,0,100,120,5,73,0,0,101,102,5,76,0,0,102,120,5,73,0,
        0,103,104,5,77,0,0,104,105,5,67,0,0,105,120,5,73,0,0,106,107,5,77,
        0,0,107,108,5,67,0,0,108,120,5,68,0,0,109,110,5,77,0,0,110,120,5,
        79,0,0,111,112,5,69,0,0,112,120,5,68,0,0,113,114,5,68,0,0,114,120,
        5,67,0,0,115,116,5,69,0,0,116,120,5,73,0,0,117,118,5,80,0,0,118,
        120,5,79,0,0,119,95,1,0,0,0,119,97,1,0,0,0,119,99,1,0,0,0,119,101,
        1,0,0,0,119,103,1,0,0,0,119,106,1,0,0,0,119,109,1,0,0,0,119,111,
        1,0,0,0,119,113,1,0,0,0,119,115,1,0,0,0,119,117,1,0,0,0,120,18,1,
        0,0,0,121,125,7,0,0,0,122,124,7,1,0,0,123,122,1,0,0,0,124,127,1,
        0,0,0,125,123,1,0,0,0,125,126,1,0,0,0,126,20,1,0,0,0,127,125,1,0,
        0,0,128,129,5,58,0,0,129,130,5,58,0,0,130,22,1,0,0,0,131,132,5,60,
        0,0,132,133,5,45,0,0,133,24,1,0,0,0,134,135,5,60,0,0,135,136,5,60,
        0,0,136,26,1,0,0,0,137,138,5,62,0,0,138,139,5,62,0,0,139,28,1,0,
        0,0,140,141,5,40,0,0,141,30,1,0,0,0,142,143,5,41,0,0,143,32,1,0,
        0,0,144,145,5,91,0,0,145,34,1,0,0,0,146,147,5,93,0,0,147,36,1,0,
        0,0,148,149,5,43,0,0,149,38,1,0,0,0,150,151,5,45,0,0,151,40,1,0,
        0,0,152,153,5,42,0,0,153,42,1,0,0,0,154,155,5,47,0,0,155,44,1,0,
        0,0,156,157,5,37,0,0,157,46,1,0,0,0,158,159,5,61,0,0,159,48,1,0,
        0,0,160,161,5,47,0,0,161,162,5,61,0,0,162,50,1,0,0,0,163,164,5,62,
        0,0,164,52,1,0,0,0,165,166,5,60,0,0,166,54,1,0,0,0,167,168,5,62,
        0,0,168,169,5,61,0,0,169,56,1,0,0,0,170,171,5,60,0,0,171,172,5,61,
        0,0,172,58,1,0,0,0,173,177,7,2,0,0,174,176,7,3,0,0,175,174,1,0,0,
        0,176,179,1,0,0,0,177,175,1,0,0,0,177,178,1,0,0,0,178,60,1,0,0,0,
        179,177,1,0,0,0,180,182,5,45,0,0,181,180,1,0,0,0,181,182,1,0,0,0,
        182,184,1,0,0,0,183,185,7,4,0,0,184,183,1,0,0,0,185,186,1,0,0,0,
        186,184,1,0,0,0,186,187,1,0,0,0,187,194,1,0,0,0,188,190,5,46,0,0,
        189,191,7,4,0,0,190,189,1,0,0,0,191,192,1,0,0,0,192,190,1,0,0,0,
        192,193,1,0,0,0,193,195,1,0,0,0,194,188,1,0,0,0,194,195,1,0,0,0,
        195,62,1,0,0,0,196,202,5,34,0,0,197,198,5,92,0,0,198,201,9,0,0,0,
        199,201,8,5,0,0,200,197,1,0,0,0,200,199,1,0,0,0,201,204,1,0,0,0,
        202,200,1,0,0,0,202,203,1,0,0,0,203,205,1,0,0,0,204,202,1,0,0,0,
        205,206,5,34,0,0,206,64,1,0,0,0,207,209,7,6,0,0,208,207,1,0,0,0,
        209,210,1,0,0,0,210,208,1,0,0,0,210,211,1,0,0,0,211,212,1,0,0,0,
        212,213,6,32,0,0,213,66,1,0,0,0,11,0,119,125,177,181,186,192,194,
        200,202,210,1,6,0,0
    ]

class LenguajeLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    T__1 = 2
    T__2 = 3
    T__3 = 4
    T__4 = 5
    T__5 = 6
    T__6 = 7
    SIZE = 8
    TACTIC = 9
    PROCNAME = 10
    ASSIGN = 11
    AGREGADO = 12
    LB = 13
    RB = 14
    LP = 15
    RP = 16
    LS = 17
    RS = 18
    SUM = 19
    MIN = 20
    MUL = 21
    DIV = 22
    MOD = 23
    EQ = 24
    NEQ = 25
    GT = 26
    LT = 27
    GET = 28
    LET = 29
    VAR = 30
    NUM = 31
    STRING = 32
    WS = 33

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'<i>'", "'<o>'", "'if'", "'else'", "'while'", "'{'", "'}'", 
            "'#'", "'::'", "'<-'", "'<<'", "'>>'", "'('", "')'", "'['", 
            "']'", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'/='", "'>'", 
            "'<'", "'>='", "'<='" ]

    symbolicNames = [ "<INVALID>",
            "SIZE", "TACTIC", "PROCNAME", "ASSIGN", "AGREGADO", "LB", "RB", 
            "LP", "RP", "LS", "RS", "SUM", "MIN", "MUL", "DIV", "MOD", "EQ", 
            "NEQ", "GT", "LT", "GET", "LET", "VAR", "NUM", "STRING", "WS" ]

    ruleNames = [ "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", 
                  "SIZE", "TACTIC", "PROCNAME", "ASSIGN", "AGREGADO", "LB", 
                  "RB", "LP", "RP", "LS", "RS", "SUM", "MIN", "MUL", "DIV", 
                  "MOD", "EQ", "NEQ", "GT", "LT", "GET", "LET", "VAR", "NUM", 
                  "STRING", "WS" ]

    grammarFileName = "Lenguaje.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


