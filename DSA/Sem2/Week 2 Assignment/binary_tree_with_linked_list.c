#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *left, *right;
};

struct node *createNode(int value)
{
    struct node *newNode = (struct node *)malloc(sizeof(struct node));
    newNode->data = value;
    newNode->left = NULL;
    newNode->right = NULL;

    return newNode;
}

struct node *insertNode(struct node *root, int value)
{
    if (root == NULL)
    {
        root = createNode(value);
    }
    else
    {
        int c;
        printf("pointer at %d", root->data);
        printf("\n1. Left\n2. Right\n");
        scanf("%d", &c);

        if (c == 1)
        {
            root->left = insertNode(root->left, value);
        }
        else
        {
            root->right = insertNode(root->right, value);
        }
    }
    return root;
}

void displayLevelOrder(struct node *root, int level)
{
    if (root == NULL)
    {
        printf("NULL ");
        return;
    }

    if (level == 1)
    {
        printf("%d ", root->data);
    }
    else if (level > 1)
    {
        displayLevelOrder(root->left, level - 1);
        displayLevelOrder(root->right, level - 1);
    }
}

int findHeight(struct node *root)
{
    if (root == NULL)
    {
        return 0;
    }

    int leftHeight = findHeight(root->left);
    int rightHeight = findHeight(root->right);

    return (leftHeight > rightHeight) ? (leftHeight + 1) : (rightHeight + 1);
}

void displayLevelWise(struct node *root)
{
    int height = findHeight(root), i;
    for (i = 1; i <= height; i++)
    {
        displayLevelOrder(root, i);
        printf("\n");
    }
}

void order(struct node *root, int check)
{
    if (root == NULL)
    {
        return;
    }
    if (root->data == check)
    {
        if (root->left != NULL)
        {
            if (root->right != NULL)
            {
                printf("The order is 2");
                return;
            }
            printf("The order is 1");
            return;
        }
        if (root->right != NULL)
        {
            printf("The order is 1");
            return;
        }
        printf("The order is 0");
        return;
    }
    order(root->left, check);
    order(root->right, check);
}

int countLeafNodes(struct node *root)
{
    if (root == NULL)
    {
        return 0;
    }
    if (root->left == NULL && root->right == NULL)
    {
        return 1;
    }
    return countLeafNodes(root->left) + countLeafNodes(root->right);
}

int countTotalNodes(struct node *root)
{
    if (root == NULL)
    {
        return 0;
    }
    return (countTotalNodes(root->left) + countTotalNodes(root->right) + 1);
}

int countInternalNodes(struct node *root)
{
    return countTotalNodes(root) - countLeafNodes(root) - 1;
}

int totalSiblings(struct node *root)
{
    if (root == NULL)
    {
        return 0;
    }
    if (root->left != NULL)
    {
        if (root->right != NULL)
        {
            return 1 + totalSiblings(root->left) + totalSiblings(root->right);
        }
        return totalSiblings(root->left) + totalSiblings(root->right);
    }
    if (root->right != NULL)
    {
        return totalSiblings(root->left) + totalSiblings(root->right);
    }
}

void main()
{
    struct node *root = NULL;
    int ch, val1, height, check, level, val;

    printf("\n1. Insert\n2. Display\n3. Height\n4. Order\n5. Count all leaf nodes\n6. Count total nodes\n7. Count all internal nodes\n8. Count total siblings\n9. Exit\n");

    while (ch != 9)
    {
        printf("\nEnter your choice : ");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            printf("\nEnter the data to insert : ");
            scanf("%d", &val1);
            root = insertNode(root, val1);
            printf("\n%d inserted\n", val1);
            break;
        case 2:
            if (root == NULL)
            {
                printf("\nNothing to display\n");
            }
            printf("\nThe tree structure : \n");
            displayLevelWise(root);
            break;
        case 3:
            height = findHeight(root);
            printf("\nHeight is %d\n", height);
            break;
        case 4:
            printf("\nEnter the node to check order : ");
            scanf("%d", &check);
            order(root, check);
            break;
        case 5:
            printf("\nThe number of leaf nodes is %d\n", countLeafNodes(root));
            break;
        case 6:
            printf("\nThe number of total nodes is %d\n", countTotalNodes(root));
            break;
        case 7:
            printf("The number of internal nodes is %d\n", countInternalNodes(root));
            break;
        case 8:
            printf("This tree has a total of %d siblings", totalSiblings(root));
            break;
        case 9:
            printf("Exiting");
            break;
        default:
            printf("Invalid choice");
            break;
        }
    }
}
