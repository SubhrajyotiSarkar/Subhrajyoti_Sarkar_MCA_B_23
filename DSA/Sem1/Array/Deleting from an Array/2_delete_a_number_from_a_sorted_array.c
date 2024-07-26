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

    int sort;
    printf("1. Increasing Order\n2. Decreasing Order:\n");
    scanf("%d", &sort);
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

    int num;
    printf("Enter Number to be Deleted: ");
    scanf("%d", &num);
    int count = 0;

    for (int i = 0; i < n; i++)
    {
        if (ar[i] == num)
        {
            count++;
            for (int j = i; j < n - 1; j++)
            {
                ar[j] = ar[j + 1];
            }
        }
    }

    printf("New Array: ");
    if (sort == 1)
    {
        for (int i = 0; i < n - count; i++)
        {
            printf("%d ", ar[i]);
        }
    }
    else
    {
        for (int i = n - count - 1; i >= 0; i--)
        {
            printf("%d ", ar[i]);
        }
    }
    return 0;
}
