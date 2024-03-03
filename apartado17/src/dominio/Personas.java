package dominio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Personas {
    private List<Persona> listaPersonas = new ArrayList<>();

    public void anadirPersona(Persona persona) {
        listaPersonas.add(persona);
    }

    public Persona elMasJoven() {
        return listaPersonas.stream()
                .min(Comparator.comparing(Persona::calcularEdad))
                .orElse(null); // You can handle a null return in your main method
    }

    public long calcularSumaEdades() {
        return listaPersonas.stream()
                .mapToLong(Persona::calcularEdad)
                .sum();
    }

    public long calcularEdadMinima() {
        return listaPersonas.stream()
                .mapToLong(Persona::calcularEdad)
                .min()
                .orElse(0);
    }

    public double calcularMediaEdad() {
        return listaPersonas.stream()
                .mapToLong(Persona::calcularEdad)
                .average()
                .orElse(0.0); 
    }
}
