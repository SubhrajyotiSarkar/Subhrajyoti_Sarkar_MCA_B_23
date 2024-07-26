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
    int source[n];
    printf("Enter Array Elements: ");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &source[i]);
    }
    int destination[n];
    int *srcPtr = source;
    int *destPtr = destination;
    for (int i = 0; i < n; i++)
    {
        *destPtr = *srcPtr;
        srcPtr++;
        destPtr++;
    }
    printf("Copied array elements: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", destination[i]);
    }
    return 0;
}
