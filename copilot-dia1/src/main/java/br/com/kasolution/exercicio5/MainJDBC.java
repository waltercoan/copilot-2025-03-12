package br.com.kasolution.exercicio5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainJDBC {

    public static void main(String[] args) {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=exemplo";
        try {
            Connection connection = conectarBanco(url);
            if (connection != null) {
                System.out.println("Conexão estabelecida com sucesso!");
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection conectarBanco(String url) throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            throw e;
        }
        return connection;
    }
}
