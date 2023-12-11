package Problema2;

public class Vehicul {
    private String marca;
    private float pret;

    public Vehicul() {
    }

    public Vehicul(String marca, float pret) {
        this.marca = marca;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Marca='" + marca + '\'' +
                ", Pret=" + pret;
    }

    public String getMarca() {
        return marca;
    }

    public float getPret() {
        return pret;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }
}
