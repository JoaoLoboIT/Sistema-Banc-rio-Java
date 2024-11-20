package agencia;

public class SaldoInsuficienteExcpetion extends RuntimeException {
    public SaldoInsuficienteExcpetion(String mensagem) {
        super(mensagem);
    }

}
