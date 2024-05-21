import java.util.Arrays;
import java.util.List;

public class Desafio11 {
    private final List<Integer> numeros = Arrays.asList(
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3
    );

    public static void main(String[] args) {
        Desafio11 desafio = new Desafio11();

        int result = desafio.numeros
                .stream()
                .mapToInt(n -> n * n)
                .sum();

        System.out.println(result);
    }
}
