#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>

#define MAX_SIZE 50

int stack[MAX_SIZE];
int top = -1;

void initialize()
{
    top = -1;
}

int isEmpty()
{
    return top == -1;
}

int isFull()
{
    return top == MAX_SIZE - 1;
}

void push(int value)
{
    if (isFull())
    {
        printf("Stack overflow. Cannot push %d.\n", value);
    }
    else
    {
        stack[++top] = value;
    }
}

int pop()
{
    if (isEmpty())
    {
        printf("Stack underflow. Cannot pop from an empty stack.\n");
        return -1; // Return an invalid value
    }
    else
    {
        return stack[top--];
    }
}

int evaluatePrefix(char *expression)
{
    int len = strlen(expression);

    for (int i = len - 1; i >= 0; i--)
    {
        if (isdigit(expression[i]))
        {
            push(expression[i] - '0');
        }
        else if (expression[i] == ' ')
        {
            continue;
        }
        else
        {
            int operand1 = pop();
            int operand2 = pop();

            switch (expression[i])
            {
            case '+':
                push(operand1 + operand2);
                break;
            case '-':
                push(operand1 - operand2);
                break;
            case '*':
                push(operand1 * operand2);
                break;
            case '/':
                push(operand1 / operand2);
                break;
            default:
                printf("Invalid operator: %c\n", expression[i]);
                return -1; // Return an error code
            }
        }
    }

    return pop();
}

int main()
{
    char expression[MAX_SIZE];

    printf("Enter a prefix expression: ");
    scanf("%[^\n]%*c", expression);

    int result = evaluatePrefix(expression);

    if (result != -1)
    {
        printf("Result: %d\n", result);
    }
    else
    {
        printf("Error in evaluating the expression.\n");
    }

    return 0;
}
