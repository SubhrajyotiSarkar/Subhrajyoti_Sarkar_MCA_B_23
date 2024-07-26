#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int main()
{
    int n;
    printf("Enter Size of Array: ");
    scanf("%d", &n);
    int arr[n];
    printf("Enter Array Elements: ");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    int sum = 0;
    int *ptr = arr;
    for (int i = 0; i < n; i++)
    {
        sum += *ptr;
        ptr++;
    }
    printf("Sum of array elements: %d\n", sum);
    return 0;
}
