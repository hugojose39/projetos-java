/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aed44;

/**
 *
 * @author User
 */
import java.util.*;

class Elemento {

    public int Num;
    public Elemento Próx;

    public Elemento() {
        Num = 0;
        Próx = null;
    }
}

public class OperPilha {

    private Elemento Topo;
    private Elemento Aux;

    public OperPilha() {
        Topo = null;

    }

    public void Inserir(int Valor) {
        Elemento Novo = new Elemento();
        Novo.Num = Valor;
        Novo.Próx = Topo;
        Topo = Novo;

    }

    public void Mostrar() {
        Scanner S = new Scanner(System.in);
        if (Topo == null) {
            System.out.println("\nA pilha está vazia...\n\n");
            S.nextLine();
        } else {
            Aux = Topo;
            
            while (Aux != null) {
                System.out.printf("%1$d", Aux.Num);
                Aux = Aux.Próx;

            }
            S.nextLine();
        }
    }

    public void Retirar() {
        Scanner S = new Scanner(System.in);
        int x;
        if (Topo == null) {
            System.out.println("\n A pilha esta vazia ");
            S.nextLine();

        } else {
            x = Topo.Num;
            Topo = Topo.Próx;
            System.out.printf("\n O elemento %1$d foi retirado da pilha....\n\n", x);
            S.nextLine();
        }
    }

}
