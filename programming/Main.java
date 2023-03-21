package programming;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 1));
//        printAllNumbersInListStructured(list);
//        printAllNumbersInListFunctional(list);
//        printEvenNumbersInListFunctional(list);
        printEvenNumbersWithLamda(list);
    }

    private static void printEvenNumbersWithLamda(List<Integer> list) {
        list.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
    }

    private static void printEvenNumbersInListFunctional(List<Integer> list) {
        list.stream().filter(Main::isEven).forEach(System.out::println);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream().forEach(System.out::println);
    }

}
