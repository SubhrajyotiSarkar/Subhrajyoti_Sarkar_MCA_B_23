#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int main()
{
    int m, n, r, c;
    printf("Enter Number of Rows of First Matrix: ");
    scanf("%d", &m);
    printf("Enter Number of Columns of First Matrix: ");
    scanf("%d", &n);
    printf("Enter Number of Rows of Second Matrix: ");
    scanf("%d", &r);
    printf("Enter Number of Columns of Second Matrix: ");
    scanf("%d", &c);
    if (n != r)
    {
        printf("This Matrix Multiplication is not possible");
        exit(0);
    }
    int ar[m][n];
    printf("Enter First Matrix Elements: ");
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            scanf("%d", &ar[i][j]);
        }
    }
    int arr[r][c];
    printf("Enter Second Matrix Elements: ");
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            scanf("%d", &arr[i][j]);
        }
    }
    int a[m][c];
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < c; j++)
        {
            a[i][j] = 0;
        }
    }
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < c; j++)
        {
            for (int k = 0; k < n; k++)
            {
                a[i][j] += ar[i][k] * arr[k][j];
            }
        }
    }
    printf("Final Matrix:\n");
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < c; j++)
        {
            printf("%d ", a[i][j]);
        }
        printf("\n");
    }
    return 0;
}
