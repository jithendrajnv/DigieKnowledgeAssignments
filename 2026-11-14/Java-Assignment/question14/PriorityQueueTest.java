package Batch10.AssignmentNov1st.question14;

import java.util.PriorityQueue;

public class PriorityQueueTest {

    public static void main(String[] args) {

        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // Adding five integers
        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);

        System.out.println("PriorityQueue: " + numbers);

        // Removing and printing the head repeatedly
        System.out.println("Removing elements:");

        while (!numbers.isEmpty()) {
            System.out.println(numbers.poll());
        }
    }
}

