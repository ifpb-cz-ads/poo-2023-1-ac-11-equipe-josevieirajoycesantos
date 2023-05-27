package QuestoesAnexas.Questao01;

public class Carro {
    int numPessoas;
    String tipoDeCarro;
    Double distanciaPercorrida;

    Carro(int numPessoas, String carro, Double distancia){
        this.numPessoas = numPessoas;
        this.tipoDeCarro = carro;
        this.distanciaPercorrida = distancia;
    }
    
    public int getNumePessoas (){
        return this.numPessoas;
    }

    public void setNumPessoas (int numPessoas){
        this.numPessoas = numPessoas;
    }

    public String getTipoDeCarro(){
        return this.tipoDeCarro;
    }

    public void setTipoDeCarro (String carro){
        this.tipoDeCarro = carro;
    }

    public Double getDistanciaPercorrida (){
        return this.distanciaPercorrida;
    }

    public void setDistanciaPercorrida (Double distancia){
        this.distanciaPercorrida = distancia;
    }

    public void andar (){
        System.out.println("O carro está andando");
    }

    public void PegadaDeCarbono(){
        System.out.println("A pegada de carbono do carro é: 3,66 de kg CO²");
    }
}
