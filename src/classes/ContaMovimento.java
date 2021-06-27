package classes;

public class ContaMovimento extends Conta {

    private float limite;//Limite de reais que podem ser retirados por mês

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

}
