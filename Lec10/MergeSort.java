    package Lec10;

    public class MergeSort {
        public static void main(String[] args) {
            int arr[]={5,4,3,2,1};
            int ans[]=Sort(arr,0,arr.length-1);
            for(int i=0;i<ans.length;i++){
                System.out.print(ans[i]+" ");
            }
        }
        public static int[] Sort(int arr[],int si,int ei){
            if(si==ei){
                int newArray[]=new int[1];
                newArray[0]=arr[si];
                return newArray;
            }
            int mid=(si+ei)/2;
             int fa[]=Sort(arr,si,mid);
             int sa[]= Sort(arr,mid+1,ei);
                 return Merge(fa,sa);
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
