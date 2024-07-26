#include <stdio.h>

void copyFile(const char *sourceFilename, const char *destinationFilename)
{
    FILE *sourceFile, *destinationFile;
    char c;
    sourceFile = fopen(sourceFilename, "r");
    if (sourceFile == NULL)
    {
        printf("Could not open the source file: %s\n", sourceFilename);
        return;
    }
    destinationFile = fopen(destinationFilename, "w");
    if (destinationFile == NULL)
    {
        printf("Could not open the destination file: %s\n", destinationFilename);
        fclose(sourceFile);
        return;
    }
    while ((c = fgetc(sourceFile)) != EOF)
    {
        fputc(c, destinationFile);
    }
    fclose(sourceFile);
    fclose(destinationFile);
    printf("File copied successfully from %s to %s\n", sourceFilename, destinationFilename);
}

int main(int argc, char *argv[])
{
    if (argc != 3)
    {
        printf("Usage: %s <source_file_path> <destination_file_path>\n", argv[0]);
        return 1;
    }
    const char *sourceFilename = argv[1];
    const char *destinationFilename = argv[2];
    copyFile(sourceFilename, destinationFilename);
    return 0;
}
