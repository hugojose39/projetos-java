/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fornotasefrequencias;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Fornotasefrequencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double notaaluno=0,mediadosalunos,totalnotas=0;
     int frequencia,contador;
    Scanner ent = new Scanner (System.in);
   for(contador=1;contador<=50;contador++){
    System.out.print("Digite a nota do aluno : ");
    notaaluno=ent.nextInt();
    System.out.println("Digite a frequência do anulo : ");
    frequencia=ent.nextInt();
    totalnotas=totalnotas+notaaluno;
    if (notaaluno>=60&&frequencia>=45){
    System.out.println("O aluno foi APROVADO");
    }
    else{
        if(((notaaluno<60&&frequencia<45)||(notaaluno>=60&&frequencia<45)||(notaaluno<60&&frequencia>=45))){
            System.out.println("O aluno foi  REPROVADO");
    }
    }
    }
   mediadosalunos=totalnotas/contador;
   System.out.println("A média de todas as notas dos alunos foi :" +mediadosalunos);
    }
}

    
    

