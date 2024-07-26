#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int main()
{
    int n;
    printf("Enter Number of Students: ");
    scanf("%d", &n);
    int ar[n][2];
    for (int i = 0; i < n; i++)
    {
        printf("Enter marks of Student %d: ", i + 1);
        for (int j = 0; j < 2; j++)
        {
            scanf("%d", &ar[i][j]);
        }
    }
    printf("________________________________\n");
    for (int i = 0; i < n; i++)
    {
        int sum = 0;
        printf("Marks of Student %d: ", i + 1);
        for (int j = 0; j < 2; j++)
        {
            sum = sum + ar[i][j];
        }
        printf("%d\n", sum);
    }
    return 0;
}
