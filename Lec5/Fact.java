package Lec5;
public class Fact {
    public static void main(String[] args) {
        int n=1;
        System.out.println(fact(n));
    }
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fn=fact(n-1);
        return n*fn;
    }
}
