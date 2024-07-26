#include <stdio.h>

int main(int argc, char *argv[])
{
    if (argc != 2)
    {
        printf("Usage: %s <file_path>\n", argv[0]);
        return 1;
    }
    const char *filename = argv[1];
    if (remove(filename) == 0)
    {
        printf("File %s deleted successfully.\n", filename);
        return 0;
    }
    else
    {
        perror("Error deleting the file");
        return 1;
    }
}
