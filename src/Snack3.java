import java.util.Scanner;

public class Snack3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int somma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Inserisci un numero: ");
            int numero = scan.nextInt();
            somma += numero;
        }

        System.out.println("La somma totale è: " + somma);
    }
}
