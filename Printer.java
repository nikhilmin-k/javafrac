import java.awt.image.BufferedImage;
import java.awt.Point;
import java.awt.Color;

public class Printer {
    
    public int height, width;
    public Point offset;
    BufferedImage image;
    void Printer(){
        height = 600;
        width = 600;
        image = new BufferedImage(height,width,BufferedImage.TYPE_INT_RGB);
        offset = new Point(width/2,height/2);
    }



    BufferedImage printImage(Shape shape, int width, int height){
        if(shape == Shape.RECT){
            for(int x=0; x<width; x++){
                for(int y=0; y<height; y++){
                    image.setRGB(x, y, x>(offset.x-width)&&x<(offset.x+width)&&y>(offset.y-height)&&y<(offset.y+height) ? Color.RED.getRGB() : Color.BLACK.getRGB());
                }
            }
        }
        return image;
    }

}
