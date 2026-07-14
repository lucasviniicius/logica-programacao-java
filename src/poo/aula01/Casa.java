package poo.aula01;

public class Casa {
    public static void main(String[] args) {
        PlantaCasa casa = new PlantaCasa();

        casa.numBanheiros = 4;
        casa.numQuartos = 2;
        casa.material = "Tijolo";
        casa.comprimento = 30.3;
        casa.largura = 15.5;
        casa.cor = "Cinza";

        double metragem = casa.metrosQuadrados(casa.comprimento, casa.largura);
        double somaComprimentoLargura = Util.somar(casa.comprimento, casa.largura);
        System.out.println("Soma do comprimento e largura: " + somaComprimentoLargura);
        System.out.println("Metragem: " + metragem);
        casa.construir();
        casa.pintar();
    }
}
