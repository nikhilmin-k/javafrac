import java.awt.*;
import java.awt.event.*;

public class Window extends Frame{
    Window(){
        setLayout(null);
        setSize(700,700);
        MyCanvas canvas = new MyCanvas();
        add(canvas);
        setVisible(true);
        //set window to close on button press
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                dispose();
            }
        });
    }
}