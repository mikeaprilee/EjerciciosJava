
package ProyectoLecturaEscrituraFicheros;
import java.io.*;
import java.util.Scanner;

public class EjerciciosFicheros {
    public static void main(String[] args) {
        /*
        char letra,letra2;
        sout("Introduce una letra en A,T,C,o G")
        letra = sc.next().chatAt(0)
        sout("")
        */
        
        File ejercicio = new File("ejercicio1.txt");
        Scanner sc = new Scanner(System.in);
        char usuario;
        char usuario2;
        char letra;
        try{
            FileReader F = new FileReader (ejercicio);
            System.out.println("Pon una letra");
            usuario = sc.next().charAt(0);
            System.out.println("Cambiar la letra");
            usuario2 = sc.next().charAt(0);
            
            int num = F.read();
            while (num != -1){
                
                letra = (char) num;
                System.out.print(letra + "  ");
                num = F.read();
                if (usuario == letra) {
                    letra = usuario2;
                }
                System.out.print(letra + "  ");
                num = F.read();       
            }
            
            F.close();
        }catch(IOException e){
            System.out.println("error");
        }
        
    }
    
}
