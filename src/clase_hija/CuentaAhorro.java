package clase_hija;
import clase_padre.CuentaBancaria;
import clase_padre.Cliente;
// Subclase CuentaAhorro
public class CuentaAhorro extends CuentaBancaria {
    public CuentaAhorro(Cliente cliente) {
        super(500.0, "CA-" + cliente.getIdentificacion(), cliente); // Saldo inicial de $500
    }

    @Override
    public boolean retirar(double monto) {
        if (getSaldo() - monto < 100) {
            System.out.println("No se puede retirar. El saldo debe ser al menos $100.");
            return false;
        } else {
            depositar(-monto);
            System.out.println("Retiro de " + monto + " realizado.");
            return true;
        }
    }
}