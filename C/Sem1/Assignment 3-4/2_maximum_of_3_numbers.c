#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int main()
{
    int a, b, c;
    printf("Enter Three Numbers: ");
    scanf("%d %d %d", &a, &b, &c);
    if (a >= b)
    {
        if (a > c)
        {
            printf("%d is biggest", a);
        }
        else
        {
            printf("%d is biggest", c);
        }
    }
    else if (b > a)
    {
        if (b >= c)
        {
            printf("%d is biggest", b);
        }
        else
        {
            printf("%d is biggest", c);
        }
    }
    return 0;
}
