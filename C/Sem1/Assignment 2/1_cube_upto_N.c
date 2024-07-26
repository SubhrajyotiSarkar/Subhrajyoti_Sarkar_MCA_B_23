#include <stdio.h>
#include <math.h>

int main()
{
    int n;
    printf("Enter Number: ");
    scanf("%d", &n);
    for (int i = 1; i <= n; i++)
    {
        printf("Cude of %d: %.0f\n", i, pow(i, 3));
    }
    return 0;
}
