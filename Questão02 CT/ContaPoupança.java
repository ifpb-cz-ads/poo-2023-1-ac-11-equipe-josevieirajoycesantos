package Questão02;
public class ContaPoupança extends ContaBancaria implements Investimento{

   ContaPoupança(String nomeTitular, int numConta, Double saldo, boolean epecial) {
      super(nomeTitular, numConta, saldo, epecial);
   }

   public void reajustar(Double percentual){
      Double saldoAtual= this.getSaldo();
      Double reajuste= saldoAtual*percentual;
      this.depositar(reajuste);
   }

   public void depositar(Double valor){
        this.saldo=  getSaldo() + valor;
   }

   public void sacar(Double valor){
      if(valor <= this.getSaldo()){
         this.saldo= getSaldo()- valor;
      }
      else{
         System.out.println("Tentativa de saque fracassada! Voçê não possui este saldo. Por favor realize uma operação válida.");
      }
   }

   public void extrato(){
        System.out.println("-- Extrato --");
        System.out.println("Titular: " + getNomeTitular());
        System.out.println("Conta: " + getNumConta());
        System.out.println("Saldo: " + getSaldo());
    }
}
