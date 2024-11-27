package LEC31;

import java.util.*;

public class Graph {
    HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
    Graph(int v){
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public void AddVertex(int v){
        map.put(v,new HashMap<>());
    }
    public boolean IsContainsEdge(int v1,int v2){
        return map.get(v1).containsKey(v2);
    }
    public boolean IsVertex(int v){
        return map.containsKey(v);
    }
    public void RemoveEdge(int v1,int v2){
        map.get(v1).remove(v2);
        map.get(v2).remove(v1);
    }
    public void removevertex(int v1) {
        for (int nbrs : map.get(v1).keySet()) {// 1,3,5
            map.get(nbrs).remove(v1);
        }
        map.remove(v1);
    }
    public int NoOfEdge(){
        int sum=0;
        for(int key: map.keySet()){
           sum=sum+map.get(key).size();
        }
        return sum/2;
    }
    public void Diplay(){
        for(int key: map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
    }
    public boolean BFS(int src,int Des){
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> Visited=new HashSet<>();
        q.add(src);
        while(!q.isEmpty()){
            // remove
            int rv=q.poll();
            // ignore if already visited
            if(Visited.contains(rv)){
                continue;
            }
            // add visited
            Visited.add(rv);
            // self work
                if(rv==Des){
                    return true;
                }
            // add unvisited
            for(int nbrs:map.get(rv).keySet()){
               if(!Visited.contains((nbrs))){
                   q.add(nbrs);
               }
            }
        }
        return false;
    }
    public boolean DFS(int src,int Des){
        Stack<Integer> q=new Stack<>();
        HashSet<Integer> Visited=new HashSet<>();
        q.push(src);
        while(!q.isEmpty()){
            // remove
            int rv=q.pop();
            // ignore if already visited
            if(Visited.contains(rv)){
                continue;
            }
            // add visited
            Visited.add(rv);
            // self work
            if(rv==Des){
                return true;
            }
            // add unvisited
            for(int nbrs:map.get(rv).keySet()){
                if(!Visited.contains((nbrs))){
                    q.push(nbrs);
                }
            }
        }
        return false;
    }
}
