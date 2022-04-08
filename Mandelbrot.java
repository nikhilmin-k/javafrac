import java.awt.Point;
import java.awt.Color;
import com.vm.jcomplex.Complex;

public class Mandelbrot implements Shape{
    int scale;
    Mandelbrot(int scale){
        this.scale = scale;
    }

    public int printFuncRGB(int x, int y, Point offset) {
        x = x-offset.x;
        y = y-offset.y;
        Complex z = Complex.ZERO;
        Complex c = new Complex(((double)x)/scale, ((double)y)/scale);
        int iter=0;
        while(z.abs()<2.0&&iter<1000){
            z = compFunc(c,z);
            iter++;
        }
        if(iter==1000)
            return Color.BLACK.getRGB();
        else if(z.abs()>=2.0)
            return Color.getHSBColor(((float)iter)/((float)1000), (float)0.5, (float)0.7).getRGB();
        else return Color.WHITE.getRGB();
    }
    
    Complex compFunc(Complex c, Complex z){
        return (z.multiply(z)).add(c);
    }
}