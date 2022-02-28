#include<stdio.h>
#include<conio.h>
int n;
void bfs(int adj[10][10],int visited[],int start)
{
	int queue[10],rear=-1,front=-1,i;
	queue[++rear]=start;
	visited[start]=1;
	while(rear!=front)
	{
		start=queue[++front];
		printf("%c-",start+65);
		for(i=0;i<n;i++)
		{
			if(adj[start][i]==1 && visited[i]==0)
			{
				queue[++rear]=i;
				visited[i]=1;
			}
		}
	}
}
void dfs(int adj[10][10],int visited[],int start)
{
	int stack[10];
	int top=-1,i;
	printf("%c-",start+65);
	visited[start]=1;
	stack[++top]=start;
	while(top!=-1)
	{
		start=stack[top];
		for(i=0;i<n;i++)
		{
			if(adj[start][i]==1 && visited[i]==0)
			{
				stack[++top]=i;
				printf("%c-",i+65);
				visited[i]=1;
				break;
			}
		}
		if(i==n)
		{
			top--;
		}
	}
}
void main()
{
	int start;
	int visited[10]={0};
	int adj[10][10],i,j;
	clrscr();
	printf("Enter The number of nodes in the graph:");
	scanf("%d",&n);
	printf("Enter the adjacency matrix : \n");
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			scanf("%d",&adj[i][j]);
		}
	}
	printf("Enter The Starting Point:");
	scanf("%d",&start);
	printf("BFS Transversal : ");
	bfs(adj,visited,start);
	for(i=0;i<n;i++)
	{
		visited[i]=0;
	}
	printf("\nDFS Transversal : ");
	dfs(adj,visited,start);
	getch();
}