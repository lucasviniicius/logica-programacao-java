package aula02;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        double pao = 12.50;
        double acucar = 2.00;
        double manteiga = 7.50;
        double desconto = 5.00;
        int qtdDias = 30;

        double valorTotal = pao + acucar + manteiga;
        double valorTotalDesconto = valorTotal - desconto;
        double valorTotalDividido = valorTotalDesconto / 2;
        double valorTotalMensal = valorTotalDesconto * qtdDias;

        System.out.println("Valor total = R$" + valorTotal);
        System.out.println("Valor com desconto = R$" + valorTotalDesconto);
        System.out.println("Valor total dividido = R$" + valorTotalDividido);
        System.out.println("Valor total mensal = R$" + valorTotalMensal);
    }
}
