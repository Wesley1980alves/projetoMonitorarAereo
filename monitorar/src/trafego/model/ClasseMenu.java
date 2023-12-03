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
public class ClasseMenu {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    // INSTANCIA DA CLASSETORRE
    ClasseTorre classeTorre = new ClasseTorre();

    // CLASSE COMANDANTE INSTANCIADA
    ClasseComandante classeComandante = new ClasseComandante();
    ClasseComandante classeComandante1 = new ClasseComandante();
    ClasseComandante classeComandante2 = new ClasseComandante();

    public boolean menu() {
        Scanner ler = new Scanner(System.in);
        boolean menu = true;

        while (true) {
            System.out.println(ANSI_BLUE + " SISTEMA DE CONTROLE AEREO \n\n " + ANSI_RESET);
            Scanner receberDados = new Scanner(System.in);
            System.out.println(ANSI_PURPLE + "1  >>>>>>><<<<<<< PAINEL MONITORAMENTO  COMANDANTES  " + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "2 >>>>>>><<<<<<<< PAINEL MONITORAMENTO AERONAVES " + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "3 >>>>>>><<<<<<<< PAINEL  MONITORAMENTO CLIMATEMPO" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "4>>>>>>><<<<<<<<< PAINEL DE ENVIO DE MENSAGENS " + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "5>>>>>><<<<<<<<<< PAINEL DE EMISSAO DE ALERTA" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "6>>>>>>><<<<<<<<< DESLIGAR SISTEMA DE MONITORAMENTO\n\n" + ANSI_RESET);

            int opcao = receberDados.nextInt();
            if (opcao == 6) {
                System.out.println("DESLIGANDO SISTEMA DE MONITORAMENTO");
                receberDados.close();
            }

            if (opcao == 1) {

                classeComandante.setNome("wesley alves");
                classeComandante.setControladorAeronave("PILOTO  ALVES");
                classeComandante.setCod_dac("542MWSP25");
                classeComandante.setHoras_voo("12");
                classeComandante.setIdentificacaolicenca("PILOTO COMERCIAL");

                // SETANDO VALORES  PARA CLASSE COMANDANTE
                classeComandante1.setNome("DENNIS MACHADO");
                classeComandante1.setControladorAeronave(" PILOTO MACHADO ");
                classeComandante1.setCod_dac("54MGP236");
                classeComandante1.setHoras_voo("56");
                classeComandante1.setIdentificacaolicenca("PILOTO MILITAR ");

                // SETANDO VALORES PARA CLASSE COMANDANTE
                classeComandante2.setNome("ANA CLARA ");
                classeComandante2.setControladorAeronave("PILOTO  ANA CLARA ");
                classeComandante2.setCod_dac("542MMM54");
                classeComandante2.setHoras_voo("23.222");
                classeComandante2.setIdentificacaolicenca("PILOTO PRIVADO");
                System.out.println("\n\n");

                System.out.println("DADOS COMANDANTE :" + classeComandante.getNome());
                System.out.println("DADOS COMANDANTE :" + classeComandante.getControladorAeronave());
                System.out.println("DADOS COMANDANTE :" + classeComandante.getCod_dac());
                System.out.println("DADOS COMANDANTE :" + classeComandante.getIdentificacaolicenca());
                System.out.println("DADOS COMANDANTE :" + classeComandante.getHoras_voo());
                System.out.println("\n\n");

                System.out.println("DADOS COMANDANTE :" + classeComandante1.getNome());
                System.out.println("DADOS COMANDANTE :" + classeComandante1.getControladorAeronave());
                System.out.println("DADOS COMANDANTE :" + classeComandante1.getCod_dac());
                System.out.println("DADOS COMANDANTE :" + classeComandante1.getIdentificacaolicenca());
                System.out.println("DADOS COMANDANTE :" + classeComandante1.getHoras_voo());
                System.out.println("\n\n");

                System.out.println("DADOS COMANDANTE :" + classeComandante2.getNome());
                System.out.println("DADOS COMANDANTE :" + classeComandante2.getControladorAeronave());
                System.out.println("DADOS COMANDANTE :" + classeComandante2.getCod_dac());
                System.out.println("DADOS COMANDANTE :" + classeComandante2.getIdentificacaolicenca());
                System.out.println("DADOS COMANDANTE :" + classeComandante2.getHoras_voo());

            }
            if (opcao == 2) {
                System.out.println("AERONAVES SOBREVOANDO ESPAÇO AEREO \n");

                // INSTANCIA DA CLASSE AERONAVE
                ClasseAeronave classeAeronave = new ClasseAeronave();

                // SETANDO VALORES PARA AERONAVES
                classeAeronave.setModelo("BOING - A320 ");
                classeAeronave.setCategoria_aeronave("COMERCIAL");
                classeAeronave.setIdentificacao_aeronave("PHP-255");
                classeAeronave.setAltitude(12.000);
                classeAeronave.setNivel_combustivel(25.000);
                classeAeronave.setRota_saida("AEROPORTO CONGONHAS");
                classeAeronave.setRota_chegada("AEROPORTO INTERNACIONAL DALLAS\n");

                System.out.println("MODELO : " + classeAeronave.getModelo());
                System.out.println("CATEGORIA: " + classeAeronave.getCategoria_aeronave());
                System.out.println("IDENTIFICACAO: " + classeAeronave.getIdentificacao_aeronave());
                System.out.println("ALTITUDE: " + classeAeronave.getAltitude());
                System.out.println("COMBUSTIVEL: " + classeAeronave.getNivel_combustivel());
                System.out.println("ROTA SAIDA: " + classeAeronave.getRota_saida());
                System.out.println("ROTA CHEGADA: " + classeAeronave.getRota_chegada());
            }
            if (opcao == 3) {
                System.out.println("INFORMAÇOES DE CLIMATEMPO NA REGIAO");
                classeTorre.emitirAlertClima("");

            }
            if (opcao == 4) {
                System.out.println("ENVIO DE MENSAGEM ");
                ClasseTorre classeTorre1 = new ClasseTorre();
                classeTorre1.enviarDados(null);

            }

            if (opcao == 5) {
                System.out.println("ENVIAR ALERTA SONORA DE PRESENCA DE AVES ");
                ClasseTorre classeTorre1 = new ClasseTorre();
                classeTorre1.alertSonoro("null");
            }

        }
    }


}
