package clase_padre;

// Clase base CuentaBancaria
public abstract class CuentaBancaria {
    private double saldo;
    private String numeroCuenta;
    private Cliente cliente;

    public CuentaBancaria(double saldoInicial, String numeroCuenta, Cliente cliente) {
        this.saldo = saldoInicial;
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Depósito de " + monto + " realizado.");
    }

    public abstract boolean retirar(double monto); // Método abstracto a sobrescribir

    public void mostrarInformacion() {
        cliente.mostrarInformacion();
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Saldo Actual: " + saldo);
    }
}
