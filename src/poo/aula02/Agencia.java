package poo.aula02;

public class Agencia {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("Lucas", 0);

        minhaConta.setTitular("Lucas Vinícius");
        minhaConta.setSaldo(minhaConta.getSaldo() + 1000.0);

        String titularConta = minhaConta.getTitular();
        double saldoConta = minhaConta.getSaldo();

        System.out.println("Titular: " + titularConta);
        System.out.println("Saldo: " + saldoConta);
    }
}
