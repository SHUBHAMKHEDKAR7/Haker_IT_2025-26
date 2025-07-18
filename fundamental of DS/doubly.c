#include <stdio.h>
#include <conio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node *prev;
    struct Node *next;
};

void main() {
    struct Node *head = NULL, *tail = NULL, *newNode, *temp;
    int choice, value;

    clrscr();

    while (1) {
        printf("\n--- Doubly Linked List Menu ---\n");
        printf("1. Insert at End\n");
        printf("2. Delete by Value\n");
        printf("3. Display Forward\n");
        printf("4. Display Reverse\n");
        printf("5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                newNode = (struct Node*) malloc(sizeof(struct Node));
                printf("Enter value to insert: ");
                scanf("%d", &value);
                newNode->data = value;
                newNode->prev = NULL;
                newNode->next = NULL;

                if (head == NULL) {
                    head = tail = newNode;
                } else {
                    tail->next = newNode;
                    newNode->prev = tail;
                    tail = newNode;
                }
                printf("Node inserted at end.\n");
                break;

            case 2:
                if (head == NULL) {
                    printf("List is empty.\n");
                    break;
                }
                printf("Enter value to delete: ");
                scanf("%d", &value);
                temp = head;
                while (temp != NULL && temp->data != value) {
                    temp = temp->next;
                }
                if (temp == NULL) {
                    printf("Value not found.\n");
                } else {
                    if (temp == head) {
                        head = head->next;
                        if (head != NULL)
                            head->prev = NULL;
                        else
                            tail = NULL;
                    } else if (temp == tail) {
                        tail = tail->prev;
                        tail->next = NULL;
                    } else {
                        temp->prev->next = temp->next;
                        temp->next->prev = temp->prev;
                    }
                    free(temp);
                    printf("Node deleted.\n");
                }
                break;

            case 3:
                if (head == NULL) {
                    printf("List is empty.\n");
                } else {
                    printf("Forward List: ");
                    temp = head;
                    while (temp != NULL) {
                        printf("%d <-> ", temp->data);
                        temp = temp->next;
                    }
                    printf("NULL\n");
                }
                break;

            case 4:
                if (tail == NULL) {
                    printf("List is empty.\n");
                } else {
                    printf("Reverse List: ");
                    temp = tail;
                    while (temp != NULL) {
                        printf("%d <-> ", temp->data);
                        temp = temp->prev;
                    }
                    printf("NULL\n");
                }
                break;

            case 5:
                printf("Exiting program...\n");
                getch();
                exit(0);

            default:
                printf("Invalid choice.\n");
        }
    }

    getch();
}
