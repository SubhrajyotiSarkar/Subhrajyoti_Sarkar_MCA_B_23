#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

void count_vertices(int max)
{
    printf("\nTotal no of vertices present in the graph : %d\n", max);
}

int isCyclicUtil(int v, int visited[], int recStack[], int max, int adj[][max])
{
    if (visited[v] == 0)
    {
        visited[v] = 1;
        recStack[v] = 1;

        for (int i = 0; i < max; i++)
        {
            if (adj[v][i])
            {
                if (!visited[i] && isCyclicUtil(i, visited, recStack, max, adj))
                    return 1;
                else if (recStack[i])
                    return 1;
            }
        }
    }
    recStack[v] = 0;
    return 0;
}

int isCyclic(int max, int adj[][max])
{
    int visited[max];
    int recStack[max];
    for (int i = 0; i < max; i++)
    {
        visited[i] = 0;
        recStack[i] = 0;
    }

    for (int i = 0; i < max; i++)
    {
        if (!visited[i])
        {
            if (isCyclicUtil(i, visited, recStack, max, adj))
                return 1;
        }
    }
    return 0;
}

int main()
{
    int i, j, max, choice, c = 0, degree = 0, odd_degree = 0, even_degree = 0, f = 0;
    printf("Enter the maximum no of nodes : ");
    scanf("%d", &max);
    int adj[max][max];
    printf("Enter the value of Adjacency Matrix=\n ");
    for (i = 0; i < max; i++)
    {
        for (j = 0; j < max; j++)
        {
            scanf("%d", &adj[i][j]);
        }
    }
    printf("\n 1. Print Inputed Matrix\n 2. Count Total Edges\n 3. Count Total Vertices\n 4. Count Odd Even Degree Vertices\n 5. Check complete graph or not\n 6. Detect Cycle\n 7. Exit\n");
    while (1)
    {
        printf("\nEnter your choice : ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            printf("\nThe inputed matrix is :\n");
            for (i = 0; i < max; i++)
            {
                for (j = 0; j < max; j++)
                {
                    printf("%d", adj[i][j]);
                    printf("    ");
                }
                printf("\n");
            }

            break;

        case 2:
            for (i = 0; i < max; i++)
            {
                for (j = 0; j < max; j++)
                {
                    if (adj[i][j] == 1)
                    {
                        c++;
                    }
                }
            }
            printf("No of edges are : %d", c);
            break;

        case 3:
            count_vertices(max);
            break;

        case 4:
            for (i = 0; i < max; i++)
            {
                degree = 0;
                for (j = 0; j < max; j++)
                {
                    if (adj[i][j] == 1)
                    {
                        degree++;
                    }
                }
                if (degree % 2 == 0)
                {
                    even_degree++;
                }
                else
                {
                    odd_degree++;
                }
            }
            printf("\nNo of odd degree edges are : %d", odd_degree);
            printf("\nNo of even degree edges are : %d", even_degree);
            break;

        case 5:
            for (i = 0; i < max; ++i)
            {
                for (j = 0; j < max; ++j)
                {
                    if (i != j && adj[i][j] == 0)
                    {
                        // If there is an edge missing between any pair of vertices, it's not complete
                        f = 1;
                    }
                }
            }
            if (f == 0)
            {
                printf("The graph is complete.\n");
            }
            else
            {
                printf("The graph is not complete.\n");
            }
            break;

        case 6:
            if (isCyclic(max, adj))
            {
                printf("The graph contains a cycle.\n");
            }
            else
            {
                printf("The graph does not contain a cycle.\n");
            }
            break;

        case 7:
            exit(1);
        default:
            printf("\nyou entered wrong choice.. ");
        }
    }

    printf("\n");
}
