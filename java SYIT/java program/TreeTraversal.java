import java.util.*;
public class TreeTraversal{
    static class Node{
        int data;
        Node left, right;
    Node (int d){
        this.data = d;
        left = right = null;
    }
    }
    Scanner sc = new Scanner(System.in);

    static Node bulidtree(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x == -1){
            return null;
        }
        Node temp = new Node(x);
        System.out.print("Enter the left child of "+x+" :");
        temp.left = bulidtree();
        System.out.print("enter the right child of "+x+" :");
        temp.right = bulidtree();
        return temp;
    }
    static void in_orderRecursive(Node current){
        if (current == null){
            return; 
        }
        in_orderRecursive(current.left);
        System.out.print(current.data+" ");
        in_orderRecursive(current.right);
    }
    static void pre_orderRecursive(Node current){
        if (current == null){
            return ;
        }
        System.out.print(current.data+" ");
        pre_orderRecursive(current.left);
        pre_orderRecursive(current.right);
    }
    static void post_orderRecursive(Node current){
        if(current == null){
            return ;
        }
        post_orderRecursive(current.left);
        post_orderRecursive(current.right);
        System.out.print(current.data+" ");
    }
    static void in_order_non_Recursive(Node current){
        if(current == null){
            return;
        }
        Stack<Node> s1 = new Stack<Node>();
        while(current!=null || !s1.isEmpty()){
            while(current != null ){
                s1.push(current);
                current = current.left;
            }
            current = s1.pop();
            System.out.print(current.data+" ");
            current = current.right;
        }
    
    }
     static void pre_order_non_Recursive(Node current){
            if(current == null){
                return;
            }
            Stack<Node> s1 = new Stack<Node>();
            while(current!=null || s1.isEmpty()){
                while(current != null){
                    s1.push(current);
                    System.out.print(current.data+" ");
                    current = current.left;
                }
                s1.pop();
                current = current.right;
            }
    }


    public static void main(String args[]){
        System.out.print("Enter the Node Pre order format (-1 or null)");
        Node root = bulidtree();

        System.out.println("Recursive In-order:");
        in_orderRecursive(root);

        System.out.println("\nRecursive pre-order:");
        pre_orderRecursive(root);

        System.out.println("\nRecursive post-order");
        post_orderRecursive(root);

        System.out.println("\nNon Recursive in-order");
        in_order_non_Recursive(root);

        System.out.println("\nNon recursive pre-order");
        pre_order_non_Recursive(root);
    }
}