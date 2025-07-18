#include <stdio.h>
#include <conio.h>
#define MAX 5

void main() {
    int queue[MAX];
    int front = -1, rear = -1;
    int choice, value, i;

    clrscr();  // Clear the screen (Turbo C specific)

    while (1) {
        printf("\n--- Queue Menu ---\n");
        printf("1. Enqueue\n");
        printf("2. Dequeue\n");
        printf("3. Display\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                if (rear == MAX - 1) {
                    printf("Queue Overflow\n");
                } else {
                    printf("Enter value to insert: ");
                    scanf("%d", &value);
                    if (front == -1)
                        front = 0;
                    rear++;
                    queue[rear] = value;
                    printf("%d inserted into queue\n", value);
                }
                break;

            case 2:
                if (front == -1 || front > rear) {
                    printf("Queue Underflow\n");
                    front = rear = -1;
                } else {
                    printf("%d removed from queue\n", queue[front]);
                    front++;
                }
                break;

            case 3:
                if (front == -1 || front > rear) {
                    printf("Queue is empty\n");
                } else {
                    printf("Queue elements: ");
                    for (i = front; i <= rear; i++) {
                        printf("%d ", queue[i]);
                    }
                    printf("\n");
                }
                break;

            case 4:
                printf("Exiting program...\n");
                getch();
                exit(0);  // Exit the program

            default:
                printf("Invalid choice. Please try again.\n");
        }
    }

    getch();  // Wait for keypress before exiting main (in case of logic errors)
}
