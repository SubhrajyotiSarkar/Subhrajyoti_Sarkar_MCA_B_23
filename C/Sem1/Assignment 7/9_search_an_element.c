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
    int num;
    printf("Enter Number you want to be searched: ");
    scanf("%d", &num);
    int index = 0;
    for (int i = 0; i < l; i++)
    {
        if (ar[i] == num)
        {
            index = i;
            break;
        }
    }
    printf("The Number is in Index %d", index);
    return 0;
}
