// question 2

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
    struct node *newnode = createNode(value);
    if (root == NULL)
    {
        return newnode;
    }
    struct node *child = root;
    struct node *parent = NULL;

    while (child != NULL)
    {
        parent = child;
        if (value < child->data)
        {
            child = child->left;
        }
        else
        {
            child = child->right;
        }
    }
    if (value < parent->data)
    {
        parent->left = newnode;
    }
    else
    {
        parent->right = newnode;
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
    int height = findHeight(root);
    for (int i = 1; i <= height; i++)
    {
        displayLevelOrder(root, i);
        printf("\n");
    }
}

int searchElement(struct node *root, int value)
{
    struct node *loop = root;
    while (loop != NULL)
    {
        if (loop->data == value)
        {
            printf("Data Exists");
            return 0;
        }
        else if (loop->data > value)
        {
            loop = loop->left;
        }
        else
        {
            loop = loop->right;
        }
    }
    return 1;
}

void main()
{
    struct node *root = NULL;
    int ch, val;

    printf("\n1. Insert\n2. Display\n3. Search\n4. Exit");

    while (ch != 4)
    {
        printf("\nEnter your choice : ");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            printf("\nEnter the data to insert : ");
            scanf("%d", &val);
            root = insertNode(root, val);
            printf("\n%d inserted\n", val);
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
            printf("Enter Element to Search: ");
            scanf("%d", &val);
            val = searchElement(root, val);
            if (val == 1)
            {
                printf("Data doesn't exist");
            }
            break;
        case 4:
            printf("Exiting");
            break;
        default:
            printf("Invalid choice");
            break;
        }
    }
}
