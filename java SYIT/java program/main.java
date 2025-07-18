import java.util.*;
class node{
    int data ;
    node next;
    node(int data){
        this.data = data;
        this.next = null;
    }
}
class linkedlist{
    node head;

    void InsertAtBeginning(int data){
        node newnode = new node(data);
        newnode.next = head;
        head = newnode;
    }
    void InsertAtEnd(int data){
        node newnode = new node(data);
        if(head == null){
            head = newnode;
        }
        else{
            node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
        }

    }void InsertAtPosition(int data, int pos){
        if(pos == 1){
            InsertAtBeginning(data);
            return;
        }
        node newnode = new node(data);
        node temp = head;
        for(int i= 11; i<pos-1&&temp!= null; i++){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("position out off range");
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }void DeleteAtBeginning(){
        if(head == null){
            System.out.println("list is empty");
        }
        else{
            head = head;
        }
    }void DeleteAtEnd(){
        if(head == null){
            System.out.println("list is empty");
        }
        else if (head.next == null){
            head = null;
        }
        else{
            node temp = head;
            while(temp!=null){
                temp = temp.next;
            }
            temp.next = null;
        }
    }
    void DeleteAtPosition(int pos){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        if(pos == 1){
            head = head.next;
        }
        node temp = head;
        for(int i = 0; i<pos - 1  && temp!= null; i++){
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println("position out off range");
        }
        else{
            temp.next = temp.next.next;
        }
    }
    void display()
    {
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
public class main{
    public static void main(String[] args){
        linkedlist list = new linkedlist();
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("1.Insert at beginning");
            System.out.println("2.Insert at end");
            System.out.println("3.Insert at Position");
            System.out.println("4.Delete at beginning");
            System.out.println("5.Delete at end");
            System.out.println("6.Insert at Position");
            System.out.println("7.Display");
            System.out.println("8.Exit");
            System.out.println("Enter the choice:");
            choice = sc.nextInt();
            int data , pos;
            switch(choice){
                case 1:
                    System.out.println("Enter the data");
                    data = sc.nextInt();
                    list.InsertAtBeginning(data);
                    break;
                case 2:
                    System.out.println("Enter the data");
                    data = sc.nextInt();
                    list.InsertAtEnd(data);
                    break;
                case 3:
                    System.out.println("Enter the data");
                    data = sc.nextInt();
                    System.out.println("Enter the pos");
                    pos = sc.nextInt();
                    list.InsertAtPosition(data, pos);
                    break;
                case 4:
                    list.DeleteAtBeginning();
                    break;
                case 5:
                    list.DeleteAtEnd();
                    break;
                case 6:
                    System.out.println("enter the pos");
                    pos = sc.nextInt();
                    break;
                case 7:
                    list.display();
                    break;
                case 8:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice != 8);
        sc.close();
    }
}