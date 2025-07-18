#include <stdio.h>
#include <conio.h>
#define MAX 5

void main() {
    int stack[MAX];
    int top = -1;
    int choice, value, i;

    clrscr(); // Clear screen

    while (1) {
        printf("\n====== STACK MENU ======\n");
        printf("1. Push\n");
        printf("2. Pop\n");
        printf("3. Peek (Top Element)\n");
        printf("4. Display Stack\n");
        printf("5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1: // Push
                if (top == MAX - 1) {
                    printf("Stack Overflow! Cannot push %d\n", value);
                } else {
                    printf("Enter value to push: ");
                    scanf("%d", &value);
                    top++;
                    stack[top] = value;
                    printf("%d pushed onto the stack.\n", value);
                }
                break;

            case 2: // Pop
                if (top == -1) {
                    printf("Stack Underflow! Nothing to pop.\n");
                } else {
                    printf("%d popped from the stack.\n", stack[top]);
                    top--;
                }
                break;

            case 3: // Peek
                if (top == -1) {
                    printf("Stack is empty.\n");
                } else {
                    printf("Top element is: %d\n", stack[top]);
                }
                break;

            case 4: // Display
                if (top == -1) {
                    printf("Stack is empty.\n");
                } else {
                    printf("Stack elements (Top to Bottom):\n");
                    for (i = top; i >= 0; i--) {
                        printf("%d\n", stack[i]);
                    }
                }
                break;

            case 5: // Exit
                printf("Exiting program. Thank you!\n");
                getch();
                return;

            default:
                printf("Invalid choice! Please try again.\n");
        }
    }

    getch(); // Wait for key press before exit
}
