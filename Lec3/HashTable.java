package Lec3;
import java.util.LinkedList;
public class HashTable {
        LinkedList<Integer>[] table;
        int size;
        HashTable(int size) {
            this.size = size;
            table = new LinkedList[size];
            for (int i = 0; i < size; i++) {
                table[i] = new LinkedList<>();
            }
        }
        void insert(int key) {
            int hash = key % size;
            table[hash].add(key); // Insert in the linked list
        }
        void display() {
            for (int i = 0; i < size; i++) {
                System.out.println("Index " + i + ": " + table[i]);
            }
        }
    }
    class Main {
        public static void main(String[] args) {
            HashTable ht = new HashTable(7);
            ht.insert(50);
            ht.insert(700);
            ht.insert(76);
            ht.insert(85);
            ht.insert(92);
            ht.display();
        }
    }

