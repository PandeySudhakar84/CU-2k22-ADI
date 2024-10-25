package Lec15;

public class BinarySearchTree {
    class Node{
        int data;
        Node left;
        Node right;
    }
    private Node root;
    BinarySearchTree(int arr[]){
        root=CreateTree(arr,0,arr.length-1);
    }
    public Node CreateTree(int arr[],int low,int high){
        if(low>high){
            return null ;
        }
        int mid=(low+high)/2;
        Node newNode=new Node();
        newNode.data=arr[mid];
        newNode.left=CreateTree(arr,low,mid-1);
        newNode.right=CreateTree(arr,mid+1,high);
        return newNode;
    }
    public void Display(){
        Display(root);
    }
    public void Display(Node root){
        if(root==null){
            return;
        }
        String s="";
        s="<--"+root.data+"-->";
        if(root.left!=null){
            s=root.left.data+s;
        }
        else {
            s=null+s;
        }
        if(root.right!=null){
            s=s+root.right.data;
        }
        else {
            s=s+null;
        }
        System.out.println(s);
        Display(root.left);
        Display(root.right);
    }

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80};
        BinarySearchTree bst=new BinarySearchTree(arr);
        bst.Display();
    }
}
