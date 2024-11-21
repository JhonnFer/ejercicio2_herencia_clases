import java.util.Scanner;
import clase_hija.CuentaAhorro;
import clase_hija.CuentaCorriente;
import clase_padre.Cliente;
import clase_padre.CuentaBancaria;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente1 = new Cliente("Juan Pérez", "12345678");
        CuentaBancaria cuentaCorriente = new CuentaCorriente(cliente1);

        Cliente cliente2 = new Cliente("Ana Gómez", "87654321");
        CuentaBancaria cuentaAhorro = new CuentaAhorro(cliente2);

        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Ver información del cliente y saldo");
            System.out.println("2. Transferir entre cuentas");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Depositar dinero");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nInformación Cuenta Corriente:");
                    cuentaCorriente.mostrarInformacion();
                    System.out.println("\nInformación Cuenta Ahorro:");
                    cuentaAhorro.mostrarInformacion();
                    break;
            }
        }
    }
}