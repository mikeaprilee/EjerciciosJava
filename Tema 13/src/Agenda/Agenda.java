
package Agenda;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.*;

public class Agenda {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int resp = 0;
        int size;
        int respCase1 = 0;
        String textoSize;
     
        
        do {
            
            System.out.println("1. Ajustes 2.Insertar contacto 3.Ver contacto 4. Mayuscula 5.Salir");
            resp = sc.nextInt();
            
            switch(resp){
                case 1:
                    size = leer();
                    System.out.println("El size es: " + size);
                    System.out.println("Quieres cambiar size 1.Si 2.No");
                    respCase1 = sc.nextInt();
                    
                    switch(respCase1){
                        case 1: 
                            System.out.println("Introduce valor");
                            size = sc.nextInt();
                            //Cambiar de int a string
                            textoSize = String.valueOf(size);
                            escribir("setup.txt", textoSize);
                        break;
                    }            
                break;
                case 2:
                    int num = leer();
                    if(num <= 0 ){
                        System.out.println("Ve a ajustes y aumente size");
                    }else{
                        int lineas = contarLineas();
                            if (lineas >= num) {
                                System.out.println("La agenda esta llena");
                            }else{
                                System.out.println("introducir nombre");
                                String nombre = sc.next();
                                System.out.println("Introduce numero");
                                int numero = sc.nextInt();
                                Persona p = new Persona(nombre, numero);
                                escribir("agenda.txt", p.toString());
                            }
                    }
                break;
                case 3:
                    leerAgenda();
                break;
                case 4:
                    try {
                        BufferedReader br = new BufferedReader(new FileReader("agenda.txt"));
                        BufferedWriter bw = new BufferedWriter(new FileWriter("agendaMayuscula.txt"));
                        String linea = br.readLine();
                            while(linea != null){
                                bw.write(linea.toUpperCase());
                                bw.newLine();
                                linea = br.readLine();
                            }
                            br.close();
                            bw.close();
                    }catch(IOException e){
                        System.out.println("error");
                    }
                break;
                case 5:
                    
                break;
                default:
            }
        
        } while (resp != 5);
        
    }

    private static int leer() {
        int num = 0;
        try{
            BufferedReader br = new BufferedReader(new FileReader("setup.txt"));
            String aux = br.readLine();
            //Convertir String en Int
            num = Integer.parseInt(aux);
        }catch(IOException e){
            System.out.println("Error archivo");
        }
       return num;
    }

    private static void escribir(String nombreArchivo, String textoSize) {
        
        try{
            BufferedWriter bw = new BufferedWriter (new FileWriter(nombreArchivo, true));
            bw.write(textoSize);
            bw.newLine();
            bw.close();
        }catch(IOException e){
            System.out.println("Error de archivo");
        }
    }
    private static int contarLineas(){
        int linea = 0;
            try{
                BufferedReader br = new BufferedReader (new FileReader ("agenda.txt"));
                String aux = br.readLine();
                while(aux != null){
                    linea ++;
                    aux = br.readLine();
                }
                br.close();
            }catch(IOException e){
                System.out.println("Error archivo");

            }
        return linea;
    }
    private static void leerAgenda() {
        try{
            BufferedReader br = new BufferedReader (new FileReader("agenda.txt"));
            String aux = br.readLine();
                while(aux != null){
                    System.out.println(aux);
                    aux = br.readLine();
                }br.close();
        }catch(IOException e){
            System.out.println("Error archivo");
        }
    }
    
    
}
