import java.awt.Point;
import java.awt.Color;

public class Rect implements Shape{
    int width;
    int height;
    Rect(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int printFuncRGB(int x, int y, Point offset) {
        int hwidth = width/2;
        int hheight = height/2;
        return x>(offset.x-hwidth)&&x<(offset.x+hwidth)&&y>(offset.y-hheight)&&y<(offset.y+hheight) ? Color.RED.getRGB() : Color.BLACK.getRGB();
    }
}
