import java.awt.image.BufferedImage;
import java.awt.Point;

public class Printer {
    
    public int height, width;
    public Point offset;
    BufferedImage image;
    Printer(int width, int height, Point offset){
        this.height = height;
        this.width = width;
        image = new BufferedImage(height,width,BufferedImage.TYPE_INT_RGB);
        this.offset = offset;
    }

    BufferedImage printImage(Shape shape){
        for(int x=0; x<width; x++){
            for(int y=0; y<height; y++){
                image.setRGB(x, y, shape.printFuncRGB(x, y, offset));
            }
        }
        return image;
    }

}
