import org.junit.Test;
import static org.junit.Assert.*;

public class AssertEqualsTest {

    @Test
    public void testeIgualdadeSucesso() {
        Dado dado = new Dado("dado1");
        Resultado resu = new Resultado();
        resu.cadastrarDadoNoRelatorio(dado);
        assertEquals(resu.getDadoSet().size(), 1);

        dado.setNome("Dados");
        assertEquals(dado.getNome(), "Dados");

    }
}