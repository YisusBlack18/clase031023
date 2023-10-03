class Figura {
    public double calcularArea() {
        return 0.0;
    }

    public double calcularArea(double base, double altura) {
        return base * altura;
    }
}

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}

public class App {
    public static void main(String[] args) {
        Figura figura = new Figura();

        System.out.println("Área de la figura: " + figura.calcularArea());

        Circulo circulo = new Circulo(5.0);

        System.out.println("Área del círculo: " + circulo.calcularArea());
    }
}
