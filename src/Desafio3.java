import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    private final List<Integer> numeros = Arrays.asList(
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, -2, 0
    );

    public static void main(String[] args) {
        Desafio3 desafio = new Desafio3();

        List<Integer> numerosPositivos = desafio.numeros.stream()
                .filter(p -> p >= 0)
                .toList();

        System.out.println(numerosPositivos);
    }
}
