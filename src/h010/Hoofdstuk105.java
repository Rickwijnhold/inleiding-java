package h010;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Label;

public class Hoofdstuk105 extends Applet {

    TextField text;
    Button add;
    Label onvoldoende;
    Label gemiddelde;
    double cijfer, totaalcijfer, gemmidelde;
    int i;
    String s;


    public void init() {
        setSize(800, 200);
        text = new TextField("", 20);
        add = new Button("bereken");
        onvoldoende = new Label("");
        gemiddelde = new Label("");
        //-----------------------------------------
        add(text);
        add(add);
        add(onvoldoende);
        add(gemiddelde);
        //-----------------------------------------
        add.addActionListener(new addListener());
    }

    public class addListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            i++;
            s = text.getText();
            cijfer = Double.parseDouble(s);
            if (cijfer >= 5.5) {
                onvoldoende.setText("voldoende");
                repaint();
            } else {
                onvoldoende.setText("onvoldoende");
                repaint();
            }
            totaalcijfer += cijfer;
            gemmidelde = totaalcijfer / i;
            gemiddelde.setText(String.valueOf(gemmidelde));
            repaint();
        }
    }
}