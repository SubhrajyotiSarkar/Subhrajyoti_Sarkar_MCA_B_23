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
    int m = n, b = n, count = 0;
    while (n > 0)
    {
        count++;
        n = n / 10;
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
        printf("Yes");
    }
    else
    {
        printf("No");
    }
    return 0;
}
