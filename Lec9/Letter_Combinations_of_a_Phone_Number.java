package Lec9;

import java.util.ArrayList;

public class Letter_Combinations_of_a_Phone_Number {
    static String map[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        String str="2";
        ArrayList<String> ll=new ArrayList<>();
        if(str.length()==0){
            System.out.println(ll);
        }
        Combination(str,"",ll);
        System.out.println(ll);
    }
    public static void Combination(String ques,String ans,ArrayList<String>ll){
        if(ques.length()==0){
            ll.add(ans);
            System.out.println(ans);
            return;
        }
        char ch=ques.charAt(0);
        int num=ch-'0';
        String press=map[num];// abc
        for(int i=0;i<press.length();i++){
            Combination(ques.substring(1), ans+press.charAt(i),ll);
        }
    }
} 
