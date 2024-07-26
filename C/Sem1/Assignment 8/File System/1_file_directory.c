#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <dirent.h>

void listFilesAndSubdirectories(const char *path)
{
    struct dirent *entry;
    DIR *dp = opendir(path);
    if (dp == NULL)
    {
        perror("opendir");
        exit(EXIT_FAILURE);
    }
    printf("Files and sub-directories in '%s':\n", path);
    while ((entry = readdir(dp)) != NULL)
    {
        if (strcmp(entry->d_name, ".") != 0 && strcmp(entry->d_name, "..") != 0)
        {
            printf("%s\n", entry->d_name);
        }
    }
    closedir(dp);
}

int main(int argc, char *argv[])
{
    if (argc != 2)
    {
        printf("Usage: %s <directory_path>\n", argv[0]);
        return EXIT_FAILURE;
    }
    const char *directoryPath = argv[1];
    listFilesAndSubdirectories(directoryPath);
    return EXIT_SUCCESS;
}
