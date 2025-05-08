/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadepilha;

/**
 *
 * @author iagom
 */
import java.util.Stack;
import java.util.Scanner;
public class AtividadePilha {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String palavra = input.nextLine();
        String[] palavras = palavra.split(" ");
        for(int i = 0; i < palavras.length; i++){
            Pilha pilha = new Pilha(palavras[i].toCharArray());
            
            
        }
        
    }
}
