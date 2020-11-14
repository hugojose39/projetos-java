/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nota.de.alunos.e.frequencias;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class NotaDeAlunosEFrequencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int notaaluno1,notaaluno2,notaaluno3,frequencia1,frequencia2,frequencia3,media1,media2,media3,aux,aux1,aux2,aux3,reprovadosporfrequencia,alunosaprovados;
    Scanner ent= new Scanner (System.in);
    notaaluno1=50;
    notaaluno2=40;
    notaaluno3=80;
    frequencia1=50;
    frequencia2=44;
    frequencia3=60;
    if(notaaluno1<notaaluno2){
        aux1=notaaluno1;
        notaaluno1=notaaluno2;
        notaaluno2=aux1;
    } 
    if(notaaluno1<notaaluno3){
        aux1=notaaluno1;
        notaaluno1=notaaluno3;
        notaaluno3=aux1;
    }
    if(notaaluno2<notaaluno1){
        aux1=notaaluno2;
        notaaluno2=notaaluno1;
        notaaluno1=aux1;
    }
     if(notaaluno2<notaaluno3){
        aux1=notaaluno2;
        notaaluno2=notaaluno3;
        notaaluno3=aux1;
    }
      if(notaaluno3<notaaluno2){
        aux1=notaaluno3;
        notaaluno3=notaaluno2;
        notaaluno2=aux1;
      }
       if(notaaluno3<notaaluno1){
        aux1=notaaluno3;
        notaaluno3=notaaluno1;
        notaaluno1=aux1;
       }
     
    System.out.println("Aluno com menor nota: " +notaaluno1);
    if(notaaluno1>notaaluno2){
        aux1=notaaluno1;
        notaaluno1=notaaluno2;
        notaaluno2=aux1;
    } 
    if(notaaluno1>notaaluno3){
        aux1=notaaluno1;
        notaaluno1=notaaluno3;
        notaaluno3=aux1;
    }
    if(notaaluno2>notaaluno1){
        aux1=notaaluno2;
        notaaluno2=notaaluno1;
        notaaluno1=aux1;
    }
     if(notaaluno2>notaaluno3){
        aux1=notaaluno2;
        notaaluno2=notaaluno3;
        notaaluno3=aux1;
    }
      if(notaaluno3>notaaluno2){
        aux1=notaaluno3;
        notaaluno3=notaaluno2;
        notaaluno2=aux1;
      }
       if(notaaluno3>notaaluno1){
        aux1=notaaluno3;
        notaaluno3=notaaluno1;
        notaaluno1=aux1;
       }
       System.out.println("Aluno com maior nota: " +notaaluno2);
    if (notaaluno1>=60&&frequencia1>=45){
       media1=0;
       aux1=0;
    }
    else{
        media1=notaaluno1;
       aux1=1;
    }
    if (notaaluno2>=60&&frequencia2>=45){
        media2=0;
       aux2=0;
        }
    else{
        media2=notaaluno2;
       aux2=1;
    }
    if (notaaluno3>=60&&frequencia3>=45){
         media3=0;
       aux3=0;
    }
    else{
          media3=notaaluno3;
       aux3=1;
    }
    alunosaprovados=((media1+media2+media3)/aux1+aux2+aux3);
    System.out.println("Média das notas dos alunos aprovados : " +alunosaprovados);
    
    if (frequencia1<45){
        frequencia1=1;
    }
        else{
                frequencia1=0;
                }
   
     if (frequencia2<45){
        frequencia2=1;
     }
        else{
                frequencia2=0;
                }
    
      if (frequencia3<45){
        frequencia3=1;
      }
        else{
                frequencia3=0;
                }
      reprovadosporfrequencia= (frequencia1+frequencia2+frequencia3);
      System.out.println("Numero de alunos reprovados por frequência : " +reprovadosporfrequencia);
    }
        
                
    }
    



       
           
           
   
           
                
                
   









