#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int main()
{
    int ar[3][5];
    for (int i = 0; i < 3; i++)
    {
        printf("***Enter Marks for Subject %d***\n", i + 1);
        for (int j = 0; j < 5; j++)
        {
            printf("Enter Marks for Student %d: ", j + 1);
            scanf("%d", &ar[i][j]);
        }
    }
    for (int i = 0; i < 3; i++)
    {
        int max = 0;
        for (int j = 0; j < 5; j++)
        {
            if (max < ar[i][j])
            {
                max = ar[i][j];
            }
        }
        printf("Highest Marks in Subject %d is: %d\n", i + 1, max);
    }
    return 0;
}
