#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int smallest(int ar[], int n)
{
    int s = ar[0];
    for (int i = 1; i < n; i++)
    {
        if (s > ar[i])
        {
            s = ar[i];
        }
    }
    return s;
}

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
    int small = smallest(ar, n);
    printf("The Smallest Number in the Array is: %d", small);
    return 0;
}
