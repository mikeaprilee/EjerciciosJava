
package MedacquenoEntras;

import java.io.*;

//Creamos una clase Persona pare registrar los datos de nuestro objeto.
public class Persona {
  
    //Declaramos las variables del nombre y la edad de cada persona.
    private String nombre;
    private int edad;
   
    //Creamos el constructor con la condicion y la excepcion creada.
    //Con throws añadimos la excepcion de mi clase y luego con throw se 
    //la "arrojamos" a esa condicion.
    public Persona(String nombre, int edad) throws ExceptionMenorEdad{
        this.nombre = nombre;
        //En este caso los menores de edad no pueden entrar.
        if (edad < 18){
            throw new ExceptionMenorEdad("Es menor de edad");
        }
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return nombre + " - " + edad ;
    }
}
