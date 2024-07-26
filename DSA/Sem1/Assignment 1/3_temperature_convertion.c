#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int main()
{
    int temp;
    printf("Enter Temperature: ");
    scanf("%d", &temp);
    int n;
    printf("Convert it to?\n1. Fahrenheit\n2. Celsius?\n");
    scanf("%d", &n);
    if (n == 1)
    {
        temp = (temp * 9 / 5) + 32;
        printf("%d°F", temp);
    }
    else
    {
        temp = (temp - 32) * 5 / 9;
        printf("%d°C", temp);
    }
    return 0;
}
