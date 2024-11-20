package agencia;

import java.time.LocalDate;
import java.util.ArrayList;

public class Historico {

    private ArrayList<String> extrato = new ArrayList<>();
    private LocalDate dataInicial;

    public Historico() {
        this.dataInicial = LocalDate.now(); // talvez tem que formatar a sintaxa da data
    }

    public ArrayList<String> getExtrato() {
        return extrato;
    }
}
