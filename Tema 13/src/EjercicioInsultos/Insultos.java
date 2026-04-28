
package EjercicioInsultos;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Insultos {  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String frase;
        String [][] diccionario = new String [10][2];
        
        try{
            BufferedWriter bw = new BufferedWriter (new FileWriter("frase.txt"));
            System.out.println("Introduce una frase: ");
            frase = sc.nextLine();
            bw.write(frase);
            bw.close();
        
            BufferedReader br = new BufferedReader (new FileReader("insultos.txt"));
            String linea = br.readLine();
            int c = 0;
            
            while(linea != null){
                String [] palabras = linea.split(":");
                diccionario[c][0] = palabras[0];
                diccionario[c][1] = palabras[1];
                c ++;
                linea = br.readLine();
            }
            for (int i = 0; i < diccionario.length; i++) {
                System.out.println(Arrays.toString(diccionario[i]));
            }
            
            br.close();
            
            for (int i = 0; i < diccionario.length; i++) {                
                    frase = frase.replaceAll(diccionario[i][0],diccionario[i][1]);                
            }
            BufferedWriter bw2 = new BufferedWriter (new FileWriter("frasebuena.txt"));
            System.out.println(frase);
            bw2.write(frase);
            bw2.close();
           
            
        }catch(Exception e){
            
        }
        
        
        
    }


    
}
