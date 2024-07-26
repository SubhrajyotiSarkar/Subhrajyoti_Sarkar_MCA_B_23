#include <stdio.h>

int main()
{
    int n;
    printf("Enter Number: ");
    scanf("%d", &n);
    int m = n, f = 1;
    while (n > 0)
    {
        f = f * n;
        n--;
    }
    printf("Factorial of %d is: %d", m, f);
    return 0;
}
