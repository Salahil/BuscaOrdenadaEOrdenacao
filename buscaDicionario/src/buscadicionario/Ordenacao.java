/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscadicionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import buscadicionario.buscaDicionario;
/**
 *
 * @author aluno
 */
public class Ordenacao {
    
    String[] vetorDicionario = new String[307374];
       public String[] vetorSelection(String[] vetorDicionario){
           
           buscaDicionario busca = new buscaDicionario();
           busca.vetorPort(vetorDicionario);
           int posicaomenor, aux;
           
         for(int i = 0; i < vetorDicionario.length;i++ ){
           posicaomenor = i;  
           for(int j = i+1; j < vetorDicionario.length;j++){
             if(vetorDicionario[j] != null && vetorDicionario[j].length() < vetorDicionario[posicaomenor].length()){ 
               posicaomenor = j;
            }
           }
           aux = posicaomenor;
           String temp = vetorDicionario[posicaomenor];
           vetorDicionario[posicaomenor] = vetorDicionario[i];
           vetorDicionario[i] = temp;
         } 
         for (int i = 0; i < vetorDicionario.length; i++) {
         System.out.println(vetorDicionario[i]);
        } 
        return vetorDicionario; 
        
    
  }
       
}