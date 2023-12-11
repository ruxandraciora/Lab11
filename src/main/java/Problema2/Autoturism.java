package Problema2;

public class Autoturism extends Vehicul{
    private float volum;
    private float kg;

    public Autoturism() {
    }

    public Autoturism(String marca, float pret, float volum, float kg) {
        super(marca, pret);
        this.volum = volum;
        this.kg = kg;
    }

    @Override
    public String toString() {
        return super.toString() + ", Volum=" + volum +
                ", Kg=" + kg;
    }

    public float getVolum() {
        return volum;
    }

    public void setVolum(float volum) {
        this.volum = volum;
    }

    public float getKg() {
        return kg;
    }

    public void setKg(float kg) {
        this.kg = kg;
    }
}
