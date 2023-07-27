package com.yassineaitmalek.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class App {

    public static <T> void printList(List<T> list) {

        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("This is The Implementation of all Sorting Algorithms");

        List<Integer> list = Arrays.asList(1, 5, 7, 6, 3, 4, 2, 0);

        Sort sort = Sort.of("Merge");

        sort.sort(list, Comparator.naturalOrder());

        printList(list);

    }
}
