package árvorebinária;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import java.util.*;

public class ÁrvoreBinária {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        int Op;

        Árvore MinhaÁrvore = new Árvore();

        do {
            ConsoleClear();

            System.out.println("ÁRVORE BINÁRIA");                          // Menu de Opções
            System.out.println("==============\n");
            System.out.println("Opções: \n");
            System.out.println("1 - Inserir Elemento na Árvore");
            System.out.println("2 - Pesquisar um Elemento na Árvore");
            System.out.println("3 - Listar Elementos da Árvore - Método \"EM ORDEM\"");
            System.out.println("4 - Listar Elementos da Árvore - Método \"PRÉ-ORDEM\"");
            System.out.println("5 - Listar Elementos da Árvore - Método \"PÓS-ORDEM\"");
            System.out.println("6 - Excluir um Elemento da Árvore");
            System.out.println("7 - Esvaziar a Árvore");
            System.out.println("8 - Sair\n");

            System.out.print("Digite sua Opção: ");
            Op = Integer.parseInt(S.nextLine());

            if (Op == 1) // Inserir Elemento na Árvore
            {
                boolean Status;                // Variável para receber o status de inserção do Elemento na Árvore

                int x;                      // Valor a ser inserido

                System.out.print("\n\nDigite um Número Inteiro: ");
                x = Integer.parseInt(S.nextLine());

                Status = MinhaÁrvore.Inserir(x);

                if (Status) {
                    System.out.println("\nElemento inserido na Árvore!\n\n");         // Status = True
                } else {
                    System.out.println("\nElemento já existe na Árvore!\n\n");        // Status = False
                }

                S.nextLine();
            }

            if (Op == 2) // Pesquisar um Elemento na Árvore
            {
                int Altura;

                int x;                      // Valor a ser pesquisado

                System.out.print("\n\nDigite o Número para Pesquisa: ");
                x = Integer.parseInt(S.nextLine());

                Altura = MinhaÁrvore.Pesquisar(x);

                if (Altura == -1) // Não encontrou...
                {
                    System.out.println("\nO Elemento não existe na Árvore!\n\n");
                } else {
                    System.out.println("\nO Elemento existe na Árvore!");
                    System.out.printf("Altura da Árvore: %1$d \n\n", Altura);
                }

                S.nextLine();
            }

            if (Op == 3) // Listar os Elementos da Árvore - "EM ORDEM"
            {
                if (MinhaÁrvore.Raiz == null) {
                    System.out.println("\nA Árvore não possui nenhum Elemento...\n\n");
                } else {
                    System.out.println("\n\nListagem dos Elementos - Método EM ORDEM");
                    System.out.println("========================================\n");

                    MinhaÁrvore.ListarEMORDEM(MinhaÁrvore.Raiz);
                }
                S.nextLine();
            }

            if (Op == 4) // Listar os Elementos da Árvore - "PRÉ-ORDEM"
            {
                if (MinhaÁrvore.Raiz == null) {
                    System.out.println("\nA Árvore não possui nenhum Elemento...\n\n");
                } else {
                    System.out.println("\n\nListagem dos Elementos - Método PRÉ-ORDEM");
                    System.out.println("=============================================\n");

                    MinhaÁrvore.ListarPRÉORDEM(MinhaÁrvore.Raiz);
                }
                S.nextLine();
            }

            if (Op == 5) // Listar os Elementos da Árvore - "PÓS-ORDEM"
            {
                if (MinhaÁrvore.Raiz == null) {
                    System.out.println("\nA Árvore não possui nenhum Elemento...\n\n");
                } else {
                    System.out.println("\n\nListagem dos Elementos - Método PÓS-ORDEM");
                    System.out.println("=============================================\n");

                    MinhaÁrvore.ListarPÓSORDEM(MinhaÁrvore.Raiz);
                }
                S.nextLine();
            }

            if (Op == 6) // Excluir um Elemento da Árvore
            {
                int x;

                int Altura;

                System.out.print("\n\nDigite o Número para Exclusão: ");
                x = Integer.parseInt(S.nextLine());

                Altura = MinhaÁrvore.Pesquisar(x);                      // Pesquisa se o elemento existe (Algura é maior que 0)

                if (Altura == -1) // Não encontrou...
                {
                    System.out.println("\nO Elemento não existe na Árvore!\n\n");
                } else {
                    MinhaÁrvore.Raiz = MinhaÁrvore.Excluir(MinhaÁrvore.Raiz, x);

                    System.out.println("\nElemento excluído da Árvore!\n\n");
                }

                S.nextLine();
            }

            if (Op == 7) // Esvaziar a Árvore
            {
                MinhaÁrvore.Raiz = null;

                System.out.println("\nÁrvore Vazia!\n\n");
                S.nextLine();
            }

        } while (Op != 8);
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
