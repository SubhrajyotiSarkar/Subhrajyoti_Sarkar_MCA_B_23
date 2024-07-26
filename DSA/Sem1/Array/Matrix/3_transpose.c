#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int main()
{
    int m, n;
    printf("Enter Number of Rows: ");
    scanf("%d", &m);
    printf("Enter Number of Columns: ");
    scanf("%d", &n);
    int ar[m][n];
    printf("Enter Matrix Elements: ");
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            scanf("%d", &ar[i][j]);
        }
    }

    int a[n][m];
    for (int j = 0; j < n; j++)
    {
        for (int i = 0; i < m; i++)
        {
            a[j][i] = ar[i][j];
        }
    }

    printf("Original Matrix:\n");
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("%d ", ar[i][j]);
        }
        printf("\n");
    }
    printf("Transposed Matrix:\n");
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            printf("%d ", a[i][j]);
        }
        printf("\n");
    }
    return 0;
}
