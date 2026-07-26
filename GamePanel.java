import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.Timer;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
    Timer timer;

    int xDirection = 25;
    int yDirection = 0;

    int foodX = 300;
    int foodY = 300;
    Random random = new Random();

    int[] snakeX = new int[100];
    int[] snakeY = new int[100];
    int snakeLength = 3;

     public GamePanel(){
       timer = new Timer(100, this);
        timer.start();
        setFocusable(true);
        addKeyListener(this);

        snakeX[0] = 100;
        snakeY[0] = 100;

        snakeX[1] = 75;
        snakeY[1] = 100;

        snakeX[2] = 50;
        snakeY[2] = 100;
     }

     @Override
     public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT && xDirection != -25){
         xDirection = 25;
          yDirection = 0;
    }
    if (e.getKeyCode() == KeyEvent.VK_LEFT && xDirection != 25){
    xDirection = -25;
    yDirection = 0;
    }

    if (e.getKeyCode() == KeyEvent.VK_UP && yDirection != 25) {
    xDirection = 0;
    yDirection = -25;
    }

        if (e.getKeyCode() == KeyEvent.VK_DOWN && yDirection != -25) {
    xDirection = 0;
    yDirection = 25;
    }

     }


     @Override
     public void keyReleased(KeyEvent e) {

     }

     @Override
     public void keyTyped(KeyEvent e) {

     }

     @Override
      protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.GREEN);

      for (int i = 0; i < snakeLength; i++) {
      g.fillRect(snakeX[i], snakeY[i], 25, 25);
      }

       g.setColor(Color.RED);
      g.fillRect(foodX, foodY, 25, 25);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      for (int i = snakeLength - 1; i > 0; i--) {
    snakeX[i] = snakeX[i - 1];
    snakeY[i] = snakeY[i - 1];
    }

      snakeX[0] += xDirection;
      snakeY[0] += yDirection;

      if (snakeX[0] == foodX && snakeY[0] == foodY) {
    System.out.println("Food eaten!");
    newFood();
    }

    repaint();
    }

    public void newFood() {
    foodX = random.nextInt(20) * 25;
    foodY = random.nextInt(20) * 25;
}
    
}
