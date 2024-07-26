#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int main()
{
    int l;
    printf("Enter Length of Array: ");
    scanf("%d", &l);
    int ar[l];
    printf("Enter Array Elements: ");
    for (int i = 0; i < l; i++)
    {
        scanf("%d", &ar[i]);
    }
    for (int i = 0; i < l - 1; i++)
    {
        for (int j = 0; j < l - 1 - i; j++)
        {
            if (ar[j] > ar[j + 1])
            {
                int temp = ar[j];
                ar[j] = ar[j + 1];
                ar[j + 1] = temp;
            }
        }
    }
    printf("Sorted Array: ");
    for (int i = 0; i < l; i++)
    {
        printf("%d ", ar[i]);
    }
    return 0;
}
