/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traballho02;

import java.util.*;
import java.awt.AWTException;

import java.awt.Robot;

import java.awt.event.KeyEvent;

import java.io.IOException;
import java.util.*;
/**
 *
 * @author User
 */import java.util.*;
public class Traballho02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner S = new Scanner(System.in);
       Random ale =new Random ();
        OperFila MinhaFila=new OperFila();
        int Op;
        int N;
        do{
            ConsoleClear();
        System.out.println("Digite a opção desejada");
            System.out.println("------------------------");
            System.out.println("Opções:\n");
            System.out.println("1 - Retirar senha!!");
            System.out.println("2 - Chamar cliente!!");
            System.out.println("3 - Sair");
            System.out.print("\nDigite a Opção:\n");
            Op = Integer.parseInt(S.nextLine());
            if (Op == 1) {
                N = ale.nextInt(100);
                MinhaFila.Inserir(N);
                OperFila x = new OperFila();
               System.out.printf("Sua senha é %1$d favor aguardar o atendimento!!\n\n",N );
               S.nextLine();
                
            }

            if (Op == 2) {
                MinhaFila.Retirar();


            }
            
        }while(Op!=3);

    }  
    static void ConsoleClear() {

        try {

            Robot robot = new Robot();

            robot.setAutoDelay(5);

            robot.keyPress(KeyEvent.VK_CONTROL);

            robot.keyPress(KeyEvent.VK_L);

            robot.keyRelease(KeyEvent.VK_CONTROL);

            robot.keyRelease(KeyEvent.VK_L);

        } catch (AWTException ex) {

            System.out.println(ex.getMessage());

        }

    }
}