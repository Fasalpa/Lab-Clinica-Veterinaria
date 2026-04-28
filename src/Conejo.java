public class Conejo extends Animal{

    public Conejo(String nombre, int edad, String nombreTitular) {
        super(nombre, edad, nombreTitular);
    }

    @Override
    public double calcularCostoConsulta() {
        return 35000;
    }


}
