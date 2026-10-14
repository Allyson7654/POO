import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Casa {
    private List<Dispositivo> dispositivos;
    private static Scanner scanner = new Scanner(System.in);

    public Casa() {
        this.dispositivos = new ArrayList<>();
    }


    public void cadastrar(Dispositivo d) {
        dispositivos.add(d);
        System.out.println(d.getNome() + " cadastrado com sucesso!");
    }

    public Dispositivo buscar(int indice) {
        if (indice >= 0 && indice < dispositivos.size()) {
            return dispositivos.get(indice);
        }
        return null;
    }

    public void listar() {
        System.out.println("\n--- Dispositivos na Casa ---");
        if (dispositivos.isEmpty()) {
            System.out.println("Nenhum dispositivo cadastrado.");
            return;
        }

        for (int i = 0; i < dispositivos.size(); i++) {
            Dispositivo d = dispositivos.get(i);
            String estado = "N/A";
            if (d instanceof Ligavel) {
                estado = ((Ligavel) d).isLigado() ? "Ligado" : "Desligado";
            }
            System.out.printf("[%d] %s (%s) - Estado: %s - Potência: %.1fW\n",
                    i, d.getNome(), d.getTipo(), estado, d.getPotenciaWatts());
        }
    }

    public double getConsumoAtual() {
        double consumo = 0;
        for (Dispositivo d : dispositivos) {
            if (d instanceof Ligavel && ((Ligavel) d).isLigado()) {
                consumo += d.getPotenciaWatts();
            }
        }
        return consumo;
    }

    public void listarConectados() {
        System.out.println("\n--- Dispositivos Conectados ao Wi-Fi ---");
        boolean encontrou = false;
        for (Dispositivo d : dispositivos) {
            if (d instanceof Conectavel && ((Conectavel) d).isConectado()) {
                System.out.println("- " + d.getNome() + " (" + d.getTipo() + ")");
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum dispositivo conectado à rede no momento.");
        }
    }

    public static void main(String[] args) {
        Casa minhaCasa = new Casa();
        int opcao = 0;

        do {
            System.out.println("\n========== AUTOMAÇÃO RESIDENCIAL ==========");
            System.out.println("1. Cadastrar dispositivo");
            System.out.println("2. Listar todos os dispositivos");
            System.out.println("3. Ligar/Desligar dispositivo");
            System.out.println("4. Agendar horário");
            System.out.println("5. Conectar ao Wi-Fi");
            System.out.println("6. Exibir consumo atual de energia");
            System.out.println("7. Listar dispositivos conectados");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("Escolha o tipo: 1-Lâmpada | 2-Ventilador | 3-Câmera | 4-Termostato");
                    int tipo = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Potência (Watts): ");
                    double pot = Double.parseDouble(scanner.nextLine());

                    if (tipo == 1) {
                        System.out.print("Intensidade (0-100): ");
                        int intens = Integer.parseInt(scanner.nextLine());
                        minhaCasa.cadastrar(new Lampada(nome, pot, intens));
                    } else if (tipo == 2) {
                        System.out.print("Velocidade (1-3): ");
                        int vel = Integer.parseInt(scanner.nextLine());
                        minhaCasa.cadastrar(new Ventilador(nome, pot, vel));
                    } else if (tipo == 3) {
                        System.out.print("Resolução (ex: 1080p): ");
                        String res = scanner.nextLine();
                        minhaCasa.cadastrar(new CameraSeguranca(nome, pot, res));
                    } else if (tipo == 4) {
                        System.out.print("Temperatura Alvo (°C): ");
                        double temp = Double.parseDouble(scanner.nextLine());
                        minhaCasa.cadastrar(new Termostato(nome, pot, temp));
                    }
                    break;

                case 2:
                    minhaCasa.listar();
                    break;

                case 3:
                    minhaCasa.listar();
                    System.out.print("Informe o índice do dispositivo: ");
                    int idxL = Integer.parseInt(scanner.nextLine());
                    Dispositivo dispL = minhaCasa.buscar(idxL);

                    if (dispL instanceof Ligavel) {
                        Ligavel l = (Ligavel) dispL;
                        System.out.print("Deseja (1) Ligar ou (2) Desligar? ");
                        int acao = Integer.parseInt(scanner.nextLine());
                        if (acao == 1) l.ligar();
                        else if (acao == 2) l.desligar();
                    } else if (dispL != null) {
                        System.out.println("Este dispositivo não pode ser ligado/desligado.");
                    } else {
                        System.out.println("Dispositivo não encontrado.");
                    }
                    break;

                case 4:
                    minhaCasa.listar();
                    System.out.print("Informe o índice do dispositivo: ");
                    int idxA = Integer.parseInt(scanner.nextLine());
                    Dispositivo dispA = minhaCasa.buscar(idxA);

                    if (dispA instanceof Agendavel) {
                        System.out.print("Horário (ex: 22:30): ");
                        String hora = scanner.nextLine();
                        ((Agendavel) dispA).agendar(hora);
                    } else if (dispA != null) {
                        System.out.println("Este dispositivo NÃO suporta agendamento!");
                    } else {
                        System.out.println("Dispositivo não encontrado.");
                    }
                    break;

                case 5:
                    minhaCasa.listar();
                    System.out.print("Informe o índice do dispositivo: ");
                    int idxC = Integer.parseInt(scanner.nextLine());
                    Dispositivo dispC = minhaCasa.buscar(idxC);

                    if (dispC instanceof Conectavel) {
                        System.out.print("Nome da rede Wi-Fi: ");
                        String rede = scanner.nextLine();
                        ((Conectavel) dispC).conectar(rede);
                    } else if (dispC != null) {
                        System.out.println("Este dispositivo NÃO possui Wi-Fi!");
                    } else {
                        System.out.println("Dispositivo não encontrado.");
                    }
                    break;

                case 6:
                    System.out.printf("\nConsumo total atual: %.2f Watts\n", minhaCasa.getConsumoAtual());
                    break;

                case 7:
                    minhaCasa.listarConectados();
                    break;

                case 8:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 8);
    }
}