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
    int ar[10] = {0};
    while (n > 0)
    {
        int r = n % 10;
        ar[r]++;
        n = n / 10;
    }
    for (int i = 0; i < 10; i++)
    {
        if (ar[i] != 0)
            printf("%d: %d\n", i, ar[i]);
    }
    return 0;
}
