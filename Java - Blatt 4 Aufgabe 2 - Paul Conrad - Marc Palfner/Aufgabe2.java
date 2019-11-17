import java.util.Scanner;

/**
 * Blatt 4 Aufgabe 1: Paul Conrad 358940, Marc Palfner 359899 
 */
//<<Haubtprogramm Aufgabe2 mit sacnner in Datei Aufgabe2.java>>
public class Aufgabe2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //<<Deklariere Variable "zahl" Type int>>
        int zahl;
        //<<Schreibe "Bitte nenne eine (ganze) Zahl!" auf die Konsole>>
        System.out.println("Bitte nenne eine (ganze) Zahl!");
        //<<Variable "zahl" wird auf eingegebenen Wert gesetzt>>
        zahl = scanner.nextInt();
        //<<Prüfung ob die Variable "zahl" glatt durch 17 Teilbar ist>>
        switch (zahl % 17) {
            //<<Fals Variable "zahl" glatt durch 17 teilbar ist, schreibe auf die Konsole
            //"Die eingegebene Zahl " +zahl
            // +" geteilt durch 11 ergiebt " +(double)(zahl / 11)>>
            case 0:
                System.out.println("Die eingegebene Zahl " +zahl
                        +" geteilt durch 11 ergiebt " +(double)(zahl / 11));
                break;
            //<<Fals Variable "zahl" nicht glatt durch 17 teilbar ist,
            //schreibe auf die Konsole
            //"Die eingegebene Zahl " +zahl +" modulo 5 ergiebt " +(zahl % 5) +".">>
            default:
                System.out.println("Die eingegebene Zahl " +zahl
                        +" modulo 5 ergiebt " +(zahl % 5) +".");
                break;
        }
    }
}