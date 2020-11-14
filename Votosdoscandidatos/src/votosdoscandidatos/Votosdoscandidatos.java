/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votosdoscandidatos;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Votosdoscandidatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int voto=0,voto1=0,voto2=0,nulo=0,branco=0,contador,soma;
    double soma1,soma2;
    Scanner ent = new Scanner(System.in);
    for (contador=1;contador<=50;contador++){
        System.out.println("Digite seu voto como 1 para o candidato 1 ou como 2 para o canditado 2 ou 3 para voto nulo ou 4 para voto em branco:");
        voto=ent.nextInt();
        if(voto<1&&voto>4){
            System.out.println("Voto inválido");
        }
        if(voto == 1){
            voto1++;
        }
        if(voto == 2){
            voto2++;
        }
        
         if(voto == 3){
            nulo++;
        }
        if(voto == 4){
            branco++;
        }
        }
    System.out.println("O Canditado 1 obteve:"+voto1+ " votos");
    System.out.println("O Canditado 2 obteve:"+voto2+ " votos");
    soma=voto1+voto2+nulo+branco;
    soma1= (nulo*100.0)/soma;
    soma2=(branco*100.0)/soma;
    System.out.println("O percentual de votos em branco foi : " +soma2+"%  e o percentual de votos  em nulo foi :" +soma1+"%");
     if (voto1>voto2){
        System.out.println("O vencedor foi o candidato 1 com : " +voto1+ " votos");
    }
    if (voto2>voto1){
        System.out.println("O vencedor foi o candidato 2 com " +voto2+ " votos");
    }
    
    }
}
    

    


    

