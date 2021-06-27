package classes;

public abstract class Conta {

    private int numero;
    private float saldo;
    private String Cliente_cpf;

    public int getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getCliente_cpf() {
        return Cliente_cpf;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setCliente_cpf(String Cliente_cpf) {
        this.Cliente_cpf = Cliente_cpf;
    }

}
