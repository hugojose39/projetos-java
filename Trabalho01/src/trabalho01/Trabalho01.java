/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho01;

/**
 *
 * @author User
 */
import java.util.*;
import java.awt.AWTException;

import java.awt.Robot;

import java.awt.event.KeyEvent;

import java.io.IOException;
import java.util.*;

public class Trabalho01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int Op;
        Lista MinhaLista = new Lista();
        do {
            ConsoleClear();

            System.out.println("Cadastro De Professores");
            System.out.println("------------------------");
            System.out.println("Opções:\n");
            System.out.println("1 - Inserir Professor no Cadastro");
            System.out.println("2 - Listar Professores cadastrados");
            System.out.println("3 - Remover um Professor do Cadastro");
            System.out.println("4 - Consultar Professor já cadastrado");
            System.out.println("5 - Reiniciar Cadastro");
            System.out.println("6 - Sair");
            System.out.print("\nDigite a Opção:\n");
            Op = Integer.parseInt(S.nextLine());
            if (Op == 1) {
                Funcionários x = new Funcionários();
                System.out.println("Registro do Professor");
                x.Matrícula = S.nextLine();
                System.out.println("Nome......................");
                x.Nome = S.nextLine();
                System.out.println("Email ......................");
                x.Email= S.nextLine();
                System.out.println("Telefone ...................");
                x.Telefone = Integer.parseInt(S.nextLine());
                MinhaLista.Inserir(x);
                System.out.println("\nFProfessor Cadastrado!!");
                System.out.printf("\nTamanho da Lista: %1$d \n\n", MinhaLista.Tamanho);

            }

            if (Op == 2) {

                MinhaLista.MostraLista();

            }
            if (Op == 3) {
                String x;
                System.out.print("Registro do Professor:");
                x = S.nextLine();
                MinhaLista.RetiraElemento(x);
            }
             if (Op == 4) {
                String x;
                System.out.print("Registro do Professor:");
                x = S.nextLine();
                MinhaLista.Procura(x);
            }
            
            if (Op == 5) {
                MinhaLista.EsvaziaLista();
            }

        } while (Op != 6);
    }

    static void ConsoleClear() {

        try {

            Robot robot = new Robot();

            robot.setAutoDelay(5);

            robot.keyPress(KeyEvent.VK_CONTROL);

            robot.keyPress(KeyEvent.VK_L);

            robot.keyRelease(KeyEvent.VK_CONTROL);

            robot.keyRelease(KeyEvent.VK_L);

        } catch (AWTException ex) {

            System.out.println(ex.getMessage());

        }

    }
}
