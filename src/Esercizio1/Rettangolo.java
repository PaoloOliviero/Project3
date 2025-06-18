package Esercizio1;

public class Rettangolo {
    private double altezza;
    private double larghezza;

    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public double calcolaArea() {
        return altezza * larghezza;
    }

    public double calcolaPerimetro() {
        return 2 * (altezza + larghezza);
    }

    public void stampaInfo() {
        System.out.println("Altezza: " + altezza);
        System.out.println("Larghezza: " + larghezza);
        System.out.println("Area: " + calcolaArea());
        System.out.println("Perimetro: " + calcolaPerimetro());
    }
}
