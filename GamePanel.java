import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
    Timer timer;
    int x = 100;
    int y = 100;

    int xDirection = 25;
    int yDirection = 0;

    int foodX = 300;
    int foodY = 300;

     public GamePanel(){
       timer = new Timer(100, this);
        timer.start();
        setFocusable(true);
        addKeyListener(this);
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
       g.fillRect(x, y, 25, 25);

       g.setColor(Color.RED);
      g.fillRect(foodX, foodY, 25, 25);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      x += xDirection;
      y += yDirection;

      if (x == foodX && y == foodY) {
        System.out.println("Food eaten!");
    }


    repaint();
    }
    
}
