import java.util.Scanner;
import java.util.Random;

class TreeNode {
    int data;
    TreeNode left, right;
    public TreeNode(int data) { this.data = data; }
}

class Main {
    // private static final Random rand = new Random();
    // private static int nodeCount = 0;

    // public static void main(String[] args) {
    //     TreeNode root = null;
    //     int totalNodes = 10;

    //     
    //     for (int i = 0; i < totalNodes; i++) {
    //         int value = rand.nextInt(100); 
    //         root = insertIntoBST(root, value);
    //         nodeCount++;
    //     }

    //     System.out.println("BST with " + nodeCount + " nodes created");

    //     System.out.print("Pre-order:  "); preOrder(root);
    //     System.out.print("\nIn-order:   "); inOrder(root);
    //     System.out.print("\nPost-order: "); postOrder(root);
    // }

    // 
    // public static TreeNode insertIntoBST(TreeNode root, int data) {
    //     if (root == null) return new TreeNode(data);
    //     if (data < root.data) {
    //         root.left = insertIntoBST(root.left, data);
    //     } else {
    //         root.right = insertIntoBST(root.right, data);
    //     }
    //     return root;
    // }
    
    
    private static final Random rand = new Random();
    private static int nodeCount = 0;

    public static void main(String[] args) {
        TreeNode root = createRandomTree(2); 
        System.out.println("Tree with " + nodeCount + " nodes created");
        
        System.out.print("Pre-order:  "); preOrder(root);
        System.out.print("\nIn-order:   "); inOrder(root);
        System.out.print("\nPost-order: "); postOrder(root);
    }

    public static TreeNode createRandomTree(int maxLevel) {
        if (maxLevel <= 0) return null;
        TreeNode node = new TreeNode(rand.nextInt(100));
        nodeCount++;
        node.left = createRandomTree(maxLevel - 1);
        node.right = createRandomTree(maxLevel - 1);
        return node;
    }

    public static void preOrder(TreeNode n)  { if (n != null) { System.out.print(n.data + " "); preOrder(n.left); preOrder(n.right); } }
    public static void inOrder(TreeNode n)   { if (n != null) { inOrder(n.left); System.out.print(n.data + " "); inOrder(n.right); } }
    public static void postOrder(TreeNode n) { if (n != null) { postOrder(n.left); postOrder(n.right); System.out.print(n.data + " "); } }
}


// class TreeNode {
//     int data;
//     TreeNode left;
//     TreeNode right;
//     public TreeNode(int data) {
//         this.data = data;
//         this.left = null;
//         this.right = null;
        
//     }
// }

// public class Main {
    
    // public static TreeNode createFixedTree() {
    //     TreeNode root = new TreeNode(1);
    //     root.left = new TreeNode(2);
    //     root.right = new TreeNode(3);
    //     root.left.left = new TreeNode(4);
    //     root.left.right = new TreeNode(5);
    //     root.right.left = new TreeNode(6);
    //     root.right.right = new TreeNode(7);
    //     return root;
    // }
    
    // public static TreeNode createDynamicTreeinputrestricted() {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter root value: ");
    //     int rootVal = sc.nextInt();
    //     TreeNode root = new TreeNode(rootVal);
        
    //     System.out.print("Enter left child of " + rootVal + ": ");
    //     int leftVal = sc.nextInt();
    //     root.left = new TreeNode(leftVal);
        
    //     System.out.print("Enter right child of " + rootVal + ": ");
    //     int rightVal = sc.nextInt();
    //     root.right = new TreeNode(rightVal);
        
    //     System.out.print("Enter left child of " + leftVal + ": ");
    //     int leftLeftVal = sc.nextInt();
    //     root.left.left = new TreeNode(leftLeftVal);
        
    //     System.out.print("Enter right child of " + leftVal + ": ");
    //     int leftRightVal = sc.nextInt();
    //     root.left.right = new TreeNode(leftRightVal);
        
    //     System.out.print("Enter left child of " + rightVal + ": ");
    //     int rightLeftVal = sc.nextInt();
    //     root.right.left = new TreeNode(rightLeftVal);
        
    //     System.out.print("Enter right child of " + rightVal + ": ");
    //     int rightRightVal = sc.nextInt();
    //     root.right.right = new TreeNode(rightRightVal);
        
    //     return root;
    // }
    
    // public static void preOrder(TreeNode node) {
    //     if (node == null) return;
    //     System.out.print(node.data + " ");
    //     preOrder(node.left);
    //     preOrder(node.right);
    // }
    
    // public static void inOrder(TreeNode node) {
    //     if (node == null) return;
    //     inOrder(node.left);
    //     System.out.print(node.data + " ");
    //     inOrder(node.right);
    // }
    
    // public static void postOrder(TreeNode node) {
    //     if (node == null) return;
    //     postOrder(node.left);
    //     postOrder(node.right);
    //     System.out.print(node.data + " ");
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
        
    //     System.out.println("Choose tree creation method:");
    //     System.out.println("1 - Fixed tree (1-7)");
    //     System.out.println("2 - Dynamic tree (custom values)");
    //     System.out.print("Your choice: ");
    //     int choice = sc.nextInt();
        
    //     TreeNode root;
    //     if (choice == 1) {
    //         root = createFixedTree();
    //     } else {
    //         root = createDynamicTree();
    //     }
        
        
    //     preOrder(root);
        
        
    //     inOrder(root);
        
        
    //     postOrder(root);
        
    // }
    
    

