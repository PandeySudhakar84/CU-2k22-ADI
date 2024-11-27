package LEC30;
import java.util.ArrayList;
import java.util.List;
public class AdjencyList {
    public static void main(String[] args) {
       int v=4;
       List<List<Integer>> list=new ArrayList<>(v);
       for(int i=0;i<v;i++){
           list.add(new ArrayList<>());
       }
       addEdge(list,0,1);
       addEdge(list,0,3);
       addEdge(list,1,2);
       addEdge(list,2,3);
       Display(list);
    }
    public static void addEdge(List<List<Integer>> list,int i,int j){
    list.get(i).add(j);
    list.get(j).add(i);
    }
    public static void Display(List<List<Integer>> list){
        for(int i=0;i<list.size();i++){
            System.out.print(i+":");
            for(int j:list.get(i)){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
