import java.util.Arrays;
import java.util.List;

public class Desafio12 {
    private final List<Integer> numeros = Arrays.asList(
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3
    );

    public static void main(String[] args) {
        Desafio12 desafio = new Desafio12();

        int result = desafio.numeros
                .stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println(result);
    }
}
