package h04;



import java.awt.*;
import java.applet.*;

public class Tekenen8 extends Applet{

    public void init() {
setSize(800,800);
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(50, 120, 350, 120);
        g.drawRect(50, 150, 300, 120);
        g.drawRoundRect(50, 300, 300, 120, 30, 30);
        g.drawString("Rechte Lijn", 160,140);
        g.drawString("Rechthoek", 160,290);
        g.drawString("Afgeronde rechthoek", 140,435);
        g.drawString("Gevulde rechthoek met ovaal", 460,290);
        g.drawString("Taartpunt met ovaal eromheen", 800,290);
        g.drawString("Cirkel", 870,450);
        g.drawString("Gevulde ovaal", 500,435);

        g.setColor(Color.magenta);
        g.fillRect(400, 150, 300, 120);

        g.setColor(Color.black);
        g.drawOval(400, 150, 300, 120);

        g.setColor(Color.magenta);
        g.fillOval(400, 300, 300, 120);

        g.setColor(Color.black);
        g.drawOval(750, 150, 300, 120);

        g.setColor(Color.black);
        g.drawOval(830, 300, 120, 120);

        g.setColor(Color.magenta);
        g.fillArc(750, 150, 300, 120, 0, 45);
    }
}