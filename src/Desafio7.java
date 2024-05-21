import java.util.Arrays;
import java.util.List;

public class Desafio7 {
    private final List<Integer> numeros = Arrays.asList(
            1, 2, 3, 15, 12, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11
    );

    public static void main(String[] args) {
        Desafio7 desafio = new Desafio7();
        desafio.numeros.sort(Integer::compareTo);
        System.out.println(desafio.numeros.get(desafio.numeros.size() -2));
    }
}
