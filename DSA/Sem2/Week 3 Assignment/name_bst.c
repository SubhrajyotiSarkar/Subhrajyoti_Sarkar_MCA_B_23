// question 5

#include <stdio.h>
#include <stdlib.h>

struct node
{
    char data;
    struct node *left, *right;
};

struct node *createNode(char value)
{
    struct node *newNode = (struct node *)malloc(sizeof(struct node));
    newNode->data = value;
    newNode->left = NULL;
    newNode->right = NULL;

    return newNode;
}

struct node *insertNode(struct node *root, char value)
{
    if (root == NULL)
    {
        root = createNode(value);
        return root;
    }
    else
    {
        if (root->data > value)
        {
            root->left = insertNode(root->left, value);
        }
        else
        {
            root->right = insertNode(root->right, value);
        }
        return root;
    }
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
        printf("%c ", root->data);
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
    int height = findHeight(root);
    for (int i = 1; i <= height; i++)
    {
        displayLevelOrder(root, i);
        printf("\n");
    }
}

void inorder(struct node *root)
{
    if (root == NULL)
    {
        return;
    }
    inorder(root->left);
    printf("%c ", root->data);
    inorder(root->right);
}

void main()
{
    struct node *root = NULL;
    int n;
    printf("Enter Length of Name: ");
    scanf("%d", &n);
    char c[n];
    printf("Enter Name to Insert: ");
    scanf("%s", c);
    for (int i = 0; i < n; i++)
    {
        root = insertNode(root, c[i]);
    }
    displayLevelWise(root);
    inorder(root);
}
