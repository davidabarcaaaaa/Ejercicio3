package Ejercicio3.apartado16;

import java.util.stream.Stream;

public class Apartado16 {

    public static void main(String[] args) {
        double decimotercero = fibonacci().skip(12).findFirst().get();
        double decimosegundo = fibonacci().skip(11).findFirst().get();

        double cociente = decimotercero / decimosegundo;

        double phi = (1 + Math.sqrt(5)) / 2;

        System.out.println("Cociente: " + cociente);
        System.out.println("Proporción áurea (phi): " + phi);
        System.out.println("La diferencia entre el cociente y phi es: " + Math.abs(cociente - phi));
    }

    public static Stream<Long> fibonacci() {
        return Stream.iterate(new long[]{0, 1}, f -> new long[]{f[1], f[0] + f[1]})
                .map(f -> f[0]);
    }
}
