package finalproject;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Cory
 */
public class FinalProjectTester extends JFrame 
{
    JPanel Board = new JPanel();
    SoundButton buttons[] = new SoundButton[16];
    
    ImageIcon[] icons = 
    {
        new ImageIcon(this.getClass().getResource("Images/Webbie.png")),
        new ImageIcon(this.getClass().getResource("Images/BenChang.png")),
        new ImageIcon(this.getClass().getResource("Images/Patrick.png")),
        new ImageIcon(this.getClass().getResource("Images/MrSparkle.png")),
        new ImageIcon(this.getClass().getResource("Images/BobChickenLeg.png")),
        new ImageIcon(this.getClass().getResource("Images/JustLikeThis.png")),
        new ImageIcon(this.getClass().getResource("Images/SteveCarell.png")),
        new ImageIcon(this.getClass().getResource("Images/Deadpool.png")),
        new ImageIcon(this.getClass().getResource("Images/Sheldon.png")),
        new ImageIcon(this.getClass().getResource("Images/Cuttas.png")),
        new ImageIcon(this.getClass().getResource("Images/MyLeg.png")),
        new ImageIcon(this.getClass().getResource("Images/EarlyCuyler.png")),
        new ImageIcon(this.getClass().getResource("Images/PillowyMounds.png")),
        new ImageIcon(this.getClass().getResource("Images/Rockso.png")),
        new ImageIcon(this.getClass().getResource("Images/ChickenArise.png")),
        new ImageIcon(this.getClass().getResource("Images/PeterGriffin.png"))
    };
    
    String[] sounds = 
    {
        "Sounds/Webbie.wav",
        "Sounds/BenChang.wav",
        "Sounds/Patrick.wav",
        "Sounds/MrSparkle.wav",
        "Sounds/BobChickenLeg.wav",
        "Sounds/JustLikeThis.wav",
        "Sounds/SteveCarell.wav",
        "Sounds/Deadpool.wav",
        "Sounds/Sheldon.wav",
        "Sounds/Cuttas.wav",
        "Sounds/MyLeg.wav",
        "Sounds/EarlyCuyler.wav",
        "Sounds/PillowyMounds.wav",
        "Sounds/Rockso.wav",
        "Sounds/ChickenArise.wav",
        "Sounds/PeterGriffin.wav"
    };
    
    
    public static void main(String[] args) 
    {
        new FinalProjectTester();
    }
    
    public FinalProjectTester()
    {
        super("Cory's Sound Board!");
        setSize(600,600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Board.setLayout(new GridLayout(4,4));
        
        for(int i = 0; i < 16; i++)
        {
            buttons[i] = new SoundButton();
            Board.add(buttons[i]);
            buttons[i].setIcon(icons[i]);
            buttons[i].Sound = sounds[i];
        }
        
        add(Board);
        setVisible(true);
    }   
}

