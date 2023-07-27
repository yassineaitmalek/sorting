package com.yassineaitmalek.sorting;

import java.util.Comparator;
import java.util.List;

public class Insertion implements Sort {

  @Override
  public <T> List<T> sort(List<T> list, Comparator<? super T> comparator) {
    int i;
    T key;
    int j;
    int n = list.size();
    for (i = 1; i < n; i++) {
      key = list.get(i);
      j = i - 1;

      // Move elements of arr[0..i-1],
      // that are greater than key,
      // to one position ahead of their
      // current position
      while (j >= 0 && comparator.compare(list.get(j), key) < 0) {
        list.set(j + 1, list.get(j));
        j = j - 1;
      }
      list.set(j + 1, key);

    }
    return list;

  }

}
