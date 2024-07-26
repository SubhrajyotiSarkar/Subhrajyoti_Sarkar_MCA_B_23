#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int main()
{
    int n;
    printf("Enter Number: ");
    scanf("%d", &n);
    int count = 0, odd = 1, sum = 0;
    while (count < n)
    {
        count++;
        printf("%d\t", odd);
        sum = sum + odd;
        odd = odd + 2;
    }
    printf("\nSum of all odd numbers: %d", sum);
    return 0;
}
