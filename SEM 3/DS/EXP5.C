#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>
#include<string.h>
#define SIZE 100

int front = 0;
int back = 0;

typedef struct 
{
    char Item_name[50];
    int price, quantity, Item_Id;
} Item;

Item queue[SIZE];
int sum = 0;

int Insert() 
{
    if(back == 49) 
	{
        printf("Queue is FUll!!!\n");
    }
    else 
	{
        printf("Enter Items Details\n");
        printf("Item_Id : ");
        scanf("%d", &queue[back].Item_Id);
        printf("Item_name : ");
        scanf("%s",&queue[back].Item_name);
        printf("price: ");
        scanf("%d", &queue[back].price);
        printf("quantity: ");
        scanf("%d", &queue[back].quantity);
        printf("\n");
        sum += queue[back].price*queue[back].quantity;
        back++;
    }
	return 0;
}

int Remove() 
{
    if(front == back) 
	{
        printf("\nQueue is Empty!!!\n\n");
    }
    else 
	{
        front++;
        printf("Item Removed.\n");
        if(front == back) 
		{
            printf("\n\nALL ITEMS REMOVED. TOTAL BILL IS :-\n\n");
            sum -= queue[front].price*queue[front].quantity;
			printf("%d",sum);
        }
    }
	return 0;
}
int Peek() 
{
    if(front == back) 
	{
        printf("\nQueue is Empty!!!\n\n");
    }
    else 
	{
        printf("Item ID of item at front is : %d\n\n", queue[front].Item_Id);
    }
	return 0;
}
int Display() 
{
    if(front == back) 
	{
        printf("\nQueue is Empty!!!\n\n");
    }
    else 
	{
        int i = 0;
        float bill=0;
        printf("\tINVENTORY\n");
        printf("S.N.|    NAME           |   Id   |  QUANTITY |  PRICE\n");
    
        for(i = front; i < back; i++) 
		{
          printf("%d        %-15s     %-d       %-5d      %-5d  \n", i + 1,queue[i].Item_name,queue[i].Item_Id,queue[i].quantity,queue[i].price);
     
        }
        for(i=front;i<back;i++)
        {
        bill = bill + queue[i].price * queue[i].quantity;
        }	       
        if(front == -1 && back == -1)
        { 
            printf("Not valid!!");
            exit(0);
        }
        else
        {
            printf("\nYour bill is %f",bill);
        }
        printf("\n\n");
    }
	return 0;
}

int main() 
{
    int ch;
    while(1) 
	{
        printf("Options\n1.Insert\n2.Remove\n3.Peek\n4.Display\n5.Exit\n");
        printf("\nEnter your Option : ");
        scanf("%d", &ch);
        switch(ch) 
		{
        case 1:
            Insert();
            break;
        case 2:
            Remove();
            break;
        case 3:
            Peek();
            break;
        case 4:
            Display();
            break;
        case 5:exit(0);
		default:printf("Enter valid choice!!\n");
		}
    }
    return 0;
}
