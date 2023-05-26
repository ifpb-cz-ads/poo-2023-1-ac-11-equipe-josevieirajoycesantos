package Questão02;

public abstract class ContaBancaria {
    private String nomeTitular;
    private int numConta;
    private boolean especial;
    protected Double saldo;


    ContaBancaria(String nome, int numero, Double valor, boolean especial){
        this.nomeTitular= nome;
        this.numConta= numero;
        this.saldo= valor;
        this.especial = especial;
    }

    public String getNomeTitular(){
        return this.nomeTitular;
    }
    public void setNomeTitular(String nome){
        this.nomeTitular= nome;
    }

    public boolean getEspecial(){
        return this.especial;
    }
    public void setEspecial(boolean especial){
        this.especial = especial;
    }

    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int conta){
        this.numConta= conta;
    }
    public Double getSaldo(){
        return this.saldo;
    }   
    public void setSaldo(int deposito){
        this.saldo = deposito;
    }

    public abstract void depositar(Double valor);
    public abstract void sacar(Double valor);
    public abstract void extrato();
}
