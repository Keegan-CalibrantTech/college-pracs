#include<stdio.h>
#include<stdlib.h>
typedef struct node
{
int data;
struct node *next;
}node;
int count = 0;
node * insert_begin(node *);
node * insert_end(node *);
node * insert_before(node *);
node * insert_after(node *);
node * insert_atn(node *);
void display(node *);
int main()
{
int choice;
struct node *start = NULL;
while(1)
{
printf("\n Menu: \n 1: Insert_begin \n 2: Insert_end \n 3: Insert_before \n 4: Insert_after \n 5: Insert_atn \n 6: Display \n 7: Exit \n Enter your choice: ");
scanf("%d",&choice);
switch(choice)
{
case 1: start = insert_begin(start);
break;
case 2: start = insert_end(start);
break;
case 3: start = insert_before(start);
break;
case 4: start = insert_after(start);
break;
case 5: start = insert_atn(start);
break;
case 6: display(start);
break;
case 7: exit(0);
default: printf("\n Enter a valid choice!");
break;
}
}
return 0;
}
node * insert_begin(node * start)
{
node * newnode = (node *)malloc(sizeof(node));
printf("Enter the data: ");
scanf("%d",&newnode->data);
newnode->next = start;
start = newnode;
count++;
return start;
}
node * insert_end(node * start)
{
node * newnode;
node * ptr;
newnode = (node *)malloc(sizeof(node));
printf("\n Enter the data: ");
scanf("%d",&newnode->data);
newnode->next = NULL;
if(start == NULL)
{
start = newnode;
}
else
{
ptr = start;
while(ptr->next != NULL)
{
ptr = ptr->next;
}
ptr->next = newnode;
count++;
}
return start;
}
node * insert_before(node * start)
{
node * newnode;
int val;
node * ptr1, * ptr2;
newnode = (node *)malloc(sizeof(node));
printf("\n Enter the data: ");
scanf("%d",&newnode->data);
printf("\n Enter the value before which the value is to be entered: ");
scanf("%d",&val);
if(start == NULL)
{
printf("\n Empty list!!! Insertion not possible!");
}
else
{
ptr1 = ptr2 = start;
while(ptr1!=NULL && ptr1->data != val)
{
ptr2 = ptr1;
ptr1 = ptr1->next;
}
if(ptr1!=NULL)
{
newnode->next = ptr1;
count++;
if(ptr1 == ptr2)
{
start = newnode;
}
else
{
ptr2->next = newnode;
}
}
else
{
printf("\n Value not found in the list!!!Insertion not possible!");
}
}
return start;
}
node * insert_after(node * start)
{
node * newnode;
int val;
node * ptr;
newnode = (node *)malloc(sizeof(node));
printf("\n Enter the data: ");
scanf("%d",&newnode->data);
printf("\n Enter the value after which the value is to be inserted: ");
scanf("%d",&val);
if(start == NULL)
{
printf("\n EMPTY list!!! Insertion not possible!");
}
else
{
ptr = start;
while(ptr!=NULL && ptr->data!=val)
{
ptr = ptr->next;
}
if(ptr!=NULL)
{
newnode->next = ptr->next;
ptr->next = newnode;
count++;
}
else
{
printf("\n Value not found in the list!!! Insertion not possible!");
}
}
return start;
}
node * insert_atn(node * start)
{
node * newnode;
int n, i;
node * ptr;
printf("\n Enter the position at which data is to be entered: ");
scanf("%d",&n);
if(start == NULL && n!=1)
{
printf("\n EMPTY list!!! Insertion not possible at the required position!");
}
else if(count < n && n!=1)
{
printf("\n The value cannot be inserted at %d position",n);
}
else
{
ptr = start;
if(n ==1)
{
start = insert_begin(start);
}
else
{
newnode = (node *)malloc(sizeof(node));
printf("\n Enter the data: ");
scanf("%d",&newnode->data);
while(ptr!=NULL && (n-2)!=0)
{
ptr = ptr->next;
n--;
}
if(ptr!=NULL)
{
newnode->next = ptr->next;
ptr->next = newnode;
count++;
}
}
}
return start;
}
void display(node * start)
{
node * ptr;
ptr = start;
if(ptr == NULL)
{
printf("\n Empty list!!!");
}
else
{
printf("\n The elements of the list are: \n ");
while(ptr!=NULL)
{
printf("%d\t",ptr->data);
ptr = ptr->next;
}
}
}