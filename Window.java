import java.awt.*;
import java.awt.event.*;

public class Window extends Frame implements ActionListener{
    MyCanvas canvas;
    TextField tf;
    Button zPlus;
    Button zMinus;
    Window(){
        setLayout(null);
        canvas = new MyCanvas();
        canvas.setBounds(0,0,600,600);
        add(canvas);
        tf = new TextField();
        zPlus = new Button();
        zMinus = new Button();
        tf.setBounds(650,50,50,20);
        zPlus.setBounds(650,100,50,20);
        zMinus.setBounds(650,150,50,20);
        zPlus.setLabel("Zoom+");
        zMinus.setLabel("Zoom-");
        add(tf);
        add(zPlus);
        add(zMinus);
        setSize(800,600);
        setVisible(true);
        //set window to close on button press
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                dispose();
            }
        });
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==zPlus){System.out.println("zPlus");canvas.setScale(canvas.scale-50);};
        if(e.getSource()==zMinus){System.out.println("zMinus");canvas.setScale(canvas.scale+50);};
    }
}