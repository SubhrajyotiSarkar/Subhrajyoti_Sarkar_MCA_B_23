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

struct node *push(struct node *head, int n)
{
    if (head == NULL)
    {
        int var;
        printf("Enter Data: ");
        scanf("%d", &var);
        struct node *temp = (struct node *)malloc(sizeof(struct node *));
        temp->data = var;
        temp->link = NULL;
        head = temp;
    }
    else
    {
        struct node *loop = head;
        int count = 0;
        while (loop->link != NULL)
        {
            loop = loop->link;
            count++;
        }
        count++;
        if (count >= n)
        {
            printf("Stack is Full\n");
        }
        else
        {
            int var;
            printf("Enter Data: ");
            scanf("%d", &var);
            struct node *temp = (struct node *)malloc(sizeof(struct node *));
            temp->data = var;
            temp->link = NULL;
            loop->link = temp;
        }
    }
    return head;
}

struct node *pop(struct node *head)
{
    if (head == NULL)
    {
        return head;
    }
    else if (head->link == NULL)
    {
        head = NULL;
    }
    else
    {
        struct node *loop = head;
        while (loop->link->link != NULL)
        {
            loop = loop->link;
        }
        loop->link = NULL;
    }
    return head;
}

void peek(struct node *head)
{
    if (head != NULL)
    {
        struct node *loop = head;
        while (loop->link != NULL)
        {
            loop = loop->link;
        }
        printf("The Topmost Element in this Stack is: %d\n", loop->data);
    }
}

void display(struct node *head)
{
    if (head == NULL)
    {
        printf("Stack is Empty\n");
    }
    else
    {
        struct node *loop = head;
        while (loop != NULL)
        {
            printf("%d ", loop->data);
            loop = loop->link;
        }
    }
}

int main()
{
    struct node *head = NULL;
    int n;
    printf("Enter Number of Elements: ");
    scanf("%d", &n);
    while (1)
    {
        int ch;
        printf("1. Push\n2. Pop\n3. Peek:\n");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            head = push(head, n);
            break;
        case 2:
            head = pop(head);
            break;
        case 3:
            peek(head);
            break;
        }
        display(head);
        int x;
        printf("\nDo you want to modify the Stack?\n1. YES\n2. NO:\n");
        scanf("%d", &x);
        if (x == 2)
        {
            exit(0);
        }
    }
    return 0;
}
