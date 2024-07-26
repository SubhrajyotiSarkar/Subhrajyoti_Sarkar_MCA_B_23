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

    int in;
    printf("Enter Index of the Number to be Deleted: ");
    scanf("%d", &in);

    for (int i = in; i < n - 1; i++)
    {
        ar[i] = ar[i + 1];
    }

    printf("New Array: ");
    for (int i = 0; i < n - 1; i++)
    {
        printf("%d ", ar[i]);
    }
    return 0;
}
