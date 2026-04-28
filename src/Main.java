
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

        Clinica clinica = new Clinica("Del socorro", "cll me la invento sur 36");

        Asegurable asegurable1 = (Perro) perro1;
        Asegurable asegurable2 = (Gato) gato1;

        System.out.println("Número de póliza: " + clinica.obtenerNumeroPoliza() + " Costo Anual prima de seguro: $" + clinica.calcularPrimaSeguro());
        System.out.println("Número de póliza: " + asegurable1.obtenerNumeroPoliza() + " Costo Anual prima de seguro: $" + asegurable1.calcularPrimaSeguro());
        System.out.println("Número de póliza: " + asegurable2.obtenerNumeroPoliza() + " Costo Anual prima de seguro: $" + asegurable2.calcularPrimaSeguro());

        Animal conejo1 = new Conejo("bigotes", 3, "Juan Rubiano");
        System.out.println(conejo1.fichaPresentacion()); //Solo se cambiaron 2 líneas.

        Animal[] animales = {
                new Perro("Max", 5, "Carlos Guzman", "Labrador"),
                new Gato("Tokio", 3, "Alexandra", false),
                new Ave("Kiko", 15, "Fabian Salamanca", 56)
        };

        for (Animal mascota : animales) {
            System.out.println(mascota.fichaPresentacion());
        }

        Asegurable[] asegurables = {(Perro) perro1, (Gato) gato1, clinica};

        for(Asegurable datos : asegurables) {
            System.out.println("Número de póliza: " + datos.obtenerNumeroPoliza() + " Costo Anual prima de seguro: $" + datos.calcularPrimaSeguro());

        }
    }
}
