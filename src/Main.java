import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        ArrayList<Integer> integer = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            integer.add(random.nextInt(20));
        }
        System.out.println(integer);
        System.out.println();

        Stream stream = integer.stream();

        System.out.println("1. __________________________________________\n");
        stream.distinct().forEach(System.out::println);
        System.out.println();

        System.out.println("2. __________________________________________\n");
        integer.stream().filter(x -> x >= 7 && x <= 17).filter(x -> x % 2 == 0).forEach(System.out::println);
        System.out.println();

        System.out.println("3. __________________________________________\n");
        integer.stream().filter(x -> x >= 7 && x <= 17).filter(x -> x % 2 == 0).map(x -> x * 2)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("4. __________________________________________\n");
        integer.stream().filter(x -> x >= 7 && x <= 17).filter(x -> x % 2 == 0).sorted().limit(4)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("5. __________________________________________\n");
        System.out.println(integer.stream().count());
        System.out.println();

        System.out.println("6. __________________________________________\n");
        System.out.println(integer.stream().mapToDouble(x -> x).average());
        System.out.println();


    }
}