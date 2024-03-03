package principal;

import java.time.LocalDate;

import dominio.Persona;

public class Principal {
    public static void main(String[] args) {
        Persona grupoPersonas = new Persona();
        
        grupoPersonas.anadirPersona(new Persona("Alice", LocalDate.of(1990, 1, 1)));
        grupoPersonas.anadirPersona(new Persona("Bob", LocalDate.of(2000, 1, 1)));
        grupoPersonas.anadirPersona(new Persona("Charlie", LocalDate.of(1985, 1, 1)));

        Persona masJoven = grupoPersonas.elMasJoven();
        if (masJoven != null) {
            System.out.println("El más joven es: " + masJoven.getNombre());
        } else {
            System.out.println("No hay personas en la lista.");
        }
        System.out.println("La suma de las edades es: " + grupoPersonas.calcularSumaEdades());
        System.out.println("La edad mínima es: " + grupoPersonas.calcularEdad());
        System.out.println("La media de edad es: " + grupoPersonas.calcularEdad());
    }
} 


