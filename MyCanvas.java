import java.awt.*;
import java.awt.image.BufferedImage;

public class MyCanvas extends Canvas{
    Printer p;
    public MyCanvas(){
        setSize(800,800);
        setBackground(Color.GRAY);
        p = new Printer(800, 800, new Point(550,400));
    }
    public void paint(Graphics g){
        BufferedImage image = p.printImage(new Mandelbrot(300));
        g.drawImage(image, 0, 0, null);
    }
}