import javax.swing.plaf.synth.ColorType;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.*;

public class Box extends Rectangle {
    Color color;

    Box(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public Box(int x, int y, int width, int height) {
    }

    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP) {
            this.y=y-10;
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            this.y=y+10;
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            this.x=x-10;
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.x=x+10;
        }
    }


    public void draw(Graphics g){
        g.setColor(this.color);
        g.fillRect(this.x,this.y,this.width,this.height);
    }



    }
