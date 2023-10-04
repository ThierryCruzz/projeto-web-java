package para;

import java.util.Scanner;

public class exemplo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        System.out.println("Nome: ");
        String nome = scanner.next();


        for (int c = 1; c <= 4; c++){
            System.out.println("Nota " + c + ": ");
            double nota = scanner.nextDouble();
            soma += nota;
//                soma = soma + nota
            System.out.println("Soma das notas: " + soma);
            double media = soma / c;

            System.out.println("Soma das notas: " + soma);
            double Media = soma / 4;
            System.out.println("a media do aluno: " +nome+ "foi"+media);

            if (media >= 7){
                System.out.println("Aluno aprovado");
            } else if (media >= 4){
                System.out.println("Aluno recuperação");
            } else {
                System.out.println("Aluno reprovado");
            }


        }

    }
}
