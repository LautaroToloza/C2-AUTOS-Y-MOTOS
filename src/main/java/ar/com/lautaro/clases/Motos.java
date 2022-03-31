package ar.com.lautaro.clases;

public class Motos implements Comparable {

    // Campos
    private int numeroChasis;
    private String patente;

    // Constructor vacio
    public Motos() {
    }

    // Constructor
    public Motos(int numeroChasis, String patente) {
        this.numeroChasis = numeroChasis;
        this.patente = patente;
    }

    // Getter y Setter
    public int getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(int numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Motos{");
        sb.append("Número de Chasis= ").append(numeroChasis);
        sb.append(", Patente= ").append(patente);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Object o) {
        Motos moto = (Motos) o;
        return this.getNumeroChasis() - moto.getNumeroChasis();
    }

}
