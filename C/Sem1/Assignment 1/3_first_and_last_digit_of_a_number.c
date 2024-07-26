#include <stdio.h>

int main()
{
    int n;
    printf("Enter Number: ");
    scanf("%d", &n);
    int l = n % 10;
    while (n > 0)
    {
        int r = n % 10;
        n = n / 10;
        if (n == 0)
        {
            printf("First Digit: %d", r);
        }
    }
    printf("\nLast Digit: %d", l);
    return 0;
}
