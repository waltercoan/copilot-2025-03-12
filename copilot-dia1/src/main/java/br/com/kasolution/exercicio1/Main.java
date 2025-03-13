package br.com.kasolution.exercicio1;

public class Main {
    // defina um método main para esta classe
    public static void main(String[] args) {
        // defina o código para chamar o método calcularMedia
        double[] numeros = {10.0, 20.0, 30.0, 40.0, 50.0};
        double media = calcularMedia(numeros);
        // defina o código para imprimir a média
        System.out.println("A média é: " + media);
    }        

    // defina um método para calcular a média de uma lista de número
    public static double calcularMedia(double[] numeros) {
        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }
        return soma / numeros.length;
    }

    //define um método que recebe por parametro uma lista de nomes e imprime em tela
    public static void imprimirNomes(String[] nomes) {
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
    //defina um método que recebe por parametro uma lista de nomes e imprime em tela utilizam o método stream
    public static void imprimirNomesStream(String[] nomes) {
        java.util.Arrays.stream(nomes).forEach(System.out::println);
    }

    // define um método que recebe dois números inteiros como parâmetro, faz a soma e retorna o resultado
    public static int somar(int num1, int num2) {
        return num1 + num2;
    }
}
