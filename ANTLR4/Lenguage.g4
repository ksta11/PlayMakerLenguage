grammar Lenguage;
root: procDef* EOF;

inss: ins*;
ins: (condition | while_)
| (input_ | output_ | proc | assign)
| (agregado) ;

input_: '<i>' VAR;
output_: '<o>' expr+;

condition: 'if' expr LB inss RB ('else' LB inss RB)?;
while_: 'while' expr LB inss RB;
siz: SIZE VAR;
SIZE: '#';

TACTIC: 'LD' | 'CD' | 'CI' | 'LI'  // Defensores
    | 'MCI' | 'MCD' | 'MO'       // Mediocampistas
    | 'ED' | 'DC' | 'EI'         // Delanteros
    | 'PO';                     // Portero

PROCNAME: [A-Z][a-zA-Z0-9_]*;
procDef: PROCNAME paramsId LB inss RB;
proc: PROCNAME paramsExpr (expr)*;

assign: VAR ASSIGN expr;
ASSIGN: '::';

paramsId: (VAR)*;
paramsExpr: (expr)*;


consult: VAR LS expr RS;
agregado: VAR AGREGADO expr
;

AGREGADO: '<-';

lista : '{' expr* '}';

expr: expr MUL expr #Mul
| expr DIV expr #Div
| expr MOD expr #Mod
| expr SUM expr #Sum
| expr MIN expr #Min
| expr GT expr #Gt
| expr GET expr #Get
| expr LT expr #Lt
| expr LET expr #Let
| expr EQ expr #Eq
| expr NEQ expr #Neq
| VAR #Var
| STRING #String
| NUM #Num
| lista #lst
| siz #sz
| consult #consul
| TACTIC #Tactic
| LP expr RP #Parens ;

LB: '<<';
RB: '>>';
LP: '(';
RP: ')';
LS: '[';
RS: ']';
SUM: '+';
MIN: '-';
MUL: '*';
DIV: '/';
MOD: '%';
EQ: '=';
NEQ: '/=';
GT: '>';
LT: '<';
GET: '>=';
LET: '<=';
VAR: [a-zA-Z][a-zA-Z0-9]*;

NUM: '-'?[0-9]+('.'[0-9]+)?;

STRING: '"' ( '\\' . | ~('\\'|'"'))* '"';


WS: [ \t\r\n]+ -> skip;