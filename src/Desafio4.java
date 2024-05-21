import java.util.Arrays;
import java.util.List;

public class Desafio4 {
    private final List<Integer> numeros = Arrays.asList(
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3
    );

    public static void main(String[] args) {
        Desafio4 desafio = new Desafio4();

        List<Integer> numerosPares = desafio.numeros.stream()
                .filter(p -> p % 2 == 0)
                .toList();

        System.out.println(numerosPares);
    }
}
