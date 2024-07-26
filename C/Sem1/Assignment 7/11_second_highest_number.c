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
    int max = ar[0], big = ar[0];
    for (int i = 1; i < l; i++)
    {
        if (max < ar[i])
        {
            max = ar[i];
        }
    }
    for (int i = 1; i < l; i++)
    {
        if (ar[i] != max)
        {
            if (big < ar[i])
            {
                big = ar[i];
            }
        }
    }
    printf("%d", big);
    return 0;
}
