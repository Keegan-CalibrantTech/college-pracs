#include <stdio.h>
#include <graphics.h>
void boundaryFill4(int x, int y, int fill_color,int boundary_color)
{
    if(getpixel(x, y) != boundary_color && getpixel(x, y) != fill_color)
    {
	     putpixel(x, y, fill_color);
	     boundaryFill4(x + 1, y, fill_color, boundary_color);
	     boundaryFill4(x, y + 1, fill_color, boundary_color);
	     boundaryFill4(x - 1, y, fill_color, boundary_color);
	     boundaryFill4(x, y - 1, fill_color, boundary_color);
    }
}
int main()
{
    int gdriver = DETECT, gmode;
    int x, y, r;
    int ch;
    clrscr();
    initgraph(&gdriver, &gmode, "C:\\TURBOC3\\BGI");
    circle(200, 250,25);
    boundaryFill4(200, 250, RED, WHITE);
    getch();
    closegraph();
    return 0;
}