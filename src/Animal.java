public abstract class Animal {

    private String nombre;
    private int edad;
    private String nombreTitular;

    public Animal(String nombre, int edad, String nombreTitular) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreTitular = nombreTitular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String fichaPresentacion() {
        return "El consultante - " + getNombre() + " de " + getEdad() + " años tiene como titular a: " + getNombreTitular() + " - costo de la cosulta: " + calcularCostoConsulta();
    }

    public abstract double calcularCostoConsulta();
}
