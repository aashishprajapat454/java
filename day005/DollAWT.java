import java.awt.*;

class DollCanvas extends Canvas {
    public DollCanvas() {
        setSize(400, 500);
    }

    public void paint(Graphics g) {
        // Head
        g.setColor(Color.PINK);
        g.fillOval(150, 50, 100, 100);

        // Eyes
        g.setColor(Color.BLACK);
        g.fillOval(170, 80, 15, 15);
        g.fillOval(215, 80, 15, 15);

        // Smile
        g.drawArc(175, 100, 50, 30, 0, -180);

        // Body
        g.setColor(Color.BLUE);
        g.fillRect(170, 150, 60, 100);

        // Arms
        g.setColor(Color.PINK);
        g.drawLine(150, 170, 110, 220);
        g.drawLine(230, 170, 270, 220);

        // Legs
        g.drawLine(180, 250, 180, 320);
        g.drawLine(220, 250, 220, 320);

        // Shoes
        g.setColor(Color.RED);
        g.fillOval(165, 320, 30, 15);
        g.fillOval(205, 320, 30, 15);
    }
}

public class DollAWT {
    public static void main(String[] args) {
        Frame f = new Frame("Doll Using AWT");
        DollCanvas dc = new DollCanvas();

        f.add(dc);
        f.setSize(400, 500);
        f.setVisible(true);

        f.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                f.dispose();
            }
        });
    }
}

