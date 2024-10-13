package Test.LecG10;

public class Permutation {
    public static void main(String[] args) {
        String s="abc";
        PrintAllPermutation(s,"");
    }
    public static void PrintAllPermutation(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String s1=s.substring(0,i);
            String s2=s.substring(i+1);
            PrintAllPermutation(s1+s2,ans+ch);
        }
    }
}
