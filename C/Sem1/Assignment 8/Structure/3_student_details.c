#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

struct Student {
    int rollNo;
    char name[50];
    char address[100];
    int age;
    float averageMarks;
};

void readAndDisplayStudentDetails(struct Student students[], int n) {
    for (int i = 0; i < n; i++) {
        printf("Student %d Details:\n", i + 1);
        printf("Roll No: %d\n", students[i].rollNo);
        printf("Name: %s\n", students[i].name);
        printf("Address: %s\n", students[i].address);
        printf("Age: %d\n", students[i].age);
        printf("Average Marks: %.2f\n\n", students[i].averageMarks);
    }
}

int main() {
    struct Student students[12];
    for (int i = 0; i < 12; i++) {
        printf("Enter details for Student %d:\n", i + 1);
        printf("Roll No: ");
        scanf("%d", &students[i].rollNo);
        printf("Name: ");
        scanf("%s", students[i].name);
        printf("Address: ");
        scanf("%s", students[i].address);
        printf("Age: ");
        scanf("%d", &students[i].age);
        printf("Average Marks: ");
        scanf("%f", &students[i].averageMarks);
    }
    readAndDisplayStudentDetails(students, 12);
    return 0;
}
