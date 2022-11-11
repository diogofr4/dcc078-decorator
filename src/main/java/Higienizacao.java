public class Higienizacao extends LimpezaDecorator{
    public Higienizacao(Limpeza limpeza) {
        super(limpeza);
    }

    @Override
    public float getAdicionalLimpeza() {
        return 20.0f;
    }

    @Override
    public String getNomeLimpezaAdicional() {
        return "Higienização";
    }
}
