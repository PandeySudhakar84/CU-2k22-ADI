package Test.LecG10;
public class CoinToss {
    public static void main(String[] args) {
        int n=3;
        Coin(n,"");
    }
    public static void Coin(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H'){
            Coin(n-1,ans+"H");
        }
        Coin(n-1,ans+"T");
    }
}
