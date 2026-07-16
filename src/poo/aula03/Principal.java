package poo.aula03;

public class Principal {
    public static void main(String[] args) {
        Cachorro duque = new Cachorro();
        duque.latir();
        duque.comer("ração");
        duque.beberAgua();
        duque.dormir();

        Galinha monica = new Galinha();
        monica.ciscar();
        monica.comer("milho");
        monica.beberAgua();
        monica.dormir();
    }
}
