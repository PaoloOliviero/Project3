package Esercizio1;

public class Main {

    public static void stampaRettangolo(Rettangolo r) {
        System.out.println("Area: " + r.calcolaArea());
        System.out.println("Perimetro: " + r.calcolaPerimetro());
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Primo rettangolo:");
        stampaRettangolo(r1);

        System.out.println("\nSecondo rettangolo:");
        stampaRettangolo(r2);

        double sommaAree = r1.calcolaArea() + r2.calcolaArea();
        double sommaPerimetri = r1.calcolaPerimetro() + r2.calcolaPerimetro();

        System.out.println("\nSomma delle aree: " + sommaAree);
        System.out.println("Somma dei perimetri: " + sommaPerimetri);
    }

    public static void main(String[] args) {
        Rettangolo rett1 = new Rettangolo(4.0, 6.0);
        Rettangolo rett2 = new Rettangolo(3.0, 8.0);

        stampaDueRettangoli(rett1, rett2);
    }
}