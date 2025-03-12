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
        System.out.println(verificarParOuImpar(5)); // Exemplo de uso
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

    public static void chamarApiRest(String urlString) {
        try {
            // Cria um objeto URL a partir da string fornecida
            URL url = new URL(urlString);
            
            // Abre uma conexão HTTP com a URL
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            
            // Define o método de requisição como "GET"
            conn.setRequestMethod("GET");

            // Obtém o código de resposta da requisição
            int responseCode = conn.getResponseCode();
            
            // Verifica se o código de resposta é HTTP_OK (200)
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Cria um BufferedReader para ler a resposta da requisição
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                // Lê a resposta linha por linha e adiciona ao StringBuilder
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                // Fecha o BufferedReader
                in.close();

                // Imprime a resposta completa no console
                System.out.println(response.toString());
            } else {
                // Imprime uma mensagem indicando que a requisição não funcionou
                System.out.println("GET request not worked");
            }
        } catch (IOException e) {
            // Captura e imprime o stack trace de qualquer IOException
            e.printStackTrace();
        }
    }
    
    public static String verificarParOuImpar(int numero) {
        if (numero % 2 == 0) {
            return "Par";
        } else {
            return "Ímpar";
        }
    }
    
}
