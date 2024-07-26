#include <stdio.h>

int main()
{
    int n;
    printf("Enter Number: ");
    scanf("%d", &n);
    int m = n, num = 0;
    while (n > 0)
    {
        int r = n % 10;
        num = num * 10 + r;
        n = n / 10;
    }
    if (m == num)
    {
        printf("Yes");
    }
    else
    {
        printf("No");
    }
    return 0;
}
