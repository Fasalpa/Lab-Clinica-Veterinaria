public class Gato extends Animal implements Vacunable, Asegurable{

    private boolean esEsterilizado;

    public Gato(String nombre, int edad, String nombreTitular, boolean esEsterilizado) {
        super(nombre, edad, nombreTitular);
        this.esEsterilizado = esEsterilizado;
    }

    public boolean isEsEsterilizado() {
        return esEsterilizado;
    }

    public void setEsEsterilizado(boolean esEsterilizado) {
        this.esEsterilizado = esEsterilizado;
    }

    public double calcularCostoConsulta(){
        return 38000;
    }

    @Override
    public String fichaPresentacion() {
        String data = super.fichaPresentacion();
        return data + " - El costo de la consulta es: $" + calcularCostoConsulta();
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
        if (esEsterilizado){
            return 120000;
        }else {
            return 200000;
        }
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "";
    }
}
