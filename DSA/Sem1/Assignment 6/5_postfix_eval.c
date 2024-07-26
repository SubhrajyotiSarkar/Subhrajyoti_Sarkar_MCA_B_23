#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#define MAX_EXPRESSION_SIZE 100

typedef struct
{
    int data[MAX_EXPRESSION_SIZE];
    int top;
} Stack;

void initialize(Stack *stack)
{
    stack->top = -1;
}

void push(Stack *stack, int item)
{
    if (stack->top == MAX_EXPRESSION_SIZE - 1)
    {
        printf("Stack Overflow\n");
        exit(EXIT_FAILURE);
    }
    stack->data[++stack->top] = item;
}

int pop(Stack *stack)
{
    if (stack->top == -1)
    {
        printf("Stack Underflow\n");
        exit(EXIT_FAILURE);
    }
    return stack->data[stack->top--];
}

int evaluatePostfix(char *postfixExpression)
{
    Stack operandStack;
    initialize(&operandStack);
    for (int i = 0; postfixExpression[i] != '\0'; i++)
    {
        char currentChar = postfixExpression[i];
        if (isdigit(currentChar))
        {
            push(&operandStack, currentChar - '0');
        }
        else if (currentChar == ' ')
        {
            continue;
        }
        else
        {
            int operand2 = pop(&operandStack);
            int operand1 = pop(&operandStack);
            switch (currentChar)
            {
            case '+':
                push(&operandStack, operand1 + operand2);
                break;
            case '-':
                push(&operandStack, operand1 - operand2);
                break;
            case '*':
                push(&operandStack, operand1 * operand2);
                break;
            case '/':
                push(&operandStack, operand1 / operand2);
                break;
            default:
                printf("Invalid operator: %c\n", currentChar);
                exit(EXIT_FAILURE);
            }
        }
    }
    return pop(&operandStack);
}

int main()
{
    char postfixExpression[MAX_EXPRESSION_SIZE];
    printf("Enter Postfix Expression:");
    scanf("%s", postfixExpression);
    int result = evaluatePostfix(postfixExpression);
    printf("Result: %d\n", result);
    return 0;
}
