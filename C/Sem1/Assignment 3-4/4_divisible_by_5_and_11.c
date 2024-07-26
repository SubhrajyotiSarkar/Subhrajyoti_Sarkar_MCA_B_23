#include <stdio.h>

int main()
{
    int n;
    printf("Enter Number: ");
    scanf("%d", &n);
    if (n % 5 == 0 && n % 11 == 0)
    {
        printf("Yes");
    }
    else
    {
        printf("No");
    }
    return 0;
}
