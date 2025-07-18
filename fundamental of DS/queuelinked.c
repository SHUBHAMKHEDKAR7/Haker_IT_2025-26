#include <stdio.h>
#include <conio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node *next;
};

void main() {
    struct Node *front = NULL, *rear = NULL, *newNode, *temp;
    int choice, value;

    clrscr();

    while (1) {
        printf("\n--- Queue Using Linked List ---\n");
        printf("1. Enqueue\n");
        printf("2. Dequeue\n");
        printf("3. Peek\n");
        printf("4. Display\n");
        printf("5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1: // Enqueue
                newNode = (struct Node*) malloc(sizeof(struct Node));
                printf("Enter value to enqueue: ");
                scanf("%d", &value);
                newNode->data = value;
                newNode->next = NULL;

                if (rear == NULL) {
                    front = rear = newNode;
                } else {
                    rear->next = newNode;
                    rear = newNode;
                }
                printf("Value enqueued.\n");
                break;

            case 2: // Dequeue
                if (front == NULL) {
                    printf("Queue Underflow! Cannot dequeue.\n");
                } else {
                    temp = front;
                    printf("Dequeued value: %d\n", front->data);
                    front = front->next;
                    if (front == NULL)
                        rear = NULL;
                    free(temp);
                }
                break;

            case 3: // Peek
                if (front == NULL) {
                    printf("Queue is empty.\n");
                } else {
                    printf("Front of queue: %d\n", front->data);
                }
                break;

            case 4: // Display
                if (front == NULL) {
                    printf("Queue is empty.\n");
                } else {
                    temp = front;
                    printf("Queue elements (front to rear): ");
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
