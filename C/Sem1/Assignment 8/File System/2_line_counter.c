#include <stdio.h>

int countLinesInFile(const char *filename)
{
    FILE *file;
    int count = 0;
    char c;
    file = fopen(filename, "r");
    if (file == NULL)
    {
        printf("Could not open the file: %s\n", filename);
        return -1;
    }
    while ((c = fgetc(file)) != EOF)
    {
        if (c == '\n')
        {
            count++;
        }
    }
    fclose(file);
    return count;
}

int main(int argc, char *argv[])
{
    if (argc != 2)
    {
        printf("Usage: %s <file_path>\n", argv[0]);
        return 1;
    }
    const char *filename = argv[1];
    int lineCount = countLinesInFile(filename);
    if (lineCount >= 0)
    {
        printf("Number of lines in %s: %d\n", filename, lineCount);
    }
     return 0;
}
