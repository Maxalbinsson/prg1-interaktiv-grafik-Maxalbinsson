import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Frame extends JFrame{

    Image image;
    Graphics graphics;
    Box Spelare;
    Box Fiende;
    boolean gameOver;

    Frame(){
        Spelare = new Box(100,300,50,50,Color.blue);
        Fiende = new Box(400,300,50,50,Color.red);
        gameOver = false;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setVisible(true);
        this.addKeyListener(new AL());
    }

    public void paint(Graphics g) {
        image = createImage(this.getWidth(),this.getHeight());
        graphics = image.getGraphics();
        g.drawImage(image,0,0,this);

        Spelare.draw(g);
        Fiende.draw(g);

        if(gameOver) {
            g.setColor(Color.RED);
            g.setFont(new Font("MV Boli",Font.PLAIN,45));
            g.drawString("DU VAN!", 150, 100);
        }
    }

    public void checkCollision() {
        if(Spelare.intersects(Fiende)) {
            gameOver = true;
            System.out.println("DU VAN!");
        }
    }

    public class AL extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            Spelare.keyPressed(e);
            checkCollision();
            repaint();
        }
    }
}