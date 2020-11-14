/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelahashing;

import java.util.*;

/**
 *
 * @author User
 */
public class TabelaHashing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TabelaHassing
        Scanner S = new Scanner(System.in);
        Hashtable<String,String> MeuHashTable=new Hashtable<String,String>(20);
        MeuHashTable.put("123","João");
        MeuHashTable.put("456","Maria");
        MeuHashTable.put("789","Pedro");
        MeuHashTable.put("321","Tereza");
        MeuHashTable.put("654","Gustavo");
        System.out.println("\n As chaves inseridas foram:\n");
        for(String Chave:MeuHashTable.keySet()){
            System.out.printf("\t%1$s",Chave);
        }
        
        System.out.println("\n\nOs valores inseridos foram:\n");
        for(String Valor:MeuHashTable.values()){
            System.out.printf("\t%1$s\n",Valor);
        }
        //S.nextLine();
        //ConsoleClear();
        System.out.println("\nConteúdo atual da tabela hash:\n");
        for(String Chave:MeuHashTable.keySet()){
          System.out.printf("\t%1$s-%2$s\n",Chave,MeuHashTable.get(Chave));
        
        
    }
        System.out.printf("\nTamanho: %1$d\n\n",MeuHashTable.size());
        //S.nextLine();
        String Aux;
        //ConsoleClear();
        System.out.print("Digite uma chave:");
        Aux=S.nextLine();
        if(MeuHashTable.containsKey(Aux)){
            System.out.printf("\nEssa Chave é valida : %1$s\n",MeuHashTable.get(Aux));
           MeuHashTable.remove(Aux);
           System.out.println("\nEssa chave foi removida...");
        }
        else{
            System.out.println("A chave não existe..");
        }
        S.nextLine();
         System.out.println("\nConteúdo atual da tabela hash:\n");
        for(String Chave:MeuHashTable.keySet()){
          System.out.printf("\t%1$s-%2$s\n",Chave,MeuHashTable.get(Chave));
}
}
}