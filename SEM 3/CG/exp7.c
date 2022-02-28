#include <stdio.h>
#include <conio.h>
#include <graphics.h>
#include <string.h>
#include <math.h>
void main()
{ 
   int gd=DETECT,gm,ch;
   initgraph(&gd,&gm,"C://turboc3//bgi");
   cleardevice();
   printf("1. Translation\n2. Rotation\n3. Scaling\n4. Reflection\n5. Shearing\n6. Exit");
   printf("\nEnter the choice: ");
   scanf("%d",&ch);
   switch(ch)
   {
    case 1:
             {
                 int tx=50,ty=50,x1=100,x2=230,y1=100,y2=70;
                 cleardevice();
                 printf("\nRectangle before translation:\n");
                 printf("\t\t\n");
                 rectangle(x1,y1,x2,y2);
                 getch();
                 cleardevice();
                 printf("\nRectangle after translation:\n");
                 printf("\t\t\n");
                 rectangle(x1+tx,y1+ty,x2+tx,y2+ty);
                 getch();
                 main();
             }   
    case 2:      
             {   
                 long x1=100,y1=100,x2=200,y2=200;
                 double d1,xt,yt;
                 cleardevice();
                 printf("\n\n\n\tEnter the angle of rotation: ");
                 scanf("%lf",&d1);
                 d1=(d1*3.14)/180.0;
                 xt=x1+((x2-x1)*cos(d1)-(y2-y1)*sin(d1));
                 yt=y1+((x2-x1)*sin(d1)+(y2-y1)*cos(d1));
                 line(x1,y1,x2,y2);
                 getch();
                 cleardevice();
                 printf("\nLine after rotation:");
                 line(x1,y1,(int)xt,(int)yt);
                 getch();
                 main();
             }
    case 3:
             {   
                int x1=30,y1=30,x2=70,y2=70,y=2,x=2;
                cleardevice();
                printf("\nRectangle beore scaling:\n");
                printf("\t\t\n");
                rectangle(x1,y1,x2,y2); 
                getch();
                cleardevice();
                printf("\nRectangle after scaling:\n");
                printf("\t\t\n");
                rectangle(x1*x,y1*y,x2*x,y2*y);
                getch();
                main();      
             }   
    case 4:  
             {
                 int x1=50,y1=150,x2=75,y2=125,x3=100,y3=150,xt;
                 cleardevice();
                 printf("\n\n\nTriangle before reflection:");
                 line(x1,y1,x2,y2);
                 line(x1,y1,x3,y3);
                 line(x2,y2,x3,y3);
                 getch();
                 cleardevice();
                 printf("\n\n\nTriangle after reflection:");
                 line(x1,-y1+200,x2,-y2+200);
                 line(x1,-y1+200,x3,-y3+200);
                 line(x2,-y2+200,x3,-y3+200);
                 getch();
                 main();
             }
     case 5: 
             {
                 int x1=100,x2=100,y1=100,y2=200,x3=200,y3=200,x4=200,y4=100,shx=1;
                 cleardevice();
                 printf("Rectangle before shearing\n");
                 printf("\t\t");
                 line(x1,y1,x2,y2);
                 line(x1,y1,x4,y4);
                 line(x2,y2,x3,y3);
                 line(x3,y3,x4,y4);
                 getch();
                 cleardevice();
                 printf("\nRectangle after shearing\n");
                 printf("\t\t");
                 line(x1+shx*y1,y1,x2,y2);
                 line(x1+shx*y1,y1,x4+shx*y4,y4);
                 line(x2,y2,x3,y3);
                 line(x3,y3,x4+shx*y4,y4);
                 getch();
                 main();
             }
   }
closegraph();
}
