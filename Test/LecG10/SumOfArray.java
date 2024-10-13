package Test.LecG10;

public class SumOfArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,100};
        System.out.println(Sum(arr,0));
    }
    public static int Sum(int arr[],int Index){
        if(arr.length==Index){
            return 0;
        }
       return arr[Index]+Sum(arr,Index+1);
    }
}
