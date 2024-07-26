#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int hcf(int a, int b)
{
    if (a % b == 0)
        return b;
    else
        hcf(b, a % b);
}
int main()
{
    int a, b;
    printf("Enter two numbers:");
    scanf("%d%d", &a, &b);
    int z = hcf(a, b);
    printf("HCF of %d and %d is: %d\n", a, b, z);
    return 0;
}
