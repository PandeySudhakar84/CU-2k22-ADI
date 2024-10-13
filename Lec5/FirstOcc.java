package Lec5;

public class FirstOcc {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,30,40};
        int target=30;
       int ans= Search(arr,target,0);
        System.out.println(ans);
    }
    public static int Search(int arr[],int target,int Index){
        if(arr.length==Index){
            return -1;
        }
        if(arr[Index]==target){
            return Index;
        }
        return Search(arr,target,Index+1);
    }
}
