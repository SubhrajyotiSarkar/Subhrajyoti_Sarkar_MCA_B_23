#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int isEven(int num)
{
    return num % 2 == 0;
}

int main()
{
    int number;
    printf("Enter a number: ");
    scanf("%d", &number);
    if (isEven(number))
    {
        printf("%d is even.\n", number);
    }
    else
    {
        printf("%d is odd.\n", number);
    }
    return 0;
}
