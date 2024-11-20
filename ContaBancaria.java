package agencia;

import java.util.ArrayList;

public class ContaBancaria {

    private Cliente titular;
    private int numero;
    private double saldo;
    private double limite;
    private Agencia agencia;
    private Historico historico;

    public ContaBancaria (Cliente titular, int numero, double saldo, double limite, Agencia agencia) {
            this.titular = titular;
            this.numero = numero;
            this.saldo = saldo;
            this.limite = limite;
            this.agencia = agencia;
            addContas(this);
            this.historico = new Historico();
    }

    public Cliente getTitular() {
        return titular;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    public Agencia getAgencia() {
        return agencia;
    }
    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public void print(){
        System.out.println("Titular: " + this.titular.getNome());
        System.out.println("Numero: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite: " + this.limite);
        System.out.println("Banco: " + this.agencia.getBanco());
        System.out.println("Agencia ID: " + this.agencia.getId());
    }

    public void deposito(double valor){
        this.saldo += valor;
        historico.getExtrato().add("+ " + valor);
    }
    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            historico.getExtrato().add("- " + valor);
        } else {
            SaldoInsuficienteExcpetion e = new SaldoInsuficienteExcpetion("Saldo insuficiente, " + "tente uma quantia menor");
            throw e;
        }
    }

    public void mostrarExtrato(){
        System.out.println("Extrato do titular: " + this.titular.getNome());
        for(int i = 0; i<historico.getExtrato().size(); i++){
            System.out.println(historico.getExtrato().get(i));
        }
        System.out.println("Saldo atual: " + this.saldo);
    }

    public void addContas(ContaBancaria conta){
        this.agencia.getContas().add(conta);
    }


}
