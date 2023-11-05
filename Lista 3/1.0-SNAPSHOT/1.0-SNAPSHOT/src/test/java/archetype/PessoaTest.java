package archetype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PessoaTest {

    private Pessoa Pessoa;


    @Test
    public void testGetNome() {
        Pessoa = new Pessoa();
        Pessoa.setNome("Pedro");
        assertEquals("Pedro", Pessoa.getNome());
    }


    @Test
    public void testDizerOla() {
        Pessoa = new Pessoa();
        assertEquals("Ola", Pessoa.dizerOla());
    }

    
}
