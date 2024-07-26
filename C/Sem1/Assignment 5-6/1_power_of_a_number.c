#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int main()
{
    int base, exp;
    printf("Enter Base: ");
    scanf("%d", &base);
    printf("Enter Exponent: ");
    scanf("%d", &exp);
    int x = 1;
    for (int i = 0; i < exp; i++)
    {
        x = x * base;
    }
    printf("Output: %d", x);
    return 0;
}
