import java.util.Arrays;
import java.util.List;

public class Desafio19 {
    private final List<Integer> numeros = Arrays.asList(
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11, 12
    );

    public static void main(String[] args) {
        Desafio19 desafio = new Desafio19();

        int result = desafio.numeros
                .stream()
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .reduce(0, Integer::sum);

        System.out.println(result);
    }
}
