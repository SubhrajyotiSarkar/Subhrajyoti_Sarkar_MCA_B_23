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

int main()
{
    // create a single linked list node
    struct node *head = NULL;
    head = (struct node *)malloc(sizeof(struct node));
    head->data = 5;
    head->link = NULL;

    // create second node
    struct node *node1 = (struct node *)malloc(sizeof(struct node));
    node1->data = 9;
    node1->link = NULL;
    head->link = node1;

    // display the linked list
    struct node *display = head;
    while (display != NULL)
    {
        printf("%d ", display->data);
        display = display->link;
    }
    return 0;
}
