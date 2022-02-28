#include<stdio.h>
#include<stdlib.h>
typedef struct node
{
	int data;
	struct node *next;
}node;
void display(node *);
node *insert_beg(node *);
node *delete_beg(node *);
node *delete_end(node *);
node *delete_at(node *);
node *delete_before(node *);
node *delete_after(node *);
int main()
{
	int i;
	struct node *start=NULL;
	int n;
	clrscr();
	printf("Enter values for 10 nodes:\n");
	for(i=0;i<10;i++)
	{
		start=insert_beg(start);
	}
	while(1)
	{
		printf("\nMenu:\n 1.Delete_beg\n 2.Delete_end\n 3.Delete_at\n 4.Delete_before\n5.Delete_after\n 6.Display\n 7.Exit\n");
		printf("\nEnter your choice:");
		scanf("%d",&n);
		switch(n)
		{
			case 1:
			start=delete_beg(start);
			break;
			case 2:
			start=delete_end(start);
			break;
			case 3:
			start=delete_at(start);
			break;
			case 4:
			start=delete_before(start);
			break;
			case 5:
			start=delete_after(start);
			break;
			case 6:
			display(start);
			break;
			case 7:
			exit(0);
		}
	}
	getch();
}
void display(node *start)
{
	node *ptr;
	ptr=start;
	if(ptr==NULL)
	{
		printf("Empty List");
	}
	else
	{
		printf("\nElements of the list:\n");
		while(ptr!=NULL)
		{
			printf("%d ",ptr->data);
			ptr=ptr->next;
		}
	}
}
node *delete_beg(node *start)
{
	node *ptr;
	if(start==NULL)
	printf("List empty!! Can’t Delete");
	else
	{
		ptr=start;
		start=start->next;
		free(ptr);
	}
	return start;
}
node *delete_end(node *start)
{
	node *ptr;
	if(start==NULL)
	{
		printf("List empty!! Can’t Delete");
	}
	else
	{
		ptr=start;
		while(ptr->next->next!=NULL)
		{
			ptr=ptr->next;
		}
		free(ptr->next);
		ptr->next=NULL;
	}
	return start;
}
node *delete_at(node *start)
{
	node *ptr1, *ptr2;
	int pos,count=1;
	printf("Enter position from which to delete:");
	scanf("%d",&pos);
	if(start==NULL)
	{
		printf("List empty!! Can’t Delete");
	}
	if(pos==1)
	{
		ptr1=start;
		start=start->next;
		free(ptr1);
	}
	else
	{
		ptr1=start;
		ptr2=start;
		while(ptr2!=NULL&&count<pos)
		{
			count=count++;
			ptr1=ptr2;
			ptr2=ptr2->next;
		}
		if(count==pos)
		{
			ptr1->next=ptr2->next;
			free(ptr2);
		}
		else
		{
			printf("\nPosition doesn't exist!! cannot delete");
		}
	}
	return start;
}
node *delete_before(node *start)
{
	node *ptr1,*ptr2;
	int val;
	printf("Enter value of node before which to delete:");
	scanf("%d",&val);
	if(start==NULL)
	{
		printf("List empty cannot delete!!");
	}
	else
	{
		ptr1=start;
		ptr2=ptr1->next;
		if(ptr1->data==val)
		{
			printf("This is the first node!! nothing to delete before it!!");
			return start;
		}
		while(ptr2!=NULL && ptr2->next->data!=val)
		{
			ptr1=ptr2;
			ptr2=ptr2->next;
		}
		if(ptr2==NULL)
		{
			printf("Value not found!! Can’t delete");
		}
		else
		{
			ptr1->next=ptr2->next;
			free(ptr2);
		}
	}
	return start;
}
node *delete_after(node *start)
{
	node *ptr1,*ptr2;
	int val;
	printf("Enter the value after which the node has to be deleted:");
	scanf("%d",&val);
	if(start==NULL)
	{
		printf("List empty can’t delete!!");
	}
	else
	{
		ptr1=start;
		ptr2=ptr1->next;
	}
	while(ptr1!=NULL && ptr1->data!=val)
	{
		ptr1=ptr2;
		ptr2=ptr2->next;
	}
	if(ptr1==NULL)
	{
		printf("Value not found!! Can’t Delete");
	}
	else
	{
		ptr1->next=ptr2->next;
		free(ptr2);
	}
	return start;
}
node *insert_beg(node *start)
{
	node *newnode=malloc(sizeof(node));
	printf("Enter data:");
	scanf("%d",&newnode->data);
	newnode->next=start;
	start=newnode;
	return start;
}