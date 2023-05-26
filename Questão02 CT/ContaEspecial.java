package Questão02;

public class ContaEspecial extends ContaBancaria{

    ContaEspecial(String nomeTitular, int numConta, Double saldo, boolean epecial) {
        super(nomeTitular, numConta, saldo, epecial);

    }

    public void depositar(Double valor){
        this.saldo=  getSaldo() + valor;
    }

    public void sacar(Double valor) {
        setSaldo(this.saldo - valor);
        System.out.println(" ");
        System.out.println("Realização de saque no valor de  " + valor);
    }

    public void extrato() {
        System.out.println("-- Extrato --");
        System.out.println("Titular:" + getNomeTitular());
        System.out.println("Conta: " + getNumConta());
        if (getSaldo() < 0) {
            System.out.println("Atenção Saldo NEGATIVO!");
        }
        System.out.println("Saldo: " + getSaldo());

    }

}
