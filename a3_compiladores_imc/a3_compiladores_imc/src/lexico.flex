import java_cup.runtime.*;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;

%%
%notunix
%cup 
%class Lexer
digito       = [0-9]

inteiro      = {digito} ({digito})* 
flutuantes   = ({digito})+\.({digito})+

novalinha = \r | \n | \r\n
vazios = [ \t\f] | {novalinha}

%%
";"              { return new Symbol(Sym.PTVIRG); }
","              { return new Symbol(Sym.VIRGULA); }
"="              { return new Symbol(Sym.IGUAL); }

"IMC"            { return new Symbol(Sym.IMC); }
"IAC"            { return new Symbol(Sym.IAC); }

{inteiro}        {
                    int aux = Integer.parseInt(yytext());
                    return new Symbol(Sym.INTEIRO, yyline, yycolumn, Integer.valueOf(aux));
                 }
{flutuantes}     {
                    Double aux = Double.parseDouble(yytext());
                    return new Symbol(Sym.FLUTUANTE, yyline, yycolumn, Double.valueOf(aux));
                 }
{vazios}         {}
<<EOF>>          { return new Symbol(Sym.EOF, yyline, yycolumn, yytext()); }