package Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Transportadora transportadora = new Transportadora();

        transportadora.cadastrarEntrega(new EntregaExpressa("101", "Maria", 2.0, 500.00));
        transportadora.cadastrarEntrega(new EntregaEconomica("102", "João", 5.0, "Interior"));
        transportadora.cadastrarEntrega(new EntregaAgendada("103", "Ana", 3.0, "10/11/2026"));
        transportadora.cadastrarEntrega(new EntregaEconomica("104", "Pedro", 1.0, "Capital"));
    
    System.out.println("=== LISTA DE ENTREGAS === ");
    transportadora.listar();

    System.out.printf("%nTotal de fretes: R$ %.2f\n", transportadora.totalDeFretes());

    Entrega maisCara = transportadora.entregaMaisCara();
    if (maisCara != null) {
        System.out.println("\n=== Entrega mais cara ===");
        maisCara.exibirResumo();
    }

    Entrega buscada = transportadora.buscarPorCodigo("103");
    if (buscada != null) {
        System.out.println("\n=== BUSCA PELO CÓDIGO 103 ===");
        buscada.exibirResumo();
    }
    }
 }