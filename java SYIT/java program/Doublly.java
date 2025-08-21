import java.util.*;
class Node{
    int data;
    Node next , prev;
    Node (int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class linkedlist{
    Node head, temp;
    void insert_at_beginning(int data){
        Node n1 = new Node(data);
        if(head == null)
        {
            head = n1;
        }
        else{
            n1.next = head;
            head.prev = n1;
            head = n1;
        }

    }
    void insert_at_end(int data){
        Node n1 = new Node(data);
        if(head == null){
            head = n1;
            return;
        }
        temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = n1;
        n1.prev = temp;
        
    }
    void insert_at_position(int data, int pos){
        if(pos<1) {
			System.out.println("Invalid");
			return;
		}
		if(pos == 1) {
			insert_at_beginning(data);
		}
		Node newNode = new Node(data);
		temp = head;
		for(int i =1;i<pos && temp!=null;i++) {
			temp = temp.next;
		}
		if(temp == null) {
			System.out.println("Out Of Range");
		}
		newNode.next = temp.next;
		newNode.prev = temp;
		if(temp.next != null) {
			temp.next.prev = newNode;
		}
		temp.next = newNode;
	}
    void Delete_from_Beginning() {
		if(head == null) {
			return;
		}
		head = head.next;
		if(head != null) {
			head.prev = null;
		}
	}
    void Delete_from_End() {
		if(head == null) 
        return;
		if(head.next == null) {
			head = null;
			return;
		}
		temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.prev.next = null;
	}
    void Delete_from_Position(int pos) {
		if(head == null || pos <1) {
			System.out.println("Invalid or Empty");
			return;
		}
		if(pos == 1) {
			Delete_from_Beginning();
		}
		temp = head;
		for(int j = 1;j<pos && temp !=null;j++) {
			temp = temp.next;
		}
		if(temp == null) {
			System.out.println("Out of range");
		}
		if(temp.prev != null) {
			temp.prev.next = null;
		}
		if(temp.next != null) {
			temp.next.prev = null;
		}
	}
    void display() {
        if (head == null){
            System.out.println("list is empty\n");
            return;
        }
		temp = head;
		while(temp !=null) {
			System.out.print(temp.data+"<->");
			temp = temp.next;
		}
        System.out.println("NULL");
	}

    
}
public class Doublly{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        linkedlist li  = new linkedlist();
        int choice;
        do{
            System.out.print("_____menu_____\n");
            System.out.print("1.insert at beginning\n");
            System.out.print("2.insert at end\n");
            System.out.print("3.insert at position\n");
            System.out.print("4.delete from beginning\n");
            System.out.print("5.delete from end\n");
            System.out.print("6.delete from position\n");
            System.out.print("7.display\n");
            System.out.print("8.Exit\n");
            System.out.print("Enter the choice:");
            choice = sc.nextInt();
            int data, pos;
            switch(choice){
                case 1:
                    System.out.println("Enter the data:");
                    data = sc.nextInt();
                    li.insert_at_beginning(data);
                    break;
                case 2:
                    System.out.println("Enter the data:");
                    data = sc.nextInt();
                    li.insert_at_end(data);
                    break;
                case 3:
                    System.out.println("Enter the data:");
                    data = sc.nextInt();
                    System.out.println("Enter the pos:");
                    pos = sc.nextInt();
                    li.insert_at_position(data , pos);
                    break;
                case 4:
                    li.Delete_from_Beginning();
                    break;
                case 5:
                    li.Delete_from_End();
                    break;
                case 6:
                    System.out.println("Enter the pos:");
                    pos = sc.nextInt();
                    li.Delete_from_Position(pos); 
                    break;
                case 7:
                    li.display();
                    break;
                case 8:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invaild choice");
            }
            
        }while(choice != 8);
        sc.close();
    }
}