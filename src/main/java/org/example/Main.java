package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

   /*     List<Integer> numbers = new LinkedList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(8);


        Stream<Integer> stream = numbers.stream();
        stream.forEach(num -> System.out.println(num));
        */
       /* String[] words = {"Salom", "Jigar", "Bormisan", "Jallimisan", "Mazgi"};
        Stream<String> stream = Arrays.stream(words);
//        stream.forEach(s -> System.out.println(s));
        String a [] = {"a","aa","aaa"};
        String b [] = {"b","bb","bbb"};
        Stream<String[]> stream1 = Stream.of(a,b);
        stream1.forEach(strings -> System.out.println(Arrays.toString(strings)));*/

        /*Integer[] numbers = {3, 7, 9, 1, 5, 9, 3, 6, 9, 2};
        Stream<Integer> num = Arrays.stream(numbers);
        List<Integer> collect = num
                .filter(n -> n > 5)
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .toList();


        collect.forEach(System.out::println);
        */
       /* List<Integer> evens = Arrays.asList(2, 4, 6);
        List<Integer> odds = Arrays.asList(3, 5, 7);
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11);
        Stream<List<Integer>> evens1 = Stream.of(evens, odds, primes);
        List<Integer> integers = evens1
                .flatMap(list -> list.stream())
                .filter(n -> n > 5)
                .toList();
        System.out.println(integers);*/
      /*  List<String> nameList = new LinkedList<>();
        nameList.add("  Alish");
        nameList.add("Valish");
        nameList.add(" Alish ");
        nameList.add("Toshmat");
        nameList.add("Valish");
        nameList.add("Alish ");

        List<String> collect = nameList
                .stream()
                .map(s -> s.trim())
                .distinct().collect(Collectors.toList());
        System.out.println(collect);*/
/*

        Integer[] numbers1 = {2, 8, 3, 6, 1, 7, 9, 0};
        List<Integer> integers = Arrays.stream(numbers1).sorted().toList();
        System.out.println(integers);

        Integer numbers[] = {2, 8, 3, 6, 1, 7, 9, 0};

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2) * -1;
            }
        };

        List<Integer> list = Arrays.stream(numbers)
                .sorted(comparator)
                .collect(Collectors.toList());

        System.out.println(list);
*/

 /*       Integer numbers[] = {2, 8, 3, 6, 1, 7, 9, 0};

        List<Integer> list = Arrays.stream(numbers)
                .sorted((o1, o2) -> o1.compareTo(o2) * -1)
                .collect(Collectors.toList());

        System.out.println(list);*/
      /*  List<String> nameList = new LinkedList<>();
        nameList.add("Alish");
        nameList.add("Valish");
        nameList.add("Toshmat");

        List<String> distinctList = nameList.stream()
                .filter(a -> a.length() > 5)
                .peek(s -> System.out.println(s))
                .collect(Collectors.toList());*/
     /*   List<String> nameList = new LinkedList<>();
        nameList.add("Alish");
        nameList.add("Valish");
        nameList.add("Toshmat");
        nameList.add("Eshmat");
        nameList.add("Qo'y");
*/

/*        List<String> collect = nameList.stream()
                .limit(3).collect(Collectors.toList());
        System.out.println(collect);*/

        /*List<String> collect = nameList.stream()
                .skip(3).collect(Collectors.toList());
        System.out.println(collect);*/
/*
        long count = nameList.stream()
                .filter(s -> s.length() > 5)
                .count();
        System.out.println(count);*/
      /*  List<String> stringList = new ArrayList<String>();
        stringList.add("Dasturlash");
        stringList.add("Java");
        stringList.add("Mazgi");
        stringList.add("Latta");

        boolean java = stringList.stream()
                .anyMatch(s -> s.startsWith("Java"));
        System.out.println(java);*/
 /*       List<String> stringList = new ArrayList<>();
        stringList.add("Dasturlash");
        stringList.add("Java");
        stringList.add("Mazgi");
        stringList.add("Latta");

        Stream<String> stream = stringList.stream();*/

      /*  Set<String> set = stream
                .filter(s -> s.length() > 5)
                .collect(Collectors.toSet());
        System.out.println(set);*/

      /*  Stream<String> stream1 = stringList.stream();
        Optional<String> first = stream1.peek(s -> System.out.println(s))
                .filter(s -> s.length() > 5)
                .findFirst();*/

//        System.out.println(first.get());

    /*    String collect = stream.filter(s -> s.length() > 3).collect(Collectors.joining());

        System.out.println(collect);*/

        Integer[] numbers = {4, 8, 3, 1, 5, 9, 4, 2};

        Optional<Integer> result = Arrays.stream(numbers)
                .filter(n -> n > 0)
                .reduce((value, sum) -> sum += value);

        System.out.println(result.get());



//        Integer[] numbers = {4, 8, 3, 1, 5, 9, 4, 2};

        Optional<Integer> optional = Arrays.stream(numbers)
                .filter(n -> n > 0)
                .reduce((value, sum) -> sum += value);

        Integer n1 = optional.get();
        Integer n2 = optional.orElseThrow(() -> new RuntimeException("dasda"));
        Integer n3 = optional.orElse(null);
        Integer n4 = optional.orElseGet(() -> {
            /// getByName();
            return 11;
        });

        Integer n5 = optional.filter(n -> n > 0).orElse(null);
        Integer n6 = optional.map(n -> {
            // to DTO
            return 1;
        }).orElse(null);

        System.out.println();
    }

}