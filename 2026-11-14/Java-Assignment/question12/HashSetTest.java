package Batch10.AssignmentNov1st.question12;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> city = new HashSet<>();
        city.add("Bangalore");
        city.add("Pune");
        city.add("kochi");
        city.add("Chennai");
        city.add("Bangalore");

        System.out.println(city);

        for(String cityName : city) {
            System.out.println(cityName);
        }
    }
}
