#include <stdio.h>

void printFileContents(const char *filename)
{
    FILE *file;
    char c;
    file = fopen(filename, "r");
    if (file == NULL)
    {
        printf("Could not open the file: %s\n", filename);
        return;
    }
    while ((c = fgetc(file)) != EOF)
    {
        putchar(c);
    }
    fclose(file);
}

int main(int argc, char *argv[])
{
    if (argc != 2)
    {
        printf("Usage: %s <file_path>\n", argv[0]);
        return 1;
    }
    const char *filename = argv[1];
    printFileContents(filename);
    return 0;
}
