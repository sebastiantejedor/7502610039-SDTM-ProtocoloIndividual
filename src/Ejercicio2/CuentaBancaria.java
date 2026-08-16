package Ejercicio2;
public class CuentaBancaria {
    String numeroCuenta;
    double saldo;
    String tipoCuenta;

    //Constructor por defecto
    public CuentaBancaria() {
        this.numeroCuenta = "7508957432";
        this.saldo = 1000.0;
        this.tipoCuenta = "Ahorros";
    }

    //Constructor con 2 parámetros
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
        this.tipoCuenta = tipoCuenta;
    }

    //Constructor con 3 parámetros
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", tipoCuenta='" + tipoCuenta + '\'' +
                '}';
    }
}
