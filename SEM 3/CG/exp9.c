#include <stdio.h>
#include <math.h>
#include <graphics.h>
#include <conio.h>
#include <stdlib.h>
void main()
{
   int x[4],y[4];
   int i;
   double puty,putx,t;
   int gd=DETECT,gm;
   initgraph(&gd,&gm,"c:\\turboc3\\bgi");
   for(i=0;i<4;i++)
   {
       printf("Enter value of x and y for control point %d:\n",i);
       scanf("%d%d",&x[i],&y[i]);
       putpixel(x[i],y[i],3);
   }
   for(t=0.0;t<=1.0;t=t+0.001){
        putx=pow(1-t,3)*x[0] + 3*t*pow(1-t,2)*x[1] + 3*t*t*pow(1-t,1)*x[2]+ pow(t,3)*x[3];
        puty=pow(1-t,3)*y[0] + 3*t*pow(1-t,2)*y[1] + 3*t*t*pow(1-t,1)*y[2]+ pow(t,3)*y[3];
        putpixel(putx,puty,WHITE);
   }
   getch();
   closegraph();
} 
