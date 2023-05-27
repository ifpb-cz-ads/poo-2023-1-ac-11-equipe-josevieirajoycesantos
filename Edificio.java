package QuestoesAnexas.Questao01;

public class Edificio {
    int quantEletrodomesticos;
    int quantPessoas;
    Double area;

    Edificio(int quantEletrodomesticos, int quantPessoas, Double area){
        this.quantEletrodomesticos = quantEletrodomesticos;
        this.quantPessoas = quantPessoas;
        this.area = area;
    }

    public int getQuantEletrodomesticos (){
        return this.quantEletrodomesticos;
    }

    public void setQuantEletrodomesticos (int quantEletrodomesticos){
        this.quantEletrodomesticos = quantEletrodomesticos;
    }

    public int getQuantPessoas (){
        return this.quantEletrodomesticos;
    }

    public void setQuantPessoas (int quantPessoas){
        this.quantPessoas = quantPessoas;
    }

    public Double getArea (){
        return this.area;
    }

    public void setArea (Double area){
        this.area = area;
    }

    public void elavador (int estadoElevador){
        if (estadoElevador == 0) {
            System.out.println("O elevador está no térreo");
        }
        else{
            System.out.println("O elevador está subindo");
        }
    }

    public void PegadaDeCarbono(){
        System.out.println("A pegada de carbono do Edificio é: 57,31 kg de CO²");
    }

}
