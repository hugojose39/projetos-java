/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste2;

import java.util.Random;

/**
 *
 * @author User
 */
public class Teste2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        int tamanho = 10;
        int[] Vetor = new int[tamanho];
        Random ale = new Random();
        for (int i = 0; i < tamanho; i++) {
            Vetor[i] = ale.nextInt(100);
            System.out.printf("%1$d ", Vetor[i]);
        }

        int Resultado = SomaVetor(Vetor, tamanho);

        System.out.println("\nResultado da soma = " + Resultado);
    }

    static int SomaVetor(int[] Vet, int n) {
        n--;
        int Res = Vet[n];

        if (n == 0) {
            return Res;
        } else {
            return Res + SomaVetor(Vet, n);
        }
    }
}
