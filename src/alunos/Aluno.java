package alunos;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double notaFinal() {
        return nota1 * 0.3 + nota2 * 0.35 + nota3 * 0.35;
    }

    public String situacao() {
        double notaFinal = notaFinal();
        if (notaFinal >= 60) {
            return "APROVADO!!";
        } else {
            double pontosFaltando = 60 - notaFinal;
            return "REPROVADO\nFALTARAM " + String.format("%.2f", pontosFaltando) + " PONTOS";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Nota 3: ");
        double nota3 = scanner.nextDouble();

        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);
        
        System.out.printf("NOTA FINAL = %.2f%n", aluno.notaFinal());
        System.out.println(aluno.situacao());
        
        scanner.close();
    }
}
