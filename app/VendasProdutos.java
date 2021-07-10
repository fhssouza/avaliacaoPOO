package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Produto;

public class VendasProdutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        List<Produto> produtos = new ArrayList<>();

        do {
            System.out.println("1 - Incluir produto");
            System.out.println("2 - Consultar produtos");
            System.out.println("3 - Listar produtos");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            sc.nextLine(); // Tira o ENTER

            switch (opcao) {
                case 1:
                    Produto prod = new Produto();

                    System.out.print("Codigo: ");
                    prod.setCodigo(sc.nextLine());
                    System.out.print("Nome: ");
                    prod.setNome(sc.nextLine());
                    System.out.print("Valor: ");
                    prod.setValor(sc.nextLine());
                    System.out.print("Quantida Estoque: ");
                    prod.setQuantidadeEstoque(sc.nextLine());

                    produtos.add(prod);

                    System.out.println("Contato adicionado com sucesso.");
                    break;
                case 2:
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto a exibir.");
                        continue;
                    }

                    for (Produto produto : produtos) {
                        System.out.println();
                        System.out.println("Codigo: " + produto.getCodigo());
                        System.out.println("Nome: " + produto.getNome());
                        System.out.println("Valor: " + produto.getValor());
                        System.out.println("Quantidade Estoque: " + produto.getQuantidadeEstoque());
                    }
                    break;
                case 0:
                    System.out.println("Fim do programa.");
                    break;
                default:
                    System.out.println("opção inválida!");
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}
