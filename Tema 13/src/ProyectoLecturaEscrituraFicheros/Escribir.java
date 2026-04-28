
package ProyectoLecturaEscrituraFicheros;
import java.io.*;

public class Escribir {
    public static void main(String[] args) {
        
        File f = new File("ejercicio2.txt");
        
        try{
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
                bw.write("hola");
                bw.newLine();
                bw.write("adios");
//            fw.write('h');
//            fw.write('o');
            bw.close();
           
        }catch(Exception e){
            System.out.println("Error");
        }
    }
    
}
