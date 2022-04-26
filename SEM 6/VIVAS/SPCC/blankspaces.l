%{
    #include<stdio.h>
    int nlines=1,nnos,sc=0;
%}

%%
\n {
    nlines++;
}
([ ])+ sc++;
[0-9] {nnos++;}
%%

int yywrap(void)
{
    return 1;
}

int main()
{
    yyin= fopen("abc.txt","r");
    yylex();
    printf("\nNo. of lines=%d", nlines);
    printf("\nNo. of spaces=%d", sc);
    printf("\nNo. of numbers=%d", nnos);
    return 0;        
}