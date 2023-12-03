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
public class ClasseComandante {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    private String nome;
    private String co_piloto;
    private String ControladorAeronave;
    private String cod_dac;
    private String identificacaolicenca;
    private String horas_voo;

    public String getCo_piloto() {
        return co_piloto;
    }

    public void setCo_piloto(String co_piloto) {
        this.co_piloto = co_piloto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getControladorAeronave() {
        return ControladorAeronave;
    }

    public void setControladorAeronave(String controladorAeronave) {

        ControladorAeronave = controladorAeronave;
    }

    public String getCod_dac() {
        return cod_dac;
    }

    public void setCod_dac(String cod_dac) {

        this.cod_dac = cod_dac;
    }

    public String getIdentificacaolicenca() {
        return identificacaolicenca;
    }

    public void setIdentificacaolicenca(String identificacaolicenca) {
        this.identificacaolicenca = identificacaolicenca;
    }

    public String getHoras_voo() {
        return horas_voo;
    }

    public void setHoras_voo(String  horas_voo) {

        this.horas_voo = horas_voo;
    }

    private boolean ligado = false;

    public void setLigado(boolean alterarEstado) {
        if (desligado(true) != alterarEstado) {
            this.ligado = alterarEstado;
        }
    }

    public boolean desligado(boolean b) {
        return ligado;
    }

    public void ligarPiloto(boolean alterarEstado) {
        alterarEstado = true;
        boolean isLigado = false;
        if (isLigado = alterarEstado) {
            isLigado = alterarEstado;
        }
        char opcao = 's';
        Scanner scanner = new Scanner(System.in);
        System.out.println("LIGAR / DESLIGAR PILOTO AUTOMATICO [S/N]");
        opcao = scanner.nextLine().charAt(0);
        if (opcao == 's' || opcao == 'S') {
            desligado(true);
            System.out.println("PILOTO AUTOMATICO LIGADO");
        } else if (opcao == 'n' || opcao == 'N') {
            desligado(false);
            System.out.println("PILOTO AUTOMATICO DESLIGADO");
        }

    }

}
