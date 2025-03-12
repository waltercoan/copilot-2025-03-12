package br.com.kasolution.exercicio2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        gerarArquivoCSV("dados.csv");
    }

    //definir uma função java para gerar um arquivo .csv com alguns dados dentro
    public static void gerarArquivoCSV(String nomeArquivo) {
        // Criar um arquivo CSV com o nome especificado
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            // Escrever o cabeçalho do CSV
            writer.write("Nome,Idade,Email\n");
            
            // Adicionar alguns dados de exemplo
            writer.write("João,30,email@email.com");
            //fechar o arquivo

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
}
