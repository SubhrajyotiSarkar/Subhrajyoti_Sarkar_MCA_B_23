#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

void stringConcatenate(char *str1, char *str2)
{
    while (*str1 != '\0')
    {
        str1++;
    }
    while (*str2 != '\0')
    {
        *str1 = *str2;
        str1++;
        str2++;
    }
    *str1 = '\0';
}

int main()
{
    char str1[100];
    printf("Enter First String: ");
    fgets(str1, sizeof(str1), stdin);
    if (str1[strlen(str1) - 1] == '\n')
    {
        str1[strlen(str1) - 1] = '\0';
    }
    char str2[100];
    printf("Enter Second String: ");
    fgets(str2, sizeof(str2), stdin);
    if (str2[strlen(str2) - 1] == '\n')
    {
        str2[strlen(str2) - 1] = '\0';
    }
    stringConcatenate(str1, str2);
    printf("Concatenated String: %s\n", str1);
    return 0;
}
