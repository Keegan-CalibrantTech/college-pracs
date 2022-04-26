#include <stdio.h>
#include "Convert.h"
int main(){
    int n;
    float n1;        
    float ctf,ftc,mf,fm,lcf,cfl;
    printf("Enter the choice: \n1. Celsius to Fahrenheit \n2. Fahrenheit to Celsius \n3. Metre to Feet \n4. Feet to Metre \n5. Litre to Cubic Feet \n6. Cubic Feet to Litre\n");
    scanf("%d",&n);
    switch(n)
    {
        case 1:
            printf("Enter the temperature in Degree Celsius: ");
            scanf("%f",&n1);
            ctf = CF(n1);
            printf("Temperature in Degree Fahrenheit: %f", ctf);
        break;
        case 2:
            printf("Enter the temperature in Degree Fahrenheit: ");
            scanf("%f",&n1);
            ftc = FC(n1);
            printf("Temperature in Degree Celsius: %f", ftc);
        break;
        case 3:
            printf("Enter the Metre: ");
            scanf("%f",&n1);
            mf = MF(n1);
            printf("Feet in metre: %f", mf);
        break;
        case 4:
            printf("Enter the Feet: ");
            scanf("%f",&n1);
            fm = FM(n1);
            printf("Metre in feet: %f", fm);
        break;
        case 5:
            printf("Enter the volume in Litre: ");
            scanf("%f",&n1);
            lcf = LCF(n1);
            printf("Cubic Feet in Litre: %f", lcf);
        break;
        case 6:
            printf("Enter the volume in Cubic feet: ");
            scanf("%f",&n1);
            cfl = CFL(n1);
            printf("Litre in Cubic Feet: %f", cfl);
        break;
        default:
            printf("Wrong Choice");                                 
    }        
    return 0;
}