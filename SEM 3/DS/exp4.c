#include <stdio.h>
#include <string.h>
#define size 50
float stack[size]; //declare the stack array to store 50 integers//

int top = -1;
void push(float val);
float pop();
float peep();
void display();

float evaluate(char *);

int main()
{
    float ans;
    char postfix[50];
    int len = 0;
    printf("Enter the postfix expression:\n");
    gets(postfix);
    printf("\nThe postfix expression is: %s",postfix);
    ans=evaluate(postfix);
    printf("\nAnswer after evaluation = %0.2f",ans);
}

float evaluate(char postfix[50])
{
    int i=0;
    float val;
    float a,b;
    while(postfix[i]!='\0')
    {
        if(isalpha(postfix[i]))
        {
            printf("\nEnter the value of %c: ",postfix[i]);
            scanf("%f",&val);
            push(val);
        }
        else
        {
            b=pop();

            a=pop();
            /*printf("a=%f , b=%f",a,b);*/
            switch(postfix[i])
            {
                case '+': val= (a+b);
                          break;
                case '-': val= (a-b);
                          break;
                case '*': val= (a*b);
                          break;
                case '/': val= (a/b);
                          break;
            }
            /*printf("val=%f:",val);*/
            push(val);
        }
        i++;
    }
    return pop();
}

//floatstack.h contents//
void push(float val)
{
    if(top == size -1)
    {
        printf("\nStack Full!!\n");
    }
    else
    {
        top++;
        stack[top] = val;
    }
}

float pop()
{
    if(top == -1)
    {
        printf("\nStack Empty!!\n");
        return -1;
    }
    else
    {
        return(stack[top--]);
    }
}

float peep()
{
    if(top == -1)
    {
        /*printf("\nStack Empty!!\n");*/
        return -1;
    }
    else
    {
        /*printf("Element at the top = %d\n",stack[top]);*/
        return stack[top];
    }
}

void display()
{
    int i;
    if(top == -1)
    {
      printf("\nStack Empty!!\n");
    }
    else
    {
        printf("\nStack elements are:\n");
        for(i=top;i>=0;i--)
        {
            printf("%0.2f\n",stack[i]);
        }
    }
}
