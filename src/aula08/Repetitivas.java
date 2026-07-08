package aula08;

public class Repetitivas {
    public static void main(String[] args) {
        int contador = 0;

        System.out.println("Contador While");

        while(contador < 5){
            System.out.println(contador);
            contador++;
        }

        System.out.println("Contador Do While");

        do {
            System.out.println(contador);
            contador++;
        } while(contador < 5);

        System.out.println("Contador For");

        for(int i = 0; i < 11; i++){
            System.out.println(i);
        }
    }
}
