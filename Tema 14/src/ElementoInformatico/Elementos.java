
package ElementoInformatico;

public class Elementos {
    
    private String nombre = "";
    private boolean estado;
    private int id = 0;
    static int cont = 0;
    
    public Elementos(String nombre){
        this.nombre = nombre;
        this.estado = estado;
        id = cont;
        cont++;
    }

    public String getNombre() {
        return nombre;
    }

    public static void setCont(int cont) {
        Elementos.cont = cont;
    }

    public static int getCont() {
        return cont;
    }

    public boolean isEstado() {
        return estado;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nombre + "estado: " + estado + " id: " + id;
    }
    
}
