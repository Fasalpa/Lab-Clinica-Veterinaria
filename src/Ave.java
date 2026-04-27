public class Ave extends Animal {

    private double pesoGramos;

    public Ave(String nombre, int edad, String nombreTitular, double pesoGramos) {
        super(nombre, edad, nombreTitular);
        this.pesoGramos = pesoGramos;
    }

    public double getPesoGramos() {
        return pesoGramos;
    }

    public void setPesoGramos(double pesoGramos) {
        this.pesoGramos = pesoGramos;
    }

    public double calcularCostoConsulta(){
        return 28000 + (getPesoGramos() * 500);
    }

    @Override
    public String fichaPresentacion() {
        String data = super.fichaPresentacion();
        return data + ".";
    }

}
