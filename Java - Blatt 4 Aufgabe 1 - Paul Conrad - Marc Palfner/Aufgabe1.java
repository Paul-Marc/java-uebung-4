//Blatt 4 Aufgabe 1: Paul Conrad 358940, Marc Palfner 359899 


/* Aufgabe 1 b: Wie löse ich das Problem wenn 5, 10 oder mehr Zahlen eingegeben 
 * werden?
 * 
 * Antwort: Die Nutzung von If-Anweisungen wird bei zu vielen Werten zu 
 * umständlich und fehleranfällig. Eine Alternative wäre die Nutzung von 
 * Schleifen. So besteht sogar die Möglichkeit, vorher den Nutzer zu fragen, 
 * wie viele Zahlen eingelesen werden sollen. Dann kann beispielsweise eine 
 * For- oder While-Schleife bei jedem Durchlauf eine Zahl vom Nutzer einlesen
 * und anschließend einen abgleich machen, ob die neue eingegeben Zahl kleiner
 * als die aktuell kleinste Zahl ist. Nachdem die Schleife x-mal durchgelaufen 
 * ist und die Schleifen-Bedingung erfüllt wurde, wird die kleinste Zahl 
 * ausgegeben.
 *
*/



//<<Hauptprogramm Aufgabe1 mit Scanner in Datei Aufgabe1.java>>
import java.util.Scanner;
public class Aufgabe1 {

    public static void main(String[] args) {
    
        //Eingabe
        Scanner scanner = new Scanner(System.in);
        //Einlesen Zahl Nr.1
        System.out.println("Gib Zahl Nr.1 ein:");
        int a = scanner.nextInt();
        //Einlesen Zahl Nr.2
        System.out.println("Gib Zahl Nr.2 ein:");
        int b = scanner.nextInt();
        //Einlesen Zahl Nr.3
        System.out.println("Gib Zahl Nr.3 ein:");
        int c = scanner.nextInt();
    
    
        //Verarbeitung
        int kleinsteZahl = 0;
    
        if (a <= b && a < c) {
            kleinsteZahl = a;
        } else if (b < a && b <= c) {
            kleinsteZahl = b;
        } else if (c <= a && c < b) {
            kleinsteZahl = c;
        }
    
    
        //Ausgabe
        System.out.println("Kleinste Zahl: " + kleinsteZahl);
       
    
    }

}