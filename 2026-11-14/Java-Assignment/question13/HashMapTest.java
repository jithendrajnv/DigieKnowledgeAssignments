package Batch10.AssignmentNov1st.question13;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1001,"Jithendra");
        map.put(1002,"Ramesh");
        map.put(1003,"Virat");
        map.put(1004,"Sachin");
        map.put(1005,"Rahul");
        System.out.println(map);

        System.out.println(map.size());
        System.out.println(map.get(1003));
        System.out.println(map.containsKey(1004));
        System.out.println(map.containsValue("Jithendra"));
        map.remove(1002);
        System.out.println(map);

        //Iterating only through keys
        for (Integer id : map.keySet()) {
            System.out.println(id);
        }
        //Iterating only through values
        for (String name : map.values()) {
            System.out.println(name);
        }

        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
