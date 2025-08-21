import java.util.*;

class Node {
    String name; 
    Node left, right;
    Node(String name) {
        this.name = name;
        this.left = null;
        this.right = null;
    }
}

public class Tree {
    Node root;

    Scanner sc = new Scanner(System.in);

    public Tree() {
        System.out.println("Enter name for node:");
        String data = sc.nextLine();

        Node newNode = new Node(data);

        System.out.println("Insert at root? (yes/no):");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            if (root == null) {
                root = newNode;
                System.out.println("Inserted at root.");
            } else {
                insertPos(root, newNode);
            }
        } else {
            System.out.println("Invalid choice");
        }
    }

    void insertPos(Node current, Node newNode) {
        System.out.println("Insert left or right ?");
        String dir = sc.nextLine();

        if (dir.equalsIgnoreCase("left")) {
            if (current.left == null) {
                current.left = newNode;
                System.out.println("Inserted at left of " + current.name);
            } else {
                insertPos(current.left, newNode);
            }
        } else if (dir.equalsIgnoreCase("right")) {
            if (current.right == null) {
                current.right = newNode;
                System.out.println("Inserted at right of " + current.name);
            } else {
                insertPos(current.right, newNode);
            }
        } else {
            System.out.println("Invalid direction.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Scanner sc = new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("Insert at root:");
            System.out.println("Enter your choice :");
            choice = sc.nextInt();
        }
        Node root;
        int data;
        Node newNode = new Node(data);
        switch(choice){
            case 1:
                System.out.println("Enter the data:");
                data = sc.nextInt();
                tree.insertPos(root , data);
        }
        while(choice != 1)

    }
}
