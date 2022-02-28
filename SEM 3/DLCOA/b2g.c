#include<stdio.h>

    #include<conio.h>

    void main()

    {int a[10],i=0,c=0,n,b[10];

    printf("\n enter the binary code");

    scanf("%d",&n);

    while(n!=0)

    {a[i]=n%10;

    n/=10;

    i++;

    c++;

    }

    for(i=c-1;i>=0;i--)

    {

    b[i]=a[i];

    }

    for(i=c-1;i>=0;i--)

    {

    if(b[i]==1)

    {

    if(a[i-1]==1)

    a[i-1]=0;

    else

    a[i-1]=1;

    }

    }

    printf("\n the gray code is");

    for(i=c-1;i>=0;i--)

    printf("%d",a[i]);

    getch();

    }