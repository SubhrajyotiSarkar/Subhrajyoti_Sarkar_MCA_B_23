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
    int r1, c1;
    printf("Enter Number of Rows: ");
    scanf("%d", &r1);
    printf("Enter Number of Columns: ");
    scanf("%d", &c1);
    if (c != r1)
    {
        printf("This Maultiplication isn't possible");
        exit(0);
    }
    int arr[r1][c1];
    printf("Enter Matrix Elements: ");
    for (int i = 0; i < r1; i++)
    {
        for (int j = 0; j < c1; j++)
        {
            scanf("%d", &arr[i][j]);
        }
    }
    int a[r][c1];
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c1; j++)
        {
            a[i][j] = 0;
        }
    }
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c1; j++)
        {
            for (int k = 0; k < c; k++)
            {
                a[i][j] = a[i][j] + ar[i][k] * arr[k][j];
            }
        }
    }
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c1; j++)
        {
            printf("%d ", a[i][j]);
        }
        printf("\n");
    }
    return 0;
}
