import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Desafio5 {
    private final List<Integer> numeros = Arrays.asList(
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3
    );

    public static void main(String[] args) {
        Desafio5 desafio = new Desafio5();

        OptionalDouble result = desafio.numeros.stream()
                .filter(n -> n > 5)
                .mapToInt(Integer::intValue).average();

        System.out.println(result);
    }
}
