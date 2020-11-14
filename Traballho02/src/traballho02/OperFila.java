/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traballho02;

/**
 */import java.util.*;

class Elemento{
public int Num;
public Elemento Próx;

public Elemento(){
Num=0;
Próx=null;
}
}
public class OperFila {
    private Elemento Início;
    private Elemento Fim;
    private Elemento Aux;
    public OperFila(){
        Início=null;
        Fim=null;
    }
    public void Inserir(int Valor){
        Elemento Novo=new Elemento();
        Novo.Num=Valor;
        Novo.Próx=null;
        if(Início==null){
            Início=Novo;
            Fim=Novo;
        }else{
            Fim.Próx=Novo;
            
            Fim=Novo;
        }
    }
    public void Retirar(){
        
        Scanner S =new Scanner(System.in);
        int x;
        if(Início==null){
            System.out.println("\nA fila não possui nenhum elemento");
            S.nextLine();
        }else{
            x=Início.Num;
            Início=Início.Próx;
            System.out.printf("Portador da senha %1$d favor comparecer ao balcão...\n\n",x);
            S.nextLine();
        }
        
    }
}
