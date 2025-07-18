#include <stdio.h>
#include <conio.h>
#include <string.h>
#define MAX 50

void main() {
    char expr[MAX];
    char stack[MAX];
    int top = -1, i, valid = 1;

    clrscr();
    printf("Enter an expression with parentheses: ");
    gets(expr);  // Turbo C specific, use fgets in modern compilers

    for (i = 0; expr[i] != '\0'; i++) {
        if (expr[i] == '(') {
            top++;
            stack[top] = '(';
        } else if (expr[i] == ')') {
            if (top == -1) {
                valid = 0;
                break;
            }
            top--;
        }
    }

    if (valid && top == -1)
        printf("The expression is well-formed.\n");
    else
        printf("The expression is not well-formed.\n");

    getch();
}
