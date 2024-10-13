package Test.LecG10;

public class Fact_Tail {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n,1));
    }
    public static int fact(int n,int ans){
        if(n==0 || n==1){
            return ans;
        }
        return fact(n-1,n*ans);
    }
}
