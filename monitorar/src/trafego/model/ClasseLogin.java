/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trafego.model;

import java.util.Scanner;

/**
 *
 * @author wesley
 */
public class ClasseLogin {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    private String senha;
    private String usuario;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean autenticar() {
        Scanner receberLogin = new Scanner(System.in);
        boolean logado = false;

        while (!logado) {
            System.out.println(ANSI_BLUE + "DIGITE NOME PARA ABRIR SISTEMA DE TRAFEGO AEREO  " + ANSI_RESET);
            String nome = receberLogin.nextLine();
            System.out.println(ANSI_BLUE + "DIGITE SENHA DE ACESSO" + ANSI_RESET);
            String senhaAcesso = receberLogin.nextLine();
            if (nome.equals("nave") || nome.equals("NAVE") & senhaAcesso.equals("BRAVOALPHA") || senhaAcesso.equals("bravoalpha")) {

                ClasseMenu classeMenu = new ClasseMenu();
                classeMenu.menu();
                System.out.println(ANSI_BLUE + "BEM VINDO AO SISTEMA DE TRAFEGO AEREO BRASILEIRO\n" + ANSI_RESET);

                logado = true;
                break;
            } else {
                System.out.println(ANSI_YELLOW + " DIGITE E TENTE NOVAMENTE " + ANSI_RESET);
            }

        }

        return true;
    }

}
