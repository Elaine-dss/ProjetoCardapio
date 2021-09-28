package br.com.zup;

import java.util.Locale;
import java.util.Scanner;

public class Sistema {

    private static Scanner tabelaCadastro(String msg) {
        System.out.println(msg);
        return new Scanner(System.in);
    }

    public static void Cadastrar() {
        String nome = tabelaCadastro("|  Nome do prato: ").nextLine().toUpperCase(Locale.ROOT);
        String ingredientes = tabelaCadastro("|  Igredientes: ").nextLine().toLowerCase(Locale.ROOT);
        double valor = tabelaCadastro("|  Valor: ").nextDouble();
    }
}
