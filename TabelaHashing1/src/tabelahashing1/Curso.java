/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelahashing1;

/**
 *
 * @author User
 */import java.util.*;

public class Curso {
public String CódCurso;
public String NomeCurso;
public Curso(){
UUID MeuUUID=UUID.randomUUID();
this.CódCurso=MeuUUID.toString().toUpperCase().substring(15, 18);
this.NomeCurso="";
}
public void LêCurso(){
Scanner S=new Scanner(System.in);
System.out.printf("Código do Curso: %1$s\n",this.CódCurso);
System.out.print("Nome do Curso..: ");
this.NomeCurso=S.nextLine();
}
}

