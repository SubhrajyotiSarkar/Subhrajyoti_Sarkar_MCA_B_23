#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int main()
{
    int n;
    printf("Enter Number of Elements: ");
    scanf("%d", &n);
    int ar[n + 1];
    printf("Enter Array Elements: ");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &ar[i]);
    }
    int num;
    printf("Enter Number to be Inserted: ");
    scanf("%d", &num);
    int in;
    printf("Enter Index of the New Number: ");
    scanf("%d", &in);
    for (int i = n; i >= in; i--)
    {
        ar[i] = ar[i - 1];
    }
    ar[in] = num;
    printf("New Array: ");
    for (int i = 0; i < n + 1; i++)
    {
        printf("%d ", ar[i]);
    }
    return 0;
}
