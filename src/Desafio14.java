import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Desafio14 {
    private final List<Integer> numeros = Arrays.asList(
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11, 12
    );

    public static void main(String[] args) {
        Desafio14 desafio = new Desafio14();

        Optional<Integer> result = desafio.numeros
                .stream()
                .filter(n -> n > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(divisor -> n % divisor == 0))
                .max(Integer::compareTo);

        if (result.isPresent()) {
            System.out.println("O maior número primo é: " + result.get());
        } else {
            System.out.println("Maior número primo não encontrado");
        }
    }
}
