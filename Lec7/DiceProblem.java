package Lec7;

public class DiceProblem {
    public static void main(String[] args) {
        int n=4;
        Dice(n,0,"");
    }
    public static void Dice(int n,int cur,String ans){
        if(cur==n){
            System.out.println(ans);
            return;
        }
        if(cur>n){
            return;
        }
        for(int i=1;i<=6;i++){
            Dice(n,cur+i,ans+i);
        }
//        Dice(n,cur+1,ans+1);
//        Dice(n,cur+2,ans+2);
//        Dice(n,cur+3,ans+3);
    } 
}
