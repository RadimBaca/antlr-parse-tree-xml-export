grammar str;

expr:
 STRING expr                                            # exprString
 | LR_BRACKET expr RR_BRACKET expr          # exprParenthesis
 | LR_STRING_BRACKET expr RR_BRACKET expr   # exprRule 
 | <EOF>                                                # exprEnd
 | EOF_MARK                                                # exprEOF
 |                                                      # exprEpsilon
;

EOF_MARK:            '<EOF>' ;
LR_STRING_BRACKET:  '(' ~[ ()]+;
LR_BRACKET:         '(';
RR_BRACKET:         ')';
STRING:             ~[ ()]+;
SPACE:              [ \t\r\n]+    -> skip; // toss out whitespace