/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhilefemininomasculino;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Dowhilefemininomasculino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    char sexo;
      int mulher=0,homem=0,homenscommaisde2metros=0,idade; 
      double alturamediadasmulheres, maior=0,menor=100,altura,soma=0;
      Scanner entrada = new Scanner(System.in);
      String nome;
     do{
       System.out.println("Digite a sua altura: "); 
         altura= entrada.nextDouble(); 
         if(altura>0&&altura<100){
         System.out.println("Digite o sexo(M ou F): "); 
         nome = entrada.next();
         sexo = nome.charAt(0);
         if (sexo == 'f' || sexo =='F'){
            mulher++;
           soma = soma + altura;
           alturamediadasmulheres= soma/mulher;
         }
         if (sexo == 'm' || sexo =='M') {
            homem++; 
            }
         if ((sexo=='m'||sexo=='M')&&(altura>2)){
           homenscommaisde2metros++;
         }
         if(altura>maior){
             maior=altura;
         }
         if(altura<menor){
             menor=altura;
         }
         }
     }while(altura>0&&altura<100);
     alturamediadasmulheres= soma/mulher;
   System.out.println("Maior altura do grupo: " +maior);
   System.out.println("Menor altura do grupo: " +menor);
   System.out.println("Media da altura das mulheres: "+alturamediadasmulheres);
   System.out.println("Numero de homens com altura superior a dois metros: "+homenscommaisde2metros);
   }
  }
