#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int searchElement(int *arr, int n, int target)
{
    int *ptr = arr;
    for (int i = 0; i < n; i++)
    {
        if (*ptr == target)
        {
            return i;
        }
        ptr++;
    }
    return -1;
}

int main()
{
    int n, target;
    printf("Enter the number of elements in the array: ");
    scanf("%d", &n);
    int arr[n];
    printf("Enter the elements of the array:\n");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    printf("Enter the element to search for: ");
    scanf("%d", &target);
    int index = searchElement(arr, n, target);
    if (index != -1)
    {
        printf("Element %d found at index %d\n", target, index);
    }
    else
    {
        printf("Element %d not found in the array\n", target);
    }
    return 0;
}
