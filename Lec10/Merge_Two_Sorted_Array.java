package Lec10;

public class Merge_Two_Sorted_Array {
    public static void main(String[] args) {
        int arr1[]={1,3,5,7,9,11};
        int arr2[]={2,4,6,8,10,12,14,16};
        int ans[]=Merge(arr1,arr2);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
    public static int[] Merge(int arr1[],int arr2[]){
        int m=arr1.length;
        int n=arr2.length;
        int arr[]=new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                arr[k]=arr1[i];
                i++;
                k++;
            }
            else {
                arr[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<m){
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<n){
            arr[k]=arr2[j];
            j++;
            k++;
        }
        return arr;
    }
}
