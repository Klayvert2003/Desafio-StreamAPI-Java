import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    private final List<Integer> numeros = Arrays.asList(
            1, 2, 3, 15, 12, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11
    );

    public static void main(String[] args) {
        Desafio6 desafio = new Desafio6();

        desafio.numeros.stream()
                .filter(p -> p > 10)
                .forEach(System.out::println);
    }
}
