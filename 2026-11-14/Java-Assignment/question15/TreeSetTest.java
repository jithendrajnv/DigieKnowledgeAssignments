package Batch10.AssignmentNov1st.question15;

import java.util.TreeSet;

public class TreeSetTest {


    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        // Adding five integers
        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);

        // Displaying elements
        System.out.println("TreeSet elements: " + numbers);

        // Iterating through TreeSet
        System.out.println("Elements one by one:");

        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}

