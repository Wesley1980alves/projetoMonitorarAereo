/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trafego.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Scanner;
import trafego.view.TelaInicial;

/**
 *
 * @author wesley
 */
public class Main {
    

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
      ClasseLogin classeLogin = new ClasseLogin();
        TelaInicial apresentar = new TelaInicial();
        apresentar.setVisible(true);
        apresentar.setLocationRelativeTo(null);
    }
}

/*
        System.out.println(ANSI_BLUE + "   SISTEMA DE TRÁFEGO AÉREO  BRASILEIRO  \n  " + ANSI_RESET);


        System.out.println(ANSI_BLUE + "****************   ||   *****************   " + ANSI_RESET);
        System.out.println(ANSI_BLUE + " ***************   ||   ***************      " + ANSI_RESET);
        System.out.println(ANSI_BLUE + "   *************   ||   *************        " + ANSI_RESET);
        System.out.println(ANSI_BLUE + "     ***********   ||   ***********          " + ANSI_RESET);
        System.out.println(ANSI_BLUE + "       **********  ||   *********            " + ANSI_RESET);
        System.out.println(ANSI_BLUE + "        *********  ||   *******              " + ANSI_RESET);
        System.out.println(ANSI_BLUE + "           ******  ||   *****                " + ANSI_RESET);
        System.out.println(ANSI_BLUE + "              ************                 " + ANSI_RESET);
        System.out.println("\n\n\n");

        System.out.println(ANSI_BLUE + "1  LOGAR SISTEMA  " + ANSI_RESET);
        System.out.println(ANSI_BLUE + "2  DESLIGAR TELA  \n\n" + ANSI_RESET);
        Scanner ler = new Scanner(System.in);
        int entrar = ler.nextInt();
        if(entrar == 1){
            classeLogin.autenticar();

        } else if (entrar==2) {
            ler.close();

        }*/


    
 
