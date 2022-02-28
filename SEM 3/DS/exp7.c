#include<stdio.h>
#include<stdlib.h>

typedef struct node
{
   int data;
   struct node *next;
}node;

void display(node * );
node * insert_beg(node * );
node * insert_end(node * );
node * insert_before(node * );
node * delete_beg(node * );
node * delete_end(node * );
node * delete_after(node * );
node * search(node *, int val);
node * replace(node * );

int main()
{
   struct node * start = NULL;
   int ch;int val;
   while(1)
   {
      printf("\nMenu:\n1.Insert_beg\n2.Insert_end\n3.Insert_before\n4.Delete_beg\n5.Delete_end\n6.Delete_after\n7.Search\n8.Replace\n9.Display\n10.Exit");
	  printf("\nEnter your choice:");
	  scanf("%d",&ch);
	  switch(ch)
	  {
	     case 1: start = insert_beg(start); break;
		 case 2: start = insert_end(start); break;
		 case 3: start = insert_before(start); break;
         case 4: start = delete_beg(start); break;
         case 5: start = delete_end(start); break;
	     case 6: start = delete_after(start); break;
	     case 7 :printf("Enter Value to Search");
		         scanf("%d",&val);
			     search(start,val); break;
	     case 8: start = replace(start); break;
	     case 9: display(start); break;
         case 10:exit(0);
	  }
	}
}

void display(node * start)
{
   node * ptr;
   ptr=start;
   if(ptr==NULL)
   {
      printf("Empty list"); return;
   }
   printf("\nElememts of the List are\n");
   while(ptr!=NULL)
   {
      printf("%d ", ptr->data);
	  ptr=ptr->next;
   }
}

node * insert_beg(node * start)
{
   node * newnode=(node *)malloc(sizeof(node));
   printf("Enter Data:");
   scanf("%d",&newnode->data);
   newnode->next=start;
   start=newnode;
   return start;
}

node * insert_end(node * start)
{
   node * ptr;
   node *newnode=(node *)malloc(sizeof(node));
   printf("Enter Data:");
   scanf("%d",&newnode->data);
   newnode->next=NULL;
   if(start==NULL)
   {
      start = newnode;
   }
   else
   {
      ptr=start;
	  while(ptr->next!=NULL)
	  {
	     ptr=ptr->next;
	  }
	  ptr->next=newnode;
   }
   return start;
}

node * insert_before(node * start)
{
   node *ptr1,*ptr2;
   int val;
   node *newnode=(node *)malloc(sizeof(node));
   printf("Enter Data:");
   scanf("%d",&newnode->data);
   newnode->next=NULL;
   printf("Enter value of node before which to insert:");
   scanf("%d",&val);
   if(start==NULL)
   {
      printf("List is empty cannot insert!");
   }
   else
   {
      ptr1=ptr2=start;
	  while(ptr2!=NULL && ptr2->data!=val)
	  {
	     ptr1=ptr2;
		 ptr2=ptr2->next;
	  }
	  if(ptr2==NULL)
	  {
	     printf("Value not found cannot insert");
	  }
	  else
	  {
	     newnode->next=ptr2;
		 if(ptr1==ptr2)
		 {
		    start=newnode;
		 }
		 else
		 {
		    ptr1->next=newnode;
		 }
	  }
	}
	return start;
}

node * delete_beg(node * start)
{
   node * ptr;
   if(start==NULL)
   {
      printf("List empty cannot delete!");
   }
   else
   {
      ptr=start;
	  start = start->next;
	  free(ptr);
   }
   return start;
}

node * delete_end(node * start)
{
   node * ptr;
   if(start==NULL)
   {
      printf("List Empty cannot delete!");
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

node * delete_after(node * start)
{
    node * ptr1;
    node * ptr2;
    int val;
    printf("Enter the value of the node after which to delete:");
    scanf("%d",&val);
    if(start==NULL)
    {
        printf("List is empty. Can't delete.\n");
    }
    if(start->next==NULL)
    {
        printf("This is the only node in the list!! Nothing to delete after it.\n");
    }
    if(start->data==val)
    {
          ptr1=start;
          ptr2=start->next;
          ptr1->next=ptr2->next;
          free(ptr2);
    }
    else
    {
        ptr2=start;
        ptr1=ptr2;
        while(ptr1!=NULL && ptr1->data!=val)
        {
            ptr1=ptr2;
            ptr2=ptr2->next;
        }
        if(ptr1->next!=NULL)
        {
            ptr1->next=ptr2->next;
            free(ptr2);
        }
        else
        {
            printf("Value not found!! Can't delete.\n");
        }
    }
    return start;
}

node * search(node * start, int val)
{
   int count = 1;
   node * ptr;
   ptr = start;
   while(ptr!=NULL && ptr->data!=val)
   {
      ptr=ptr->next;
	  count++;
   }
   if(ptr!=NULL)
   {
      printf("Value found at position %d",count);
	  return ptr;
   }
   else
   {
      printf("Value not found");
	  return NULL;
   }
}

node * replace(node * start)
{
   node * ptr;
   int val;
   printf("Enter the value of node to replace:");
   scanf("%d",&val);
   ptr=search(start,val);
   if(ptr!=NULL)
   {
     printf("Enter the new value of the node:");
	 scanf("%d",&ptr->data);
   }
   return start;
}
