#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int stringCompare(char *str1, char *str2)
{
    while (*str1 == *str2)
    {
        if (*str1 == '\0')
        {
            return 0;
        }
        str1++;
        str2++;
    }
    return *str1 - *str2;
}

int main()
{
    char string1[100];
    printf("Enter First String: ");
    fgets(string1, sizeof(string1), stdin);
    if (string1[strlen(string1) - 1] == '\n')
    {
        string1[strlen(string1) - 1] = '\0';
    }
    char string2[100];
    printf("Enter Second String: ");
    fgets(string2, sizeof(string2), stdin);
    if (string2[strlen(string2) - 1] == '\n')
    {
        string2[strlen(string2) - 1] = '\0';
    }
    int result = stringCompare(string1, string2);
    if (result == 0)
    {
        printf("The two strings are equal.\n");
    }
    else if (result < 0)
    {
        printf("String 1 is less than String 2.\n");
    }
    else
    {
        printf("String 1 is greater than String 2.\n");
    }
    return 0;
}
