#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

struct Employee
{
    char name[50];
    int employeeID;
    float salary;
    char department[50];
};

int main()
{
    struct Employee employee;
    printf("Enter Employee's Details:\n");
    printf("Name: ");
    scanf("%s", employee.name);
    printf("Employee ID: ");
    scanf("%d", &employee.employeeID);
    printf("Salary: ");
    scanf("%f", &employee.salary);
    printf("Department: ");
    scanf("%s", employee.department);
    printf("\nEmployee Details:\n");
    printf("Name: %s\n", employee.name);
    printf("Employee ID: %d\n", employee.employeeID);
    printf("Salary: %.2f\n", employee.salary);
    printf("Department: %s\n", employee.department);
    return 0;
}
