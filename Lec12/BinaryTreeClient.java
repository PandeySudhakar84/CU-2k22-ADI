package Lec12;

public class BinaryTreeClient {
    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        // user input
        // 10 true 20 true 40 false false true 50 false false true 30 false true 60 false false
        bt.Display();
        System.out.println("----------------------------------------");
        bt.Find();
        bt.Max();
    }
}
