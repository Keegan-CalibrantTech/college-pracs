int fib(n)
{
    int i;
    int a=0;
    int b=1;
    int nt=a+b;
    printf("Fibonacci Series:%d\t%d",a,b);
    for(i=3;i<=n;++i)
    {
        printf("\t%d",nt);
        a=b;
        b=nt;
        nt=a+b;
    }                  
}

int prime(n)
{

    int a,i,flag=0;
    if(n == 0 || n == 1){
        flag = 1;
    }
    for(i=2;i<=n/2;++i)
    {
        if(n%i==0)
        {
            flag = 1;
            break;
        }        
    }
    if(flag == 0)
    {
        printf("It is a prime number!!");
    }
    else
    {
        printf("It is not a prime number!!");
    }
}
int leap(n)
{
    if(n % 400 == 0)
    {
        printf("%d is a leap year.", n);
    }
    else if (n % 100 == 0)
    {
        printf("%d is not a leap year.", n);
    }
        else if (n % 4 == 0)
    {
        printf("%d is a leap year.", n);
    }
    else
    {
        printf("%d is not a leap year.", n);
    }
}