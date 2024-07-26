#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int main()
{
    int n;
    printf("Enter Number: ");
    scanf("%d", &n);
    if (n > 0)
    {
        printf("positive");
    }
    else if (n < 0)
    {
        printf("negative");
    }
    else
    {
        printf("zero");
    }
    return 0;
}
