import javax.swing.plaf.synth.ColorType;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Box extends Rectangle {
    Color color;

    Box(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void keypressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            this.y = y - 10;

            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                this.y = y + 10;

                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    this.x=x-10;
                    if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                        this.x=x+10;
                    }
                }
            }
        }
    }


    public void draw(Graphics g){
    }



    }
