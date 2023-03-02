/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buscadicionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author User
 */
// Lembre do Rock Lee todo Cagado!
    // lembre do rock lee todo cagado
    // lembre do rock lee todo cagado
        // lembre do rock lee todo cagado
    
    public class BuscaDicionario {
     public static String[] vetorDicionarioPort = new String[307374];
     public static String[] vetorDicionarioPortExibs = new String[307374];
     public static String[] vetorPort(String[] Vetor){
    try{
     //String Arquivo = "C:\\Users\\User\\Documents\\NetBeansProjects\\buscaDicionario\\src\\arquivotexto\\Portuguese (Brazilian).dic.txt";
     FileReader file = new FileReader("C:\\Users\\aluno\\Desktop\\BuscaOrdenadaEOrdenacao\\buscaDicionario\\src\\arquivotexto\\Portuguese (Brazilian).dic.txt");
     BufferedReader buffRead = new BufferedReader(file);
     String linha = buffRead.readLine();
     int i = 0;
     while (linha != null && i < vetorDicionarioPort.length) {
                vetorDicionarioPort[i] = linha; 
                i++;
                linha = buffRead.readLine(); // Lê a próxima linha do arquivo
            }
     buffRead.close();
     file.close();
     
     
    } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
   
    for (String s : vetorDicionarioPort){
        //int i = 0;
        if (s != null){
            int comprimento = s.length();
            //vetorDicionarioPortExibs[i] = s;
            //i = i + 1;
            System.out.println(s + ": " + comprimento);
            //System.out.println(vetorDicionarioPortExibs);
            
        }
    }
        
    return vetorDicionarioPort;
     }
    }

//lembra do rock lee todo cagado!