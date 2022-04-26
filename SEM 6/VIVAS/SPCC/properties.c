#include<stdio.h>
#include "properties.h"
int main()
{
    int n;
    int n1;
    printf("Enter the choice: \n1. Factorial  \n2. Sum of N natural numbers\n3. Factors of N\n");
    scanf("%d",&n);
    switch(n)
    {
        case 1:
            printf("\nEnter the number to find the Factorial: ");
            scanf("%d",&n1);
            printf("Factorial of %d is %d",n1,fact(n1));
        break;
        case 2:
            printf("\nEnter the number to find the sum of N natural numbers: ");
            scanf("%d",&n1);
            printf("Sum of %d natural number is %d",n1,sum_n(n1));
        break;
        case 3:
            printf("\nEnter the number to find the factors: ");
            scanf("%d",&n1);
            printf("Factors of %d are ",n1);
            print_factors(n1);
        break;
        default:
            printf("Wrong Choice");
    }
    return 0;            

}