%{
    #include<stdio.h>
    int nLines=1;
%}

%%
\n {
        nLines++;
    }
%%

int yywrap(void)
{        
    return 1;
}

int main()
{
    yyin = fopen("abc.txt","r");
    yylex();
    printf("\nTotal lines in the File are %d",nLines);
    return 0;
}