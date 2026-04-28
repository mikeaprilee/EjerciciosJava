
package ProyectoLecturaEscrituraFicheros;

import java.io.*;


public class mainSplit {

    public static void main(String[] args) {
        
        try{
            BufferedReader bw = new BufferedReader (new FileReader("compra.txt"));
            String palabra = bw.readLine();
            while(palabra != null){
                String [] array = palabra.split(":");
                    System.out.println(array[0]);
                    System.out.println(array[1]);
                    palabra = bw.readLine();
            }
        }catch(Exception e){
            System.out.println("Error");
        }
        
    }
    
}
