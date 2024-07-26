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
    int min = ar[0], min_in = 0;
    for (int i = 1; i < n; i++)
    {
        if (ar[i] < min)
        {
            min = ar[i];
            min_in = i;
        }
    }
    printf("The Smallest Number in the Array is %d and it's in Position %d", min, min_in + 1);
    return 0;
}
