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
    int front = -1, rear = -1;
    while (1)
    {
        int ch;
        printf("1. Push\n2. Pop\n3. Peek:\n");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            if (front == -1)
            {
                front = 0;
                rear = 0;
                printf("Enter Data: ");
                scanf("%d", &ar[front]);
            }
            else if (rear == (n - 1))
            {
                printf("Stack is Full\n");
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
                rear--;
            }
            break;
        case 3:
            if (front == -1)
            {
                break;
            }
            else
            {
                printf("The Topmost Value in the Stack is: %d", ar[rear]);
            }
            break;
        }
        if (front == -1)
        {
            printf("Stack is Empty\n");
        }
        else
        {
            printf("Your Stack: \n");
            for (int i = front; i <= rear; i++)
            {
                printf("%d ", ar[i]);
            }
            printf("\n");
        }
        int x;
        printf("Do you want to modify the Stack?\n1. Yes\n2. No:\n");
        scanf("%d", &x);
        if (x == 2)
        {
            exit(0);
        }
    }
    return 0;
}
