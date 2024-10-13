package Test.LecG10;
public class PrintAllSubSequence {
    public static void main(String[] args) {
        String s="abc";
        SubSecequence(s,"");
        System.out.println(count);
    }
    static int count=0;
    public static void SubSecequence(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            count++;
            return;
        }
        char ch=s.charAt(0);
        SubSecequence(s.substring(1),ans);
        SubSecequence(s.substring(1),ans+ch);
    }
}
