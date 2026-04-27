
public class Main {
    public static void main(String[] args) {

        Animal perro1 = new Perro("Max", 5, "Carlos Guzman", "Labrador");
        Animal gato1 = new Gato("Tokio", 3, "Alexandra", false);
        Animal ave1 = new Ave("Kiko", 15, "Fabián Salamanca", 56);


        System.out.println(perro1.fichaPresentacion());
        System.out.println(gato1.fichaPresentacion());
        System.out.println(ave1.fichaPresentacion());

        ((Perro) perro1).registrarVacuna("Parvo");
        ((Perro) perro1).registrarVacuna("Rabia");
        ((Gato) gato1).registrarVacuna("Rabia");
        ((Gato) gato1).registrarVacuna("Triple Felina");

        System.out.println("Vacunas " + perro1.getNombre() + ": " + ((Perro) perro1).getVacunasAplicadas());
        System.out.println("Vacunas " + gato1.getNombre() + ": " + ((Perro) perro1).getVacunasAplicadas());

    }
}
