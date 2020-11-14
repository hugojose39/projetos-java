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

class Elemento {

    public Funcionários Func;
    public Elemento Próx;
    public Elemento Anterior;

    public Elemento() {
        this.Func = null;
        this.Próx = null;
        this.Anterior = null;

    }
}

public class Lista {

    private Elemento Início;
    private Elemento Fim;
    private Elemento Aux;
    private Elemento Aux2;

    public int Tamanho;

    public Lista() {
        this.Início = null;
        this.Fim = null;

        this.Tamanho = 0;

    }

    public void Inserir(Funcionários F) {
        Elemento Novo = new Elemento();
        Novo.Func = F;
        Scanner S = new Scanner(System.in);
        Aux = Início;
        boolean Achou = false;
        while (Aux != null) {
            if (Aux.Func.Matrícula.toUpperCase().compareTo(Novo.Func.Matrícula.toUpperCase()) == 0) {
                Achou = true;
                Aux = null;
            } else {

                Aux = Aux.Próx;
            }

        }
        if (Achou) {
            System.out.println("\nIMPOSSIVEL CADASTRAR PROFESSOR NOVAMENTE!!");
            S.nextLine();

        } else if (!Achou) {
            if (Início == null) {
                Início = Novo;
                Fim = Novo;
                Novo.Próx = null;
                Novo.Anterior = null;
            } else {

                Aux = Início;

                while (Aux != null && Novo.Func.Nome.compareTo(Aux.Func.Nome) > 0) {

                    Aux = Aux.Próx;
                }

                if (Aux == Início) {//Inserir no Início
                    Novo.Próx = Início;
                    Início.Anterior = Novo;
                    Início = Novo;
                } else if (Aux == null) {//Inserir no Final
                    Fim.Próx = Novo;
                    Novo.Anterior = Fim;
                    Fim = Novo;

                } else {               //Inserir entre elementos
                    Aux.Anterior.Próx = Novo;
                    Novo.Anterior = Aux.Anterior;
                    Novo.Próx = Aux;
                    Aux.Anterior = Novo;

                }
            }
            Tamanho++;
        }
    }

    public void MostraLista() {
        Scanner S = new Scanner(System.in);
        if (Início == null) {
            System.out.println("\n Não existem dados no cadastro!!\n");
            S.nextLine();
        } else {
            Aux = Início;
            while (Aux != null) {
                System.out.printf(("\n%1$s - Registro: %2$s"), Aux.Func.Nome, Aux.Func.Matrícula);
                System.out.printf(("\nEmail: %1$s\n"), Aux.Func.Email);
                System.out.printf(("Telefone: %1$d\n"), Aux.Func.Telefone);
                Aux = Aux.Próx;
            }
            S.nextLine();
        }
    }

    public void RetiraElemento(String Mat) {
        Scanner S = new Scanner(System.in);
        if (Início == null) {
            System.out.println("\nNão existem dados no cadastro!!\n");
            S.nextLine();
        } else {
            Aux = Início;

            boolean Achou = false;
            while (Aux != null) {
                if (Aux.Func.Matrícula.toUpperCase().compareTo(Mat.toUpperCase()) == 0) {
                    Achou = true;
                    if (Aux == Início) {
                        Início = Aux.Próx;
                        Aux = null;
                        Tamanho--;
                    } else if (Aux == Fim) {
                        Aux.Anterior.Próx = null;
                        Fim = Aux.Anterior;
                        Aux = null;
                        Tamanho--;
                    } else {

                        Aux.Anterior.Próx = Aux.Próx;
                        Aux.Próx = Aux.Anterior;
                        Aux = null;
                        Tamanho--;
                    }
                } else {

                    Aux = Aux.Próx;
                }
            }
            if (!Achou) {
                System.out.println("\nProfessor não cadastrado!!");
            } else {
                System.out.println("\nProfessor Removido Do Cadastro!!");
            }
            System.out.printf("Total de Professores no Cadastro:  %1$d ", Tamanho);
            S.nextLine();
        }
    }

    public void EsvaziaLista() {
        Scanner S = new Scanner(System.in);
        if (Início == null) {
            System.out.println("\nNão Existem Dados no Cadastro!\n");
            S.nextLine();
        } else {
            Início = null;
            Tamanho = 0;

            System.out.println("\n Dados do Cadastro foram Removidos!!\n");

            S.nextLine();
        }
    }

    public void Procura(String Mat) {
        Scanner S = new Scanner(System.in);

        Aux = Início;
        boolean Achou = false;
        while (Aux != null) {
            if (Aux.Func.Matrícula.toUpperCase().compareTo(Mat.toUpperCase()) == 0) {
                 Achou = true;
            System.out.printf(("\n%1$s - Registro: %2$s"), Aux.Func.Nome, Aux.Func.Matrícula);
            System.out.printf(("\nEmail: %1$s\n"), Aux.Func.Email);
            System.out.printf(("Telefone:  %1$d\n"), Aux.Func.Telefone);
            Aux=null;

            } else {
                Aux = Aux.Próx;

            }
             
        }

         if (!Achou) {
            System.out.println("\nEste registro não está cadastrado\n");
        }
         S.nextLine();
    }
}
