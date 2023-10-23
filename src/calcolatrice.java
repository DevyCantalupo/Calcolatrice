import java.util.Scanner;

public class calcolatrice {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci un operatore algebrico. Inserisci '?' per vedere se il numero è pari o dispari.");
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
            scan.close();
    }

    public static void operator(char operator){
        int secondNumber = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero");
        int firstNumber = scanner.nextInt();
        if (operator != '?'){
            System.out.println("inserisci il  seconda  numero (o di quanto elevare la base )");
            secondNumber = scanner.nextInt();
        }

        scanner.close();
        switch(operator){
            case '+': System.out.println(addition(firstNumber,secondNumber));
                break;
            case '-': System.out.println(subtraction(firstNumber,secondNumber));
                break;
            case '*': System.out.println(multiplication(firstNumber,secondNumber));
                break;
            case '/': System.out.println(division(firstNumber,secondNumber));
                break;
            case '^': System.out.println(power(firstNumber,secondNumber));
                break;
            case '?': System.out.println("Il numero è " +evenOrOdd(firstNumber));
                break;
            default: System.out.println("input non valido");
        }
    }
    static int subtraction(int a, int b){
        return a - b;
    }
    static int addition (int a, int b){
        return a + b;
    }
    static int power (int a, int b){
        return (int)Math.pow(a,b);
    }

    public static int multiplication(int a, int b){ return a * b;}

    public static String evenOrOdd(int a){
        String result;
        if(a%2 == 0){
            result = "pari";
        }
        else {
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
    
}
