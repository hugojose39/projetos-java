/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizempresa;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class MatrizEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] empresa = new double[500][6];
    // coluna 0 = código do funcionário
    // coluna 1 = horas trabalhadas
    // coluna 2 = salário horas
    // coluna 3 = salário bruto
    // coluna 4 = desconto
    // coluna 5 = salário líquido
    Scanner ent = new Scanner(System.in);
    int i=0,linha,quantMaiorMil=0;
    double folhatotal=0;
    System.out.println("Digite o código do funcionário : ");
    empresa[i][0] = ent.nextDouble();
    while(empresa[i][0]!=0 && i<500){
      System.out.println("Digite as horas trabalhadas do funcionário : ");
      empresa[i][1]= ent.nextDouble();
      System.out.println("Digite o salário hora do funcionário : ");
      empresa[i][2]= ent.nextDouble();
      empresa[i][3]=empresa[i][1]*empresa[i][2];
      if(empresa[i][3]<541){
        empresa[i][4]=empresa[i][3]*8/100;
      }
      else{
        if(empresa[i][3]<=1180){
          empresa[i][4]=empresa[i][3]*12/100;
        }
        else{
          empresa[i][4]=empresa[i][3]*16/100;
        }
      }
      empresa[i][5]= empresa[i][3]-empresa[i][4];
      i++;
      System.out.println("Digite o código do funcionário : ");
      empresa[i][0] = ent.nextDouble();
    }
    linha=0;
    System.out.println("código\tsalário bruto\tdesconto\tsalário líquido ");
    while(linha<i){
       System.out.println(empresa[linha][0]+
       "\t"+empresa[linha][3]+"\t\t"+empresa[linha][4]+"\t\t\t"+empresa[linha][5]);
       folhatotal = folhatotal+empresa[linha][3];
       if(empresa[linha][3]>1000){
         quantMaiorMil++;
       }
       linha++;
    }
    System.out.println("total da folha :"+folhatotal);
    System.out.println("número de funcionários com salário > 1000 : "+quantMaiorMil);
  }
}
    
    

