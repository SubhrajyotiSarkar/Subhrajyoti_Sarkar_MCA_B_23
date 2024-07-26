#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int main()
{
    int m;
    printf("Enter Number of Rows: ");
    scanf("%d", &m);
    int ar[m][m], arr[m][m];
    printf("Enter Matrix Elements:\n");
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < m; j++)
        {
            scanf("%d", &ar[i][j]);
            arr[j][i] = ar[i][j];
        }
    }
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < m; j++)
        {
            if (ar[i][j] != arr[i][j])
            {
                printf("They are NOT Symmetric");
                exit(0);
            }
        }
    }
    printf("They Are Symmetric");
    return 0;
}
