#include <stdio.h>
#include <conio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node *next;
};

void main() {
    struct Node *head = NULL, *newNode, *temp, *prev;
    int choice, value;

    clrscr();

    while (1) {
        printf("\n--- Singly Linked List Menu ---\n");
        printf("1. Insert at End\n");
        printf("2. Delete by Value\n");
        printf("3. Display List\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                newNode = (struct Node*) malloc(sizeof(struct Node));
                printf("Enter value to insert: ");
                scanf("%d", &value);
                newNode->data = value;
                newNode->next = NULL;

                if (head == NULL) {
                    head = newNode;
                } else {
                    temp = head;
                    while (temp->next != NULL) {
                        temp = temp->next;
                    }
                    temp->next = newNode;
                }
                printf("Node inserted.\n");
                break;

            case 2:
                if (head == NULL) {
                    printf("List is empty.\n");
                    break;
                }
                printf("Enter value to delete: ");
                scanf("%d", &value);
                temp = head;
                prev = NULL;
                while (temp != NULL && temp->data != value) {
                    prev = temp;
                    temp = temp->next;
                }
                if (temp == NULL) {
                    printf("Value not found.\n");
                } else {
                    if (temp == head) {
                        head = head->next;
                    } else {
                        prev->next = temp->next;
                    }
                    free(temp);
                    printf("Node deleted.\n");
                }
                break;

            case 3:
                if (head == NULL) {
                    printf("List is empty.\n");
                } else {
                    temp = head;
                    printf("Linked List: ");
                    while (temp != NULL) {
                        printf("%d -> ", temp->data);
                        temp = temp->next;
                    }
                    printf("NULL\n");
                }
                break;

            case 4:
                printf("Exiting...\n");
                getch();
                exit(0);

            default:
                printf("Invalid choice.\n");
        }
    }

    getch();
}
