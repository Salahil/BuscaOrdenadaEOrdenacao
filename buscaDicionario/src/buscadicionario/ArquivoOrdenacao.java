/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscadicionario;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author User
 */
public class ArquivoOrdenacao {
    public static void salvarTXT(String[] vetorDePalavras, String nomeTipoOrdenador) throws Exception {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\User\\Desktop\\BuscaOrdenadaEOrdenacao\\buscaDicionario\\src\\arquivotexto\\oi.txt"))){
            String listaPalavras = "";
            for(String palavra:vetorDePalavras){
                listaPalavras += palavra + "\n";
            }
            bw.write(listaPalavras);
        } catch (Exception e){
            throw new Exception("Nao foi possivel realizar o salvar do arquivo TXT: "+e.getMessage());
        }
    }
}
