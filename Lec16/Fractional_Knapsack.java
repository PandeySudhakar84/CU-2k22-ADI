package Lec16;

import Lec50.KnapShak_Probleam;

import java.util.Arrays;

public class Fractional_Knapsack {
    public static void main(String[] args) {
        int Value[]={25,24,15};
        int Weight[]={18,15,10};
        int Capacity=20;
        KnapSack(Value,Weight,Capacity);
    }
    public static void KnapSack(int Value[],int Weight[],int Capacity){
        int n=Value.length;
        Item items[]=new Item[n];
        for(int i=0;i<n;i++){
            items[i]=new Item(Value[i],Weight[i]);
        }
        Arrays.sort(items,(a,b)->{
            return Double.compare(b.PerValueWeight,a.PerValueWeight);
        });
        double MaxValue=0.0;
        for(Item Obj:items){
            if(Capacity-Obj.Weight>=0){
                Capacity=Capacity-Obj.Weight;
                MaxValue=MaxValue+Obj.Value;
            }
            else {
                MaxValue=MaxValue+Capacity*Obj.PerValueWeight;
                break;
            }
        }
       MaxValue=Math.round(MaxValue*1000000.0)/1000000.0;
        System.out.println(MaxValue);
    }
    static class Item{
        int Value;
        int Weight;
        double PerValueWeight;
        Item(int Value,int Weight){
            this.Value=Value;
            this.Weight=Weight;
            PerValueWeight=(double) Value/Weight;
        }
    }
}
