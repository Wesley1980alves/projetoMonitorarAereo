
package trafego.model;

import java.util.ArrayList;


public class ClasseAeronave {
    
    private String modelo;
    private double altitude;
    private double velocidade;
    private double nivel_combustivel;
    private String rota_saida;
    private String rota_chegada;
    private String identificacao_aeronave;
    private String categoria_aeronave;
  

    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getIdentificacao_aeronave() {
        return identificacao_aeronave;
    }

    public void setIdentificacao_aeronave(String identificacao_aeronave) {
        this.identificacao_aeronave = identificacao_aeronave;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getNivel_combustivel() {
        return nivel_combustivel;
    }

    public void setNivel_combustivel(double nivel_combustivel) {
        this.nivel_combustivel = nivel_combustivel;
    }

    public String getRota_saida() {
        return rota_saida;
    }

    public void setRota_saida(String rota_saida) {
        this.rota_saida = rota_saida;
    }

    public String getRota_chegada() {
        return rota_chegada;
    }

    public void setRota_chegada(String rota_chegada) {
        this.rota_chegada = rota_chegada;
    }

    public String getCategoria_aeronave() {
        return categoria_aeronave;
    }

    public void setCategoria_aeronave(String categoria_aeronave) {
        this.categoria_aeronave = categoria_aeronave;
    }

    private static class Item {

        public Item() {
        }
    }
}

    
    

