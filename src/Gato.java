import java.util.ArrayList;

public class Gato extends Animal implements Vacunable, Asegurable {

    private boolean esEsterilizado;
    private ArrayList<String> vacunas = new ArrayList<>();

    public Gato(String nombre, int edad, String nombreTitular, boolean esEsterilizado) {
        super(nombre, edad, nombreTitular);
        this.esEsterilizado = esEsterilizado;
        this.vacunas = vacunas;
    }

    public boolean isEsEsterilizado() {
        return esEsterilizado;
    }

    public void setEsEsterilizado(boolean esEsterilizado) {
        this.esEsterilizado = esEsterilizado;
    }

    public double calcularCostoConsulta() {
        return 38000;
    }

    @Override
    public String fichaPresentacion() {
        String data = super.fichaPresentacion();
        return data + ".";
    }

    @Override
    public void registrarVacuna(String nombre) {
        vacunas.add(nombre);
    }

    @Override
    public int getVacunasAplicadas() {
        return vacunas.size();
    }

    @Override
    public double calcularPrimaSeguro() {
        if (esEsterilizado) {
            return 120000;
        } else {
            return 200000;
        }
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-CLINICA-" + getNombre();
    }
}
