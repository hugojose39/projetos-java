/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aed43;

/**
 *
 * @author User
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
    public void Mostrar(){
        Scanner S=new Scanner(System.in);
        if(Início==null){
            System.out.println("\nA fila não possui elementos...\n\n");
            S.nextLine();
        }else{
            System.out.print("Início ");
            Aux=Início;
            while(Aux!=null){
                System.out.printf("%1$5d", Aux.Num);
                Aux=Aux.Próx;
            }
            System.out.print("   Fim");
            S.nextLine();
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
            System.out.printf("\n O elemento %1$d foi retirado da fila...\n\n",x);
            S.nextLine();
        }
        
    }
}
