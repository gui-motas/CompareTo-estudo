package Services;

import java.util.List;

import entities.Product;

public class CalculatorService {

    public static <T extends Comparable<T>> T max(List<T> list) {

        if (list.isEmpty()) {

            throw new IllegalStateException("LIST CAN'T BE EMPTY");

        }

        T max = list.get(0);

        for (T item : list) {

            if (item.compareTo(max) > 0) {
                max = item;
            }

        }

        return max;

    }

}