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
    int index;
    printf("Enter Position of the Element which you want to remove: ");
    scanf("%d", &index);
    for (int i = index; i < n - 1; i++)
    {
        ar[index] = ar[index + 1];
    }
    printf("New Array: \n");
    for (int i = 0; i < n - 1; i++)
    {
        printf("%d ", ar[i]);
    }
    return 0;
}
