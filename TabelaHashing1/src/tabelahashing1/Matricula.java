/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelahashing1;

import java.util.*;
public class Matricula {
    public String NumMatricula;
    public String DataMatricula;
    public String CódCurso;
    public String CódAluno;
    public Matricula(){
        UUID MeuUUID=UUID.randomUUID();
        this.NumMatricula=MeuUUID.toString().toUpperCase().substring(15,18);
    }
    public void LeMatricula(){
        Scanner S=new Scanner(System.in);
        System.out.printf("Numero da matricula: %1$s\n",this.NumMatricula);
        System.out.print("Data da Matricula...:");
        this.DataMatricula=S.nextLine();
         System.out.print("Codigo do aluno....:");
        this.CódAluno=S.nextLine();
         System.out.print("Codigo do Curso...:");
        this.CódCurso=S.nextLine();
        
        
    }
}
