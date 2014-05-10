package finalproject;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.sound.sampled.*;
/*
 *
 * @author Cory
 */
public class SoundButton extends JButton implements ActionListener
{
    String Sound;
    
    public SoundButton()
    {
        this.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
      try
      {
        Clip clip = AudioSystem.getClip();
        AudioInputStream inputStream = AudioSystem.getAudioInputStream(this.getClass().getResource(Sound));
        clip.open(inputStream);
        clip.start();
      } catch(Exception blah){System.out.println("Could not find file");} //Mandatory for Audio-related functions >:(
    };
};
