import java.util.Scanner;

public class Snack2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci la prima parola: ");
        String parola1 = scan.nextLine();

        System.out.print("Inserisci la seconda parola: ");
        String parola2 = scan.nextLine();

        if (parola1.length() < parola2.length()) {
            System.out.println(parola1 + " " + parola2);
        } else if (parola2.length() < parola1.length()) {
            System.out.println(parola2 + " " + parola1);
        } else {
            System.out.println("Le parole hanno la stessa lunghezza: " + parola1 + " " + parola2);
        }
    }
}
