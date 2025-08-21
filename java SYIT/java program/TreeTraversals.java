import java.util.Scanner;
import java.util.Stack;

public class TreeTraversals {

    // ---------- Node ----------
    static class Node {
        int data;
        Node left, right;
        Node(int d) { 
            this.data = d;
            left = right = null;
        }
    }

    static Scanner sc = new Scanner(System.in);

    // ---------- Build Tree (Pre-order Input) ----------
    static Node buildTree() {
        int x = sc.nextInt();
        if (x == -1) {
            return null;
        }
        Node temp = new Node(x);
        System.out.print("Enter the left child of " + x + ": ");
        temp.left = buildTree();
        System.out.print("Enter the right child of " + x + ": ");
        temp.right = buildTree();
        return temp;
    }

    // ---------- DFS (Recursive) Traversals ----------
    static void preorderRecursive(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorderRecursive(root.left);
        preorderRecursive(root.right);
    }

    static void inorderRecursive(Node root) {
        if (root == null) return;
        inorderRecursive(root.left);
        System.out.print(root.data + " ");
        inorderRecursive(root.right);
    }

    static void postorderRecursive(Node root) {
        if (root == null) return;
        postorderRecursive(root.left);
        postorderRecursive(root.right);
        System.out.print(root.data + " ");
    }

    // ---------- DFS (Iterative with Stack) ----------
    // Pre-order Iterative
    static void preorderIterative(Node root) {
        Stack<Node> s1 = new Stack<>();
        Node cur = root;

        while (cur != null || !s1.isEmpty()) {
            while (cur != null) {
                s1.push(cur);
               System.out.print(cur.data + " ");
                cur = cur.left;
            }

            cur = s1.pop();

            cur = cur.right;
        }
    }

    // In-order Iterative
    static void inorderIterative(Node root) {
        Stack<Node> s1 = new Stack<>();
        Node cur = root;

        while (cur != null || !s1.isEmpty()) {
            while (cur != null) {
                s1.push(cur);
                cur = cur.left;
            }

            cur = s1.pop();
            System.out.print(cur.data + " ");

            cur = cur.right;
        }
    }

    // Post-order Iterative using two stacks
    static void postorderIterative(Node root) {
        if (root == null) return;

        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        s1.push(root);
        while (!s1.isEmpty()) {
            Node cur = s1.pop();
            s2.push(cur);

            if (cur.left != null) s1.push(cur.left);
            if (cur.right != null) s1.push(cur.right);
        }

        while (!s2.isEmpty()) {
            System.out.print(s2.pop().data + " ");
        }
    }

    // ---------- BFS Traversal ----------
    static void bfs(Node root) {
        if (root == null) return;

        // BFS uses a queue, so Stack is not suitable here
        java.util.Queue<Node> q = new java.util.LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node cur = q.remove();
            System.out.print(cur.data + " ");
            if (cur.left != null) q.add(cur.left);
            if (cur.right != null) q.add(cur.right);
        }
    }

     static void search(Node root,int val) {
        if (root == null) return;
        Node temp = root;
        if(temp.data==val) 
        { 
            System.out.print("found");
        return;
     }
        search(temp.left,val);
        search(temp.right,val);
    }

     static int height(Node root){
        Node temp = root;
        if(root==null) return 0;
        if(temp.left==null && temp.right==null) return 0;
        return 1 + Math.max(height(temp.left) height(temp.right));

}

    // ---------- Main ----------
    public static void main(String[] args) {
        System.out.println("Enter tree data in pre-order format (-1 for null): ");
        Node root = buildTree();

        System.out.print("\nPre-order (recursive): "); 
        preorderRecursive(root);

        System.out.print("\nIn-order (recursive): "); 
        inorderRecursive(root);

        System.out.print("\nPost-order (recursive): ");
         postorderRecursive(root);

        System.out.print("\nPre-order (iterative): "); 
        preorderIterative(root);

        System.out.print("\nIn-order (iterative): ");
         inorderIterative(root);

        System.out.print("\nPost-order (iterative): ");
         postorderIterative(root);

        System.out.print("\nBFS (level-order): "); bfs(root);
        System.out.println();

        search(root,20);
        System.out.println();
        System.out.println(height(root));

        sc.close();
    }
}
