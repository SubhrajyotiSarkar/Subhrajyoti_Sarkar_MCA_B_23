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
    int min = ar[0], max = ar[0];
    for (int i = 0; i < l; i++)
    {
        if (min > ar[i])
        {
            min = ar[i];
        }
        if (max < ar[i])
        {
            max = ar[i];
        }
    }
    printf("Lagest Number: %d\nSmallest Number: %d", max, min);
    return 0;
}
