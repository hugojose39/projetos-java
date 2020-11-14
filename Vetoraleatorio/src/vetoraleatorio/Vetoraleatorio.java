/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetoraleatorio;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Vetoraleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int i,maior=0,menor=9,po = 0,numero,contador=0;
        int[]V=new int[20];
         Random ale = new Random();
         Scanner ent= new Scanner (System.in);
         for(i=0;i<V.length;i++){
            V[i] = ale.nextInt(10); 
            System.out.println(V[i]);    
                 }   
     for(i=0;i<V.length;i++){
         if(menor>V[i]){
             menor=V[i];
             
     }
         if(V[i]>maior){
             maior=V[i];
             
         }

}
     System.out.println("O menor número é :"+menor);
     System.out.println("O maior número é :"+maior);
     
   
  

  System.out.println("Digite o valor para saber a posição da primeira ocorrência:");
  numero=ent.nextInt();
  if(numero!=V[po]){
 while(numero != V[po]){
     po++;
    }
  }
System.out.println("A primeira ocorrência do algarismo "+numero+" é na "+(po+1)+"° posição");
 for(i=0;i<V.length;i++){
   if(numero==V[i]){
        System.out.println("O algarismo aparece na  "+(i+1)+"° posição");
        contador++;
    }
}
 System.out.println("O algarismo aparece "+contador+" vezes no Vetor.");
    
}
}