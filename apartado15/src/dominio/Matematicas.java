package dominio;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Matematicas {

    public static int sumaSecuencia(int n) {
        return IntStream.rangeClosed(0, n).sum();
    }

    public static int factorial(int number) {
        return IntStream.rangeClosed(1, number).reduce(1, (a, b) -> a * b);
    }

    public static double potencia(int base, int exponent) {
        return IntStream.range(0, exponent).mapToDouble(i -> base).reduce(1, (a, b) -> a * b);
    }

    public static int sumaLista(List<Integer> list) {
        return list.stream().reduce(0, Integer::sum);
    }

    public static double mediaAritmetica(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public static double desviacionTipica(List<Integer> list) {
        double mean = mediaAritmetica(list);
        double variance = list.stream().mapToDouble(i -> Math.pow(i - mean, 2)).sum() / list.size();
        return Math.sqrt(variance);
    }

    public static int sumaPrimerosNPares(int n) {
        return IntStream.iterate(0, i -> i + 2).limit(n / 2).sum();
    }

    public static int sumaElementosPares(List<Integer> list) {
        return list.stream().filter(i -> i % 2 == 0).reduce(0, Integer::sum);
    }

    public static List<Integer> obtenerListaSinRepetidos(int n) {
        return IntStream.rangeClosed(2, n).distinct().boxed().collect(Collectors.toList());
    }

    public static List<Integer> primerosNPares(int n) {
        return IntStream.iterate(0, i -> i + 2).limit(n).boxed().collect(Collectors.toList());
    }

    public static int productoEscalar(List<Integer> list1, List<Integer> list2) {
        return IntStream.range(0, list1.size()).map(i -> list1.get(i) * list2.get(i)).sum();
    }
}

