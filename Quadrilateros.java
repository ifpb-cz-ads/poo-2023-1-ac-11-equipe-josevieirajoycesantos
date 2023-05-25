package QuestoesAnexas.Questao02;

public abstract class Quadrilateros implements FormaGeometrica{
    Double lado1;
    Double lado2;
    Double lado3;
    Double lado4;

    Quadrilateros (double lado1, double lado2, double lado3, double lado4){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }

    public double getLado1 (){
        return this.lado1;
    }

    public void setLado1 (double lado1){
        this.lado1 = lado1;
    }

    public double getLado2 (){
        return this.lado2;
    }

    public void setLado2 (double lado2){
        this.lado2 = lado2;
    }

    public double getLado3 (){
        return this.lado3;
    }

    public void setLado3 (double lado3){
        this.lado3 = lado3;
    }

    public double getLado4 (){
        return this.lado4;
    }

    public void setLado4 (double lado4){
        this.lado4 = lado4;
    }

    public void area (){
    }
    public void perimetro (){
        Double perimetro = lado1+lado2+lado3+lado4;
        System.out.println("O perimetro do quadrilatero é: " + perimetro);
    }

}
