#include <stdio.h>
#include <conio.h>
#include <string.h>
#define MAX 5

void main() {
    char playlist[MAX][30];
    int front = -1, rear = -1;
    int choice, i;
    char song[30];

    clrscr();
    while (1) {
        printf("\n--- Music Playlist Menu ---\n");
        printf("1. Add Song\n");
        printf("2. Play Song\n");
        printf("3. Show Playlist\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        fflush(stdin);  // Clear input buffer

        switch (choice) {
            case 1:
                if (rear == MAX - 1) {
                    printf("Playlist Full (Queue Overflow)\n");
                } else {
                    printf("Enter song name: ");
                    gets(song);  // Turbo C specific
                    if (front == -1) front = 0;
                    rear++;
                    strcpy(playlist[rear], song);
                    printf("Song '%s' added to playlist\n", song);
                }
                break;

            case 2:
                if (front == -1 || front > rear) {
                    printf("No songs to play (Queue Underflow)\n");
                    front = rear = -1;
                } else {
                    printf("Now playing: %s\n", playlist[front]);
                    front++;
                }
                break;

            case 3:
                if (front == -1 || front > rear) {
                    printf("Playlist is empty\n");
                } else {
                    printf("Songs in Playlist:\n");
                    for (i = front; i <= rear; i++)
                        printf("%s\n", playlist[i]);
                }
                break;

            case 4:
                printf("Exiting Music Playlist...\n");
                getch();
                exit(0);

            default:
                printf("Invalid choice\n");
        }
    }
}
