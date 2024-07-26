#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#define PI 3.14159

typedef struct
{
    double real;
    double imaginary;
} complex;

complex addComplex(complex c1, complex c2)
{
    complex result;
    result.real = c1.real + c2.real;
    result.imaginary = c1.imaginary + c2.imaginary;
    return result;
}

complex subtractComplex(complex c1, complex c2)
{
    complex result;
    result.real = c1.real - c2.real;
    result.imaginary = c1.imaginary - c2.imaginary;
    return result;
}

int main()
{
    complex num1, num2, sum, difference;
    printf("Enter the real and imaginary parts of the first complex number: ");
    scanf("%lf %lf", &num1.real, &num1.imaginary);
    printf("Enter the real and imaginary parts of the second complex number: ");
    scanf("%lf %lf", &num2.real, &num2.imaginary);
    sum = addComplex(num1, num2);
    difference = subtractComplex(num1, num2);
    printf("Sum of the two complex numbers: %.2lf + %.2lfi\n", sum.real, sum.imaginary);
    printf("Difference of the two complex numbers: %.2lf + %.2lfi\n", difference.real, difference.imaginary);
    return 0;
}
