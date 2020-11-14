/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aed41;

/**
 *
 * @author User
 */
import java.util.*;

class Elemento {

    public Funcionários Func;
    public Elemento Próx;

    public Elemento() {
        this.Func = null;
        this.Próx = null;

    }
}

public class Lista {

    private Elemento Início;
    private Elemento Fim;
    private Elemento Aux;
    private Elemento Anterior;
    public int Tamanho;

    public Lista() {
        this.Início = null;
        this.Fim = null;

        this.Tamanho = 0;

    }

    public void Inserir(Funcionários F) {
        Elemento Novo = new Elemento();
        Novo.Func = F;
        if (Início == null) {
            Início = Novo;
            Fim = Novo;
            // Novo.Próx=null;
        } else {
            Aux = Início;
            Anterior = null;
            while (Aux != null && Novo.Func.Nome.compareTo(Aux.Func.Nome) > 0) {
                Anterior = Aux;
                Aux = Aux.Próx;
            }
            if (Anterior == null) {//Inserir no Início
                Novo.Próx = Início;
                Início = Novo;
            } else if (Aux == null) {//Inserir no Final
                Fim.Próx = Novo;
                Fim = Novo;
            } else {               //Inserir entre elementos
                Anterior.Próx = Novo;
                Novo.Próx = Aux;
            }
        }
        Tamanho++;
    }

    public void MostraLista() {
        Scanner S = new Scanner(System.in);
        if (Início == null) {
            System.out.println("\n Não existem dados no cadastro!!\n");
            S.nextLine();
        } else {
            Aux = Início;
            while (Aux != null) {
                System.out.printf(("\n%1$s- Matrícula: %2$s"), Aux.Func.Nome, Aux.Func.Matrícula);
                System.out.printf(("Cargo: %1$s\n"), Aux.Func.Cargo);
                System.out.printf(("Salário: R$ %1$.2f\n"), Aux.Func.Salário);
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
            Anterior = null;
            boolean Achou = false;
            while (Aux != null) {
                if (Aux.Func.Matrícula.toUpperCase().compareTo(Mat.toUpperCase()) == 0) {
                    Achou = true;
                    if (Aux == Início) {
                        Início = Aux.Próx;
                        Aux = Início;

                        Tamanho--;
                    } else if (Aux == Fim) {
                        Anterior.Próx = null;
                        Fim = Anterior;
                        Aux = null;
                        Tamanho--;
                    } else {
                        Anterior.Próx = Aux.Próx;
                        Aux = Aux.Próx;
                        Tamanho--;
                    }
                } else {
                    Anterior = Aux;
                    Aux = Aux.Próx;
                }
            }
            if (!Achou) {
                System.out.println("\nFuncionário não cadastrado!!");
            } else {
                System.out.println("\nFuncionário Removido Do Cadastro!!");
            }
            System.out.printf("Total de Funcionários no Cadastro:  %1$d ", Tamanho);
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

            System.out.println("\nOs Dados do Cadastro foram Removidos!!\n");

            S.nextLine();
        }

    }
}
