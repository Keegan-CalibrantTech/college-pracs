#include<stdio.h>
#include<conio.h>
#include<dos.h>
#include<graphics.h>

void Circle1(int r, int xc, int yc);
void Circle2(int r, int xc, int yc);
void Circle3(int r, int xc, int yc);
void Circle4(int r, int xc, int yc);
void Circle5(int r, int xc, int yc);

int Red()
{
  setfillstyle(SOLID_FILL,RED);
  circle(350,100,50);
  floodfill(350,100,WHITE);

  setfillstyle(SOLID_FILL,BLACK);
  circle(350,250,50);
  circle(350,400,50);
  floodfill(350,250,WHITE);
  floodfill(350,450,WHITE);
  return 0;
}

int Yellow()
{
  setfillstyle(SOLID_FILL,YELLOW);
  circle(350,250,50);
  floodfill(350,250,WHITE);

  setfillstyle(SOLID_FILL,BLACK);
  circle(350,100,50);
  circle(350,400,50);
  floodfill(350,100,WHITE);
  floodfill(350,400,WHITE);
  return 0;
}

int Green()
{
  setfillstyle(SOLID_FILL,GREEN);
  circle(350,400,50);
  floodfill(350,400,WHITE);

  setfillstyle(SOLID_FILL,BLACK);
  circle(350,250,50);
  circle(350,100,50);
  floodfill(350,250,WHITE);
  floodfill(350,100,WHITE);
  return 0;
}

int Blue()
{
  setfillstyle(SOLID_FILL,BLUE);
  circle(350,400,50);
  floodfill(350,400,WHITE);

  setfillstyle(SOLID_FILL,BLACK);
  circle(350,250,50);
  circle(350,100,50);
  floodfill(350,250,WHITE);
  floodfill(350,100,WHITE);
  return 0;
}
int Magenta()
{
  setfillstyle(SOLID_FILL,MAGENTA);
  circle(350,400,50);
  floodfill(350,400,WHITE);

  setfillstyle(SOLID_FILL,BLACK);
  circle(350,250,50);
  circle(350,100,50);
  floodfill(350,250,WHITE);
  floodfill(350,100,WHITE);
  return 0;
}

void main()
{
  int gd=DETECT, gm;
  int r,xc,yc,i=1;
  clrscr();

  // initializing graphics Function
  initgraph(&gd,&gm,"c:\\turboc3\\bgi");
  Circle1(50,350,100);
  Circle2(50,350,250);
  Circle3(50,350,400);
  Circle4();
  for(i=1;i<10;i++)
  {
  Red();
  delay(2000);

  Yellow();
  delay(2000);

  Green();
  delay(2000);

  Blue();
  delay(2000);

  Magenta();
  delay(2000);
  }
  getch();
  closegraph();
}

void Circle1(int r, int xc, int yc)
{
  float p;
  int x=0, y;
  p=1.25-r;
  y=r;

  do{
    if(p<0.0)
    {
      x++;
      p=p+2*x+1;
    }
    else
    {
      x=x+1;
      y=y-1;
      p=p+2*x-2*y+1;
    }
    putpixel(xc+x,yc+y,RED);
    putpixel(xc-y,yc-x,RED);
    putpixel(xc+y,yc-x,RED);
    putpixel(xc-y,yc+x,RED);
    putpixel(xc+y,yc+x,RED);
    putpixel(xc-x,yc-y,RED);
    putpixel(xc+x,yc-y,RED);
    putpixel(xc-x,yc+y,RED);
  }while(x<y);
}


void Circle2(int r, int xc, int yc)
{
  float p;
  int x=0, y;
  p=1.25-r;
  y=r;

  do{
    if(p<0.0)
    {
      x++;
      p=p+2*x+1;
    }
    else
    {
      x=x+1;
      y=y-1;
      p=p+2*x-2*y+1;
    }
    putpixel(xc+x,yc+y,YELLOW);
    putpixel(xc-y,yc-x,YELLOW);
    putpixel(xc+y,yc-x,YELLOW);
    putpixel(xc-y,yc+x,YELLOW);
    putpixel(xc+y,yc+x,YELLOW);
    putpixel(xc-x,yc-y,YELLOW);
    putpixel(xc+x,yc-y,YELLOW);
    putpixel(xc-x,yc+y,YELLOW);
  }while(x<y);
}

void Circle3(int r, int xc, int yc)
{
  float p;
  int x=0, y;
  p=1.25-r;
  y=r;

  do{
    if(p<0.0)
    {
      x++;
      p=p+2*x+1;
    }
    else
    {
      x=x+1;
      y=y-1;
      p=p+2*x-2*y+1;
    }
    putpixel(xc+x,yc+y,GREEN);
    putpixel(xc-y,yc-x,GREEN);
    putpixel(xc+y,yc-x,GREEN);
    putpixel(xc-y,yc+x,GREEN);
    putpixel(xc+y,yc+x,GREEN);
    putpixel(xc-x,yc-y,GREEN);
    putpixel(xc+x,yc-y,GREEN);
    putpixel(xc-x,yc+y,GREEN);
  }while(x<y);
}
