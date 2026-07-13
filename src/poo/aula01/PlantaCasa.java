package poo.aula01;

public class PlantaCasa {
    int metragem;
    int numQuartos;
    int numBanheiros;
    String cor;
    String material;

    public void construir(){
        System.out.println("Metragem: " + metragem);
        System.out.println("Número de quartos: " + numQuartos);
        System.out.println("Número de banheiros: " + numBanheiros);
        System.out.println("Material: " + material);
    }

    public void pintar(){
        System.out.println("Cor: " + cor);
    }
}
