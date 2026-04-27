public class Perro extends Animal implements Vacunable, Asegurable {

    private String raza;

    public Perro(String nombre, int edad, String nombreTitular, String raza) {
        super(nombre, edad, nombreTitular);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String fichaPresentacion() {
        String data = super.fichaPresentacion();
        return data + " - El costo de la consulta es: $" + calcularCostoConsulta();
    }

    public double calcularCostoConsulta() {
        return 45000 + (getEdad() * 3000);
    }

    @Override
    public void registrarVacuna(String nombre) {

    }

    @Override
    public int getVacunasAplicadas() {
        return 0;
    }

    @Override
    public double calcularPrimaSeguro() {
        return 80000 * getEdad();
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "";
    }
}
