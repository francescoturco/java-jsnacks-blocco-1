import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] invitati = {"Paolo", "Amilcare", "Giacobbe", "Luciano", "Pippo"};

        System.out.print("Inserisci il tuo nome: ");
        String nomeUtente = scan.nextLine();

        boolean trovato = false;

        for (String nome : invitati) {
            if (nome.equalsIgnoreCase(nomeUtente)) {
                trovato = true;
                break;
            }
        }

        if (trovato) {
            System.out.println("Sei in lista. entra!");
        } else {
            System.out.println("Mi dispiace, non sei sulla lista.");
        }
    }
}