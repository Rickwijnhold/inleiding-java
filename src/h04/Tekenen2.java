package h04;

//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Tekenen2 extends Applet {

    public void init() {
        setSize(800,800);
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawRect(200, 350, 400, 200);
        g.drawRect(260, 390, 75, 50);
        g.drawRect(440, 460, 50, 90);
        g.drawLine(200, 350, 400, 120);
        g.drawLine(600, 350, 400, 120);


    }
}


