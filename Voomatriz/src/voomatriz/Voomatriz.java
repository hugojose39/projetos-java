/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voomatriz;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Voomatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int [][] voo =  new int [4][5];
     int i,j,identidade,numerovoo;
     boolean existente;
     Scanner ent = new Scanner(System.in);
     for(i=0;i<5;i++){
     System.out.println("Digite o número do voo : ");
     voo[0][i] = ent.nextInt();
     System.out.println("Digite o valor das passagens : ");
      voo[1][i]= ent.nextInt();
      System.out.println("Digite o modelo do avião : ");
      voo[2][i]= ent.nextInt();
      if(voo[2][i]==707){
      voo[3][i]=10;
      }
      if(voo[2][i]==727){
      voo[3][i]=7;
      }
      if(voo[2][i]==737){
      voo[3][i]=5;
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
     if (numerovoo==voo[0][i]){
     existente=true;
     if(voo[3][i]>0){
     voo[3][i]--;
     System.out.println("RESERVA CONFIRMADA. O pasageiro " +identidade+ " que escolheu o voo "+voo[0][i]+" cuja passagem tem o valor  de " +voo[1][i] + " reais");
     }
     else{
     System.out.println("VÔO LOTADO. O pasageiro " +identidade+ " que escolheu o voo " +voo[0][i]);
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
     

