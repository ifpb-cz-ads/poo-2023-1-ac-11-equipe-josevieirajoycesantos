package QuestoesAnexas.Questao01;

public class Bicicleta {
    Double distanciaPercorrida;


    Bicicleta(Double distancia){
        this.distanciaPercorrida = distancia;
    }

    public Double getDistanciaPercorrida (){
        return this.distanciaPercorrida;
    }

    public void setDistanciaPercorrida (Double distancia){
        this.distanciaPercorrida = distancia;
    }

    public void Percorrer (){
        System.out.println("A ciclista está pedalando");
    }

    public void PegadaDeCarbono(){
        System.out.println("A pegada de carbono da Bicicleta é: 0 de kg CO²");
    }
}

