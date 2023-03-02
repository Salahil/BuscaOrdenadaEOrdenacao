/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscadicionario;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import buscadicionario.BuscaDicionario;

/**
 *
 * @author aluno
 */
/*
public static void insertionSort(int[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; ++i) {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}
*/
public class Ordenacao {
    public static void insertionSort(String[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; ++i) {
        String key = arr[i];
        String posAnt = arr [i - 1];
        if ()
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}
    String[] vetorDicionario = new String[307374];
       public void vetorSelection(){
           
           BuscaDicionario busca = new BuscaDicionario();
           busca.vetorPort(vetorDicionario);
           
         
       }
       public String[] vetorOrdenado(){
           String[] Ordenador = BuscaDicionario.vetorDicionarioPort;
           return Ordenador;
       }
}

