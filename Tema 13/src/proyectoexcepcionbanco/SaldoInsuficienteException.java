
package proyectoexcepcionbanco;


public class SaldoInsuficienteException extends Exception{
    
    public SaldoInsuficienteException (){
        super();
    }
    public SaldoInsuficienteException(String mensaje){
        super(mensaje);
    }
}
