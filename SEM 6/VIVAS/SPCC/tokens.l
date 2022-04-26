%option noyywrap
%{
    #include<stdio.h>
%}

%%
"while"|"if"|"else"|"elseif"|"do"|"int"|"float" {printf("\n%s is Keywords\n",yytext);}
"<="|"="|"=>"|"+"|"-"|"/"|"*" {printf("\n%s is Operators\n",yytext);}
[a-zA-Z]* {printf("\n%s is Identifiers\n",yytext);}
[0-9]+ {printf("\n%s is Numbers\n",yytext);}
[{}()|, ;] {printf("\n%s is Separators\n",yytext);}
%%

int main()
{
    yylex();
    return 0;
}