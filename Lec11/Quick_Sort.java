package Lec11;

public class Quick_Sort {
    public static void main(String[] args) {
        int arr[]={6,8,6,4,2,1,10,12,7,8};
        Sort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Sort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
       int index=Partation(arr,si,ei);
       Sort(arr,si,index-1);
        Sort(arr,index+1,ei);
    }
    public static int Partation(int arr[],int si,int ei){
        int ele=arr[ei];
        int index=si;
        for(int i=si;i<ei;i++){
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
        return index;
    }
}
