import java.util.Arrays;
import java.util.List;

public class Desafio10 {
    private final List<Integer> numeros = Arrays.asList(
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3
    );

    public static void main(String[] args) {
        Desafio10 desafio = new Desafio10();

        desafio.numeros
                .stream()
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .forEach(System.out::println);
    }
}
