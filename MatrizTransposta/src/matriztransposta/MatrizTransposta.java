/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriztransposta;



import java.util.Scanner;

/**
 *
 * @author User
 */
public class MatrizTransposta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int  linha=0, coluna=0, i, j,cont=0;
    Scanner ent = new Scanner(System.in);
    System.out.println("Digite o número de linhas da matriz este número deve menor ou igual a 20:");
   linha=ent.nextInt();
   System.out.println("Digite o número de colunas da matriz este número deve menor ou igual a 50:");
   coluna=ent.nextInt();
    System.out.println("Digite os números da matriz:");
    int[][]  A = new int[linha][coluna];
    int[][] B = new int[coluna][linha];
    while(linha<=20&&coluna<=50&&cont<linha){
    for(i=0;i<A.length;i++){
     for(j=0;j<A[i].length;j++){
     A[i][j] = ent.nextInt();
     cont++;
     }
    }
    System.out.println();
    System.out.println("  Matriz : ");
    for(i=0;i<A.length;i++){
     for(j=0;j<A[i].length;j++){
         System.out.print("\t" + A[i][j]);
     }
    System.out.println();
  }
for(i=0;i<B.length;i++){
     for(j=0;j<B[i].length;j++){
     B[i][j]=A[j][i];
     }
    }
    System.out.println();
    System.out.println("  Matriz Transposta : ");
    for(i=0;i<B.length;i++){
     for(j=0;j<B[i].length;j++){
         
         System.out.print("\t" +B[i][j]);
     }
     System.out.println();
    }
}
    }   
}

    


