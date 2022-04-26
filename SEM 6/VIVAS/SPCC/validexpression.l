%option noyywrap
%{
    #include<stdio.h>
    #include<string.h>
    int operands_count=0,operators_count=0,valid=1,top=-1,l=0,j=0;
    char operators[10][10],operands[10][10],stack[100];
%}

%%
"(" {
    top++;
    stack[top]= '(';
}

"[" {
    top++;
    stack[top]= '[';
}

"{" {
    top++;
    stack[top]= '{';
}

")" {
        if(stack[top]!='(')
        {
            valid=0;
        }
        else if(operands_count>0 && (operands_count-operators_count)!=1)
        {
            valid=0;
        }
        else
        {
            top--;
            operands_count=1;
            operators_count=0;
        }
}

"]" {
        if(stack[top]!='[')
        {
            valid=0;
        }
        else if(operands_count>0 && (operands_count-operators_count)!=1)
        {
            valid=0;
        }
        else
        {
            top--;
            operands_count=1;
            operators_count=0;
        }
}

"}" {
        if(stack[top]!='{')
        {
            valid=0;
        }
        else if(operands_count>0 && (operands_count-operators_count)!=1)
        {
            valid=0;
        }
        else
        {
            top--;
            operands_count=1;
            operators_count=0;
        }
}

"+"|"-"|"/"|"*" {
    operators_count++;
    strcpy(operators[l], yytext);
    l++;
}

[0-9]+|[a-zA-Z][a-zA-Z0-9_]* {
    operands_count++;
    strcpy(operands[j], yytext);
    j++;
}

%%
int main()
{
    printf("Enter the arithmetic expression: ");
    yylex();
    if(valid==1 && top==-1)
    {
        printf("\nValid Expression\n");
    }
    else
    {
        printf("\nInvalid Expression\n");
    }
    return 0;
}