#include <stdio.h>
void printArray(int arr[], int size)
{
    int i;
    for (i = 0; i < size; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
}
void insertionSort(int arr[], int size)
{
    int i;
    for (i = 1; i < size; i++)
    {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key)
        {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
        printf("After iteration %d: ", i);
        printArray(arr, size);
    }
}
int main()
{
    int arr[] = {27, 15, 39, 21, 28, 70};
    int size = sizeof(arr) / sizeof(arr[0]);
    printf("Original array: ");
    printArray(arr, size);
    insertionSort(arr, size);
    printf("Sorted array: ");
    printArray(arr, size);
    getch();
}
