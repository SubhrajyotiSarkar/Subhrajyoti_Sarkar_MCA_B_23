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
    int max = -1, big = -1;
    for (int i = 0; i < n; i++)
    {
        if (max < ar[i])
        {
            max = ar[i];
        }
    }
    for (int i = 0; i < n; i++)
    {
        if (big < ar[i] && ar[i] != max)
        {
            big = ar[i];
        }
    }
    printf("The Largest Number is: %d", max);
    printf("\nThe Second Largest Number is: %d", big);
    return 0;
}
