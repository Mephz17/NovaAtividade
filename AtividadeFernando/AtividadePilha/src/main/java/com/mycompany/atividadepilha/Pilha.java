/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadepilha;

/**
 *
 * @author iagom
 */
public class Pilha {
    private int tamanho;
    private int indice;
    private char topo;
    private char[] elementos;
    public Pilha(char[] palavra){
        this.tamanho = palavra.length;
        this.indice = palavra.length - 1;
        elementos = palavra;
        this.topo = elementos[indice];
    }
    
    public void add(char[] palavra){
        if(isFull()){
            System.out.println("Pilha cheia");
            return;
        }
        this.topo = palavra[palavra.length - 1];
        indice = palavra.length;
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Pilha vazia");
            return;
        }
        indice--;
        this.topo = elementos[indice];
        
    }
    public char top(){
        if(isEmpty()){
            return 'd';
        }
        return this.topo;
    }
    public void printar(){
        while(indice > 0){
            System.out.print(this.topo);
            pop();
        }
    }
    private boolean isFull(){
        return this.tamanho == this.indice;
    }
    private boolean isEmpty(){
        return this.indice == 0;
    }
}
