class Animal {
    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("*El animal hace un sonido*");
    }
}

class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    public void ladrido() {
        System.out.println("Guau!");
    }
}

public class App {
    public static void main(String[] args) {
        Animal animal = new Animal("Itachi");

        System.out.println("Nombre del animal: " + animal.nombre);

        animal.hacerSonido();

        Perro perro = new Perro("Scooby");

        System.out.println("Nombre del perro: " + perro.nombre);

        perro.hacerSonido();

        perro.ladrido();
    }
}
