#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

struct node
{
    int data;
    struct node *next;
    struct node *prev;
};

struct node *insertBeginning(struct node *head, int var)
{
    struct node *temp = (struct node *)malloc(sizeof(struct node));
    temp->data = var;
    temp->next = temp;
    temp->prev = temp;

    if (head == NULL)
    {
        head = temp;
    }
    else
    {
        struct node *t = head;
        t = t->prev;

        temp->next = head;
        temp->prev = t;
        head->prev = temp;
        t->next = temp;
        head = temp;
    }
    return head;
}

struct node *insertEnd(struct node *head, int var)
{
    struct node *temp = (struct node *)malloc(sizeof(struct node));
    temp->data = var;
    temp->next = temp;
    temp->prev = temp;

    if (head == NULL)
    {
        head = temp;
    }
    else
    {
        struct node *t = head;
        t = t->prev;

        t->next = temp;
        temp->prev = t;
        temp->next = head;
        head->prev = temp;
    }
    return head;
}

struct node *deleteBeginning(struct node *head)
{
    if (head == NULL)
    {
        printf("Linked List is Already Empty\n");
    }
    else if (head->next == head)
    {
        head = NULL;
    }
    else
    {
        struct node *temp = head;
        temp = temp->prev;

        head = head->next;
        temp->next = head;
        head->prev = temp;
    }
    return head;
}

struct node *deleteEnd(struct node *head)
{
    if (head == NULL)
    {
        printf("Linked List is Already Empty\n");
    }
    else if (head->next == head)
    {
        head = NULL;
    }
    else
    {
        struct node *temp = head;
        temp = temp->prev->prev;

        temp->next = head;
        head->prev = temp;
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
        struct node *flag = head;
        while (loop->data != deleteafter)
        {
            if (loop->next == flag)
            {
                printf("Invalid Number");
                return head;
            }
            loop = loop->next;
        }
        if (loop->next == head)
        {
            head = deleteBeginning(head);
        }
        else
        {
            struct node *temp = loop;
            temp = temp->next->next;
            loop->next = temp;
            temp->prev = loop;
        }
    }
    return head;
}

void display(struct node *head)
{
    printf("Your Linked List:\n");
    if (head != NULL)
    {
        struct node *loop = head;
        do
        {
            printf("%d ", loop->data);
            loop = loop->next;
        } while (loop != head);
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
