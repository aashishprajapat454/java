import javax.swing.*;
class fram {
    fram(){
        JFrame f1 = new JFrame("login");
        f1.setSize(500,500);
        f1.setVisible(true);
        f1.setBounds(200,100,500,500);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon img = new ImageIcon("img.jpg");
        f1.setIconImage(img.getImage());
        f1.setResizable(true);
    }

    public static void main(String[] args) {
        fram obj = new fram();
    }
}