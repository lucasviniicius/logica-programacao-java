package aula11;

import java.util.HashMap;

public class ColecaoHashMap {
    public static void main(String[] args) {
        HashMap<String, Double> notasAlunos = new HashMap<>();

        notasAlunos.put("Lucas", 10.0);
        notasAlunos.put("Vinicius", 9.8);
        notasAlunos.put("Silva", 9.5);

        for(String nome : notasAlunos.keySet()){
            double notas = notasAlunos.get(nome);
            System.out.println("Aluno: " + nome + " | " + "Nota: " + notas);
        }

        int tam = notasAlunos.size();

        System.out.println(tam);
    }
}
