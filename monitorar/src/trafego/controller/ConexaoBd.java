package trafego.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wesley
 */
public class ConexaoBd {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Não obteve um conexão com banco de dados ");
        }
    }
}
