import java.util.Arrays;
import java.util.List;

public class Desafio16 {
    private final List<Integer> numeros = Arrays.asList(
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11, 12
    );

    public static void main(String[] args) {
        Desafio16 desafio = new Desafio16();

        List<Integer> numerosPares = desafio.numeros
                .stream()
                .filter(n -> n % 2 == 0)
                .toList();

        List<Integer> numerosImpares = desafio.numeros
                .stream()
                .filter(n -> n % 2 != 0)
                .toList();

        System.out.println("Os números pares são: " + numerosPares + ", e os números ímpares são: " + numerosImpares);
    }
}
