package aula07;

public class Condicionais {
    public static void main(String[] args) {
        int idade = 30;

        if(idade >= 18){
            System.out.println("Maior de idade!");
        } else {
            System.out.println("Menor de idade!");
        }

        String mensagem = (idade >= 18) ? "Maior de idade!" : "Menor de idade!";
        System.out.println(mensagem);

        int diaSemana = 4;

        switch(diaSemana){
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            default:
                System.out.println("Sexta-feira");
        }
    }
}
