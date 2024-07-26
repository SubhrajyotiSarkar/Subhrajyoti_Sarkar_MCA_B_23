/*
    0
   01
  010
 0101
01010
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
        int x = 0;
        for (int j = 0; j < n; j++)
        {
            if ((i + j) >= (n - 1))
            {
                if (x == 0)
                {
                    printf("0 ");
                    x++;
                }
                else
                {
                    printf("1 ");
                    x--;
                }
            }
            else
            {
                printf("  ");
            }
        }
        printf("\n");
    }
    return 0;
}
