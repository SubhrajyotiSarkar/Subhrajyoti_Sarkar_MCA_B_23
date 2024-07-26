#include <stdio.h>
#include <stdlib.h>

// Node structure for adjacency list
struct Node
{
    int vertex;
    struct Node *next;
};

// Graph structure
struct Graph
{
    int numVertices;
    struct Node **adjLists;
};

// Create a new node
struct Node *createNode(int v)
{
    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
    newNode->vertex = v;
    newNode->next = NULL;
    return newNode;
}

// Create a graph with 'V' vertices
struct Graph *createGraph(int V)
{
    int i;
    struct Graph *graph = (struct Graph *)malloc(sizeof(struct Graph));
    graph->numVertices = V;
    graph->adjLists = (struct Node **)malloc(V * sizeof(struct Node *));
    for (i = 0; i < V; ++i)
        graph->adjLists[i] = NULL;
    return graph;
}

// Add an edge to the graph
void addEdge(struct Graph *graph, int src, int dest)
{
    struct Node *newNode = createNode(dest);
    newNode->next = graph->adjLists[src];
    graph->adjLists[src] = newNode;

    newNode = createNode(src);
    newNode->next = graph->adjLists[dest];
    graph->adjLists[dest] = newNode;
}

// Display the graph
void displayGraph(struct Graph *graph)
{
    int i;
    for (i = 0; i < graph->numVertices; ++i)
    {
        struct Node *temp = graph->adjLists[i];
        printf("Adjacency list of vertex %d: ", i);
        while (temp)
        {
            printf("%d -> ", temp->vertex);
            temp = temp->next;
        }
        printf("NULL\n");
    }
}

int main()
{
    int V, i, j;
    printf("Enter the number of vertices: ");
    scanf("%d", &V);

    struct Graph *graph = createGraph(V);

    // Input adjacency matrix
    printf("Enter the adjacency matrix (0 or 1):\n");
    for (i = 0; i < V; ++i)
    {
        for (j = 0; j < V; ++j)
        {
            int val;
            scanf("%d", &val);
            if (val == 1)
                addEdge(graph, i, j);
        }
    }

    // Display the graph
    displayGraph(graph);

    return 0;
}
