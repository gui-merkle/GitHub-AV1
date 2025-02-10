package cambio;

import java.util.Scanner;

public class CurrencyConverter {
    public static double converter(double cotacao, double dolares) {
        double valorEmReais = dolares * cotacao * 1.06;
        return valorEmReais;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Qual o valor do dólar? ");
        double cotacao = scanner.nextDouble();
        System.out.print("Quantos dólares serão comprados? ");
        double dolares = scanner.nextDouble();

        double valorReais = converter(cotacao, dolares);
        System.out.printf("Valor a ser pago em reais = %.2f%n", valorReais);
        
        scanner.close();
    }
}
