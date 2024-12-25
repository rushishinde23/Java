package java8.streamAPI.javatech;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("rushi",1);
        map.put("krishna",2);
        map.put("angad",3);
        map.put("anand",4);
        map.put("rushi",1);

        int i=234;

        map.entrySet().iterator().forEachRemaining(System.out::println);

    }
}
