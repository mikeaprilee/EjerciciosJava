
package Agenda;

import java.io.*;


public class Persona {
  
    private String nombre;
    private int telefono;
   
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int edad) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return nombre + " - " + telefono ;
    }
}