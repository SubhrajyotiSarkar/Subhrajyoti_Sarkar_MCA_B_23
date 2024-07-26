/*
    1
   123
  12345
 1234567
123456789
*/

#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

int main()
{
    int n;
    printf("Enter Number of Rows: ");
    scanf("%d", &n);
    int ar[2 * n - 1];
    for (int i = 0; i < 2 * n - 1; i++)
    {
        ar[i] = i + 1;
    }
    int flag = (2 * n + 1) / 2, x = 0;
    for (int i = 0; i < n; i++)
    {
        int count = 0;
        for (int j = 0; j < 2 * n + 1; j++)
        {
            if (j == (flag - x))
            {
                while (count < (2 * i + 1))
                {
                    printf("%d", ar[count]);
                    count++;
                }
            }
            else
                printf(" ");
        }
        x++;
        printf("\n");
    }
    return 0;
}
