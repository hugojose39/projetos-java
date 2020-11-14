/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forewhile;

/**
 *
 * @author User
 */
public class Forewhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int num=1,contador,numeroinvertido,quociente,alg,i,resto;
    for(contador=num;contador<5001;contador++){
        quociente=contador;
        alg=0;
        while(quociente!=0){
            quociente=quociente/10;
           alg++;
            }
        quociente=num;
        numeroinvertido=0;
        for(i=1;i<=alg;i++);{
        resto=quociente%10;
        quociente=quociente/10;
        numeroinvertido=numeroinvertido+resto*(int)Math.pow(10,alg-i);
    if(contador==numeroinvertido){
    System.out.println("Os numeros são:" +contador);
    }
    }
    }
    }
}
    
