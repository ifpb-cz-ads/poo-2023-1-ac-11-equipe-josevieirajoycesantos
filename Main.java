package QuestoesAnexas.Questao02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Object> lista = new ArrayList<>();

        Quadrado quadrado = new Quadrado(2);
        Retangulo retangulo = new Retangulo(3, 2);
        Circulo circulo = new Circulo(2.0);

        lista.add(quadrado);
        lista.add(retangulo);
        lista.add(circulo);

        Object objeto1 = lista.get(0);
        if (objeto1 instanceof Quadrado) {
            Quadrado square = (Quadrado) objeto1;
            square.imprimir();
        }

        Object objeto2 = lista.get(1);
        if (objeto2 instanceof Retangulo) {
            Retangulo rectangle = (Retangulo) objeto2;
            rectangle.imprimir();
        }

        Object objeto3 = lista.get(2);
        if (objeto3 instanceof Circulo) {
            Circulo circle = (Circulo) objeto3;
            circle.imprimir();
        }
    }
}
