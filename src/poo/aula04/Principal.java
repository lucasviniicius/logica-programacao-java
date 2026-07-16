package poo.aula04;

public class Principal {
    public static void main(String[] args) {
        int pao = 4;
        int arroz = 6;
        double macarao = 10.5;
        double feijao = 9.5;
        Integer sabao = 23;
        Integer escova = 7;
        Integer chiclete = 10;

        Calculadora calculadora = new Calculadora();

        int total = calculadora.somar(pao, arroz);
        double totalDouble = calculadora.somar(macarao, feijao);
        Integer totalInteger = calculadora.somar(sabao, escova, chiclete);

        System.out.println("Total: " + total);
        System.out.println("Total Double: " + totalDouble);
        System.out.println("Total Integer: " + totalInteger);

        Carro meuCarro = new Carro();

        meuCarro.mover();
    }
}
