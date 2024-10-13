package Lec3;
import java.util.Hashtable;
public class DemoHashTable {
    public static void main(String[] args) {
        Hashtable<Integer,String> sc=new Hashtable<>();
        sc.put(101,"Sudhakar");
        sc.put(106,"Prince");
        sc.put(107,"Shivam");
        sc.put(110,"Tushar");
        sc.put(121,"Ram");
        System.out.println(sc);
    }
}
