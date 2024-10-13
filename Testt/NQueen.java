package Testt;

import java.util.ArrayList;
import java.util.List;

public class NQueen {
    public static void main(String[] args) {
        List<List<String>> list=new ArrayList<>();
        int n=4;
        boolean bord[][]=new boolean[n][n];
        PrintQueen(n,bord,0,list);
        System.out.println(list);
    }
    public static void PrintQueen(int tq,boolean bord[][],int row,List<List<String>> list){
        if(tq==0){
            List<String> sc=new ArrayList<>();
            Display(bord,sc);
            list.add(sc);
            return;
        }
        for(int col=0;col<bord[0].length;col++){
            if(IsSefe(bord,row,col)==true){
                bord[row][col]=true;
                PrintQueen(tq-1,bord,row+1,list);
                bord[row][col]=false;
            }
        }
    }
    public static boolean IsSefe(boolean bord[][],int row,int col){
        int r=row;
        while(r>=0){
            if(bord[r][col]==true){
                return false;
            }
            r--;
        }
        r=row;
        int c=col;
        while(r>=0 && c>=0){
            if(bord[r][c]==true){
                return false;
            }
            r--;
            c--;
        }
        r=row;
        c=col;
        while (r>=0 && c<bord[0].length){
            if(bord[r][c]==true){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
 public static void Display(boolean bord[][],List<String>sc){
        for(int i=0;i<bord.length;i++){
            String ans="";
            for(int j=0;j<bord[0].length;j++){
                if(bord[i][j]==true){
                    ans=ans+"Q";
                }
                else {
                    ans=ans+".";
                }
                //System.out.print(bord[i][j]+" ");
            }
            sc.add(ans);
            //System.out.println(ans);
        }
 }
}
