package para;

import java.util.Scanner;

public class exemplo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // O programa ira perguntar o nome e idade 5x
        for (int c = 1; c <= 5; c++){
            System.out.println("Nome: " + c +": ");
            String nome = scanner.next();

            System.out.println("Idade: ");
            int idade = scanner.nextInt();
        }
    }
}
