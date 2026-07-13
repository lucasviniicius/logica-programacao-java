package aula12;

import java.util.TreeMap;

public class ColecaoTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Double> notasAluno = new TreeMap<>();

        notasAluno.put("Lucas", 10.0);
        notasAluno.put("Vinicius", 9.8);
        notasAluno.put("Silva", 9.5);

        for(String nome : notasAluno.keySet()){
            double notas = notasAluno.get(nome);
            System.out.println("Nome: " + nome + " | " + "Nota: " + notas);
        }
    }
}
