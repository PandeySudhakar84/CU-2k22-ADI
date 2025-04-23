package Lec5;

public class Power {
    public static void main(String[] args) {
        int a=2;
        int b=5;
        System.out.println(Pow(a,b));
    }
    public static int Pow(int a,int b){
        if(b==0){
            return 1;
        }
       int fn=Pow(a,b-1);
       return a*fn;
    }
} 
