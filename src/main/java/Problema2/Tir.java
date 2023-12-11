package Problema2;

public class Tir extends Vehicul {
    private int inc_max;

    public Tir() {
    }

    public Tir(String marca, float pret, int inc_max) {
        super(marca, pret);
        this.inc_max = inc_max;
    }

    @Override
    public String toString() {
        return super.toString() + "Tir{" +
                "inc_max=" + inc_max +
                '}';
    }

    public int getInc_max() {
        return inc_max;
    }

    public void setInc_max(int inc_max) {
        this.inc_max = inc_max;
    }
}
