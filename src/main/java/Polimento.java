public class Polimento extends LimpezaDecorator{
    public Polimento(Limpeza limpeza) {
        super(limpeza);
    }

    @Override
    public float getAdicionalLimpeza() {
        return 10.0f;
    }

    @Override
    public String getNomeLimpezaAdicional() {
        return "Polimento";
    }
}
