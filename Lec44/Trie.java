package Lec44;

import java.util.HashMap;

public class Trie {
        class node{
            char data;
            boolean IsTerminated;
            HashMap<Character,node> child=new HashMap<>();
        }
        node root;
        public Trie() {
            node n=new node();
            n.data='*';
            root=n;
        }

        public void insert(String word) { // apple
            node cur=root;
            for(int i=0;i<word.length();i++){
                char ch=word.charAt(i); //a
                if(cur.child.containsKey(ch)){
                    cur=cur.child.get(ch);
                }
                else{
                    node nn=new node();
                    nn.data=ch;
                    cur.child.put(ch,nn);
                    cur=nn;
                }
            }
            cur.IsTerminated=true;
        }

        public boolean search(String word) {
            node cur=root;
            for(int i=0;i<word.length();i++){
                char ch=word.charAt(i);
                if(cur.child.containsKey(ch)){
                    cur=cur.child.get(ch);
                }
                else{
                    return false;
                }
            }
            return cur.IsTerminated;
        }

        public boolean startsWith(String word) {
            node cur=root;
            for(int i=0;i<word.length();i++){
                char ch=word.charAt(i);
                if(cur.child.containsKey(ch)){
                    cur=cur.child.get(ch);
                }
                else{
                    return false;
                }
            }
            return true;
        }
    }

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */