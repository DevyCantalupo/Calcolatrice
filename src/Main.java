public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci 1 se vuoi lavorare con una coppia di numeri , 2 se vuoi lavorare con una lista di numeri ");
        while (!scan.hasNextInt()) {
            System.out.println("Inserisci un valore valido (intero):");
            scan.next();
        }
        int option = scan.nextInt();
        int[] validOption = {1, 2};
        boolean isValidOption = false;
        for (int i = 0; i < validOption.length; i++) {
            if (option == validOption[i]) {
                isValidOption = true;
                break;

            }
        }
        if (isValidOption) {

            switch (option) {
                case 1:
                    prova();
                    break;
                case 2:
                    prova2();
                    break;
            }
        } else {
            System.out.println("opzione non valida");
        }

    }
}
