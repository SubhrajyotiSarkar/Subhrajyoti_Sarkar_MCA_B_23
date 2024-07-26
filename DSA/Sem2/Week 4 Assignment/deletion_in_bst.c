// all questions

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
        if (root->data > value)
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
    int height = findHeight(root);
    for (int i = 1; i <= height; i++)
    {
        displayLevelOrder(root, i);
        printf("\n");
    }
}

int searchElement(struct node *root, int value)
{
    if (root == NULL)
    {
        return 0;
    }
    if (root->data == value)
    {
        printf("Data Exists");
        return 1;
    }
    else
    {
        if (root->data > value)
        {
            searchElement(root->left, value);
        }
        else
        {
            searchElement(root->right, value);
        }
    }
}

struct node *deleteElement(struct node *root, int value)
{
    if (root == NULL)
    {
        return NULL;
    }
    if (root->data > value)
    {
        root->left = deleteElement(root->left, value);
    }
    else if (root->data < value)
    {
        root->right = deleteElement(root->right, value);
    }
    else
    {
        if (root->left == NULL && root->right == NULL)
        {
            free(root);
            return NULL;
        }
        else if (root->left == NULL)
        {
            struct node *temp = root->right;
            free(root);
            return temp;
        }
        else if (root->right == NULL)
        {
            struct node *temp = root->left;
            free(root);
            return temp;
        }
        else
        {
            struct node *temp = root->right;
            while (temp->left != NULL)
            {
                temp = temp->left;
            }
            root->data = temp->data;
            root->right = deleteElement(root->right, temp->data);
        }
    }
    return root;
}

void main()
{
    struct node *root = NULL;
    int ch, val;

    printf("\n1. Insert\n2. Display\n3. Search\n4. Delete\n5. Exit");

    while (ch != 5)
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
            if (val == 0)
            {
                printf("Data doesn't exist");
            }
            break;
        case 4:
            printf("Enter Element to Delete: ");
            scanf("%d", &val);
            root = deleteElement(root, val);
            break;
        case 5:
            printf("Exiting");
            break;
        default:
            printf("Invalid choice");
            break;
        }
    }
}
