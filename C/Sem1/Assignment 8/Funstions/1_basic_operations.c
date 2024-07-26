#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int add(int x, int y)
{
    return x + y;
}

int subtract(int x, int y)
{
    return abs(x - y);
}

int multiply(int x, int y)
{
    return x * y;
}

int divide(int x, int y)
{
    if (x > y)
    {
        return x / y;
    }
    else
    {
        return y / x;
    }
}

int main()
{
    int a, b;
    printf("Enter Two Numbers: ");
    scanf("%d%d", &a, &b);
    printf("Addition: %d\n", add(a, b));
    printf("Subtraction: %d\n", subtract(a, b));
    printf("Multiplication: %d\n", multiply(a, b));
    printf("Division: %d\n", divide(a, b));
    return 0;
}
