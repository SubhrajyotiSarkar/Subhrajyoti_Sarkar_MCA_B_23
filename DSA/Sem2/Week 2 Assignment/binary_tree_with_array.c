#include <stdio.h>
#define max 100

/*
    formula for calculating the tree indexes in array representation of binary  tree
    (where " i " is the index of root node)

    starting from index " 0 " :
    left child = 2 * i + 1;
    right child = 2 * i + 2;
    parent node = floor value of (i-1)/2

    starting from index " 1 " :
    left child = 2 * i;
    right child = 2 * i + 1;
    parent node = floor value of i/2
*/

void buildTree(int arr[], int index, int item)
{
    int ch, val;

    arr[index] = item;
    printf("\nDo you want left child of %d ? (1. yes 2. no) ", arr[index]);
    scanf("%d", &ch);
    if (ch == 1)
    {
        printf("\nEnter left child of %d : ", arr[index]);
        scanf("%d", &val);
        buildTree(arr, 2 * index + 1, val);
    }

    printf("\nDo you want right child of %d ? (1. yes 2. no) ", arr[index]);
    scanf("%d", &ch);
    if (ch == 1)
    {
        printf("\nEnter right child of %d : ", arr[index]);
        scanf("%d", &val);
        buildTree(arr, 2 * index + 2, val);
    }
}

void main()
{
    int tree[max], item, i;
    for (i = 0; i < max; i++)
        tree[i] = -1;

    printf("\nEnter the value of root node : ");
    scanf("%d", &item);

    buildTree(tree, 0, item);

    printf("\nTree Structure : \n");
    int count = 0;
    for (i = 0; i < max; i++)
    {
        if (tree[i] == -1)
        {
            printf("- ");
        }
        else
        {
            printf("%d ", tree[i]);
            count++;
        }
    }
    printf("\nThis tree has a total of: %d", count);
    getch();
}
