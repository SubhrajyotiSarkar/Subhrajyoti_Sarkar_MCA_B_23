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
    printf("Enter Array Elemets: ");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &ar[i]);
    }
    for (int i = 0; i < n - 1; i++)
    {
        int temp = ar[i], flag = 0;
        for (int j = i + 1; j < n; j++)
        {
            if (temp == ar[j])
            {
                flag++;
            }
        }
        if (flag != 0)
        {
            printf("%d is duplicate\n", ar[i]);
        }
    }
    return 0;
}
