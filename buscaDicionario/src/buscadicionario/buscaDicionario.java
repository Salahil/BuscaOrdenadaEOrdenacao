/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscadicionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author aluno
 */
public class buscaDicionario {
   String[] vetorDicionario = new String[307374];
   
   public String[] vetorPort(String[] Vetor){
       
       
       
    try{
     //String Arquivo = "C:\\Users\\User\\Documents\\NetBeansProjects\\buscaDicionario\\src\\arquivotexto\\Portuguese (Brazilian).dic.txt";
     FileReader file = new FileReader("C:\\Users\\User\\Documents\\NetBeansProjects\\buscaDicionario\\src\\arquivotexto\\Portuguese (Brazilian).dic.txt");
     BufferedReader buffRead = new BufferedReader(file);
     String linha = buffRead.readLine();
     int i = 1;
     while (linha != null && i < vetorDicionario.length) {
                vetorDicionario[i] = linha; 
                i++;
                linha = buffRead.readLine(); // Lê a próxima linha do arquivo
            }
     buffRead.close();
     file.close();
     
     
    } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
   
    /*for (String s : vetorDicionario) {
      if(s != null){
        int comprimento = s.length();
        System.out.println(s + ":" + comprimento);
      }    
        }*/
    return vetorDicionario;
}
}
