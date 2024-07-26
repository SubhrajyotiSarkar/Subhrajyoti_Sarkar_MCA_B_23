#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

void addNumbers(int *a, int *b, int *result)
{
    *result = *a + *b;
}

int main()
{
    int num1, num2, sum;
    printf("Enter Two Numbers: ");
    scanf("%d%d", &num1, &num2);
    addNumbers(&num1, &num2, &sum);
    printf("Sum of %d and %d is %d\n", num1, num2, sum);
    return 0;
}
