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

void print(struct node *display)
{
    while (display != NULL)
    {
        printf("%d ", display->data);
        display = display->link;
    }
}

int main()
{
    // create a single linked list node
    struct node *head = (struct node *)malloc(sizeof(struct node));
    printf("Enter The First Data: ");
    scanf("%d", &head->data);
    head->link = NULL;

    // create second node
    struct node *node1 = (struct node *)malloc(sizeof(struct node));
    printf("Enter The Second Data: ");
    scanf("%d", &node1->data);
    node1->link = NULL;
    head->link = node1;

    // display the original linked list
    struct node *display = head;
    printf("Original Linked List:\n");
    print(display);
    printf("\n");

    struct node *begin = (struct node *)malloc(sizeof(struct node));

    return 0;
}
