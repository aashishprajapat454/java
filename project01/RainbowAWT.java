import java.awt.*;

class RainbowCanvas extends Canvas {
    public RainbowCanvas() {
        setSize(700, 700);
    }

    public void paint(Graphics g) {
        int x = 50, y = 50, width = 400, height = 300;

        // Colors of the rainbow
        Color[] rainbowColors = {
            Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, 
            Color.CYAN, Color.BLUE, new Color(128, 0, 128) // Violet
        };

        for (int i = 0; i < rainbowColors.length; i++) {
            g.setColor(rainbowColors[i]);
            g.fillArc(x, y, width, height, 0, 180);
            x += 10; 
            y += 10;
            width -= 20;
            height -= 20;
        }

        // Ground (Sky background)
        g.setColor(Color.CYAN);
        g.fillRect(0, 200, 500, 200);
    }
}

public class RainbowAWT {
    public static void main(String[] args) {
        Frame f = new Frame("Rainbow Using AWT");
        RainbowCanvas rc = new RainbowCanvas();

        f.add(rc);
        f.setSize(500, 400);
        f.setVisible(true);

        f.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                f.dispose();
            }
        });
    }
}
