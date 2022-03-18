import java.util.*;

// Class for changing the priority of priorityQueue
class ComperatorDemo implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2)
            return 1;
        if (o1 > o2)
            return -1;
        return 0;
    }
}

public class PriorityQueueCollectionFrameWork {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>(new ComperatorDemo());

        p.add(10);
        p.add(26);
        p.add(30);
        p.add(5);
        p.add(15);
        p.add(3);

        System.out.println("Head element : " + p.peek());
        p.forEach((x) -> System.out.print(x + " "));
        System.out.print("\nAfter Deletion : ");
        p.poll();
        p.forEach((x) -> System.out.print(x + " "));
    }
}