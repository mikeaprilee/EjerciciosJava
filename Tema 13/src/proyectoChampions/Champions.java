
package proyectoChampions;

import java.io.*;



public class Champions {
    public static void main(String[] args) {
         // g.toUpperCase()
        
        try{
            BufferedReader br = new BufferedReader (new FileReader("Champion.txt"));
            String [] array = new String[4];
            String line;
            int cont = 0;
            line = br.readLine();
            
        while (line != null){
            line = line.toUpperCase();
            array[cont] = line;
            cont ++;
            System.out.println(line);
            line = br.readLine();
            
        }
            br.close();
            
            BufferedWriter bw = new BufferedWriter (new FileWriter("Champion.txt"));
            for (int i = 0; i < array.length; i++) {
                bw.write(array[i]);
                bw.newLine();
            }
        bw.close();
        }catch(Exception e){
            
        }
    }
    
}
