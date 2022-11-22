package main;

/**
 *
 * @author deris
 */
public class game {
    private GameWindow gameWindow;
    private GamePanel gamePanel;
    public game() {
        gamePanel = new GamePanel();
        gameWindow = new GameWindow(gamePanel);
    }
    
}
