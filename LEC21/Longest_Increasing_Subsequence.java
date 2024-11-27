package LEC21;
import java.util.Arrays;
public class Longest_Increasing_Subsequence {
    public static void main(String[] args) {
        int arr[]={10,9,2,5,3,7,101,18};
        int lis[]=new int[arr.length];
        Arrays.fill(lis,1);
          for(int i=1;i<arr.length;i++){
              for(int j=i-1;j>=0;j--){
                 if(arr[j]<arr[i]){
                     int l=lis[j];
                     lis[i]=Math.max(lis[i],l+1);
                 }
              }
          }
          int max=lis[0];
          for(int i=1;i<lis.length;i++){
              max=Math.max(max,lis[i]);
          }
        System.out.println(max);
    }
}
