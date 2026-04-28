
package ElementoInformatico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ElementosInformaticos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList <Elementos> elementos = new ArrayList <>();
        String nombre = "";
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce elementos: ");
            nombre = sc.next();
            elementos.add(new Elementos(nombre));   
        }
        for (int i = 0; i < elementos.size(); i++) {
            if (elementos.get(i).getId() % 2 == 0) {
                elementos.get(i).setEstado(false);
                System.out.println(elementos.get(i));
            }
            
        }
        System.out.println(elementos);
        
        for(Elementos i:elementos ){
            if (i.getId() % 2 == 0) {
                i.setEstado(false);
                System.out.println(i);
            }
        }
        
        
    }
    
}
