import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    private final List<Integer> numeros = Arrays.asList(
            1,1,1,1,1,1,1,1,1,1
    );

    public static void main(String[] args) {
        Desafio18 desafio = new Desafio18();

        boolean result = desafio.numeros
                .stream()
                .distinct().count() == 1;

        if (result) {
            System.out.println("A lista está com todos os números iguais");
        } else {
            System.out.println("A lista não está com todos os números iguais");
        }
    }
}
