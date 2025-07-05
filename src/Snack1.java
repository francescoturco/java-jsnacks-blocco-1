import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        int numero1 = scan.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        int numero2 = scan.nextInt();

        if (numero1 > numero2) {
            System.out.println("Il numero maggiore è: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("Il numero maggiore è: " + numero2);
        } else {
            System.out.println("I due numeri sono uguali.");
        }
    }
}
