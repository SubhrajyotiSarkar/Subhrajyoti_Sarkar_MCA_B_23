#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int main()
{
    int r, c;
    printf("Enter Number of Rows: ");
    scanf("%d", &r);
    printf("Enter Number of Columns: ");
    scanf("%d", &c);
    int ar[r][c];
    printf("Enter Matrix Elements: ");
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {

            scanf("%d", &ar[i][j]);
        }
    }
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            if (i == j)
            {
                if (ar[i][j] != 1)
                {
                    printf("Not an Identity Matrix");
                    exit(0);
                }
            }
            else
            {
                if (ar[i][j] != 0)
                {
                    printf("Not an Identity Matrix");
                    exit(0);
                }
            }
        }
    }
    printf("Identity matrix");
    return 0;
}
