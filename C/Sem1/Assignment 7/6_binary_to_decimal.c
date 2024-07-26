#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int main()
{
    int l;
    printf("Enter Binary Number Length: ");
    scanf("%d", &l);
    int ar[l];
    printf("Enter Binary Number: ");
    for (int i = 0; i < l; i++)
    {
        scanf("%d", &ar[i]);
    }
    int n = 0;
    for (int i = 0; i < l; i++)
    {
        n = n + ar[i] * pow(2, l - 1 - i);
    }
    printf("%d", n);
    return 0;
}
