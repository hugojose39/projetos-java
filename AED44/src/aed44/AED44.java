/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aed44;

import java.util.*;

/**
 *
 * @author User
 */
public class AED44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner S = new Scanner(System.in);
             Random ale =new Random ();
            int N,RestoDiv;
        OperPilha Pilha=new OperPilha();
       System.out.print("Digite um Número:");
       N=S.nextInt();
       N = ale.nextInt(5);
      Pilha.Inserir(N);
       while(N>=2){
           RestoDiv=N%2;
           Pilha.Inserir(RestoDiv);
           N/=2;
           
       }
       Pilha.Inserir(N);
       System.out.print("Número na base 2:");
       Pilha.Mostrar();
    }
    
}
  
