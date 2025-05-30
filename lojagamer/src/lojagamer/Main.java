package lojagamer;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorEstoque gerenciador = new GerenciadorEstoque();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== RONALDO GAMES GERENCIAMENTO ===");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Consultar Produto por ID");
            System.out.println("3. Atualizar Produto");
            System.out.println("4. Deletar Produto");
            System.out.println("5. Listar Todos os Produtos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1: 
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Descrição: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Preço: ");
                    float preco = scanner.nextFloat();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Categoria: ");
                    String categoria = scanner.nextLine();

                    Produtos novoProduto = new Produtos(nome, descricao, preco, quantidade, categoria);
                    gerenciador.criarProduto(novoProduto);
                    System.out.println("Produto adicionado com sucesso! ID gerado: " + novoProduto.getId());
                    break;

                case 2:
                    System.out.print("Digite o ID do produto: ");
                    int idConsulta = scanner.nextInt();
                    Produtos produtoConsultado = gerenciador.lerProduto(idConsulta);
                    if (produtoConsultado != null) {
                        System.out.println("Produto encontrado: " + produtoConsultado);
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o ID do produto a atualizar: ");
                    int idAtualizar = scanner.nextInt();
                    scanner.nextLine(); // 
                    Produtos produtoParaAtualizar = gerenciador.lerProduto(idAtualizar);
                    if (produtoParaAtualizar == null) {
                        System.out.println("Produto não encontrado.");
                        break;
                    }
                    System.out.print("Novo nome: ");
                    produtoParaAtualizar.setNome(scanner.nextLine());
                    System.out.print("Nova descrição: ");
                    produtoParaAtualizar.setDescricao(scanner.nextLine());
                    System.out.print("Novo preço: ");
                    produtoParaAtualizar.setPreco(scanner.nextFloat());
                    System.out.print("Nova quantidade: ");
                    produtoParaAtualizar.setQuantidade(scanner.nextInt());
                    scanner.nextLine(); 
                    System.out.print("Nova categoria: ");
                    produtoParaAtualizar.setCategoria(scanner.nextLine());

                    gerenciador.atualizarProduto(produtoParaAtualizar);
                    System.out.println("Produto atualizado com sucesso!");
                    break;

                case 4: 
                    System.out.print("Digite o ID do produto a deletar: ");
                    int idDeletar = scanner.nextInt();
                    gerenciador.deletarProduto(idDeletar);
                    System.out.println("Produto deletado com sucesso!");
                    break;

                case 5: 
                    System.out.println("Lista de Produtos:");
                    List<Produtos> produtos = gerenciador.listarProdutos();
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto encontrado.");
                    } else {
                        for (Produtos p : produtos) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 0: 
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}