/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelahashing1;
import java.util.*;
public class TabelaHashing1 {

  
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        Dados Cadastro=new Dados();
        Aluno MeuAluno;
        Curso MeuCurso;
        Matricula MinhaMatricula;
        do{
            //ConsoleClear();
            MeuAluno=new Aluno();
            MeuAluno.LêAluno();
            Cadastro.GravaDados(MeuAluno);
            System.out.print("\nDeseja cadastrar outro aluno?(S/N)");
            
        }while(S.nextLine().toUpperCase().charAt(0)!='N');
            do{
            //ConsoleClear();
            MeuCurso=new Curso();
            MeuCurso.LêCurso();
            Cadastro.GravaDados(MeuCurso);
            System.out.print("\nDeseja cadastrar outro curso?(S/N)");
            
        }while(S.nextLine().toUpperCase().charAt(0)!='N');
                do{
            //ConsoleClear();
            MinhaMatricula=new Matricula();
            MinhaMatricula.LeMatricula();
            Cadastro.GravaDados(MinhaMatricula);
            System.out.print("\nDeseja cadastrar outra Matricula?(S/N)");
            
        }while(S.nextLine().toUpperCase().charAt(0)!='N');
        
        Cadastro.ListaMatricula();
    }
    
}
