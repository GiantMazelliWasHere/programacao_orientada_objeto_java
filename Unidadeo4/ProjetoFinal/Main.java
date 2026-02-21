import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Carro> carros = new ArrayList<>();
    private static List<Moto> motos = new ArrayList<>();
    private static List<Van> vans = new ArrayList<>();
    private static List<Pessoa> clientes = new ArrayList<>();
    private static List<Venda> vendas = new ArrayList<>();
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        do {
            try {
                System.out.println("###### Menu ######");
                System.out.println("1. Exibir veículos");
                System.out.println("2. Exibir clientes");
                System.out.println("3. Comprar veículo");
                System.out.println("4. Vender veículo");
                System.out.println("5. Recomendação de veículos");
                System.out.println("6. Cadastrar um cliente");
                System.out.println("7. Gerar relatório de vendas");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");
                escolha = scanner.nextInt();
                
                switch (escolha) {
                    case 1:
                        mostrarInformacoes(1);
                        mostrarInformacoes(2);
                        mostrarInformacoes(3);
                        break;
                    case 2:
                        mostrarInformacoes(4);
                        break;
                    case 3:
                        comprarVeiculo(scanner);
                        break;
                    case 4:
                        venderVeiculo(scanner);
                        break;
                    case 5:
                        recomendarVeiculo(scanner);
                        break;
                    case 6:
                        cadastrarCliente(scanner);
                        break;
                    case 7:
                        gerarRelatorio();
                        break;
                    case 0:
                        System.out.println("Fechando o programa...");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                
                }

            } catch (InputMismatchException e){
                System.out.println("Erro: Entrada inválida. Por gentileza certifique-se de inserir os dados corretamente.");
                scanner.nextLine();

            } catch (Exception e) {
                System.out.println("Erro desconhecido: " + e.getMessage());
            }

        } while (escolha != 0);

        scanner.close();
    }

    private static void mostrarInformacoes(int escolha) {
        switch (escolha) {
            case 1:
                if (!carros.isEmpty()) {

                    System.out.println("###### Lista de Carros ######");
                    int x = 1;
                    for (Carro carro : carros) {
                        System.out.println(x + " - " + carro.getModelo() + " - " + carro.getAno());
                        x++;
                    }

                    System.out.println();
                    System.out.println("---------------------------------------------------------");
                    System.out.println();
                } else {
                    System.out.println("Nenhum veículo disponível para exibir.");
                }
                break;
            case 2:
                if (!motos.isEmpty()) {
                    System.out.println("###### Lista de Motos ######");
                    int x = 1;
                    for (Moto moto : motos) {
                        System.out.println(x + " - " + moto.getModelo() + " - " + moto.getAno());
                        x++;
                    }

                    System.out.println();
                    System.out.println("---------------------------------------------------------");
                    System.out.println();
                } else {
                    System.out.println("Nenhum veículo disponível para exibir.");
                }
                break;
            case 3:
                if (!vans.isEmpty()) {
                    System.out.println("###### Lista de Vans ######");
                    int x = 1;
                    for (Van van : vans) {
                        System.out.println(x + " - " + van.getModelo() + " - " + van.getAno());
                        x++;
                    }

                    System.out.println();
                    System.out.println("---------------------------------------------------------");
                    System.out.println();
                } else {
                    System.out.println("Nenhum veículo disponível para exibir.");
                }
                break;

            case 4:
                if (!clientes.isEmpty()) {
                    System.out.println("###### Lista de Clientes ######");
                    int x = 1;
                    for (Pessoa cliente : clientes) {
                        System.out.println(x + " - " + cliente.getNome() + " - " + cliente.getTelefone());
                        x++;
                    }
                } else {
                    System.out.println("Nenhum cliente encontrado.");
                }
                break;
            default:
                System.out.println("Opção inválida! Tente novamente.");
        }
    }

    private static void comprarVeiculo(Scanner scanner) {
        System.out.println("### Menu de Compra de Veículos ###");
        int escolha;

        System.out.println("Qual nvo veículo deseja cadastrar?");
        System.out.println("1. Carro");
        System.out.println("2. Moto");
        System.out.println("3. Vans");
        System.out.println("0. Voltar");
        escolha = scanner.nextInt();
        scanner.nextLine();

        if(escolha > 2){
            throw new InputMismatchException();
        }
        
        while(escolha != 0){
            try{
                System.out.println("Digite a marca do veículo:");
                String marca = scanner.nextLine();

                System.out.println("Digite o modelo do veículo:");
                String modelo = scanner.nextLine();

                System.out.println("Digite o ano do veículo:");
                int ano = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Digite a cor do veículo:");
                String cor = scanner.nextLine();

                System.out.println("Digite o preço do veículo:");
                double preco = scanner.nextDouble();

                System.out.println("Digite a altura do veículo (em cm):");
                double altura = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Digite a capacidade de carga do veículo (em kg):");
                double capacidadeCarga = scanner.nextDouble();
                scanner.nextLine();

                switch (escolha) {
                    case 1:
                        System.out.println("Digite o número de portas do carro:");
                        int portas = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Digite o tipo de combustível do carro:");
                        String combustivel = scanner.nextLine();

                        System.out.println("Digite a capacidade do porta-malas do carro (em litros):");
                        int potencia = scanner.nextInt();
                        scanner.nextLine();

                        Carro carro = new Carro(marca, modelo, ano, cor, preco, 0, altura, capacidadeCarga, portas, combustivel, potencia);
                        carros.add(carro);
                        System.out.println("Carro do modelo " + modelo + " cadastrado com sucesso!");
                        escolha = 0;
                        break;
                    case 2:
                        System.out.println("Digite o cilindrada da moto:");
                        int cilindrada = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("A moto tem partida elétrica? S - Sim / N - Não");
                        String partida = scanner.nextLine();
                        boolean partidaEletrica;
                        if (partida == "S" || partida == "s") {
                            partidaEletrica = true;
                        } else {
                            partidaEletrica = false;
                        }
                        
                        System.out.println("Digite a categoria da moto:");
                        String tipo = scanner.nextLine();

                        
                        Moto moto = new Moto(marca, modelo, ano, cor, preco, 0, altura, capacidadeCarga, cilindrada, partidaEletrica, tipo);
                        motos.add(moto);
                        System.out.println("Moto do modelo " + modelo + " cadastrada com sucesso!");
                        escolha = 0;
                        break;
                    case 3:
                        System.out.println("A van tem espaço para 7 pessoas? S - Sim / N - Não");
                        String espaco = scanner.nextLine();
                        boolean temEspacoPara7Pessoas;
                        if (espaco == "S" || espaco == "s") {
                            temEspacoPara7Pessoas = true;
                        } else {
                            temEspacoPara7Pessoas = false;
                        }
                        System.out.println("A van tem porta lateral deslizante? S - Sim / N - Não");
                        String porta = scanner.nextLine();
                        boolean temPortaLateralDeslizante;
                        if (porta == "S" || porta == "s") {
                            temPortaLateralDeslizante = true;
                        } else {
                            temPortaLateralDeslizante = false;
                        }

                        Van van = new Van(marca, modelo, ano, cor, preco, 0, altura, capacidadeCarga, temEspacoPara7Pessoas, temPortaLateralDeslizante);
                        vans.add(van);
                        System.out.println("Van do modelo " + modelo + " cadastrada com sucesso!");
                        escolha = 0;
                        break;
                
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por gentileza certifique-se de inserir os dados corretamente.");
            } catch (Exception e) {
                System.out.println("Erro desconhecido: " + e.getMessage());
            }
        }
    }

    private static void venderVeiculo(Scanner scanner) {
        try {
            if(clientes.isEmpty() || (carros.isEmpty() && motos.isEmpty() && vans.isEmpty())) {
                if (clientes.isEmpty()) {
                    System.out.println("Não há clientes cadastrados na base de dados para realizar uma venda.");
                }

                if (carros.isEmpty()) {
                    System.out.println("Não há carros disponíveis para venda.");
                }

                if (motos.isEmpty()) {
                    System.out.println("Não há motos disponíveis para venda.");
                }

                if (vans.isEmpty()) {
                    System.out.println("Não há vans disponíveis para venda.");
                }
            } else {
                mostrarInformacoes(4);
                Pessoa comprador = clientes.get(scanner.nextInt() - 1);
                scanner.nextLine();

                System.out.print("Informe o valor da venda: R$");
                double valorVenda = scanner.nextDouble();
                scanner.nextLine();

                int escolha;

                System.out.println("Qual novo veiculo deseja vender?");
                System.out.println("1 - Carro");
                System.out.println("2 - Moto");
                System.out.println("3 - Vans");
                escolha = scanner.nextInt();
                scanner.nextLine();

                switch(escolha){
                    case 1:
                        mostrarInformacoes(escolha);
                        Carro carroParaVenda = carros.get(scanner.nextInt() - 1);
                        scanner.nextLine();

                        Venda vendaCarro = new Venda(carroParaVenda, comprador, valorVenda, LocalDateTime.now());
                        vendas.add(vendaCarro);
                        carros.remove(carroParaVenda);
                        break;

                    case 2:
                        mostrarInformacoes(escolha);
                        Moto motoParaVenda = motos.get(scanner.nextInt() - 1);
                        scanner.nextLine();

                        Venda vendaMoto = new Venda(motoParaVenda, comprador, valorVenda, LocalDateTime.now());
                        vendas.add(vendaMoto);
                        motos.remove(motoParaVenda);
                        break;
                    case 3:
                        mostrarInformacoes(escolha);
                        Van vanParaVenda = vans.get(scanner.nextInt() - 1);
                        scanner.nextLine();

                        Venda vendaVan = new Venda(vanParaVenda, comprador, valorVenda, LocalDateTime.now());
                        vendas.add(vendaVan);
                        vans.remove(vanParaVenda);
                        
                }

                System.out.println("Venda executada com sucesso!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por gentileza certifique-se de inserir os dados corretamente.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro: Índice inválido. Por favor, certifique-se de escolher uma opção correta!");
        } catch (Exception e) {
            System.out.println("Erro desconhecido: " + e.getMessage());
        }
    }

    private static void cadastrarCliente(Scanner scanner) {
        try{
            System.out.println("### Cadastro de Clientes ###");

            System.out.println("Digite o nome do cliente:");
            String nome = scanner.nextLine();

            System.out.println("Digite a idade do cliente:");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite o endereço do cliente:");
            String endereco = scanner.nextLine();

            System.out.println("Digite um telefone para contato do cliente:");
            String telefone = scanner.nextLine();

            System.out.println("Digite o email do cliente:");
            String email = scanner.nextLine();

            System.out.println("Digite a altura do cliente (em cm):");
            double altura = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Digite o peso do cliente (em kg):");
            double peso = scanner.nextDouble();
            scanner.nextLine();

            Pessoa novoCliente = new Pessoa(nome, idade, endereco, telefone, email, altura, peso);
            clientes.add(novoCliente);
            System.out.println("O(A) cliente de " + nome + " cadastrado(a) com sucesso!");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por gentileza certifique-se de inserir os dados corretamente.");
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Erro desconhecido: " + e.getMessage());
        }
    }

    private static void gerarRelatorio() {
        if(vendas.isEmpty()) {
            System.out.println("Nenhuma venda realizada até o momento.");
        } else {
            System.out.println("### Relatório de Vendas ###");
            System.out.println();
            for (Venda venda : vendas) {
                System.out.println("Data: " + venda.getDataVenda());
                System.out.println("Veículo: " + venda.getVeiculo().getModelo() + " - " + venda.getVeiculo().getAno());
                System.out.println("Comprador: " + venda.getComprador().getNome() + " - " + venda.getComprador().getTelefone());
                System.out.println("Valor da Venda: R$ " + venda.getValorVenda());
                rendimento(venda.getValorVenda(), venda.getVeiculo().getPreco());
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println();
            }
        }
    }

    private static void rendimento(double valorVenda, double preco) {
        try{
            if(valorVenda < 0 || preco < 0) {
                if (valorVenda < 0) {
                throw new IllegalArgumentException("O valor da venda deve ser positivo e maior que zero.");
                }

                if (preco < 0) {
                    throw new IllegalArgumentException("O preço do veículo deve ser positivo e maior que zero.");
                }
            }

            double lucro = (valorVenda - preco);

            if( lucro > 0) {
                System.out.println("Lucro: R$ " + lucro);
            } else if (lucro < 0) {
                System.out.println("Prejuízo: R$ " + lucro);
            } else {
                System.out.println("A venda foi realizada sem lucro ou prejuízo.");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro desconhecido: " + e.getMessage());
        }
    }

    public static void recomendarVeiculo(Scanner scanner) {
        try {
            if(clientes.isEmpty() || (carros.isEmpty() && motos.isEmpty() && vans.isEmpty())) {
                if (clientes.isEmpty()) {
                    System.out.println("Não há clientes cadastrados na base de dados para realizar uma recomendação.");
                }

                if (carros.isEmpty()) {
                    System.out.println("Não há carros disponíveis para recomendação.");
                }

                if (motos.isEmpty()) {
                    System.out.println("Não há motos disponíveis para recomendação.");
                }

                if (vans.isEmpty()) {
                    System.out.println("Não há vans disponíveis para recomendação.");
                }
            } else {
                System.out.println("### Recomendação de Veículos ###");
                System.out.println();
                
                System.out.println("Clientes cadastrados:");
                mostrarInformacoes(4);
                
                System.out.println("Selecione um cliente para receber a recomendação de veículos:");
                Pessoa comprador = clientes.get(scanner.nextInt() - 1);
                scanner.nextLine();

                System.out.println("Escolha o tipo de veículo para recomendação:");
                System.out.println("1 - Carro");
                System.out.println("2 - Moto");
                System.out.println("3 - Van");
                int escolha = scanner.nextInt();
                scanner.nextLine();
                try{
                    switch (escolha) {
                        case 1:
                            System.out.println("Recomendações de Carros para " + comprador.getNome() + ":");
                            for (Carro carro : carros) {
                                if (comprador.getAltura() >= carro.getAltura() && comprador.getPeso() <= carro.getCapacidadeCarga()) {
                                    System.out.println("- " + carro.getModelo() + " - Ano: " + carro.getAno());
                                } else {
                                    if (comprador.getAltura() < carro.getAltura()) {
                                        throw new AlturaException("Não há carros disponíveis com altura compatível para o comprador.");
                                    } else if (comprador.getPeso() < carro.getCapacidadeCarga()) {
                                        throw new PesoException("Não há carros com capacidade de carga compatível para o comprador.");
                                    }
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Recomendações de Motos para " + comprador.getNome() + ":");
                            for (Moto moto : motos) {
                                if (comprador.getAltura() >= moto.getAltura() && comprador.getPeso() <= moto.getCapacidadeCarga()) {
                                    System.out.println("- " + moto.getModelo() + " - Ano: " + moto.getAno());
                                } else {
                                    if (comprador.getAltura() < moto.getAltura()) {
                                        throw new AlturaException("Não há motos disponíveis com altura compatível para o comprador.");
                                    } else if (comprador.getPeso() < moto.getCapacidadeCarga()) {
                                        throw new PesoException("Não há motos com capacidade de carga compatível para o comprador.");
                                    }
                                }
                            }
                            break;
                        case 3:
                            System.out.println("Recomendações de Vans para " + comprador.getNome() + ":");
                            for (Van van : vans) {
                                if (comprador.getAltura() >= van.getAltura() && comprador.getPeso() <= van.getCapacidadeCarga()) {
                                    System.out.println("- " + van.getModelo() + " - Ano: " + van.getAno());
                                } else {
                                    if (comprador.getAltura() < van.getAltura()) {
                                        throw new AlturaException("Não há vans disponíveis com altura compatível para o comprador.");
                                    } else if (comprador.getPeso() < van.getCapacidadeCarga()) {
                                        throw new PesoException("Não há vans com capacidade de carga compatível para o comprador.");
                                    }
                                }
                            }
                            break;
                        default:
                            break;
                    }
                } catch (AlturaException | PesoException e) {
                    System.out.println("Recomendação: " + e.getMessage());
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Erro: Índice inválido. Por favor, certifique-se de escolher uma opção correta!");
                } catch (Exception e) {
                    System.out.println("Erro desconhecido: " + e.getMessage());
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por gentileza certifique-se de inserir os dados corretamente.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro: Índice inválido. Por favor, certifique-se de escolher uma opção correta!");
        } catch (Exception e) {
            System.out.println("Erro desconhecido: " + e.getMessage());
        }
    }
}
