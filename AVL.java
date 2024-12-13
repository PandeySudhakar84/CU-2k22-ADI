package Lec43;
public class AVL {
    static class Node {
        int data;
        int height;
        Node left;
        Node right;

        Node(int val) {
            this.data = val;
            height = 0;
            right = null;
            left = null;
        }
    }
        public static Node RightRotation(Node root) {
            Node child = root.left;
            Node childRight = child.right;
            child.right = root;
            root.left = childRight;
            // Update height
            root.height = 1 + Math.max(GetHeight(root.left), GetHeight(root.right));
            child.height = 1 + Math.max(GetHeight(child.left), GetHeight(child.right));
            return child;
        }

        public static Node LeftRotation(Node root) {
            Node child = root.right;
            Node childLeft = child.left;
            child.left = root;
            root.right = childLeft;
            // Update height
            root.height = 1 + Math.max(GetHeight(root.left), GetHeight(root.right));
            child.height = 1 + Math.max(GetHeight(child.left), GetHeight(child.right));
            return child;
        }

        public static int GetHeight(Node root) {
            if (root == null) {
                return 0;
            }
            return root.height;
        }

        public static int GetBalance(Node root) {
            return GetHeight(root.left) - GetHeight(root.right);
        }

        public static Node insertToAVL(Node root, int key) {
            if (root == null) {
                return new Node(key);
            }
            if (key < root.data) { // insertToAVL in the left subtree
                root.left = insertToAVL(root.left, key);
            } else if (key > root.data) { // insertToAVL in the right subtree
                root.right = insertToAVL(root.right, key);
            } else {
                return root; // Duplicate keys are not allowed
            }
            // Update height
            root.height = 1 + Math.max(GetHeight(root.left), GetHeight(root.right));

            // Balance factor
            int balance = GetBalance(root);

            // Left Left case
            if (balance > 1 && key < root.left.data) {
                return RightRotation(root);
            }
            // Right Right case
            if (balance < -1 && key > root.right.data) {
                return LeftRotation(root);
            }
            // Left Right case
            if (balance > 1 && key > root.left.data) {
                root.left = LeftRotation(root.left);
                return RightRotation(root);
            }
            // Right Left case
            if (balance < -1 && key < root.right.data) {
                root.right = RightRotation(root.right);
                return LeftRotation(root);
            }
            // No imbalance
            return root;
        }
        public static void InOrder(Node root) {
            if (root == null) {
                return;
            }
            InOrder(root.left);
            System.out.println(root.data);
            InOrder(root.right);
        }

    public static void main(String[] args) {
        Node root = null;
        root = insertToAVL(root, 21);
        root = insertToAVL(root, 26);
        root = insertToAVL(root, 30);
        root = insertToAVL(root, 9);
        root = insertToAVL(root, 4);
        root = insertToAVL(root, 14);
        root = insertToAVL(root, 28);
        InOrder(root);
    }
}
