%option noyywrap
%{
    #include<stdio.h>
    int V=0, C=0;
%}

%%
[AEOIUaeiou] {V++;}
[^AEOIUaeiou\n] {C++;}
\n {printf("Vowels = %d \nConsanants = %d",V,C);}
%%

int main()
{
    printf("Enter string: ");
    yylex();
    return 0;
}