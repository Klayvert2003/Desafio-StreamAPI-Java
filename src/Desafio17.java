import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Desafio17 {
    private final List<Integer> numeros = Arrays.asList(
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11, 12
    );

    public static void main(String[] args) {
        Desafio17 desafio = new Desafio17();

        List<Integer> result = desafio.numeros
                .stream()
                .filter(n -> n > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(divisor -> n % divisor == 0))
                .toList();

        System.out.println("A lista com os números primos é: " + result);
    }
}
