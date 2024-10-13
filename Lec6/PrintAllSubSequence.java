package Lec6;
public class PrintAllSubSequence {
    public static void main(String[] args) {
        String s="abc";
        Sub(s,"");
        System.out.println(count);
    }
    static int count=0;
    public static void Sub(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            count++;
            return;
        }
        char ch=str.charAt(0);
        Sub(str.substring(1),ans);
        Sub(str.substring(1), ans+ch);
    }
}
