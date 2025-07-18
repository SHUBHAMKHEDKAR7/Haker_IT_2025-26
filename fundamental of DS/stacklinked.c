#include <stdio.h>
#include <conio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node *next;
};

void main() {
    struct Node *top = NULL, *newNode, *temp;
    int choice, value;

    clrscr();

    while (1) {
        printf("\n--- Stack Using Linked List ---\n");
        printf("1. Push\n");
        printf("2. Pop\n");
        printf("3. Peek\n");
        printf("4. Display\n");
        printf("5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1: // Push
                newNode = (struct Node*) malloc(sizeof(struct Node));
                printf("Enter value to push: ");
                scanf("%d", &value);
                newNode->data = value;
                newNode->next = top;
                top = newNode;
                printf("Value pushed to stack.\n");
                break;

            case 2: // Pop
                if (top == NULL) {
                    printf("Stack Underflow! Cannot pop.\n");
                } else {
                    temp = top;
                    printf("Popped value: %d\n", top->data);
                    top = top->next;
                    free(temp);
                }
                break;

            case 3: // Peek
                if (top == NULL) {
                    printf("Stack is empty.\n");
                } else {
                    printf("Top of stack: %d\n", top->data);
                }
                break;

            case 4: // Display
                if (top == NULL) {
                    printf("Stack is empty.\n");
                } else {
                    temp = top;
                    printf("Stack elements (top to bottom): ");
                    while (temp != NULL) {
                        printf("%d ", temp->data);
                        temp = temp->next;
                    }
                    printf("\n");
                }
                break;

            case 5:
                printf("Exiting...\n");
                getch();
                exit(0);

            default:
                printf("Invalid choice.\n");
        }
    }

    getch();
}
