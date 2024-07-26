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
    int ar[n];
    printf("Enter Array Elements: ");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &ar[i]);
    }
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = 0; j < n - 1 - i; j++)
        {
            if (ar[j] > ar[j + 1])
            {
                int temp = ar[j];
                ar[j] = ar[j + 1];
                ar[j + 1] = temp;
            }
        }
    }
    int x;
    printf("Sort in Which Order?\n1. Increading Order\n2. Descending Order?\n");
    scanf("%d", &x);
    if (x == 1)
    {
        for (int i = 0; i < n; i++)
        {
            printf("%d ", ar[i]);
        }
    }
    else
    {
        for (int i = n - 1; i >= 0; i--)
        {
            printf("%d ", ar[i]);
        }
    }
    return 0;
}
