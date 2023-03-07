/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuscaBinar_e_BuscaOrden;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Julio
 */
public class BuscaBinariaClass {
    public static int buscaBinaria (String[] vetorDeBusca, String ParametroDeBusca){
        //Arrays.sort(vetorDeBusca,Comparator.comparingInt(String::length)); /* para o caso do vetor chegar na classe sem estar ordenado... o que eu duvido*\
        int primeiroTreco = 0;
        int ultimoTreco = vetorDeBusca.length - 1;
        while (primeiroTreco <= ultimoTreco) {
            int trecoDoMeio = (primeiroTreco + ultimoTreco) / 2;
            int resultDaComparacao = ParametroDeBusca.compareTo(vetorDeBusca[trecoDoMeio]);
            if (resultDaComparacao == 0){
                return trecoDoMeio; //retornando a posição da string encontrada
            } else if (resultDaComparacao < 0){
                ultimoTreco = trecoDoMeio - 1;
            } else {
                ultimoTreco = trecoDoMeio + 1;
            }
        }
        return -1; // retornando um aviso de que não foi encontrada
    }
}
