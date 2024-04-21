// Willian Fedel 249931-1
package com.mycompany.trabalho;

//*@author willian

import javax.swing.JOptionPane;

public class Trabalho {

    public static void main(String[] args) {
        
        int comprimento = Integer.parseInt(JOptionPane.showInputDialog("Digite comprimento do vetor"));
        
        int[] vetor = new int[comprimento];
        
        for (int i = 0; i < comprimento; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do "+(i + 1)+"º elemento."));
        }
        String msgVetor = "";
        
        for (int i = 0; i < comprimento; i++) {
            if (i > 0) msgVetor += ", ";
            msgVetor += vetor[i];
        }
        JOptionPane.showMessageDialog(null, "Vetor escolhido: [" + msgVetor + "].");
       
        int metodoEscolhido = Integer.parseInt(JOptionPane.showInputDialog("Escolha método de ordenação: 1-Inserção, 2-Seleção, 3-Bolha"));
        
        long tempoInicial = 0, tempoFinal = 0;
        
        if (metodoEscolhido == 1) {
            tempoInicial = System.currentTimeMillis();
            
            //Médoto de ordenação inserção.
            int n = vetor.length;
            for (int i = 1; i < n; ++i) {
                int key = vetor[i];
                int j = i - 1;

                while (j >= 0 && vetor[j] > key) {
                    vetor[j + 1] = vetor[j];
                    j = j - 1;
                }
                vetor[j + 1] = key;
            }
            tempoFinal = System.currentTimeMillis();
            String insercao = "";
            for (int i = 0; i < comprimento; i++) {
                if (i > 0) insercao += ", ";
                insercao += vetor[i];
            }
            JOptionPane.showMessageDialog(null, "Vetor por ordenação Inserção: {" + insercao +" }." );
            JOptionPane.showMessageDialog(null, "O tempo de execução foi de " + (tempoFinal - tempoInicial) + " milissegundos.");

        } else if (metodoEscolhido == 2) {
            tempoInicial = System.currentTimeMillis();
            //Médoto de ordenação seleção.
            int s = vetor.length;
            for (int i = 0; i < s - 1; i++) {
                int minIdx = i;
                for (int j = i + 1; j < s; j++) {
                    if (vetor[j] < vetor[minIdx]) {
                        minIdx = j;
                    }
                }
                int temp = vetor[minIdx];
                vetor[minIdx] = vetor[i];
                vetor[i] = temp;
            }
            tempoFinal = System.currentTimeMillis();
            String selecao = "";
            for (int i = 0; i < comprimento; i++) {
                if (i > 0) selecao += ", ";
                selecao += vetor[i];
            }
            JOptionPane.showMessageDialog(null, "Vetor por ordenação seleção: {" + selecao +" }." );
            JOptionPane.showMessageDialog(null, "O tempo de execução foi de " + (tempoFinal - tempoInicial) + " milissegundos.");

        } else if (metodoEscolhido == 3){
            tempoInicial = System.currentTimeMillis();
            //Método de Ordenação bolha.
            int w = vetor.length;
            for (int i = 0; i < w - 1; i++) {
                for (int j = 0; j < w - i - 1; j++) {
                    if (vetor[j] > vetor[j + 1]) {
                        int temp = vetor[j];
                        vetor[j] = vetor[j + 1];
                        vetor[j + 1] = temp;
                    }
                }
            }
            tempoFinal = System.currentTimeMillis();
            String bolha = "";
            for (int i = 0; i < comprimento; i++) {
                if (i > 0) bolha += ", ";
                bolha += vetor[i];
            }
            JOptionPane.showMessageDialog(null, "Vetor por ordenação bolha: {" + bolha +" }." );  
            JOptionPane.showMessageDialog(null, "O tempo de execução foi de " + (tempoFinal - tempoInicial) + " milissegundos.");
        }      
        

    }
}
