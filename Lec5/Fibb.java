package Lec5;
public class Fibb {
    public static void main(String[] args) {
        int n=15;
        System.out.println(fibo(n));
    }
    public static int  fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int fibo1=fibo(n-1);
        int fibo2=fibo(n-2);
        return fibo1+fibo2;
//        return fibo(n-2)+fibo(n-1);
    }
}
