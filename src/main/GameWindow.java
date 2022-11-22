package main;

import javax.swing.JFrame;

/**
 *
 * @author deris
 */
class GameWindow {
    private JFrame jframe;

    public GameWindow() {
        jframe = new JFrame();
        jframe.setSize(400, 400);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.setVisible(true);
    }
    
}
