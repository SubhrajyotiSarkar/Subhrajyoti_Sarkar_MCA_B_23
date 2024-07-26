#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int main()
{
    char c[100];
    printf("Enter String: ");
    scanf("%s", c);
    int l = strlen(c);
    char ch[101];
    for (int i = 0; i < l; i++)
    {
        ch[i] = c[l - 1 - i];
    }
    ch[l] = '\0';

    if (strcmp(c, ch) == 0)
    {
        printf("The Given String Is Palindrome");
    }
    else
    {
        printf("The Given String Is NOT Palindrome");
    }
    return 0;
}
