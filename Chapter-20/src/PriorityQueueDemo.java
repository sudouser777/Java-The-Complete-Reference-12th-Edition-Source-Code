import java.util.List;
import java.util.PriorityQueue;


public class PriorityQueueDemo {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
        pq.addAll(List.of(3, 4, 5));

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
