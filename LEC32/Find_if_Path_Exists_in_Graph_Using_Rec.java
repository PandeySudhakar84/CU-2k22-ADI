package LEC32;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Find_if_Path_Exists_in_Graph_Using_Rec {
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
            if(src==des){
                return true;
            }
            visited.add(src);
            for(int nbrs:map.get(src)){
                if(!visited.contains(nbrs)){
                    boolean ans=hashPath(map,nbrs,des,visited);
                    if(ans){
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
