package aula10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Coleção {
    public static void main(String[] args) {
        List<String> listaDeCompras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 4; i++){
            System.out.printf("Digite o item %d da lista de compras: ", i + 1);
            listaDeCompras.add(scanner.nextLine());
        }

        listaDeCompras.add(2, "Purê");

        String item2 = listaDeCompras.get(2);
        System.out.println(item2);

        boolean eVazia = listaDeCompras.isEmpty();
        int tam = listaDeCompras.size();
        boolean contem = listaDeCompras.contains("Arroz");

        System.out.println("A lista de compras está vazia: " + eVazia);
        System.out.println("Qual o tamanho da lista de compras: " + tam);
        System.out.println("Contém arroz na lista de compras: " + contem);

        for(String item : listaDeCompras) {
            System.out.println(item);
        }
    }
}
