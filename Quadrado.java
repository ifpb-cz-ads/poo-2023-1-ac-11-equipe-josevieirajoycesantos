package QuestoesAnexas.Questao02;

public class Quadrado implements FormaGeometrica {
    private double lado;

    Quadrado (double lado){
        this.lado = lado;
    }

    public double getLado (){
        return this.lado;
    }

    public void setLado (double lado){
        this.lado = lado;
    }

    public void area (){
        double area = lado*lado;
        System.out.println("A area do quadrado é: " + area);

    }
    public void perimetro (){
        Double perimetro = lado+lado+lado+lado;
        System.out.println("O perimetro do quadrado é: " + perimetro);
    }

    public void imprimir (){
        System.out.println("O lado do quadrado é: " + lado);
        perimetro();
        area();
    }
}
