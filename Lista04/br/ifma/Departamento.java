package br.ifma;
import java.util.List;
import java.util.ArrayList;

public class Departamento {

    private String nome;
    private List<Funcionario> funcionarios = new ArrayList<>();

    public void transferirFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public int getQuantidadeDeFuncionario() {
        return funcionarios.size();
    }
}
