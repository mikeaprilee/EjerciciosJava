
package proyectoexcepcionbanco;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ProyectoExcepcionBanco {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    try{
        System.out.println("Introduce nombre");
        String titular = sc.next();
        System.out.println("Introduce numero");
        int numero = sc.nextInt();
        
        
            Cuenta c = new Cuenta("Dani", numero, 500);
            c.movimiento(-1000);
            }catch(SaldoInsuficienteException e){
                System.out.println(e.getMessage());
            }catch(InputMismatchException e){
                System.out.println("Error");
            }
    }
    
}
