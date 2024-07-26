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
    int ar[n];
    float sum = 0;
    printf("Enter Array Elements: ");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &ar[i]);
        sum += ar[i];
    }
    sum = sum / n;
    printf("The Mean of all the numbers is: %0.2f", sum);
    return 0;
}
