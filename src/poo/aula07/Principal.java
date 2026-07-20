package poo.aula07;

public class Principal {
    public static void main(String[] args) {
        Funcionario joao = new Funcionario("Rua da Soledade", 100, "Recife", "Pernambuco", "1234432", "Lucas", "1234554321");
        Cliente joana = new Cliente("Rua das Graças", 120, "Recife", "Pernambuco", "09877890", "Joana", "0987667890");

        System.out.println(joao);
        joao.mostrarEndereco();
        System.out.println(joana);
        joana.mostrarEndereco();
    }
}
