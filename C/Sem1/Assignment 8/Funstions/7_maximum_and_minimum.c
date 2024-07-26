#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int findMax(int num1, int num2)
{
    return (num1 > num2) ? num1 : num2;
}

int findMin(int num1, int num2)
{
    return (num1 < num2) ? num1 : num2;
}

int main()
{
    int num1, num2;

    printf("Enter the first number: ");
    scanf("%d", &num1);
    printf("Enter the second number: ");
    scanf("%d", &num2);

    int maximum = findMax(num1, num2);
    int minimum = findMin(num1, num2);

    printf("Maximum number: %d\n", maximum);
    printf("Minimum number: %d\n", minimum);

    return 0;
}
