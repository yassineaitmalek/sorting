package com.yassineaitmalek.sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Selection implements Sort {

  @Override
  public <T> List<T> sort(List<T> list, Comparator<? super T> comparator) {
    int i;
    int j;
    int n = list.size();
    // One by one move boundary of unsorted subarray
    for (i = 0; i < n - 1; i++) {
      // Find the minimum element in unsorted array
      int min_idx = i;
      for (j = i + 1; j < n; j++)
        if (comparator.compare(list.get(j), list.get(min_idx)) < 0) {
          min_idx = j;
        }

      // Swap the found minimum element with the first
      // element
      Collections.swap(list, min_idx, i);
    }
    return list;

  }

}
