package main;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author deris
 */
public class GamePanel extends JPanel{

    public GamePanel() {
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.fillRect(100, 100, 200, 50);
    }
}
