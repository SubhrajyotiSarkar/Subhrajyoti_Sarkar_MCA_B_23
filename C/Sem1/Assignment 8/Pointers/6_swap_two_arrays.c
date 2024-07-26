#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

void swapArrays(int *arr1, int *arr2, int n)
{
    for (int i = 0; i < n; i++)
    {
        int temp = arr1[i];
        arr1[i] = arr2[i];
        arr2[i] = temp;
    }
}

int main()
{
    int n;
    printf("Enter the number of elements in the arrays: ");
    scanf("%d", &n);
    int array1[n];
    int array2[n];
    printf("Enter elements of the first array:\n");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &array1[i]);
    }
    printf("Enter elements of the second array:\n");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &array2[i]);
    }
    printf("Arrays before swapping:\n");
    printf("Array 1: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", array1[i]);
    }
    printf("\n");
    printf("Array 2: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", array2[i]);
    }
    printf("\n");
    swapArrays(array1, array2, n);
    printf("Arrays after swapping:\n");
    printf("Array 1: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", array1[i]);
    }
    printf("\n");
    printf("Array 2: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", array2[i]);
    }
    return 0;
}
