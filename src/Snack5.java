import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.print("Inserisci un numero: ");
            int numero = scan.nextInt();

            if (numero % 2 != 0) {
                System.out.println("Il numero " + numero + " è dispari.");
            }
        }
    }
}
