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
    int size = 2 * n;
    int ar[size];
    for (int i = 0; i < size; i++)
    {
        ar[i] = -1;
    }
    for (int i = 0; i < size; i++)
    {
        if (n > 0)
        {
            ar[i] = n % 2;
            n = n / 2;
        }
    }
    for (int i = size - 1; i >= 0; i--)
    {
        if (ar[i] != -1)
        {
            printf("%d", ar[i]);
        }
    }
    return 0;
}
