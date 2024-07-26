#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int main()
{
    char inputString[100];
    printf("Enter a string: ");
    scanf("%s", inputString);
    if (inputString[2] != '\0')
    {
        printf("The 3rd element of the string is: %c\n", inputString[2]);
    }
    else
    {
        printf("The string is too short to have a 3rd element.\n");
    }
    return 0;
}
