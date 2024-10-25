package Lec17;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap_Demo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(1);
        pq.add(2);
        pq.add(5);
        pq.remove();
        pq.size();
        System.out.println(pq);
    }
}
