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
  circle(100,250,50);
  floodfill(100,250,WHITE);

  setfillstyle(SOLID_FILL,BLACK);
  circle(200,250,50);
  circle(300,250,50);
  circle(400,250,50);
  circle(500,250,50);
  floodfill(200,250,WHITE);
  floodfill(300,250,WHITE);
  floodfill(400,250,WHITE);
  floodfill(500,250,WHITE);
  return 0;
}

int Yellow()
{
  setfillstyle(SOLID_FILL,YELLOW);
  circle(200,250,50);
  floodfill(200,250,WHITE);

  setfillstyle(SOLID_FILL,BLACK);
  circle(100,250,50);
  circle(300,250,50);
  circle(400,250,50);
  circle(500,250,50);
  floodfill(100,250,WHITE);
  floodfill(300,250,WHITE);
  floodfill(400,250,WHITE);
  floodfill(500,250,WHITE);
  return 0;
}

int Green()
{
  setfillstyle(SOLID_FILL,GREEN);
  circle(300,250,50);
  floodfill(300,250,WHITE);
  setfillstyle(SOLID_FILL,BLACK);
  circle(200,250,50);
  circle(100,250,50);
  circle(400,250,50);
  circle(500,250,50);
  floodfill(200,250,WHITE);
  floodfill(100,250,WHITE);
  floodfill(400,250,WHITE);
  floodfill(500,250,WHITE);
  return 0;
}

int Blue()
{
  setfillstyle(SOLID_FILL,BLUE);
  circle(400,250,50);
  floodfill(400,250,WHITE);
  setfillstyle(SOLID_FILL,BLACK);
  circle(200,250,50);
  circle(300,250,50);
  circle(100,250,50);
  circle(500,250,50);
  floodfill(200,250,WHITE);
  floodfill(300,250,WHITE);
  floodfill(100,250,WHITE);
  floodfill(500,250,WHITE);
  return 0;
}
int Magenta()
{
  setfillstyle(SOLID_FILL,MAGENTA);
  circle(500,250,50);
  floodfill(500,250,WHITE);
  setfillstyle(SOLID_FILL,BLACK);
  circle(200,250,50);
  circle(300,250,50);
  circle(400,250,50);
  circle(100,250,50);
  floodfill(200,250,WHITE);
  floodfill(300,250,WHITE);
  floodfill(400,250,WHITE);
  floodfill(100,250,WHITE);
  return 0;
}

void main()
{
  int gd=DETECT, gm;
  int r,xc,yc,i=1;
  clrscr();

  // initializing graphics Function
  initgraph(&gd,&gm,"c:\\turboc3\\bgi");
  Circle1(50,100,250);
  Circle2(50,200,250);
  Circle3(50,300,250);
  Circle4(50,400,250);
  Circle5(50,500,250);
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
void Circle4(int r, int xc, int yc)
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
    putpixel(xc+x,yc+y,BLUE);
    putpixel(xc-y,yc-x,BLUE);
    putpixel(xc+y,yc-x,BLUE);
    putpixel(xc-y,yc+x,BLUE);
    putpixel(xc+y,yc+x,BLUE);
    putpixel(xc-x,yc-y,BLUE);
    putpixel(xc+x,yc-y,BLUE);
    putpixel(xc-x,yc+y,BLUE);
  }while(x<y);
}
void Circle5(int r, int xc, int yc)
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
    putpixel(xc+x,yc+y,MAGENTA);
    putpixel(xc-y,yc-x,MAGENTA);
    putpixel(xc+y,yc-x,MAGENTA);
    putpixel(xc-y,yc+x,MAGENTA);
    putpixel(xc+y,yc+x,MAGENTA);
    putpixel(xc-x,yc-y,MAGENTA);
    putpixel(xc+x,yc-y,MAGENTA);
    putpixel(xc-x,yc+y,MAGENTA);
  }while(x<y);
}
