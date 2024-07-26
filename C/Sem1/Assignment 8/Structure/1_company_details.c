#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

struct company
{
    char name[50];
    char address[100];
    char phone[15];
    int noOfEmployee;
};

int main()
{
    struct company myCompany;
    printf("Enter company name: ");
    scanf("%s", myCompany.name);
    printf("Enter company address: ");
    scanf("%s", myCompany.address);
    printf("Enter company phone number: ");
    scanf("%s", myCompany.phone);
    printf("Enter the number of employees: ");
    scanf("%d", &myCompany.noOfEmployee);

    printf("\nCompany Details:\n");
    printf("Name: %s\n", myCompany.name);
    printf("Address: %s\n", myCompany.address);
    printf("Phone: %s\n", myCompany.phone);
    printf("Number of Employees: %d\n", myCompany.noOfEmployee);
    return 0;
}
