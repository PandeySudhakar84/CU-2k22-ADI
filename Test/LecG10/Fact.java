package Test.LecG10;

public class Fact {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
    }
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        int ans=fact(n-1);
        return ans*n;
    }
}
