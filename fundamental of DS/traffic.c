#include <stdio.h>
#include <conio.h>
#define MAX 5

void main() {
    int queue[MAX], front = -1, rear = -1;
    int choice, vehicle, i;

    clrscr();
    while (1) {
        printf("\n--- Traffic Signal Queue ---\n");
        printf("1. Vehicle Arrives (Enqueue)\n");
        printf("2. Vehicle Passes (Dequeue)\n");
        printf("3. Show Vehicles in Queue\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                if (rear == MAX - 1) {
                    printf("Traffic Lane Full (Queue Overflow)\n");
                } else {
                    printf("Enter Vehicle Number: ");
                    scanf("%d", &vehicle);
                    if (front == -1) front = 0;
                    rear++;
                    queue[rear] = vehicle;
                    printf("Vehicle %d added to the queue\n", vehicle);
                }
                break;

            case 2:
                if (front == -1 || front > rear) {
                    printf("No vehicles waiting (Queue Underflow)\n");
                    front = rear = -1;
                } else {
                    printf("Vehicle %d has passed the signal\n", queue[front]);
                    front++;
                }
                break;

            case 3:
                if (front == -1 || front > rear) {
                    printf("No vehicles in queue\n");
                } else {
                    printf("Vehicles waiting: ");
                    for (i = front; i <= rear; i++)
                        printf("%d ", queue[i]);
                    printf("\n");
                }
                break;

            case 4:
                printf("Exiting Traffic System...\n");
                getch();
                exit(0);

            default:
                printf("Invalid choice\n");
        }
    }
}
