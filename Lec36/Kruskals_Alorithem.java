package Lec36;
import java.util.*;
public class Kruskals_Alorithem {
    HashMap<Integer, HashMap<Integer,Integer>> map = new HashMap<>();
    Kruskals_Alorithem(int v) {
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    class EdgePair {
        int e1;
        int e2;
        int cost;

        EdgePair(int e1, int e2, int cost) {
            this.e1 = e1;
            this.e2 = e2;
            this.cost = cost;
        }

        public String toString() {
            return e1 + "-" + e2 + "->" + cost;
        }
    }

    public List<EdgePair> GetAllEdge() {
        List<EdgePair> ll = new ArrayList<>();
        for (int e1 : map.keySet()) {
            for (int e2 : map.get(e1).keySet()) {
                int cost = map.get(e1).get(e2);
                ll.add(new EdgePair(e1, e2, cost));
            }
        }
        return ll;
    }

    public void Kruskals() {
        List<EdgePair> ll = GetAllEdge();
        Collections.sort(ll, new Comparator<EdgePair>() {
            @Override
            public int compare(EdgePair o1, EdgePair o2) {
                return o1.cost - o2.cost;
            }
        });
        int sum = 0;
        DisjointSetUnion dsu = new DisjointSetUnion();
        for (int v : map.keySet()) {
            dsu.CreateSet(v);
        }
        for (EdgePair e : ll) {
            int cr1 = dsu.find(e.e1);
            int cr2 = dsu.find(e.e2);
            if (cr1 != cr2) {
                dsu.union(e.e1, e.e2);
                sum += e.cost;
                System.out.println(e);
            }
        }
        System.out.println("Total cost of MST: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt(); // Number of edges
        Kruskals_Alorithem ks = new Kruskals_Alorithem(v);
        for (int i = 0; i < e; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int cost = sc.nextInt();
            ks.AddEdge(v1, v2, cost);
        }
        ks.Kruskals();
    }
}
