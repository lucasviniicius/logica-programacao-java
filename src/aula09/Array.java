package aula09;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeros[] = {10, 20, 30, 40, 50};
        double salarios[] = new double[5];

        for(int i = 0; i < 5; i++){
            System.out.println("Número: " + numeros[i]);
        }

        for(int i = 0; i < salarios.length; i++){
            System.out.printf("Digite o salário da pessoa %d: ", i);
            salarios[i] = scanner.nextDouble();
        }

        for(double salario : salarios){
            System.out.println(salario);
        }
    }
}
