import java.awt.*;

public class MyCanvas extends Canvas{
    
    public MyCanvas(){
        setSize(600,600);
        setBackground(Color.GRAY);
    }
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.drawOval(75, 75, 150, 75);
    }
}