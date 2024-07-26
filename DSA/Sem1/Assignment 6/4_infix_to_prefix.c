#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#define MAX_EXPRESSION_SIZE 100

typedef struct
{
    char data[MAX_EXPRESSION_SIZE];
    int top;
} Stack;

void initialize(Stack *stack)
{
    stack->top = -1;
}

void push(Stack *stack, char item)
{
    if (stack->top == MAX_EXPRESSION_SIZE - 1)
    {
        printf("Stack Overflow\n");
        exit(EXIT_FAILURE);
    }
    stack->data[++stack->top] = item;
}

char pop(Stack *stack)
{
    if (stack->top == -1)
    {
        printf("Stack Underflow\n");
        exit(EXIT_FAILURE);
    }
    return stack->data[stack->top--];
}

int isOperator(char c)
{
    return c == '+' || c == '-' || c == '*' || c == '/';
}

int getPrecedence(char operator)
{
    switch (operator)
    {
    case '+':
    case '-':
        return 1;
    case '*':
    case '/':
        return 2;
    default:
        return 0;
    }
}

void reverseString(char *str)
{
    int length = strlen(str);
    int i, j;
    char temp;
    for (i = 0, j = length - 1; i < j; i++, j--)
    {
        temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}

void infixToPrefix(char *infixExpression, char *prefixExpression)
{
    Stack operatorStack;
    initialize(&operatorStack);
    reverseString(infixExpression);
    for (int i = 0; i < strlen(infixExpression); i++)
    {
        if (infixExpression[i] == '(')
        {
            infixExpression[i] = ')';
        }
        else if (infixExpression[i] == ')')
        {
            infixExpression[i] = '(';
        }
    }

    int j = 0;
    for (int i = 0; i < strlen(infixExpression); i++)
    {
        char currentChar = infixExpression[i];

        if (isalnum(currentChar))
        {
            prefixExpression[j++] = currentChar;
        }
        else if (currentChar == '(')
        {
            push(&operatorStack, currentChar);
        }
        else if (currentChar == ')')
        {
            while (operatorStack.top != -1 && operatorStack.data[operatorStack.top] != '(')
            {
                prefixExpression[j++] = pop(&operatorStack);
            }
            pop(&operatorStack);
        }
        else if (isOperator(currentChar))
        {
            while (operatorStack.top != -1 && operatorStack.data[operatorStack.top] != '(' &&
                   getPrecedence(operatorStack.data[operatorStack.top]) >= getPrecedence(currentChar))
            {
                prefixExpression[j++] = pop(&operatorStack);
            }
            push(&operatorStack, currentChar);
        }
    }

    while (operatorStack.top != -1)
    {
        prefixExpression[j++] = pop(&operatorStack);
    }
    prefixExpression[j] = '\0';
    reverseString(prefixExpression);
}

int main()
{
    char infixExpression[MAX_EXPRESSION_SIZE];
    printf("Enter Infix: ");
    scanf("%s", infixExpression);
    char prefixExpression[MAX_EXPRESSION_SIZE];
    infixToPrefix(infixExpression, prefixExpression);
    printf("Prefix Expression: %s\n", prefixExpression);
    return 0;
}
