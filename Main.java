package agencia;

public class Main {
    public static void main(String[] args) {

        Agencia itau1 = new Agencia(1,  "itau", "Rua 1");
        Cliente joao = new Cliente("Joao", "123", "GP");
        Cliente andre = new Cliente("Andre", "456", "Medico");
        ContaBancaria c1 = new ContaBancaria(joao, 1, 1000, 20000, itau1);
        ContaBancaria c2 = new ContaBancaria(andre, 2, 5000, 30000, itau1);

        itau1.printarContas();

        c1.deposito(1000);
        c1.sacar(3000);
        c1.deposito(200);
        c1.sacar(100);
        c1.sacar(300);

        c1.mostrarExtrato();



    }
}
