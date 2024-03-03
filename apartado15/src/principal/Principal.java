package principal;

import java.util.List;

import mates.Matematicas;

public class Principal {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Ejercicio 1: " + Matematicas.sumaSecuencia(n));
        System.out.println("Ejercicio 2: " + Matematicas.factorial(5));
        System.out.println("Ejercicio 3: " + Matematicas.potencia(2, 5));
        
        List<Integer> lista = List.of(1, 2, 3, 4, 5);
        System.out.println("Ejercicio 4: " + Matematicas.sumaLista(lista));
        System.out.println("Ejercicio 5: " + Matematicas.mediaAritmetica(lista));
        System.out.println("Ejercicio 6: " + Matematicas.desviacionTipica(lista));
        
        System.out.println("Ejercicio 7: " + Matematicas.sumaPrimerosNPares(n));
        System.out.println("Ejercicio 8: " + Matematicas.sumaElementosPares(lista));
        System.out.println("Ejercicio 9: " + Matematicas.obtenerListaSinRepetidos(n));
        System.out.println("Ejercicio 10: " + Matematicas.sumaPrimerosNPares(n));
        
        List<Integer> lista1 = List.of(1, 2, 3);
        List<Integer> lista2 = List.of(4, 5, 6);
        System.out.println("Ejercicio 11: " + Matematicas.productoEscalar(lista1, lista2));
    }
}