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
    int length = strlen(inputString);
    printf("Reverse of the string: ");
    for (int i = length - 1; i >= 0; i--)
    {
        printf("%c", inputString[i]);
    }
    printf("\n");
    return 0;
}
