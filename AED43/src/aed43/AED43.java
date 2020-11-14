/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aed43;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class AED43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // FILA
        Scanner S = new Scanner(System.in);
        OperFila MinhaFila=new OperFila();
        MinhaFila.Inserir(23);
        MinhaFila.Inserir(17);
        MinhaFila.Inserir(42);
        MinhaFila.Inserir(69);
        MinhaFila.Inserir(11);
        MinhaFila.Mostrar();
        MinhaFila.Retirar();
        MinhaFila.Mostrar();
    }
    
}
