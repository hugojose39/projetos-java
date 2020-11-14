/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelahashing1;

import java.util.*;
import java.util.UUID;

public class Aluno {
public String CódAluno;
public String NomeAluno;
public Aluno(){
UUID MeuUUID=UUID.randomUUID();
this.CódAluno=MeuUUID.toString().toUpperCase().substring(15,18);
this.NomeAluno="";
}
public void LêAluno(){
Scanner S=new Scanner(System.in);
System.out.printf("Código do Aluno: %1$s\n",this.CódAluno);
System.out.print("Nome...........: ");
this.NomeAluno=S.nextLine();
}
}
