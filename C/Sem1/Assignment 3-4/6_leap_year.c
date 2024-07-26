#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int main()
{
    int year;
    printf("Enter year: ");
    scanf("%d", &year);
    if (year % 4 == 0)
    {
        if (year % 100 == 0)
        {
            if (year % 400 == 0)
                printf("The year you have entered is a Leap Year.");
            else
                printf("The year you have entered is not a Leap Year");
        }
        else
            printf("The year you have entered is a Leap Year");
    }
    else
        printf("The year you have entered in not a Leap Year");
    return 0;
}
