#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int isPrime(int num)
{
    int count = 0;
    for (int i = 1; i <= num; i++)
    {
        if (num % i == 0)
        {
            count++;
        }
    }
    if (count == 2)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int isArmstrong(int num)
{
    int originalNum = num;
    int sum = 0;
    int n = 0;
    while (originalNum != 0)
    {
        originalNum /= 10;
        n++;
    }
    originalNum = num;
    while (originalNum != 0)
    {
        int digit = originalNum % 10;
        sum += pow(digit, n);
        originalNum /= 10;
    }
    return (sum == num);
}

int isPerfect(int num)
{
    int sum = 1;
    for (int i = 2; i <= num / 2; i++)
    {
        if (num % i == 0)
        {
            sum += i;
        }
    }
    return (sum == num);
}

int main()
{
    int number;
    printf("Enter a number: ");
    scanf("%d", &number);

    if (isPrime(number))
    {
        printf("%d is a prime number.\n", number);
    }
    else
    {
        printf("%d is not a prime number.\n", number);
    }

    if (isArmstrong(number))
    {
        printf("%d is an Armstrong number.\n", number);
    }
    else
    {
        printf("%d is not an Armstrong number.\n", number);
    }

    if (isPerfect(number))
    {
        printf("%d is a perfect number.\n", number);
    }
    else
    {
        printf("%d is not a perfect number.\n", number);
    }
    return 0;
}
