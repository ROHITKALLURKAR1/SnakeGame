import javax.swing.*;

public class SnakeGame  extends JFrame{

    SnakeGame(){

        setTitle("Snake Game");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        
        GamePanel panel = new GamePanel();
        add(panel);

        setVisible(true);


    }
    public static void main(String[] args) {
        new SnakeGame();
        
    }
}
