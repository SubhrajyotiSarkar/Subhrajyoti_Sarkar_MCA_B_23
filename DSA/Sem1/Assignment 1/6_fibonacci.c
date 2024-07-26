#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int main()
{
    int n;
    printf("Enter Number of Elements: ");
    scanf("%d", &n);
    if (n <= 0)
    {
        printf("There's nothing to print");
    }
    else if (n == 1)
    {
        printf("0");
    }
    else if (n == 2)
    {
        printf("0 1");
    }
    else
    {
        int a = 0, b = 1, c;
        printf("0 1 ");
        n = n - 2;
        while (n > 0)
        {
            c = a + b;
            printf("%d ", c);
            a = b;
            b = c;
            n--;
        }
    }
    return 0;
}
