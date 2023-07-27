package com.yassineaitmalek.sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bubble implements Sort {

  @Override
  public <T> List<T> sort(List<T> list, Comparator<? super T> comparator) {
    int i;
    int j;
    int n = list.size();
    boolean swapped;
    for (i = 0; i < n - 1; i++) {
      swapped = false;
      for (j = 0; j < n - i - 1; j++) {
        if (comparator.compare(list.get(j), list.get(j + 1)) > 0) {

          // Swap arr[j] and arr[j+1]

          Collections.swap(list, j, j + 1);
          swapped = true;
        }
      }

      // If no two elements were
      // swapped by inner loop, then break
      if (!swapped) {
        break;
      }

    }
    return list;

  }

}
