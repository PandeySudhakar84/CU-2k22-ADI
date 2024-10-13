package Test.LecG10;

import java.util.ArrayList;
import java.util.List;

public class Lexicographical_Numbers {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        int n=1000;
        for(int i=1;i<=9;i++){
            Lexicographical(n,i,list);
        }
        System.out.println(list);
    }
    public static void Lexicographical(int n,int cur,List<Integer>list){
        if(cur>n){
            return;
        }
        list.add(cur);
        for(int i=0;i<=9;i++){
            Lexicographical(n,cur*10+i,list);
        }
    }
}
