#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

void stringCopy(char *destination, const char *source)
{
    while (*source != '\0')
    {
        *destination = *source;
        destination++;
        source++;
    }
    *destination = '\0';
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
    char destinationString[100];
    stringCopy(destinationString, myString);
    printf("Copied String: %s\n", destinationString);
    return 0;
}
