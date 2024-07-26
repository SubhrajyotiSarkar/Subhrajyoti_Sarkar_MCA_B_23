#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int stringLength(const char *str)
{
    const char *ptr = str;
    while (*ptr != '\0')
    {
        ptr++;
    }
    return ptr - str;
}

int main()
{
    char myString[100];
    printf("Enter a string: ");
    fgets(myString, sizeof(myString), stdin);
    if (myString[strlen(myString) - 1] == '\n')
    {
        myString[strlen(myString) - 1] = '\0';
    }
    int length = stringLength(myString);
    printf("Length of the string: %d\n", length);
    return 0;
}
