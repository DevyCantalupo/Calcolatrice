import java.util.Scanner;

public class calcolatrice {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci un operatore algebrico");
        char operator =scan.next().charAt(0);

        char[] validOperators = {'+', '-', '*', '/', '^'};


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

    public static void operator(char operator){
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci il  primo numero (o base per la potenza )");
        int firstNumber = scanner.nextInt();
        System.out.println("inserisci il  seconda  numero (o di quanto elevare la base )");
        int secondNumber = scanner.nextInt();
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
            default: System.out.println("input non valido");
        }
    }
    static int addition (int a, int b){
        return a + b;
    }
    static int power (int a, int b){
        return (int)Math.pow(a,b);
    }
}
