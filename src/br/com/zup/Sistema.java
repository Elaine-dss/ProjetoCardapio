package br.com.zup;

import java.util.Locale;
import java.util.Scanner;

public class Sistema {

    public static void exibirMenu() {
        System.out.println("\n------------------------------------------------");
        System.out.println("|              RESTAURANTE ZUPPER              |");
        System.out.println("|    Programa para atualização do cardápio!    |");
        System.out.println("------------------------------------------------");
        System.out.println("|  Digite 1 para exibir o cardápio atualizado  |");
        System.out.println("|  Digite 2 para adicionar um novo prato       |");
        System.out.println("|  Digite 3 para finalizar o programa          |");
        System.out.println("------------------------------------------------");
    }

    private static Scanner modoDeExibicao(String msg) {
        System.out.print(msg);
        return new Scanner(System.in);
    }

    public static Pratos cadastrarPrato() {
        System.out.println("------------------------------------------------");
        System.out.println("|          Adicione o prato desejado!          |");
        System.out.println("------------------------------------------------");
        String nome = modoDeExibicao("|  Nome do prato: ").nextLine().toUpperCase(Locale.ROOT);
        String ingredientes = modoDeExibicao("|  Igredientes: ").nextLine().toLowerCase(Locale.ROOT);
        double valor = modoDeExibicao("|  Valor: ").nextDouble();
        System.out.println("------------------------------------------------");
        System.out.println("Prato adicionado com sucesso!");

        return new Pratos(nome, ingredientes, valor);
    }

    public static void executar(){
        Cardapio cardapio = new Cardapio();
        boolean finalizar = false;

        while (!finalizar) {
            exibirMenu();
            int opcaoDesejada = modoDeExibicao("Digite um número referente a opção desejada: ").nextInt();

            if (opcaoDesejada == 1) {
                if (cardapio.getCardapio().size() == 0) {
                    System.out.println("O cardápio está vazio!");
                }
                else {
                    System.out.println();
                    System.out.println("------------------------------------------------");
                    System.out.println("|                 CARDÁPIO ZUP                 |");
                    System.out.println("------------------------------------------------\n|");
                    for (int i = 0; i < cardapio.getCardapio().size(); i++) {
                        System.out.println(cardapio.getCardapio().get(i));
                        System.out.println("|");
                    }
                    System.out.println("------------------------------------------------");
                    System.out.println("Fim de exibição!");
                }
            }
            else if (opcaoDesejada == 2) {
                cardapio.adicionarPrato(cadastrarPrato());
            }
            else if (opcaoDesejada == 3) {
                finalizar = true;
                System.out.println("Programa finalizado!");
            }
            else {
                System.out.println("Opção inválida!");
            }
        }
    }
}
