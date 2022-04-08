import java.awt.*;
import java.awt.image.BufferedImage;

public class MyCanvas extends Canvas{
    Printer p;
    int scale;
    public MyCanvas(){
        setSize(600,600);
        setBackground(Color.GRAY);
        p = new Printer(600, 600, new Point(550,400));
        scale = 300;
    }
    public void paint(Graphics g){
        g.clearRect(0, 0, this.getSize().width, this.getSize().height);
        BufferedImage image = p.printImage(new Mandelbrot(scale));
        g.drawImage(image, 0, 0, null);
        System.out.println("Finished paint");
    }
    public void setScale(int n){
        scale = n;
    }
}