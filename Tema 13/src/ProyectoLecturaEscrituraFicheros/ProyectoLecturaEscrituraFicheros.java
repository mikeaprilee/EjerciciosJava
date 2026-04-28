
package ProyectoLecturaEscrituraFicheros;

import java.io.*;


public class ProyectoLecturaEscrituraFicheros {

  
    public static void main(String[] args) {
        //File dir = new File ("C:\\Users\\MEDAC\\Documents\\NetBeansProjects");
        //File f = new File ( dir,"prueba.txt");
        //System.out.println("f.exists = " + f.exists());
        //System.out.println("f.isFile= " + f.isFile());
        //System.out.println("d.isFile= " + dir.isDirectory());
        
        char letra;
        
        File ejemplo = new File("ejemplo.txt");
        
        try{
            FileReader fR = new FileReader(ejemplo);
            //int num = fR.read();                   
            //while (num != -1){
                //letra = (char) num;
                //System.out.print(letra + "  ");
                //num = fR.read();
            //}
            //fR.close();
            BufferedReader bR = new BufferedReader(fR);
            String palabra = bR.readLine();
            while(palabra != null){
                System.out.println(palabra);
                palabra = bR.readLine();
            }
            bR.close();
        }catch(IOException e){
            System.out.println("error");
        }
    }
}
