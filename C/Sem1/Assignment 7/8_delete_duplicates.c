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
    int a[l], count = 0;
    for (int i = 0; i < l; i++)
    {
        int flag = 0;
        for (int j = 0; j <= count; j++)
        {
            if (ar[i] == a[j])
            {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
        {
            a[count] = ar[i];
            count++;
        }
    }
    for (int i = 0; i < count; i++)
    {
        printf("%d ", a[i]);
    }
    return 0;
}
