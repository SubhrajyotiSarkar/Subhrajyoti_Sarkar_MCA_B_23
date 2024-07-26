#include <stdio.h>
#include <conio.h>
#define max 6
int main()
{
	int queue[max], rear = -1, front = -1;
	int visited[max], adj[max][max];
	int i, j, start;
	printf("Enter the value of Adjacency Matrix=\n ");
	for (i = 0; i < max; i++)
	{
		for (j = 0; j < max; j++)
		{
			scanf("%d", &adj[i][j]);
		}
	}
	for (i = 0; i < max; i++)
	{
		visited[i] = 0;
	}
	printf("Enter the first node = ");
	scanf("%d", &start);
	queue[++rear] = start;
	++front;
	visited[start] = 1;
	printf("\nThe output is =  ");
	printf("|");
	while (rear >= front)
	{
		start = queue[front++];
		printf(" %d |", start);

		for (i = 0; i < max; i++)
		{
			if (adj[start][i] == 1 && visited[i] == 0)
			{
				queue[++rear] = i;
				visited[i] = 1;
			}
		}
	}
	getch();
}
