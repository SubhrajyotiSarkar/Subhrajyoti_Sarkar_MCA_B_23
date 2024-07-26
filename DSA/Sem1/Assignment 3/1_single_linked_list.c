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

struct node *insertBeginning(struct node *head, int var)
{
    struct node *temp = (struct node *)malloc(sizeof(struct node));
    temp->data = var;
    temp->link = NULL;

    if (head != NULL)
    {
        temp->link = head;
    }
    return temp;
}

struct node *insertBeforeNode(struct node *head, int var, int addbefore)
{
    struct node *temp = (struct node *)malloc(sizeof(struct node));
    temp->data = var;
    temp->link = NULL;

    if (head == NULL)
    {
        head = temp;
    }
    else if (head->data == addbefore)
    {
        head = insertBeginning(head, var);
    }
    else
    {
        struct node *loop1 = head;
        struct node *loop2 = head;
        while (loop1->link->data != addbefore)
        {
            loop1 = loop1->link;
            loop2 = loop2->link;
        }
        loop2 = loop2->link;
        temp->link = loop2;
        loop1->link = temp;
    }
    return head;
}

struct node *insertAfterNode(struct node *head, int var, int addafter)
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
        struct node *loop1 = head;
        struct node *loop2 = head;
        while (loop1->data != addafter)
        {
            loop1 = loop1->link;
            loop2 = loop2->link;
        }
        loop2 = loop2->link;
        temp->link = loop2;
        loop1->link = temp;
    }
    return head;
}

struct node *deleteBeginning(struct node *head)
{
    if (head == NULL)
    {
        printf("Linked List is Already Empty\n");
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

struct node *deleteEnd(struct node *head)
{
    if (head == NULL)
    {
        printf("Linked List is Already Empty\n");
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

struct node *deleteAfterNode(struct node *head, int deleteafter)
{
    if (head == NULL)
    {
        printf("Linked List is Already Empty\n");
    }
    else
    {
        struct node *loop = head;
        while (loop->data != deleteafter)
        {
            loop = loop->link;
            if (loop->link == NULL)
            {
                return head;
            }
        }
        if (loop->link->link != NULL)
        {
            struct node *temp = loop;
            temp = temp->link->link;
            loop->link = temp;
        }
        else
        {
            loop->link = NULL;
        }
    }
    return head;
}

void display(struct node *head)
{
    printf("Your Linked List:\n");
    struct node *disp = head;
    while (disp != NULL)
    {
        printf("%d ", disp->data);
        disp = disp->link;
    }
}

int main()
{
    struct node *head = NULL;
    while (1)
    {
        int ch, num, n;
        printf("1. Insert at End\n2. Insert at Beginning\n");
        printf("3. Insert Before a Node\n4. Insert After a Node\n");
        printf("5. Delete from Beginning\n6. Delete from End\n");
        printf("7. Delete After a Node\n8. Delete All:\n");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            printf("Enter Data: ");
            scanf("%d", &n);
            head = insertEnd(head, n);
            break;
        case 2:
            printf("Enter Data: ");
            scanf("%d", &n);
            head = insertBeginning(head, n);
            break;
        case 3:
            printf("Enter Data: ");
            scanf("%d", &n);
            printf("Before which Number? ");
            scanf("%d", &num);
            head = insertBeforeNode(head, n, num);
            break;
        case 4:
            printf("Enter Data: ");
            scanf("%d", &n);
            printf("After which Number? ");
            scanf("%d", &num);
            head = insertAfterNode(head, n, num);
            break;
        case 5:
            head = deleteBeginning(head);
            break;
        case 6:
            head = deleteEnd(head);
            break;
        case 7:
            printf("After which Number? ");
            scanf("%d", &num);
            head = deleteAfterNode(head, num);
            break;
        case 8:
            head = NULL;
        }
        display(head);
        int x;
        printf("\nDo you want to insert/delete more values?\n1. YES\n2. NO:\n");
        scanf("%d", &x);
        if (x == 2)
        {
            exit(0);
        }
    }
    return 0;
}
