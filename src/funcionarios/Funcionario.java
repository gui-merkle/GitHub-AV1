package funcionarios;

import java.util.Scanner;

public class Funcionario {
    private String nome;
    private double salarioBruto;
    private double imposto;

    public Funcionario(String nome, double salarioBruto, double imposto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
    }

    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public void aumentarSalario(double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100;
    }

    public String toString() {
        return "Funcionário: " + nome + ", $ " + String.format("%.2f", salarioLiquido());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Salário bruto: ");
        double salarioBruto = scanner.nextDouble();
        System.out.print("Imposto: ");
        double imposto = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(nome, salarioBruto, imposto);
        
        System.out.println(funcionario);
        
        System.out.print("Qual a porcentagem para aumentar o salário? ");
        double porcentagem = scanner.nextDouble();
        
        funcionario.aumentarSalario(porcentagem);
        System.out.println("Dados atualizados: " + funcionario);
        
        scanner.close();
    }
}
