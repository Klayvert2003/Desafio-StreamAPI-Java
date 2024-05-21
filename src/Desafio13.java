import java.util.Arrays;
import java.util.List;

public class Desafio13 {
    private final List<Integer> numeros = Arrays.asList(
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11, 12
    );

    public static void main(String[] args) {
        Desafio13 desafio = new Desafio13();

        desafio.numeros
                .stream()
                .filter(n -> n >= 5 && n <= 10)
                .forEach(System.out::println);
    }
}
