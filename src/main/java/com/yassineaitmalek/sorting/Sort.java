package com.yassineaitmalek.sorting;

import java.util.Comparator;
import java.util.List;

public interface Sort {

  public <T> List<T> sort(List<T> list, Comparator<? super T> comparator);

  public static Sort of(String type) {
    if (type.equals("Selection")) {
      return new Selection();
    } else if (type.equals("Bubble")) {
      return new Bubble();
    } else if (type.equals("Insertion")) {
      return new Insertion();
    } else if (type.equals("Merge")) {
      return new Merge();
    }
    return null;
  }

}
