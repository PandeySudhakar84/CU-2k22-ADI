package Lec40;

public class LPS {
    public static void main(String[] args) {
        String s="abcabdabcabcabd";
        LPS(s);
    }
    public static void LPS(String s){
        char Pattern[]=s.toCharArray();
        int lps[]=new int[s.length()];
        int pre=0;
        for(int suf=1;suf<lps.length;){
            if(Pattern[pre]==Pattern[suf]){
                lps[suf]=pre+1;
                pre++;
                suf++;
            }
            else {
                if(pre!=0){
                    pre=lps[pre-1];
                }
                else {
                    lps[suf]=0;
                    suf++;
                }
            }
        }
        for(int i=0;i<lps.length;i++){
            System.out.print(lps[i]+" ");
        }
    }
}
