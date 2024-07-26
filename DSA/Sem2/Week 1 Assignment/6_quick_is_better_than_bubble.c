#include <stdio.h>
#include <stdlib.h>
#include <time.h>
void swap(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}
void bubbleSort(int arr[], int n)
{
    int i,j;
    for (i = 0; i < n - 1; i++)
    {
        for (j = 0; j < n - i - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                swap(&arr[j], &arr[j + 1]);
            }
        }
    }
}
int partition(int arr[], int low, int high)
{
    int pivot = arr[high];
    int i = (low - 1), j;
    for (j = low; j <= high - 1; j++)
    {
        if (arr[j] < pivot)
        {
            i++;
            swap(&arr[i], &arr[j]);
        }
    }
    swap(&arr[i + 1], &arr[high]);
    return (i + 1);
}
void quickSort(int arr[], int low, int high)
{
    if (low < high)
    {
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}
int main()
{
    const int size = 10000;

    int bubbleArr[size];
    int quickArr[size], i;
    for (i = 0; i < size; i++)
    {
        bubbleArr[i] = rand() % 1000;
        quickArr[i] = bubbleArr[i];
    }
    clock_t start, end;
    start = clock();
    bubbleSort(bubbleArr, size);
    end = clock();
    printf("Time taken by Bubble Sort: %f seconds\n", ((double)(end - start)) / CLOCKS_PER_SEC);
    start = clock();
    quickSort(quickArr, 0, size - 1);
    end = clock();
    printf("Time taken by Quick Sort: %f seconds\n", ((double)(end - start)) / CLOCKS_PER_SEC);
    getch();
}
