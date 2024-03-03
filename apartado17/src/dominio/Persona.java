package dominio;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private LocalDate fechaDeNacimiento;

    public Persona() {
    }

    public Persona(String string, LocalDate localDate) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Persona() {
        //TODO Auto-generated constructor stub
    }

    public Persona(String string, LocalDate of) {
        //TODO Auto-generated constructor stub
    }

    public long calcularEdad() {
        return Period.between(this.fechaDeNacimiento, LocalDate.now()).getYears();
    }

    public String getNombre() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNombre'");
    }

    public void anadirPersona(Persona persona) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'anadirPersona'");
    }

    public Persona elMasJoven() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'elMasJoven'");
    }

    public String calcularSumaEdades() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularSumaEdades'");
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
}
