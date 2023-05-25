package QuestoesAnexas.Questao02;

public class Circulo {
    private Double raio;

    Circulo (Double raio){
        this.raio = raio;
    }

    public Double getRaio (){
        return this.raio;
    }

    public void setRaio (double raio){
        this.raio = raio;
    }

    public void area (){
        double area = 3.14*(raio*raio);
        System.out.println("A area do circulo é: " + area);

    }
    public void perimetro (){
        Double perimetro = 2*3.14*raio;
        System.out.println("O perimetro do circulo é: " + perimetro);
    }

    public void imprimir (){
        System.out.println("O raio do circulo é: " + raio);
        perimetro();
        area();
    }
}
