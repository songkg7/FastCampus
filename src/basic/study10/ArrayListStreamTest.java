package basic.study10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListStreamTest {

    public static void main(String[] args) {
        List<String> sList = new ArrayList<>();
        sList.add("Tomas");
        sList.add("Edward");
        sList.add("Jack");

        sList.forEach(System.out::println);

        System.out.println("-------------------");

        sList.stream().sorted().forEach(s -> System.out.print(s + "\t"));

        System.out.println();
        System.out.println("-------------------");

        sList.stream().map(String::length).forEach(System.out::println);

        sList.stream().filter(s -> s.length() >= 5).forEach(System.out::println);

        List<Integer> collect = sList.stream().map(String::length).collect(Collectors.toList());
        int sum = collect.stream().mapToInt(s -> s).sum();
        System.out.println("sum = " + sum);

    }

}
