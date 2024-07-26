/*
*****
****
***
**
*
*/

#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int main()
{
    int n;
    printf("Enter Number of Rows: ");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        for (int j = n - 1; j >= i; j--)
        {
            printf("* ");
        }
        printf("\n");
    }
    return 0;
}
