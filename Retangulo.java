package QuestoesAnexas.Questao02;

public class Retangulo implements FormaGeometrica {
    private double base;
    private double altura;

    Retangulo (double base, double altura){
        this.altura = altura;
        this.base = base;
    }

    public double getBase (){
        return this.base;
    }

    public void setBase (double base){
        this.base = base;
    }

    public double getAltura (){
        return this.altura;
    }

    public void setAltura (double altura){
        this.altura = altura;
    }

    public void area (){
        double area = base*altura;
        System.out.println("A area do retangulo é: " + area);

    }
    public void perimetro (){
        Double perimetro = base+altura+base+altura;
        System.out.println("O perimetro do retangulo é: " + perimetro);
    }

    public void imprimir (){
        System.out.println("A base do retangulo é: " + base);
        System.out.println("A altura do retangulo é: " + altura);
        perimetro();
        area();
    }
}
