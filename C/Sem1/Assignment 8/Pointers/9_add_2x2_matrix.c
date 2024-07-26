#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

void addMatrices(int *mat1, int *mat2, int result[2][2])
{
    int count = 0;
    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 2; j++)
        {
            result[i][j] = (*mat1 + count) + (*mat2 + count);
            count++;
        }
    }
}

int main()
{
    int matrix1[2][2];
    int matrix2[2][2];
    int resultMatrix[2][2];
    printf("Enter elements of the first 2x2 matrix:\n");
    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 2; j++)
        {
            scanf("%d", &matrix1[i][j]);
        }
    }
    printf("Enter elements of the second 2x2 matrix:\n");
    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 2; j++)
        {
            scanf("%d", &matrix2[i][j]);
        }
    }
    addMatrices(&matrix1[0][0], &matrix2[0][0], resultMatrix);
    printf("Resulting 2x2 matrix after addition:\n");
    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 2; j++)
        {
            printf("%d ", resultMatrix[i][j]);
        }
        printf("\n");
    }
    return 0;
}
