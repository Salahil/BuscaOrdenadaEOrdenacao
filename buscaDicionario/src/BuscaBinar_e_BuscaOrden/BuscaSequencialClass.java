/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuscaBinar_e_BuscaOrden;

/**
 *
 * @author Julio
 */
public class BuscaSequencialClass { // para caso você procura algo em um vetor que não está ordenado... o q provavelmente não vai ser o caso
    public int buscaSequencialSemOrdenacao (String[] vetorDeBusca, String parametroDeBusca){
        for (int indice = 0; indice < vetorDeBusca.length; indice++){
            if (vetorDeBusca[indice].equals(parametroDeBusca)) return indice; //retorna a posição do vetor que você procura
        }
        return -1; // retorna um aviso caso não tenha encontrado o que você procura
    }
    
    public int buscaSequencial (String[] vetorDeBusca, String parametroDeBusca){
        int coiso = -1; // aqui é pra no caso de eu não encontrar a string... pq no caso, se não tiver ele não recebe nada
        for (int indice = 0; indice < vetorDeBusca.length; indice++) {
            if (vetorDeBusca[indice].equals(parametroDeBusca)) {
                coiso = indice; // se eu encontrar o que eu procuro ele será salvo
                while (indice + 1 < vetorDeBusca.length && vetorDeBusca[indice + 1].equals(parametroDeBusca)){ // pra não peger coordenada errada, sendo que eu estou considerando a primeira como certa.
                    indice++;
                }
                break;
            }
            
        }
        return coiso; // retornando a resposta
    }
}
