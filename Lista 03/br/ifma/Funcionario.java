package br.ifma;

public class Funcionario {

    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario <= 0) {
            System.out.println("O salário não pode ter valores negativos.");
            return;
        }
            this.salario = salario;
        }

    public void aumentarSalario(double percentual) {
        if (percentual <= 0) {
            System.out.println("Percentual inválido.");
            return;
        }
        salario += salario * (percentual / 100);
    }

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João");
        funcionario.setSalario(1000.0);
        funcionario.aumentarSalario(50);

        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário: " + funcionario.getSalario());
    }
    }
    