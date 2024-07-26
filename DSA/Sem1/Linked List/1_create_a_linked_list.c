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

struct node *insertEnd(struct node *head, int var)
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
        while (loop->link != NULL)
        {
            loop = loop->link;
        }
        loop->link = temp;
    }
    return head;
}

// struct node *insertBeginning(struct node *head, int var)
// {
//     struct node *temp = (struct node *)malloc(sizeof(struct node));
//     temp->data = var;
//     temp->link = NULL;

//     if (head == NULL)
//     {
//         head = temp;
//     }
//     else
//     {
//         temp->link = head;
//     }
//     return temp;
// }

void display(struct node *head)
{
    struct node *disp = head;
    while (disp != NULL)
    {
        printf("%d ", disp->data);
        disp = disp->link;
    }
}

int main()
{
    int x = 2;
    struct node *head = NULL;
    do
    {
        int n;
        printf("Enter Data: ");
        scanf("%d", &n);
        head = insertEnd(head, n);
        display(head);
        printf("\nDo you want to insert more values?\n1. YES\n2. NO:\n");
        scanf("%d", &x);
    } while (x == 1);
    return 0;
}
