
package proyectoexcepcionbanco;


public class Cuenta {
    private String titular;
    private int numero;
    private double saldo;

    public Cuenta(String titular, int numero, double saldo) throws SaldoInsuficienteException{
        if(saldo <0.0){
            throw new SaldoInsuficienteException("Cuenta creada con valor negativo");
        }
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public void movimiento(double valor)throws SaldoInsuficienteException{
        if(saldo + valor < 0){
            throw new SaldoInsuficienteException("Movimiento saldo negativo");
        }
        saldo += valor;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", numero=" + numero + ", saldo=" + saldo + '}';
    }
}
