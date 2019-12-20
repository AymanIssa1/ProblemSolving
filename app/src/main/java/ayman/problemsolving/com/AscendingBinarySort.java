package ayman.problemsolving.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AscendingBinarySort {

    public static void main(String... args) {
        List<Integer> elements = new ArrayList<>();
//        elements.add(5);
//        elements.add(5);
//        elements.add(3);
//        elements.add(7);
//        elements.add(10);
//        elements.add(14);
        elements.add(5);
        elements.add(7);
        elements.add(11);
        elements.add(20);
        elements.add(21);
        elements.add(22);
        elements.add(23);
        elements.add(30);

        List<Integer> elementsNums = rearrange(elements);


        for (int e : elementsNums) {
            System.out.println(e);
        }
    }

    public static List<Integer> rearrange(List<Integer> elements) {
        List<Integer> elementsNums = new ArrayList<>();

        for (int element : elements) {
            if (!elementsNums.contains(element)) {
                elementsNums.add(element);
            }
        }

        for (int i = elementsNums.size() -1; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                if (numberOrder(elementsNums.get(i - 1 )) > numberOrder(elementsNums.get(i))) {
                    Collections.swap(elementsNums, i-1, i);
                }
            }
        }

        return elementsNums;
    }

    public static int numberOrder(int element) {
        String elementString = Integer.toBinaryString(element);
        return (onesCounter(elementString) * 3) + zerosCounter(elementString);
    }

    public static int onesCounter(String element) {
        int counter = 0;
        for (char c : element.toCharArray()) {
            if (c == '1')
                counter++;
        }
        return counter;
    }

    public static int zerosCounter(String element) {
        int counter = 0;
        for (char c : element.toCharArray()) {
            if (c == '0')
                counter++;
        }
        return counter;
    }

}
