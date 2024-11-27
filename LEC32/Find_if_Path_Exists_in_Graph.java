package LEC32;

import java.util.*;

public class Find_if_Path_Exists_in_Graph {
    class Solution {
        public boolean validPath(int n, int[][] edges, int source, int destination) {
            HashMap<Integer, List<Integer>> map=new HashMap<>();
            for(int i=0;i<n;i++){
                map.put(i,new ArrayList<>());
            }
            for(int edge[]:edges){
                int u=edge[0];
                int v=edge[1];
                map.get(u).add(v);
                map.get(v).add(u);
            }
            return hashPath(map,source,destination,new HashSet<>());
        }
        public static boolean hashPath(HashMap<Integer,List<Integer>> map,int src,int des,HashSet<Integer> visited){
            Stack<Integer> q=new Stack<>();
            //HashSet<Integer> visited=new HashSet<>();
            q.push(src);
            while(!q.isEmpty()){
                // remove
                int rv=q.pop();
                // ignore
                if(visited.contains(rv)){
                    continue;
                }
                // add visited
                visited.add(rv);
                // self work
                if(rv==des){
                    return true;
                }
                // add unvisited
                for(int nbrs:map.get(rv)){
                    if(!visited.contains(nbrs)){
                        q.push(nbrs);
                    }
                }
            }
            return false;
        }
    }
}
