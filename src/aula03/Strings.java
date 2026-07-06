package aula03;

public class Strings {
    public static void main(String[] args) {
        String nome = "Lucas";
        String sobrenome = "Vinicius";
        String nome2 = "Luiz";

        String nomeCompleto = nome.concat(sobrenome);
        int tamNome = nome.length();
        String nomeMaiusculo = nome.toUpperCase();
        String nomeMinusculo = nome.toLowerCase();
        boolean nomeIgual = nome.equals(nome2);

        System.out.println("Olá " + nome);
        System.out.println("Nome completo: " + nomeCompleto);
        System.out.println("Tamanho do nome 1: " + tamNome);
        System.out.println("Nome maiusculo: " + nomeMaiusculo);
        System.out.println("Nome minusculo: " + nomeMinusculo);
        System.out.println("Nome 1 e 2 é igual: " + nomeIgual);
    }
}
