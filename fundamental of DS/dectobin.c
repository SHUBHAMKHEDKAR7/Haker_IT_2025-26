#include <stdio.h>
#include <conio.h>
#define MAX 50

void main() {
    int stack[MAX], top = -1;
    int num, rem;

    clrscr();
    printf("Enter a decimal number: ");
    scanf("%d", &num);

    while (num > 0) {
        rem = num % 2;
        top++;
        stack[top] = rem;
        num = num / 2;
    }

    printf("Binary equivalent: ");
    while (top >= 0) {
        printf("%d", stack[top]);
        top--;
    }

    getch();
}
