package Lec11;

public class Partation_Of_An_Array {
    public static void main(String[] args) {
        int arr[]={5,6,7,8,3,2,1,4};
        Partation(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Partation(int arr[],int si,int ei){
        int ele=arr[ei];
        int index=si;
        for(int i=0;i<ei;i++){
            if(arr[i]<ele){
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
                index++;
            }
        }
        int temp=arr[index];
        arr[index]=arr[ei];
        arr[ei]=temp;
    }
}
