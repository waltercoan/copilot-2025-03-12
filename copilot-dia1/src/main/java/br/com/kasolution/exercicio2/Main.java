package br.com.kasolution.exercicio2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

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

    public static void chamarApiRest(String apiUrl) {
        try {
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                System.out.println(response.toString());
            } else {
                System.out.println("GET request not worked");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    
}
