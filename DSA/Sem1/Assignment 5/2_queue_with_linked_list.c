#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

struct node
{
	int data;
	struct node *link;
};

struct node *enqueue(struct node *head, int n, int var)
{
	struct node *temp = (struct node *)malloc(sizeof(struct node));
	temp->data = var;
	temp->link = NULL;

	if (head == NULL)
	{
		head = temp;
	}
	else
	{
		struct node *loop = head;
		int count = 0;
		while (loop->link != NULL)
		{
			count++;
			loop = loop->link;
		}
		count++;
		if (count >= n)
		{
			printf("Queue is Full\n");
		}
		else
		{
			loop->link = temp;
		}
	}
	return head;
}

struct node *dequeue(struct node *head)
{
	if (head == NULL)
	{
		printf("Queue is Empty\n");
	}
	else if (head->link == NULL)
	{
		head = NULL;
	}
	else
	{
		head = head->link;
	}
	return head;
}

void peek(struct node *head)
{
	if (head == NULL)
	{
		printf("Queue is Empty\n");
	}
	else
	{
		printf("The First Value of the Queue is: %d\n", head->data);
	}
}

void display(struct node *head)
{
	if (head == NULL)
	{
		printf("Queue is Empty\n");
	}
	else
	{
		printf("Your Queue is:\n");
		struct node *loop = head;
		while (loop != NULL)
		{
			printf("%d ", loop->data);
			loop = loop->link;
		}
		printf("\n");
	}
}

int main()
{
	int n;
	printf("Enter Number of Elements: ");
	scanf("%d", &n);
	struct node *head = NULL;
	int ch, num;
	while (1)
	{
		printf("1. Enqueue\n2. Dequeue\n3. Peek:\n");
		scanf("%d", &ch);
		switch (ch)
		{
		case 1:
			printf("Enter Data: ");
			scanf("%d", &num);
			head = enqueue(head, n, num);
			break;
		case 2:
			head = dequeue(head);
			break;
		case 3:
			peek(head);
			break;
		}
		display(head);
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
