package Test.LecG10;

public class IncreasingNumber {
    public static void main(String[] args) {
        int n=10;
        PI(n);
    }
    public static void PI(int n){
        if(n==0){
            return;
        }
        PI(n-1);
        System.out.println(n);
    }
}
