/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trafego.model;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author wesley
 */
public class ClasseTocarSom {

    public void ClasseTocarSomPassaros() {
        try {

            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src\\som\\passaros.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            clip.loop(0); 
        } catch (Exception ex) {
            System.out.println("Erro ao executar SOM!");
            ex.printStackTrace();
        }
    }

    public void ClasseTocarSomAcidente() {
        try {

            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src\\som\\pousoForcado.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            clip.loop(0); 
        } catch (Exception ex) {
            System.out.println("Erro ao executar SOM!");
            ex.printStackTrace();
        }
    }

    public void ClasseTocarSomIncendio() {
        try {

            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src\\som\\acidentePista.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            clip.loop(0); 
        } catch (Exception ex) {
            System.out.println("Erro ao executar SOM!");
            ex.printStackTrace();
        }
    }

    public void ClasseTocarSomPouso() {
        try {

            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src\\som\\sirene.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            clip.loop(0); 
        } catch (Exception ex) {
            System.out.println("Erro ao executar SOM!");
            ex.printStackTrace();
        }
    }

}
