
package MedacquenoEntras;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.*;


public class MedacNoEntras {
    public static void main(String[] args1) {
        
        Scanner sc= new Scanner (System.in);
        String nombre="";
        int edad=0;
        int resp;
        
        
        do{
            System.out.println("1. Nombre y Edad 2. Salir");
            resp=sc.nextInt();
            switch(resp){
                case 1: 
                    try{
                        System.out.println("Introduce nombre: ");
                        nombre=sc.next();
                        System.out.println("Introduce edad: ");
                        edad=sc.nextInt();
                            try{
                                Persona p = new Persona (nombre,edad);
                                registrarEntrada(p);
                                System.out.println("Te dejo entrar");
                            }catch(ExceptionMenorEdad e){
                            registrarError(e.getMessage());
                            System.out.println("Fuera eres menor");
                            }
                    }catch(InputMismatchException e){
                        System.out.println("Error formato invalido");
                        registrarError("Error formato");
                        sc.nextLine();
                    }              
                break;
                case 2:
                    System.out.println("Saliendo");
                break;
            }  
        }while(resp!=2);
    }

    private static void registrarEntrada(Persona persona) {
        try{
            BufferedWriter bw = new BufferedWriter (new FileWriter("Input.txt", true));
            bw.write(persona.toString());
            bw.newLine();
            bw.close();
        }catch(Exception e){
            System.out.println("Error en archivo");
        }
    }
    private static void registrarError(String mensaje) {
        try{
            BufferedWriter bw = new BufferedWriter (new FileWriter("log.txt", true));
            bw.write(mensaje.toString());
            bw.newLine();
            bw.close();
        }catch(Exception e){
            System.out.println("Error en archivo");
        }
    } 
    
}
