/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.*;

/**
 *
 * @author User
 */
public class Testes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random ale = new Random();
        Queue<Integer> Fila = new LinkedList<Integer>();
        Stack<Integer> Pilha = new Stack<Integer>();
        int numero, par;
        System.out.println("Inserindo elementos na pilha: ");
        System.out.println("-------------------------------");
        for (int i = 0; i < 5; i++) {
            numero = ale.nextInt(100);
            System.out.println("Elemento inserido: " + numero);
            Pilha.push(numero);
        }

        for (int i = 0; i < 5; i++) {
            par = Pilha.peek();
            if (par % 2 == 0 && par != 0) {
                System.out.printf("\nElemento %1$d é par.", par);
                System.out.println();
                Pilha.pop();
                Fila.add(par);
            } else {
                System.out.printf("\nElemento %1$d foi deletado.", par);
                System.out.println();
                Pilha.pop();
            }
        }
        System.out.println("\nFila Gerada:");
        for (int x : Fila) {
            System.out.printf("%1$d ", x);

        }
        System.out.println();

    }

}
