public class Pintura extends LimpezaDecorator{
    public Pintura(Limpeza limpeza) {
        super(limpeza);
    }

    @Override
    public float getAdicionalLimpeza() {
        return 50.0f;
    }

    @Override
    public String getNomeLimpezaAdicional() {
        return "Pintura";
    }
}
