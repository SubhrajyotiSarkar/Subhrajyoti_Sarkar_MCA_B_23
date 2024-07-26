#include <stdio.h>
#include <stdlib.h>

void readArray(int ***arr, int rows, int cols)
{
    *arr = (int **)malloc(rows * sizeof(int *));
    for (int i = 0; i < rows; i++)
    {
        (*arr)[i] = (int *)malloc(cols * sizeof(int));
    }
    printf("Enter the elements of the 2D array:\n");
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < cols; j++)
        {
            scanf("%d", &(*arr)[i][j]);
        }
    }
}

void printSparseMatrix(int **arr, int rows, int cols)
{
    int k = 0;
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < cols; j++)
        {
            if (arr[i][j] != 0)
            {
                printf("%d\t%d\t%d\n", i, j, arr[i][j]);
                k++;
            }
        }
    }

    if (k == 0)
    {
        printf("The sparse matrix is empty (all elements are zero).\n");
    }
}

void freeArray(int ***arr, int rows)
{
    for (int i = 0; i < rows; i++)
    {
        free((*arr)[i]);
    }
    free(*arr);
    *arr = NULL;
}

int main()
{
    int rows, cols;
    int **array;
    printf("Enter the number of rows and columns of the 2D array: ");
    scanf("%d %d", &rows, &cols);
    if (rows <= 0 || cols <= 0)
    {
        printf("Invalid input for rows or columns.\n");
        return 1;
    }

    readArray(&array, rows, cols);
    printSparseMatrix(array, rows, cols);
    freeArray(&array, rows);
    return 0;
}

void readArray(int ***arr, int rows, int cols)
{
    *arr = (int **)malloc(rows * sizeof(int *));
    for (int i = 0; i < rows; i++)
    {
        (*arr)[i] = (int *)malloc(cols * sizeof(int));
    }
    printf("Enter the elements of the 2D array:\n");
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < cols; j++)
        {
            scanf("%d", &(*arr)[i][j]);
        }
    }
}

void printSparseMatrix(int **arr, int rows, int cols)
{
    int k = 0;
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < cols; j++)
        {
            if (arr[i][j] != 0)
            {
                printf("%d\t%d\t%d\n", i, j, arr[i][j]);
                k++;
            }
        }
    }
    if (k == 0)
    {
        printf("The sparse matrix is empty (all elements are zero).\n");
    }
}

void freeArray(int ***arr, int rows)
{
    for (int i = 0; i < rows; i++)
    {
        free((*arr)[i]);
    }
    free(*arr);
    *arr = NULL;
}

int main()
{
    int rows, cols;
    int **array;
    printf("Enter the number of rows and columns of the 2D array: ");
    scanf("%d %d", &rows, &cols);
    if (rows <= 0 || cols <= 0)
    {
        printf("Invalid input for rows or columns.\n");
        return 1;
    }
    readArray(&array, rows, cols);
    printSparseMatrix(array, rows, cols);
    freeArray(&array, rows);
    return 0;
}
