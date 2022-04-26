%option noyywrap

%{

        #include<stdio.h>

        int n=0;

%}


%%

["while"|"if"|"else"|"elseif"]*  {printf("Valid Keyword");}

^[^("while")|^("if")|^("else")|^("elseif")]*  {printf("InValid Keyword");break;}

%%

int main()

{
    printf("Enter a word to check if it is a valid keyword: ");
    yylex();
    return 0;
}