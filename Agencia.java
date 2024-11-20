package agencia;

import java.util.ArrayList;


public class Agencia {

    private int id;
    private String banco;
    private String endereco;
    private ArrayList<ContaBancaria> contas;

    public Agencia(int id, String banco, String endereco) {
        this.id = id;
        this.banco = banco;
        this.endereco = endereco;
        this.contas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBanco() {
        return banco;
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public ArrayList<ContaBancaria> getContas() {
        return contas;
    }
    public void setContas(ArrayList<ContaBancaria> contas) {
        this.contas = contas;
    }

    public void print(){
        System.out.println("Agencia ID: " + this.id);
        System.out.println("Banco: " + this.banco);
        System.out.println("Endereco: " + this.endereco);
    }

    public void printarContas(){
        for(int i = 0; i<this.contas.size(); i++){
            this.contas.get(i).print();
            System.out.println("-------------");
        }
    }

}
