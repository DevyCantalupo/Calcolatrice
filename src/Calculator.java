
import java.util.Scanner;

public class Calculator {
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

    public static void prova() {
        System.out.println("inserisci un operatore algebrico. Inserisci '?' per vedere se il numero è pari o dispari.");
        Scanner scan = new Scanner(System.in);
        char operator = scan.next().charAt(0);

        char[] validOperators = {'+', '-', '*', '/', '^', '?'};
        boolean isValidOperator = false;
        for (char validOperator : validOperators) {
            if (operator == validOperator) {
                isValidOperator = true;
                break;
            }
        }
        if (isValidOperator) {
            operator(operator);
        } else {
            System.out.println("Errore: Inserito un operatore non valido.");
        }
    }

    public static void operator(char operator) {
        int secondNumber = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci il  primo numero (o base per la potenza )");
        int firstNumber = scanner.nextInt();
        if (operator != '?') {
            System.out.println("inserisci il  seconda  numero (o di quanto elevare la base )");
            secondNumber = scanner.nextInt();
        }

        scanner.close();
        switch (operator) {
            case '+':
                System.out.println("il risultato è : " + addition(firstNumber, secondNumber));
                break;
            case '-':
                System.out.println("il risultato è : " + subtraction(firstNumber, secondNumber));
                break;
            case '*':
                System.out.println("il risultato è : " + multiplication(firstNumber, secondNumber));
                break;
            case '/':
                System.out.println("il risultato è : " + division(firstNumber, secondNumber));
                break;
            case '^':
                System.out.println("il risultato è : " + power(firstNumber, secondNumber));
                break;
            case '?':
                System.out.println("Il numero è " + evenOrOdd(firstNumber));
                break;
            default:
                System.out.println("input non valido");
        }
    }


    static int subtraction(int a, int b) {
        return a - b;
    }

    static int addition(int a, int b) {
        return a + b;
    }

    static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static String evenOrOdd(int a) {
        String result;
        if (a % 2 == 0) {
            result = "pari";
        } else {
            result = "dispari";
        }
        return result;
    }

    public static double division(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            System.out.println("Errore: Divisione per zero non consentita.");
            return 0; // Gestione dell'errore, potresti scegliere un valore diverso.
        }
        return (double) firstNumber / secondNumber;
    }


    public static void prova2() {
        System.out.println("inserisci la grandezza della lista");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Inserisci un valore valido (intero):");
            scanner.next(); // Scarta l'input non valido
        }
        int size = scanner.nextInt();
        int[] lista = new int[size];
        System.out.println("inserisci i valori con cui vuoi lavorare");
        for (int i = 0; i < lista.length; i++) {
            while (!scanner.hasNextInt()) {
                System.out.println("Inserisci un valore valido (intero):");
                scanner.next();
            }
            lista[i] = scanner.nextInt();
        }

        System.out.println("inserisci un operatore algebrico.");
        Scanner scan = new Scanner(System.in);
        char operator = scan.next().charAt(0);
        scan.close();
        char[] validOperators = {'+', '-', '*', '/'};
        boolean isValidOperator = false;
        for (char validOperator : validOperators) {
            if (operator == validOperator) {
                isValidOperator = true;
                break;
            }
        }
        if (isValidOperator) {
            operator2(operator, lista);
        } else {
            System.out.println("Errore: Inserito un operatore non valido.");
        }
    }

    public static void operator2(char operator, int[] lista) {
        switch (operator) {
            case '+':
                System.out.println("il risultato è : " + addition2(lista));
                break;
            case '-':
                System.out.println("il risultato è : " + subtraction2(lista));
                break;
            case '*':
                System.out.println("il risultato è : " + multiplication2(lista));
                break;
            case '/':
                System.out.println("il risultato è : " + division2(lista));
                break;
            default:
                System.out.println("input non valido");
        }
    }

    static int subtraction2(int[] lista) {
        int risultato = lista[0];
        for (int i = 1; i < lista.length; i++) {
            risultato -= lista[i];
        }
        return risultato;
    }

    static int addition2(int[] lista) {
        int risultato = 0;
        for (int i = 0; i < lista.length; i++) {
            risultato += lista[i];
        }

        return risultato;
    }

    public static int multiplication2(int[] lista) {
        int risultato = 1;
        for (int i = 0; i < lista.length; i++) {
            risultato *= lista[i];
        }
        return risultato;
    }

    public static double division2(int[] lista) {
        double risultato = lista[0];

        for (int i = 1; i < lista.length; i++) {
            if (risultato == 0 || lista[i] == 0) {
                System.out.println("Errore: Divisione per zero non consentita.");
                return 0;
            } else {
                risultato /= lista[i];
            }
        }
        return risultato;
    }

}




