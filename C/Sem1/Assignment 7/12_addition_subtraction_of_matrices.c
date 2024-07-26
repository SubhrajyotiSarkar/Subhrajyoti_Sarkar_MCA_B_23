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
    int arr[r][c];
    printf("Enter Second Matrix Elements: ");
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {

            scanf("%d", &arr[i][j]);
        }
    }
    printf("Addition Matrix:\n");
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            printf("%d ", abs(ar[i][j] + arr[i][j]));
        }
        printf("\n");
    }
    printf("Subtraction Matrix:\n");
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            printf("%d ", ar[i][j] - arr[i][j]);
        }
        printf("\n");
    }

    return 0;
}
