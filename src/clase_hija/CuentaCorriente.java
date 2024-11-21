package clase_hija;
import clase_padre.CuentaBancaria;
import clase_padre.Cliente;
// Subclase CuentaCorriente
public class CuentaCorriente extends CuentaBancaria {
    private static final double COMISION_RETIRO = 0.02; // 2% de comisión

    public CuentaCorriente(Cliente cliente) {
        super(1000.0, "CC-" + cliente.getIdentificacion(), cliente); // Saldo inicial de $1000
    }

    @Override
    public boolean retirar(double monto) {
        double totalRetiro = monto + (monto * COMISION_RETIRO);
        if (totalRetiro <= getSaldo()) {
            depositar(-totalRetiro);
            System.out.println("Retiro de " + monto + " realizado con una comisión de " + (monto * COMISION_RETIRO));
            return true;
        } else {
            System.out.println("Fondos insuficientes para realizar el retiro.");
            return false;
        }
    }
}