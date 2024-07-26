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
        int row = 0;
        for (int j = 0; j < c; j++)
        {
            row = row + ar[i][j];
        }
        printf("Sumation of Row %d: %d\n", i + 1, row);
    }
    for (int j = 0; j < c; j++)
    {
        int col = 0;
        for (int i = 0; i < r; i++)
        {
            col = col + ar[i][j];
        }
        printf("Sumation of Column %d: %d\n", j + 1, col);
    }
    return 0;
}
