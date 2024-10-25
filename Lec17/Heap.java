package Lec17;
import java.util.ArrayList;
public class Heap {
    ArrayList<Integer> list=new ArrayList<>();
    public void add(int item){
        list.add(item);
        UpHeaify(list.size()-1);
    }
    public void UpHeaify(int ci){
        int pi=(ci-1)/2;
        if(list.get(pi)>list.get(ci)){
            Swap(pi,ci);
            UpHeaify(pi);
        }
    }
    public void Swap(int pi,int ci){
        int pith=list.get(pi);
        int cith=list.get(ci);
        list.set(pi,cith);
        list.set(ci,pith);
    }
    public int  Remove(){
        Swap(0,list.size()-1);
        int rv=list.remove(list.size()-1);
        DownHeaipy(0);
        return rv;
    }
    public void DownHeaipy(int pi){
        int lci=2*pi+1;
        int rci=2*pi+2;
        int min=pi;
        if(lci<list.size()-1 && list.get(lci)<list.get(min)){
            min=lci;
        }
        if(rci<list.size()-1 && list.get(rci)<list.get(min)){
            min=rci;
        }
        if(pi!=min){
            Swap(pi,min);
            DownHeaipy(min);
        }
    }
    public int Get(){
        return list.get(0);
    }
    public void Display(){
        System.out.println(list);
    }
}
