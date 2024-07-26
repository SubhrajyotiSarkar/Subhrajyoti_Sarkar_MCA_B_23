#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int main()
{
    char c;
    printf("Enter Character: ");
    scanf("%c", &c);
    if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122))
    {
        printf("Alphabet");
    }
    else if (c >= 48 && c <= 57)
    {
        printf("Number");
    }
    else
    {
        printf("Special Character");
    }
    return 0;
}
