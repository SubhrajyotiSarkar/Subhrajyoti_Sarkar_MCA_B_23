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
    int ar[n];
    for (int i = 0; i < n; i++)
    {
        printf("Enter Marks of Student %d: ", (i + 1));
        scanf("%d", &ar[i]);
    }
    printf("________________________________\n");
    for (int i = 0; i < n; i++)
    {
        printf("Marks of Student 1: %d\n", ar[i]);
    }
    return 0;
}
