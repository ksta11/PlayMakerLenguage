grammar Lenguage;
root: procDef* EOF;

inss: ins*;
ins: (condition | while_)
| (input_ | output_ | proc | assign)
| (add) | tactics;

input_: '<i>' VAR;
output_: '<o>' (expr)*;

condition: IF expr LB inss RB (ELSE LB inss RB)?;
while_: 'while' expr LB inss RB;
siz: SIZE VAR;
SIZE: '#';

IF: 'if';
ELSE: 'else';

tactics: 'tactic' LB tacticName LP position (',' position)* RP RB;

tacticName: STRING;

position: POSITION;

POSITION: 'LD' | 'CD' | 'CI' | 'LI'  // Defensores
    | 'MI' | 'MD' | 'MO'       // Mediocampistas
    | 'ED' | 'DC' | 'EI'         // Delanteros
    | 'PO';                     // Portero

PROCNAME: [A-Z][a-zA-Z0-9_]*;
procDef: PROCNAME paramsId LB inss RB;
proc: PROCNAME paramsExpr;

assign: VAR ASSIGN expr;
ASSIGN: '::';

paramsId: (VAR)*;
paramsExpr: (expr)*;


consult: VAR LS expr RS;
add: VAR ADD expr;

ADD: '<-';

lista : '{' expr* '}';

expr:
  NUM #Num
| FLOAT #Float
| VAR #Var
| STRING #String
| lista #lst
| siz #sz
| consult #consul
| expr MUL expr #Mul
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

NUM: '-'?[0-9]+;
FLOAT: NUM'.'([0-9])+;

STRING: '"' ( '\\' . | ~('\\'|'"'))* '"';


WS: [ \t\r\n]+ -> skip;