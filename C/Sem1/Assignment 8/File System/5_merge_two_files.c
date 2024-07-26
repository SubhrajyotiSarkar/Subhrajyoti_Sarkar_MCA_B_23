#include <stdio.h>

void mergeFiles(const char *sourceFile1, const char *sourceFile2, const char *destinationFile)
{
    FILE *file1, *file2, *destination;
    char c;
    file1 = fopen(sourceFile1, "r");
    if (file1 == NULL)
    {
        printf("Could not open the first source file: %s\n", sourceFile1);
        return;
    }
    file2 = fopen(sourceFile2, "r");
    if (file2 == NULL)
    {
        printf("Could not open the second source file: %s\n", sourceFile2);
        fclose(file1);
        return;
    }
    destination = fopen(destinationFile, "w");
    if (destination == NULL)
    {
        printf("Could not open the destination file: %s\n", destinationFile);
        fclose(file1);
        fclose(file2);
        return;
    }
    while ((c = fgetc(file1)) != EOF)
    {
        fputc(c, destination);
    }
    while ((c = fgetc(file2)) != EOF)
    {
        fputc(c, destination);
    }
    fclose(file1);
    fclose(file2);
    fclose(destination);
    printf("Files merged successfully into %s\n", destinationFile);
}

int main(int argc, char *argv[])
{
    if (argc != 4)
    {
        printf("Usage: %s <source_file1_path> <source_file2_path> <destination_file_path>\n", argv[0]);
        return 1;
    }
    const char *sourceFile1 = argv[1];
    const char *sourceFile2 = argv[2];
    const char *destinationFile = argv[3];
    mergeFiles(sourceFile1, sourceFile2, destinationFile);
    return 0;
}
