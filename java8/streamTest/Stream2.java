package java8.streamTest;

import java.util.*;
import java.util.stream.Collectors;


public class Stream2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "rushi");
        map.put(2, "java");
        map.put(3, "pune");
        map.put(4, "parbhani");
        map.put(5, "india");
        map.put(6, "angad");
        map.put(7, "maharashtra");
        map.put(8, "warje");
        map.put(9, "banaras");
        map.put(10, "tdit");

        System.out.println(map);
        //1st way:-
        map.values().stream().sorted().forEach(System.out::println);

        //2nd way:-
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

    }
}

