import java.util.Scanner;

public class Snack6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int numero = scan.nextInt();

        int cubo = numero * numero * numero;

        System.out.println("Il cubo di " + numero + " è: " + cubo);
    }
}
