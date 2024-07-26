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

struct node *insertBeginning(struct node *head, int var)
{
    struct node *temp = (struct node *)malloc(sizeof(struct node));
    temp->data = var;
    temp->link = temp;

    if (head != NULL)
    {
        struct node *loop = head;
        struct node *flag = head;
        while (loop->link != flag)
        {
            loop = loop->link;
        }
        loop->link = temp;
        temp->link = head;
    }
    return temp;
}

struct node *insertEnd(struct node *head, int var)
{
    struct node *temp = (struct node *)malloc(sizeof(struct node));
    temp->data = var;
    temp->link = temp;

    if (head == NULL)
    {
        head = temp;
    }
    else
    {
        struct node *loop = head;
        struct node *flag = head;
        while (loop->link != flag)
        {
            loop = loop->link;
        }
        loop->link = temp;
        temp->link = flag;
    }
    return head;
}

struct node *deleteBeginning(struct node *head)
{
    if (head == NULL)
    {
        printf("Linked List is Already Empty\n");
    }
    else if (head->link == head)
    {
        head = NULL;
    }
    else
    {
        struct node *loop = head;
        struct node *flag = head;
        while (loop->link != head)
        {
            loop = loop->link;
        }
        flag = flag->link;
        loop->link = flag;
        head = flag;
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
        struct node *flag = head;
        while (loop->link->link != flag)
        {
            loop = loop->link;
        }
        loop->link = flag;
    }
    return head;
}

struct node *deleteAfterNode(struct node *head, int deleteafter)
{
    if (head == NULL)
    {
        printf("Linked List is Already Empty");
    }
    else
    {
        struct node *loop = head;
        struct node *flag = head;
        while (loop->data != deleteafter)
        {
            if (loop->link == flag)
            {
                printf("Invalid Number");
                return head;
            }
            loop = loop->link;
        }
        if (loop->link == head)
        {
            head = head->link;
            loop->link = head;
        }
        else
        {
            struct node *temp = loop;
            temp = temp->link->link;
            loop->link = temp;
        }
    }
    return head;
}

void display(struct node *head)
{
    printf("Your Linked List:\n");
    if (head != NULL)
    {
        struct node *disp = head;
        do
        {
            printf("%d ", disp->data);
            disp = disp->link;
        } while (disp != head);
    }
}

int main()
{
    struct node *head = NULL;
    while (1)
    {
        int ch, num, n;
        printf("1. Insert at Beginning\n2. Insert at End\n");
        printf("3. Delete from Beginning\n4. Delete from End\n");
        printf("5. Delete After a Node\n6. Delete All:\n");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            printf("Enter Data: ");
            scanf("%d", &n);
            head = insertBeginning(head, n);
            break;
        case 2:
            printf("Enter Data: ");
            scanf("%d", &n);
            head = insertEnd(head, n);
            break;
        case 3:
            head = deleteBeginning(head);
            break;
        case 4:
            head = deleteEnd(head);
            break;
        case 5:
            printf("After which Number? ");
            scanf("%d", &num);
            head = deleteAfterNode(head, num);
            break;
        case 6:
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
