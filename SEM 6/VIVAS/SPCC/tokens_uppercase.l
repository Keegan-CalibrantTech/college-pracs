%option noyywrap

%{
    #include<stdio.h>
    int UC=0;
%}

%%
[A-Z] {UC++;}
\n {printf("Total uppercase characters are %d", UC);}
%%

int main()
{
    printf("Enter Sentence: ");
    yylex();
    return 0;
}