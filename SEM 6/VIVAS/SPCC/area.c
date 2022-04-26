#include <stdio.h>
#include "Area.h"
int main()
{
        int n;
        float radius, length, width, base, height, side;
        float A_circle, A_rectangle, A_triangle, A_square;
        printf("Enter the choice: \n1. Circle\n2. Rectangle\n3. Square\n4. Triangle\n");
        scanf("%d",&n);
        switch(n)
        {
            case 1:
                printf("Enter the radius: ");
                scanf("%f",&radius);
                A_circle = C_area(radius);
                printf("Area of the Circle: %f", A_circle);
                break;
            case 2:
                printf("Enter the length and width: ");
                scanf("%f%f",&length,&width);
                A_rectangle = R_area(length,width);
                printf("Area of the Rectangle: %f", A_rectangle);
                break;
            case 3:
                printf("Enter the side: ");
                scanf("%f",&side);
                A_square = S_area(side);
                printf("Area of the Square: %f", A_square);
                break;
            case 4:
                printf("Enter the base and height: ");
                scanf("%f%f",&base,&height);
                A_triangle = T_area(base,height);
                printf("Area of the Triangle: %f", A_triangle);
                break;
            default:
                printf("Wrong Choice");                                  
        }
        return 0;
}