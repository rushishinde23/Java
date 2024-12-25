package java8.medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToUpperCase {
    public static void main(String[] args) {
        String s=new String("My name is rushikesh shinde.");
        List<String> list= Arrays.asList("Rushi","Rushika","Anita","Pandharinath");

        Arrays.stream(s.split("")).map(String::toUpperCase).forEach(System.out::print);
        System.out.println();
       List<String> upperList= list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperList);



    }
}
