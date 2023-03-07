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
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Ordenacao selec = new Ordenacao();
        buscaDicionario b = new buscaDicionario();
        String[] vetorDicionario = new String[307374];
        b.vetorPort(vetorDicionario); // preenche o vetor a partir do arquivo de texto
        selec.vetorSelection(vetorDicionario); // ordena o vetor
        ArquivoOrdenacao.salvarTXT(vetorDicionario,"SelectionSort");
        for (String palavra : vetorDicionario) {
        System.out.println(palavra);
        }
        /*for (int i = 0; i < vetorDicionario.length; i++) {
         System.out.println(vetorDicionario[i]);
         }  */      
    }
    
}
