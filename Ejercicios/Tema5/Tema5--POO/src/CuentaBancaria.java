
public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        System.out.printf("Cuenta de %s: %.2f€%n", titular, saldo);
    }

    public void depositar(double cantidad) {
        saldo = saldo + cantidad;
        System.out.printf("Depósito de %.2f€. Nuevo saldo: %.2f€%n%n", cantidad, saldo);
    }

    public void retirar(double cantidad) {
        saldo = saldo - cantidad;
        System.out.printf("Retiro de %.2f€. Nuevo saldo: %.2f€%n%n", cantidad, saldo);
    }

}
