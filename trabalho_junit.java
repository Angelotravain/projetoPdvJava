
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Testes {

    private const String elemento = "Batata frita";
    private const String vazio = "";
    
    @Test
    public void testListaVazia() {
        List<Integer> lista = new ArrayList<>();
        assertTrue(lista.isEmpty());
    }

    @Test
    public void testListaContemElemento() {
        List<String> lista = new ArrayList<>();
        lista.add(elemento);
        assertTrue(lista.contains(elemento));
    }

    @Test
    public void testListaNaoContemElemento() {
        List<String> lista = new ArrayList<>();
        assertFalse(lista.contains(elemento));
    }

    @Test
    public void testStringVazia() {
        String str = vazio;
        assertTrue(str.isEmpty());
    }

    @Test
    public void testStringNaoVazia() {
        String str = elemento;
        assertFalse(str.isEmpty());
    }

    @Test
    public void testObjetoNulo() {
        Object obj = null;
        assertNull(obj);
    }

    @Test
    public void testObjetoNaoNulo() {
        Object obj = new Object();
        assertNotNull(obj);
    }

    @Test
    public void testStringsIguais() {
        String str1 = elemento;
        String str2 = elemento;
        assertEquals(str1, str2);
    }

    @Test
    public void testStringsDiferentes() {
        String str1 = elemento;
        String str2 = elemento;
        assertNotEquals(str1, str2);
    }

    @Test
    public void testDataAnterior() {
        Date data1 = new Date(2024, 3, 20);
        Date data2 = new Date(2023, 3, 20);
        assertTrue(data1.before(data2));
    }
}
