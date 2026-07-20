package poo.aula06;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Funcionarios lucas = new Funcionarios("Lucas");
        Funcionarios vinicius = new Funcionarios("Vinícius");
        Funcionarios silva = new Funcionarios("Silva");

        List<Funcionarios> listaDeFuncionarios = new ArrayList<Funcionarios>();
        listaDeFuncionarios.add(lucas);
        listaDeFuncionarios.add(vinicius);
        listaDeFuncionarios.add(silva);

        Departamento ti = new Departamento("TI", listaDeFuncionarios);
        ti.mostrarFuncionarios();


    }
}
