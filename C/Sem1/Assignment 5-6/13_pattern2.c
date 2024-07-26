/*
 *
 * *
 * * *
 * * * *
 * * * * *
 */

#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int main()
{
    int n;
    printf("Enter number of Rows: ");
    scanf("%d", &n);
    int flag = (2 * n + 1) / 2, x = 0;
    for (int i = 0; i < n; i++)
    {
        int count = 0;
        for (int j = 0; j < 2 * n + 1; j++)
        {
            if (j == (flag - x))
            {
                while (count <= (2 * i + 1))
                {
                    if (count % 2 == 0)
                        printf("* ");
                    else
                        printf("  ");
                    count++;
                }
            }
            else
                printf("  ");
        }
        x++;
        printf("\n");
    }
    return 0;
}
