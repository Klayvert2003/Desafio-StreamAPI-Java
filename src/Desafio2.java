import java.util.Arrays;
import java.util.List;

public class Desafio2 {
    private final List<Integer> numeros = Arrays.asList(
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3
    );

    public static void main(String[] args) {
        Desafio2 desafio = new Desafio2();

        Integer soma = desafio.numeros.stream().mapToInt(num -> num).sum();

        System.out.println(soma);
    }
}
