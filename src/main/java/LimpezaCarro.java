public class LimpezaCarro implements Limpeza {
    public float valor;

    public LimpezaCarro(float valor) {
        this.valor = valor;
    }

    public LimpezaCarro() {
    }

    @Override
    public float getValor() {
        return valor;
    }

    @Override
    public String getDescricao() {
        return "Limpeza Carro";
    }
}
