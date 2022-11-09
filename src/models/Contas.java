package models;

/**
 * @author Matheus Martinelli
 * 09 /11/ 2022
 */
public class Contas {
    private int numero;
    private double saldo;

    public Contas(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
