package Lec11;

public class N_Bit_String {
    public static void main(String[] args) {
        int n=3;
        Permutation(n,"");
    }
    public static void Permutation(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        Permutation(n-1,ans+"0");
        Permutation(n-1,ans+"1");
    }
}
