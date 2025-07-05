public class Snack7 {
    public static void main(String[] args) {
        int potenza = 1;

        while (potenza <= 1000) {
            System.out.println(potenza);
            potenza *= 2;
        }
    }
}


// 1000 non viene stampato perchè la potenza successiva a 512 è 1024 e quindi supera il valore 1000