package org.example.view;

public class MenuPrincipal {
    public static void run (){
        System.out.println("Bem vindo ao sistema da escola, o que deseja fazer?");
        System.out.println("0 - Sair do programa");
        System.out.println("1 - Cadastrar um aluno");
        System.out.println("2 - Lançar a nota de um aluno");
        System.out.println("3 - Exibir o boletim e enviar boletim");
        System.out.print("Opção: ");
    }

    public static void exit () {
        System.out.println("Saindo do sistema, obrigado por usar nossos serviços ");
    }
}
