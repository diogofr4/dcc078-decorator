import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LimpezaTest {
    @Test
    void deveRetornarValorLimpeza() {
        Limpeza limpeza = new LimpezaCarro(50.0f);

        assertEquals(50.0f, limpeza.getValor());
    }

    @Test
    void deveRetornarValorLimpezaComEnceramento() {
        Limpeza limpeza = new Enceramento(new LimpezaCarro(50.0f));

        assertEquals(70.0f, limpeza.getValor());
    }

    @Test
    void deveRetornarValorLimpezaComHigienizacao() {
        Limpeza limpeza = new Higienizacao(new LimpezaCarro(50.0f));

        assertEquals(70.0f, limpeza.getValor());
    }

    @Test
    void deveRetornarValorLimpezaComPintura() {
        Limpeza limpeza = new Pintura(new LimpezaCarro(50.0f));

        assertEquals(100.0f, limpeza.getValor());
    }

    @Test
    void deveRetornarValorLimpezaComPolimento() {
        Limpeza limpeza = new Polimento(new LimpezaCarro(50.0f));

        assertEquals(60.0f, limpeza.getValor());
    }

    @Test
    void deveRetornarValorLimpezaComPolimentoMaisEnceramento() {
        Limpeza limpeza = new Polimento(new Enceramento(new LimpezaCarro(50.0f)));

        assertEquals(80.0f, limpeza.getValor());
    }

    @Test
    void deveRetornarValorLimpezaComPolimentoMaisHigienizacao() {
        Limpeza limpeza = new Polimento(new Higienizacao(new LimpezaCarro(50.0f)));

        assertEquals(80.0f, limpeza.getValor());
    }

    @Test
    void deveRetornarValorLimpezaComPolimentoMaisPintura() {
        Limpeza limpeza = new Polimento(new Pintura(new LimpezaCarro(50.0f)));

        assertEquals(110.0f, limpeza.getValor());
    }

    @Test
    void deveRetornarValorLimpezaComPinturaMaisEnceramento() {
        Limpeza limpeza = new Pintura(new Enceramento(new LimpezaCarro(50.0f)));

        assertEquals(120.0f, limpeza.getValor());
    }

    @Test
    void deveRetornarValorLimpezaComPinturaMaisHigienizacao() {
        Limpeza limpeza = new Pintura(new Higienizacao(new LimpezaCarro(50.0f)));

        assertEquals(120.0f, limpeza.getValor());
    }

    @Test
    void deveRetornarValorLimpezaComHigienizacaoMaisEnceramento() {
        Limpeza limpeza = new Higienizacao(new Enceramento(new LimpezaCarro(50.0f)));

        assertEquals(90.0f, limpeza.getValor());
    }

    @Test
    void deveRetornarValorLimpezaComPolimentoMaisPinturaMaisEnceramento() {
        Limpeza limpeza = new Polimento(new Pintura(new Enceramento(new LimpezaCarro(50.0f))));

        assertEquals(130.0f, limpeza.getValor());
    }

    @Test
    void deveRetornarValorLimpezaComPolimentoMaisPinturaMaisEnceramentoMaisHigienizacao() {
        Limpeza limpeza = new Polimento(new Pintura(new Enceramento(new Higienizacao(new LimpezaCarro(50.0f)))));

        assertEquals(150.0f, limpeza.getValor());
    }

    @Test
    void deveRetornarDescricaoLimpeza() {
        Limpeza limpeza = new LimpezaCarro();

        assertEquals("Limpeza Carro", limpeza.getDescricao());
    }

    @Test
    void deveRetornarDescricaoLimpezaComEnceramento() {
        Limpeza limpeza = new Enceramento(new LimpezaCarro(50.0f));

        assertEquals("Limpeza Carro Enceramento", limpeza.getDescricao());
    }

    @Test
    void deveRetornarDescricaoLimpezaComHigienizacao() {
        Limpeza limpeza = new Higienizacao(new LimpezaCarro(50.0f));

        assertEquals("Limpeza Carro Higienização", limpeza.getDescricao());
    }

    @Test
    void deveRetornarDescricaoLimpezaComPintura() {
        Limpeza limpeza = new Pintura(new LimpezaCarro(50.0f));

        assertEquals("Limpeza Carro Pintura", limpeza.getDescricao());
    }

    @Test
    void deveRetornarDescricaoLimpezaComPolimento() {
        Limpeza limpeza = new Polimento(new LimpezaCarro(50.0f));

        assertEquals("Limpeza Carro Polimento", limpeza.getDescricao());
    }

    @Test
    void deveRetornarDescricaoLimpezaComPolimentoMaisEnceramento() {
        Limpeza limpeza = new Polimento(new Enceramento(new LimpezaCarro(50.0f)));

        assertEquals("Limpeza Carro Enceramento Polimento", limpeza.getDescricao());
    }

    @Test
    void deveRetornarDescricaoLimpezaComPolimentoMaisHigienizacao() {
        Limpeza limpeza = new Polimento(new Higienizacao(new LimpezaCarro(50.0f)));

        assertEquals("Limpeza Carro Higienização Polimento", limpeza.getDescricao());
    }

    @Test
    void deveRetornarDescricaoLimpezaComPolimentoMaisPintura() {
        Limpeza limpeza = new Polimento(new Pintura(new LimpezaCarro(50.0f)));

        assertEquals("Limpeza Carro Pintura Polimento", limpeza.getDescricao());
    }

    @Test
    void deveRetornarDescricaoLimpezaComPinturaMaisEnceramento() {
        Limpeza limpeza = new Pintura(new Enceramento(new LimpezaCarro(50.0f)));

        assertEquals("Limpeza Carro Enceramento Pintura", limpeza.getDescricao());
    }

    @Test
    void deveRetornarDescricaoLimpezaComPinturaMaisHigienizacao() {
        Limpeza limpeza = new Pintura(new Higienizacao(new LimpezaCarro(50.0f)));

        assertEquals("Limpeza Carro Higienização Pintura", limpeza.getDescricao());
    }

    @Test
    void deveRetornarDescricaoLimpezaComHigienizacaoMaisEnceramento() {
        Limpeza limpeza = new Higienizacao(new Enceramento(new LimpezaCarro(50.0f)));

        assertEquals("Limpeza Carro Enceramento Higienização", limpeza.getDescricao());
    }

    @Test
    void deveRetornarDescricaoLimpezaComPolimentoMaisPinturaMaisEnceramento() {
        Limpeza limpeza = new Polimento(new Pintura(new Enceramento(new LimpezaCarro(50.0f))));

        assertEquals("Limpeza Carro Enceramento Pintura Polimento", limpeza.getDescricao());
    }

    @Test
    void deveRetornarDescricaoLimpezaComPolimentoMaisPinturaMaisEnceramentoMaisHigienizacao() {
        Limpeza limpeza = new Polimento(new Pintura(new Enceramento(new Higienizacao(new LimpezaCarro(50.0f)))));

        assertEquals("Limpeza Carro Higienização Enceramento Pintura Polimento", limpeza.getDescricao());
    }
}
