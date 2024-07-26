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
    for (int i = 1; i <= n; i++)
    {
        int m = i, b = i, x = i, count = 0;
        while (x > 0)
        {
            count++;
            x = x / 10;
        }
        int num = 0;
        while (m > 0)
        {
            int r = m % 10;
            num = num + (int)pow(r, count);
            m = m / 10;
        }
        if (num == b)
        {
            printf("%d\t", i);
        }
    }

    return 0;
}
