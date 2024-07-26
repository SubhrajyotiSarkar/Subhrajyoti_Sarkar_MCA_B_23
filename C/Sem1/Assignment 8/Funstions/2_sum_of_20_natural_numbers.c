#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int add(int n)
{
    if (n != 0)
    {
        return n + add(n - 1);
    }
    else
    {
        return n;
    }
}

int main()
{
    int n = 20;
    int x = add(n);
    printf("Addition of First 20 Natural Numbers: %d\n", x);
    return 0;
}
