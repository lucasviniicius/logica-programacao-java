package poo.aula01;

public class PlantaCasa implements Construcao{
    public double comprimento;
    public double largura;
    public int numQuartos;
    public int numBanheiros;
    public String cor;
    public String material;

    public double metrosQuadrados(double comprimento, double largura){
        return comprimento * largura;
    }

    public void construir(){
        System.out.println("Número de quartos: " + numQuartos);
        System.out.println("Número de banheiros: " + numBanheiros);
        System.out.println("Material: " + material);
    }

    @Override
    public double custoMetro(double custoPorMetro) {
        return (comprimento * largura) * custoPorMetro;
    }

    public void pintar(){
        System.out.println("Cor: " + cor);
    }
}
