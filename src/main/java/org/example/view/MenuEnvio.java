package org.example.view;

public class MenuEnvio {
    public static void executar() {
        System.out.println("Para onde deseja enviar?");
        System.out.println("0 - Não enviar");
        System.out.println("1 - Email");
        System.out.println("2 - Mensagem no celular");
        System.out.println("3 - Imprimir");
        System.out.print("Opção: ");
    }

    public static void exit () {
        System.out.println("Voltando ao menu principal");
    }
}
