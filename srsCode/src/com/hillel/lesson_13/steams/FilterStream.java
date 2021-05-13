package com.hillel.lesson_13.steams;

import com.hillel.lesson_13.predicat.PredicatExample;

import javax.naming.ldap.PagedResultsControl;
import java.util.List;
import java.util.function.Predicate;

public class FilterStream {
    public static void main(String[] args) {
        List<Integer> ints = List.of(1,2,3,4,5,6,7,8,9,10);

        ints.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.print(i + " "));
        System.out.println();


        Predicate<Integer> odd = (i) -> i % 2 == 0;
        Predicate<Integer> odd3 = (i) -> i % 3 == 0;

        ints.stream().filter(odd.or(odd3)).forEach(i -> System.out.print(i + " "));
    }
}
