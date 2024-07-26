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
    int x = 2;
    while (n > 1)
    {
        if (n % x == 0)
        {
            printf("%d\t", x);
            n = n / x;
        }
        else
        {
            x++;
        }
    }
    return 0;
}
