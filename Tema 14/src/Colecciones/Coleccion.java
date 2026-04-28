
package Colecciones;


import java.util.*;


public class Coleccion {
    public static void main(String[] args) {
        
        ArrayList < Integer > primerArray = new ArrayList <Integer> (); // No podemos usar los datos primitivos
        List <Integer> segundoArray = new ArrayList <>(); // Posible pero se usa mas el otro.
     
        primerArray.add(3);
        primerArray.add(2);
     
        System.out.println(primerArray);    // Van en orden de llegada
        primerArray.add(2);
        System.out.println(primerArray);    // Permiten elementos duplicados
        primerArray.remove(2);              // Elimina el elemento que indiques
        System.out.println(primerArray);
        primerArray.add(1,5);               // De esta forma puedes colocarlo donde quieres
        System.out.println(primerArray);
//      primerArray.clear();                // Elimina toda la lista
        System.out.println(primerArray);
        System.out.println(primerArray.contains(3)); // Te indica si hay un elemento en esa lista, si esta te da True
        System.out.println(primerArray.get(0));      // te devuelve el elemento de la posicion indicada
        System.out.println(primerArray.set(1, 9));   // Te cambia un numero en otra posicion
        System.out.println(primerArray.indexOf(5));  // Devuelve la posicion y el primero que se encuentra
        System.out.println(primerArray.isEmpty());   // Devuelve si esta vacio un true
//      primerArray.remove(0); //Te elimina por posicion. es lo mismo
        System.out.println(primerArray);
        System.out.println(primerArray.size());
        
        Integer [] arrayOld = primerArray.toArray(new Integer[0]); // Hace un array list hace un array normal.
        System.out.println(Arrays.toString(arrayOld));
        
        ArrayList <Integer> tercerArray = new ArrayList <>();
        
        for (int i = 0; i < 5; i++) {
                tercerArray.add(i);
        }
        System.out.println(tercerArray);
        
        ArrayList <String> cuartoArray = new ArrayList <>();
            cuartoArray.add("Pepe");
            cuartoArray.add("Juan");
            cuartoArray.add("Olga");
            
        for (int i = 0; i < cuartoArray.size(); i++) {
            System.out.println("Nombre " + (i + 1) + ": " + cuartoArray.get(i) );
        }
        
        String [] nombre = {"Pepe", "Elena", "Pedro", "Maria"};
        List <String> nombres = new ArrayList <>(Arrays.asList(nombre));
        System.out.println(nombres);
        
        Collections.sort(primerArray);
        System.out.println(primerArray);
        Collections.reverse(primerArray);
        System.out.println(primerArray);
        Collections.sort(nombres);
        System.out.println(nombres);
        
        for (int i = 0; i < nombres.size(); i++) {
            if (nombres.get(i).equals("Pedro")) {
                nombres.remove(i);
            }
        }
        System.out.println(nombres);
        
        for(String i: nombres){
            if(i.equals("Pedro")){
                nombres.remove(nombre);
            }
        }
        System.out.println(nombres);
    }
    
}
 