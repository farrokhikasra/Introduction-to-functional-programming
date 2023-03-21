package programming;


import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PlayingWithOptional {
    public static void main(String[] args){
        List<String> fruits = List.of("Apple", "Banana", "Mango");

        Predicate<? super String> predicate = fruit -> fruit.startsWith("B");
        Optional<String> optional = fruits.stream().filter(predicate).findFirst();
        System.out.println(optional);
        System.out.println(optional.isEmpty());
        System.out.println(optional.isPresent());
        System.out.println(optional.get());

        Predicate<? super String> predicate1 = fruit -> fruit.startsWith("C");
        Optional<String> optional1 = fruits.stream().filter(predicate1).findFirst();
        System.out.println(optional1);
        System.out.println(optional1.isEmpty());
        System.out.println(optional1.isPresent());
        // Returns an exception because there is no fruit that starts with "C"
        System.out.println(optional1.get());
    }

}
