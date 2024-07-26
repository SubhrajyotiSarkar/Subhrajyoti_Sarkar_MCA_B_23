#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int reverseNumber(int n)
{
    static int reversed = 0;

    if (n == 0)
    {
        return reversed;
    }
    else
    {
        reversed = reversed * 10 + (n % 10);
        return reverseNumber(n / 10);
    }
}

int main()
{
    int num;

    printf("Enter an integer: ");
    scanf("%d", &num);

    int reversedNum = reverseNumber(num);

    printf("Reverse of the number: %d\n", reversedNum);

    return 0;
}
