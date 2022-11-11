public abstract class LimpezaDecorator implements Limpeza {
    private Limpeza limpeza;
    public String descricao;

    public LimpezaDecorator(Limpeza limpeza){ this.limpeza = limpeza; }

    public Limpeza getLimpeza() {
        return limpeza;
    }

    public void setLimpeza(Limpeza limpeza) {
        this.limpeza = limpeza;
    }

    public abstract float getAdicionalLimpeza();

    public float getValor(){
        return this.limpeza.getValor() + this.getAdicionalLimpeza();
    }

    public abstract String getNomeLimpezaAdicional();

    @Override
    public String getDescricao() {
        return this.limpeza.getDescricao() + " " + this.getNomeLimpezaAdicional();
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
