package Problema2;

public class Motocicleta extends Vehicul{
    private int viteza_max;

    public Motocicleta() {
    }

    public Motocicleta(String marca, float pret, int viteza_max) {
        super(marca, pret);
        this.viteza_max = viteza_max;
    }

    @Override
    public String toString() {
        return super.toString()  +
                ", Viteza_max=" + viteza_max;
    }

    public int getViteza_max() {
        return viteza_max;
    }

    public void setViteza_max(int viteza_max) {
        this.viteza_max = viteza_max;
    }
}
