import java.util.Scanner;

public class Snack8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci un numero di 4 cifre: ");
        String numero = scan.nextLine();

        if (numero.length() != 4) {
            System.out.println("Errore: devi inserire esattamente 4 cifre numeriche.");
        } else {
            int somma = 0;
            for (int i = 0; i < numero.length(); i++) {
                somma += Character.getNumericValue(numero.charAt(i)); // character.getNumericValue trasforma il carattere in numero perchè l'utente inserisce il numero sottoforma di stringa.
            }
            System.out.println("La somma delle cifre è: " + somma);
        }
    }
}
