package ar.com.lautaro.clases;

public class Autos implements Comparable {

    // Campos
    private int numeroChasis;
    private String patente;

    // Constructor vacio
    public Autos() {
    }
    // Constructor

    public Autos(int numeroChasis, String patente) {
        this.numeroChasis = numeroChasis;
        this.patente = patente;
    }

    // getter y setter
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
        sb.append("Autos{");
        sb.append("Número de Chasis = ").append(numeroChasis);
        sb.append(", Patente= ").append(patente);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Object o) {

        Autos auto = (Autos) o;
        return this.getNumeroChasis() - auto.getNumeroChasis();
    }

}
