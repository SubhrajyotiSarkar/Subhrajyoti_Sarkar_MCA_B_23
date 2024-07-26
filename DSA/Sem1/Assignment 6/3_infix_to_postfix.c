#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
typedef struct stack
{
    char *ch;
    struct stack *next;
} stack;
stack *head = NULL;
int top = 1;
int max;
void push(char *x, int max)
{
    if (top <= max)
    {
        stack *newnode;
        newnode = (stack *)malloc(sizeof(stack));
        newnode->ch = (char *)malloc(max * (sizeof(char)));
        strcpy(newnode->ch, x);
        newnode->next = NULL;
        if (head == NULL)
            head = newnode;
        else
        {
            stack *tmp = head;
            newnode->next = tmp;
            head = newnode;
            top++;
        }
    }
    else
        printf("Stack OVERFLOW!\n");
}
char *pop()
{
    if (head == NULL)
    {
        printf("Stack UNDERFLOW!\n");
        return " ";
    }
    else
    {
        char *s;
        stack *tmp;
        tmp = head->next;
        head->next = NULL;
        s = head->ch;
        free(head);
        head = tmp;
        top--;
        return s;
    }
}
void popall()
{
    int i = 1;
    if (head == NULL)
        i = 0;
    else
    {
        stack *tmp;
        tmp = head->next;
        printf("%s", head->ch);
        head->next = NULL;
        free(head);
        head = tmp;
        top--;
    }
    if (i)
        popall();
}
int isOperator(char x)
{
    switch (x)
    {
    case '+':
    case '-':
    case '/':
    case '*':
    case '^':
        return 1;
    }
    return 0;
}
char *operate(char qs)
{
    char *a, *b, c[2];
    c[0] = qs;
    c[1] = '\0';
    a = pop();
    b = pop();
    strcat(a, b);
    strcat(a, c);
    return a;
}
int main()
{
    char qs[100];
    printf("Enter Infix: ");
    scanf("%[^\n]s", qs);
    int length = strlen(qs);
    char *s = (char *)malloc(max * sizeof(char));
    char *q = (char *)malloc(sizeof(char));
    max = length;
    for (int i = length - 1; i >= 0; i--)
    {
        q[0] = qs[i];
        q[1] = '\0';
        if (isOperator(qs[i]))
        {
            s = operate(qs[i]);
            push(s, max);
        }
        else
        {
            push(q, max);
        }
    }
    printf("Postfix: ");
    popall();
    return 0;
}
