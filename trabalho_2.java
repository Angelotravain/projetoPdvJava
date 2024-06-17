import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TesteexecDois {
    @Test
    public void testeCriacaoPessoa() {
        Pessoa pessoa = new Pessoa("Fulano", "123.456.789-00", "1234567-8", "Rua Teste, 123", "Cidade Teste", "Estado Teste");
        assertEquals("Fulano", pessoa.getNome());
        assertEquals("123.456.789-00", pessoa.getCpf());
        assertEquals("1234567-8", pessoa.getRg());
        assertEquals("Rua Teste, 123", pessoa.getEndereco());
        assertEquals("Cidade Teste", pessoa.getCidade());
        assertEquals("Estado Teste", pessoa.getEstado());
    }

    @Test
    public void testeRetornoNome() {
        Pessoa pessoa = new Pessoa("Fulano", "123.456.789-00", "1234567-8", "Rua Teste, 123", "Cidade Teste", "Estado Teste");
        assertEquals("Fulano", pessoa.getNome());
    }

    @Test
    public void testeRetornoCPF() {
        Pessoa pessoa = new Pessoa("Fulano", "123.456.789-00", "1234567-8", "Rua Teste, 123", "Cidade Teste", "Estado Teste");
        assertEquals("123.456.789-00", pessoa.getCpf());
    }

    @Test
    public void testeRetornoRG() {
        Pessoa pessoa = new Pessoa("Fulano", "123.456.789-00", "1234567-8", "Rua Teste, 123", "Cidade Teste", "Estado Teste");
        assertEquals("1234567-8", pessoa.getRg());
    }

    @Test
    public void testeRetornoEndereco() {
        Pessoa pessoa = new Pessoa("Fulano", "123.456.789-00", "1234567-8", "Rua Teste, 123", "Cidade Teste", "Estado Teste");
        assertEquals("Rua Teste, 123", pessoa.getEndereco());
    }

    @Test
    public void testeRetornoCidade() {
        Pessoa pessoa = new Pessoa("Fulano", "123.456.789-00", "1234567-8", "Rua Teste, 123", "Cidade Teste", "Estado Teste");
        assertEquals("Cidade Teste", pessoa.getCidade());
    }

    @Test
    public void testeRetornoEstado() {
        Pessoa pessoa = new Pessoa("Fulano", "123.456.789-00", "1234567-8", "Rua Teste, 123", "Cidade Teste", "Estado Teste");
        assertEquals("Estado Teste", pessoa.getEstado());
    }

    @Test
    public void testeValidacaoCPF() {
        Pessoa pessoa = new Pessoa("Fulano", "123.456.789-00", "1234567-8", "Rua Teste, 123", "Cidade Teste", "Estado Teste");
        assertTrue(validarCPF(pessoa.getCpf()));
    }

    @Test
    public void testeValidacaoRG() {
        Pessoa pessoa = new Pessoa("Fulano", "123.456.789-00", "1234567-8", "Rua Teste, 123", "Cidade Teste", "Estado Teste");
        assertTrue(validarRG(pessoa.getRg()));
    }

        private boolean validarCPF(String cpf) {
        cpf = cpf.replaceAll("[^0-9]", "");

        if (cpf.length() != 11)
            return false;

        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += Integer.parseInt(cpf.substring(i, i + 1)) * (10 - i);
        }
        int resto = 11 - (soma % 11);
        int digitoVerificador1 = resto == 10 || resto == 11 ? 0 : resto;

        if (digitoVerificador1 != Integer.parseInt(cpf.substring(9, 10)))
            return false;
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += Integer.parseInt(cpf.substring(i, i + 1)) * (11 - i);
        }
        resto = 11 - (soma % 11);
        int digitoVerificador2 = resto == 10 || resto == 11 ? 0 : resto;

        return digitoVerificador2 == Integer.parseInt(cpf.substring(10, 11));
    }
    private boolean validarRG(String rg) {
        return rg.matches("\\d{7}-\\d{1}");
    }
}


public class Pessoa {
    
    private String nome;
    private String cpf;
    private String rg;
    private String endereco;
    private String cidade;
    private String estado;

    public Pessoa(String nome, String cpf, String rg, String endereco, String cidade, String estado) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
