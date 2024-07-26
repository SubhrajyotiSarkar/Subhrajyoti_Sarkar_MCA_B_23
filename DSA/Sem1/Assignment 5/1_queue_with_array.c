#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int main()
{
	int n;
	printf("Enter Number of Elements: ");
	scanf("%d", &n);
	int ar[n];
	int ch;
	int front = -1, rear = -1;
	while (1)
	{
		printf("1. Enqueue\n2. Dequeue\n3. Peek:\n");
		scanf("%d", &ch);
		switch (ch)
		{
		case 1:
			if (rear == n - 1)
			{
				printf("Queue is Full\n");
			}
			else if (rear == -1)
			{
				front = 0;
				rear = 0;
				printf("Enter Data: ");
				scanf("%d", &ar[rear]);
			}
			else
			{
				rear++;
				printf("Enter Data: ");
				scanf("%d", &ar[rear]);
			}
			break;
		case 2:
			if (front == -1)
			{
				break;
			}
			else if (front == rear)
			{
				front = -1;
				rear = -1;
			}
			else
			{
				for (int i = front; i <= rear; i++)
				{
					ar[i] = ar[i + 1];
				}
				rear--;
			}
			break;
		case 3:
			if (front != -1)
			{
				printf("The First Value of the Queue is: %d\n", ar[front]);
			}
			else
			{
				printf("Queue is Empty\n");
			}
			break;
		}
		if (front == -1)
		{
			printf("Queue is Empty\n");
		}
		else
		{
			printf("Your Queue:\n");
			for (int i = front; i <= rear; i++)
			{
				printf("%d ", ar[i]);
			}
			printf("\n");
		}
		int x;
		printf("Do you want to modify the Queue?\n1. Yes\n2. No:\n");
		scanf("%d", &x);
		if (x == 2)
		{
			exit(0);
		}
	}
	return 0;
}
