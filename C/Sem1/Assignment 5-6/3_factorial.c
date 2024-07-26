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
    int x = 1;
    for (int i = 1; i <= n; i++)
    {
        x = x * i;
    }
    printf("%d", x);
    return 0;
}
