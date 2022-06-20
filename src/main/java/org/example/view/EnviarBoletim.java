package org.example.view;

import org.example.controller.MenuEnvioControl;
import org.example.controller.MenuPrincipalControl;
import org.example.model.Aluno;

import java.util.Objects;
import java.util.Scanner;

public class EnviarBoletim {
    public static void executar(Scanner sc, Aluno aluno) {
        do {
            System.out.println("Deseja enviar esse boletim?");
            System.out.println("Digite 1 para sim e 2 para não");
            System.out.print("Resposta:");
            String opcao = sc.nextLine();

            if (Objects.equals(opcao, "1")) {
                MenuEnvioControl.executar(sc, aluno);
                return;
            } else if (Objects.equals(opcao, "2")) {
                System.out.println("Voltando para o menu principal");
                MenuPrincipalControl.run(sc);
                return;
            } else {
                System.out.println("Opção invalida, tente novamente");
            }
        } while (true);
    }
}
