package br.com.kasolution.exercicio6;

import java.util.Scanner;

public class Caixa {
    private boolean aberto;
    private Scanner scanner;

    public Caixa() {
        this.aberto = true;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        while (aberto) {
            processarCompra();
            System.out.print("Deseja fechar o caixa? (s/n): ");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("s")) {
                aberto = false;
            }
        }
    }

    private void processarCompra() {
        Carrinho carrinho = new Carrinho();
        boolean maisItens = true;

        while (maisItens) {
            System.out.print("Digite o nome do item: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o preço do item: ");
            double preco = Double.parseDouble(scanner.nextLine());
            carrinho.adicionarItem(new Item(nome, preco));

            System.out.print("Há mais itens a serem processados? (s/n): ");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("n")) {
                maisItens = false;
            }
        }

        double total = carrinho.calcularTotal();
        System.out.printf("Total da compra: R$ %.2f%n", total);
    }
}