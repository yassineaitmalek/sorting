package com.yassineaitmalek.sorting;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;

public class Merge implements Sort {

  @Override
  public <T> List<T> sort(List<T> list, Comparator<? super T> comparator) {

    subSsort(list, comparator, 0, list.size() - 1);
    return list;

  }

  public <T> void subSsort(List<T> list, Comparator<? super T> comparator, int start, int end) {
    if (start >= end) {
      return;
    }

    // Find the middle point
    int m = start + (end - start) / 2;

    // Sort first and second halves
    subSsort(list, comparator, start, m);
    subSsort(list, comparator, m + 1, end);

    // Merge the sorted halves
    merge(list, comparator, start, m, end);

  }

  public <T> void merge(List<T> list, Comparator<? super T> comparator, int l, int m, int r) {
    // Find sizes of two subarrays to be merged
    int n1 = m - l + 1;
    int n2 = r - m;

    // Create temp arrays
    List<T> L = new ArrayList<>();
    List<T> R = new ArrayList<>();

    // Copy data to temp arrays
    for (int i = 0; i < n1; ++i) {
      L.add(list.get(l + i));
    }

    for (int j = 0; j < n2; ++j) {
      R.add(list.get(m + 1 + j));
    }

    // Merge the temp arrays

    // Initial indices of first and second subarrays
    int i = 0;
    int j = 0;

    // Initial index of merged subarray array
    int k = l;
    while (i < n1 && j < n2) {
      if (comparator.compare(L.get(i), R.get(j)) <= 0) {
        list.set(k, L.get(i));
        i++;
      } else {
        list.set(k, R.get(j));
        j++;
      }
      k++;
    }

    // Copy remaining elements of L[] if any
    while (i < n1) {
      list.set(k, L.get(i));
      i++;
      k++;
    }

    // Copy remaining elements of R[] if any
    while (j < n2) {
      list.set(k, R.get(j));
      j++;
      k++;
    }
  }

}
