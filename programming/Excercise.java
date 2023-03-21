package programming;

import java.util.List;

public class Excercise {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        printFunctionalOddNumbers(numbers);
        printCubesEvenNumbers(numbers);

        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        printSpringCourses(courses);
        printWithAtLeastFourLetters(courses);
        printNumberOfCharacters(courses);



    }

    private static void printNumberOfCharacters(List<String> courses) {
        courses.stream().map(course -> course.length()).forEach(System.out::println);
    }

    private static void printCubesEvenNumbers(List<Integer> numbers) {
        numbers.stream().filter(number -> number%2==0).map(number -> number * number * number).forEach(System.out::println);
    }

    private static void printWithAtLeastFourLetters(List<String> courses) {
        courses.stream().filter(str -> str.length() >= 4).forEach(System.out::println);
    }

    private static void printSpringCourses(List<String> courses) {
        courses.stream().filter(str -> str.contains("Spring")).forEach(System.out::println);
    }

    private static void printFunctionalOddNumbers(List<Integer> numbers) {
        numbers.stream().filter(number -> number % 2 == 1).forEach(System.out::println);
    }

}
