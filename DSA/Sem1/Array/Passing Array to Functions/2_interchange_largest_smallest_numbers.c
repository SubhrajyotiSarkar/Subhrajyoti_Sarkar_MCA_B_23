#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int largest(int ar[], int n)
{
    int x = 0;
    for (int i = 1; i < n; i++)
    {
        if (ar[x] < ar[i])
        {
            x = i;
        }
    }
    return x;
}

int smallest(int ar[], int n)
{
    int x = 0;
    for (int i = 1; i < n; i++)
    {
        if (ar[x] > ar[i])
        {
            x = i;
        }
    }
    return x;
}

void print(int ar[], int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d ", ar[i]);
    }
}

void interchange(int ar[], int n)
{
    int l = largest(ar, n);
    int s = smallest(ar, n);
    int temp = ar[l];
    ar[l] = ar[s];
    ar[s] = temp;
    printf("\nFinal Array: ");
    print(ar, n);
}

int main()
{
    int n;
    printf("Enter Number of Elements: ");
    scanf("%d", &n);
    int ar[n];
    printf("Enter Array Elements: ");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &ar[i]);
    }
    printf("Original Array: ");
    print(ar, n);
    interchange(ar, n);
    return 0;
}
