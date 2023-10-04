package enquanto;

import java.util.Scanner;
import java.util.SortedMap;

public class exemplo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        System.out.println("Nome: ");
        String nome = scanner.next();
        int c;

        for (c = 1; c <= 4; c++){
            System.out.println("Nota " + c + ": ");
            double nota = scanner.nextDouble();
            while (nota < 0 || nota >10){

            }
        }
    }
}
