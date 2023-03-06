/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buscadicionario;

/**
 *
 * @author User
 */
public class Resultados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] vetorDicionario = new String[307374];
        Ordenacao selec = new Ordenacao();
        selec.vetorSelection(vetorDicionario);
        /*for (int i = 0; i < vetorDicionario.length; i++) {
         System.out.println(vetorDicionario[i]);
         }  */      
    }
    
}
