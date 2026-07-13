package poo.aula01;

public class Casa {
    public static void main(String[] args) {
        PlantaCasa casa = new PlantaCasa();

        casa.numBanheiros = 4;
        casa.numQuartos = 2;
        casa.material = "Tijolo";
        casa.metragem = 70;
        casa.cor = "Cinza";

        casa.construir();
        casa.pintar();
    }
}
