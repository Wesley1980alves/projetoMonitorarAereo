/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trafego.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author wesley
 */
public class ClasseTorre {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    private String nomeControlador;
    private String numeroIdentificacao;
    private String horasEntrada;
    private String horassaida;


    private Scanner sc;

   

    public String getNomeControlador() {
        return nomeControlador;
    }

    public void setNomeControlador(String nomeControlador, String codigo) {

        this.nomeControlador = nomeControlador;

    }

    public String getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(String numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public String getHorasEntrada() {
        return horasEntrada;
    }

    public void setHorasEntrada(int horasEntrada) {

        this.horasEntrada = String.valueOf(horasEntrada);
    }

    public String getHorassaida() {

        return horassaida;
    }

    public void setHorassaida(int horassaida) {
        this.horassaida = String.valueOf(horassaida);
    }

    //METODOS DA CLASSE TORRE
    public boolean receberDados(boolean mensagem) {
        mensagem = false;

        if (mensagem != false) {
            System.out.println("MENSAGEM RECEBIDA COM SUCESSO, PROSSIGA");
        } else {
            System.out.println("MENSAGEM NAO RECEBIDA , CONFIRME ENVIO");
        }

        return true;
    }

    public String enviarDados(String dados) {
        Scanner lerDados = new Scanner(System.in);
        System.out.println("DIGITE A MENSAGEM QUE DESEJA ENVIAR :");
        dados = lerDados.nextLine();
        if (dados == dados) {
            System.out.println("MENSAGEM ENVIADA COM SUCESSO ");
        }
        return dados;

    }

    public void emitirAlertClima(String clima) {
        System.out.println("NUVENS: Esparsas \n TEMPERATURA:  29 graus \n SENSAÇAO: "
                + " 32 \n UMIDADE DO AR:  66%  \nPRESSAO:  1009hPa \n VENTO:  11KM/H");

    }

    public boolean alertSonoro(String sonoro) {
        int opcao;

        Scanner sc = new Scanner(System.in);
        System.out.println(" 1       ALERTA DE AVES  ");
        System.out.println(" 2      ALERTA DE INCÊNDIOS   ");
        System.out.println(" 3      ALERTA DE ACIDENTES NA PISTA  ");
        System.out.println(" 4       ALERTA DE AERONAVE EM POUSO DE EMERGÊNCIA ");
        opcao = sc.nextInt();
        if (opcao == 1) {

            System.out.println("   PRESENÇA DE PÁSSAROS NAS APROXIMIDADES DO AEROPORTO ");

        } else if (opcao == 2) {
            System.out.println(" INCÊNDIO NO AEROPORTO ");
        } else if (opcao == 3) {
            System.out.println("  ACIDENTE NA PISTA");

        } else if (opcao == 4) {
            System.out.println(" AERONAVE EM POUSO DE EMERGÊNCIA");

        }

        return true;
    }

}
