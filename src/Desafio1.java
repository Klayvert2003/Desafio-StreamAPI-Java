import java.util.Arrays;
import java.util.List;

public class Desafio1 {
    private final List<Integer> numeros = Arrays.asList(
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3
    );

    public static void main(String[] args) {
        Desafio1 desafio = new Desafio1();
        desafio.numeros.sort(Integer::compareTo);

        System.out.println(desafio.numeros);
    }
}
