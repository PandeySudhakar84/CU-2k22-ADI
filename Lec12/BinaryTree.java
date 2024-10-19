package Lec12;
import java.util.Scanner;

public class BinaryTree {
    private class Node {
        int data;
        Node left;
        Node right;
    }

    private Node root;
    Scanner sc = new Scanner(System.in);

    BinaryTree() {
        this.root = CreateTree();
    }

    public Node CreateTree() {
        int item = sc.nextInt();
        Node newNode = new Node();
        newNode.data = item;
        boolean isLeftChild = sc.nextBoolean();
        if (isLeftChild) {
            newNode.left = CreateTree();
        }
        boolean isRightChild = sc.nextBoolean();
        if (isRightChild) {
            newNode.right = CreateTree();
        }
        return newNode;
    }

    public void Display() {
        Display(root);
    }

    public void Display(Node root) {
        if (root == null) {
            return;
        }
        String s = "";
        s = "<--" + root.data + "-->";
        if (root.left != null) {
            s = root.left.data + s;
        } else {
            s = "." + s;
        }
        if (root.right != null) {
            s = s + root.right.data;
        } else {
            s = s + ".";
        }
        System.out.println(s);
        Display(root.left);
        Display(root.right);
    }

    public void Max() {
        System.out.println(Max(root));
    }

    public int Max(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int l = Max(root.left);
        int r = Max(root.right);
        return Math.max(root.data, Math.max(l, r));
    }

    public void Find() {
        System.out.println(Find(root, 50));
    }

    public boolean Find(Node root, int item) {
        if (root == null) {
            return false;
        }
        if (root.data == item) {
            return true;
        }
        boolean l = Find(root.left, item);
        boolean r = Find(root.right, item);
        return l || r;
    }
}
