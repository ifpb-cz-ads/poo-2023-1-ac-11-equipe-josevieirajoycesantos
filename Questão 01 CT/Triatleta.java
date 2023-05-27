public class Triatleta extends Pessoa implements Nadador, Corredor, Ciclista{
    public Triatleta (String nome){
        super(nome);
    }
    
    public void aquecer (){
        System.out.println(getNome() + " Está aquecendo");
    }

    public void nadar (){
        System.out.println(this.getNome() + " Está nadando");
    }

    public void correr (){
        System.out.println(this.getNome() + " Está correndo");
    }

    public void correrDeBicicleta (){
        System.out.println(this.getNome() + " Está pedalando");
    }
}
