import java.util.Arrays;
import java.util.List;

public class Desafio15 {
    private final List<Integer> numeros = Arrays.asList(
            1, 2, 3, 4, -12, 5, 6, 7, 8, -15, 9, 10, 5, 4, 3, 11, 12
    );

    public static void main(String[] args) {
        Desafio15 desafio = new Desafio15();

        desafio.numeros
                .stream()
                .filter(n -> n < 0)
                .forEach(System.out::println);
    }
}
