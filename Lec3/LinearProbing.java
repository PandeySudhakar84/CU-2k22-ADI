package Lec3;
public class LinearProbing {
        int[] table;
        int size;
        LinearProbing(int size) {
            this.size = size;
            table = new int[size];
        }
        void insert(int key) {
            int i=1;
            int hash = key % size;
//            while (table[hash] != 0) { // Collision
//                hash = (hash + i) % size; // Linear probing
//                i++;
//            }
            while (table[hash] != 0) { // Collision
                hash = (hash + i*i) % size; // Quadratic probing
                i++;
            }
            table[hash] = key;
        }
        void display() {
            for (int i = 0; i < size; i++) {
                System.out.println("Index " + i + ": " + table[i]);
            }
        }
    }
     class Main1 {
        public static void main(String[] args) {
            LinearProbing ht = new LinearProbing(7);
            ht.insert(50);
            ht.insert(700);
            ht.insert(76);
            ht.insert(85);
            ht.insert(92);
            ht.display();
        }
    }