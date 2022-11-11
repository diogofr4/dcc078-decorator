public class Enceramento extends LimpezaDecorator {
    public Enceramento(Limpeza limpeza) {
        super(limpeza);
    }

    @Override
    public float getAdicionalLimpeza() {
        return 20.0f;
    }

    @Override
    public String getNomeLimpezaAdicional() {
        return "Enceramento";
    }
}
