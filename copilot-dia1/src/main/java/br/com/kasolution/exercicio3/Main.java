package br.com.kasolution.exercicio3;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    public static void main(String[] args) {
        // Define um endereço de e-mail para validação
        String email = "exemplo@dominio.com";
        
        // Verifica se o e-mail está em branco ou vazio
        if (email == null || email.trim().isEmpty()) {
            System.out.println("O e-mail não pode estar em branco ou vazio.");
            return;
        }
        
        // Chama o método validarEmail para verificar se o e-mail é válido
        boolean isValid = validarEmail(email);
        
        // Imprime o resultado da validação no console
        System.out.println("O email " + email + " é válido? " + isValid);
    }

    /**
     * Método para validar um endereço de e-mail usando expressão regular.
     * 
     * @param email O endereço de e-mail a ser validado.
     * @return true se o e-mail for válido, false caso contrário.
     */
    public static boolean validarEmail(String email) {
        // Expressão regular que define o formato válido de um e-mail
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        
        // Compila a expressão regular em um padrão
        Pattern pattern = Pattern.compile(emailRegex);
        
        // Cria um matcher para verificar se o e-mail corresponde ao padrão
        Matcher matcher = pattern.matcher(email);
        
        // Retorna true se o e-mail corresponder ao padrão, false caso contrário
        return matcher.matches();
    }
}
