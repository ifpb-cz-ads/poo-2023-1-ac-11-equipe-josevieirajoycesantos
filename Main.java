package QuestoesAnexas.Questao01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Object> lista = new ArrayList<>();

        Edificio predio = new Edificio(50, 100, 100.0);
        Bicicleta bicicleta = new Bicicleta(10.5);
        Carro carro = new Carro(5, "Pequeno a gasolina", 50.0);

        lista.add(bicicleta);
        lista.add(carro);
        lista.add(predio);

        Object objeto1 = lista.get(0);
        if (objeto1 instanceof Bicicleta) {
            Bicicleta bike = (Bicicleta) objeto1;
            bike.PegadaDeCarbono();
        }

        Object objeto2 = lista.get(1);
        if (objeto2 instanceof Carro) {
            Carro car = (Carro) objeto2;
            car.PegadaDeCarbono();
        }

        Object objeto3 = lista.get(2);
        if (objeto3 instanceof Edificio) {
            Edificio predioo = (Edificio) objeto3;
            predioo.PegadaDeCarbono();
        }
}
}
