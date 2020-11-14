/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voo.vetor;


import java.util.Scanner;

/**
 *
 * @author User
 */
public class VooVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] voo = new int[5];
        double[] passagem = new double[5];
        int[] aviao = new int[5];
        int[] capacidade = new int[5];
        boolean existente=false;
        
        int identidade, numerovoo,i=0,k=0; 
        Scanner ent = new Scanner(System.in);
     
        for(i=0;i<voo.length;i++){
            System.out.println("Digite o número do voo:");
            voo[i]=ent.nextInt();
            System.out.println("Digite o valor das pasagens:");
            passagem[i]=ent.nextDouble();
            System.out.println("Informe o tipo de avião:");
            aviao[i]=ent.nextInt();
          if(aviao[i]==707){
             capacidade[i]=10;
            }
          if(aviao[i]==727){
             capacidade[i]=7;
            }
          if(aviao[i]==737){
             capacidade[i]=5;
            }
        }
         System.out.println();
         System.out.println("Informe a identidade:");
         identidade=ent.nextInt();
         while(identidade!=0){
             System.out.println("Informe o número do voo:");
             numerovoo=ent.nextInt();
             existente=false;
             for (i=0;i<5;i++){
                 if (numerovoo==voo[i]){
                     existente=true;
                     if(capacidade[i]>0){
                         capacidade[i]--;
                         System.out.println("RESERVA CONFIRMADA. O pasageiro " +identidade+ " que escolheu o voo "+voo[i]+" cuja passagem tem o valor  de " +passagem[i] + " reais");
                        }else{
                           System.out.println("VÔO LOTADO. O pasageiro " +identidade+ " que escolheu o voo " +voo[i]);
                        }
                    }
                }
           if(!existente){
             System.out.println("Digite um número de voo válido");
           }
             System.out.println();
             System.out.println("Informe a identidade:");
             identidade=ent.nextInt();
         }
            }
}
    
 
   

    