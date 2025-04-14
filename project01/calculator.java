import java.awt.*;
import java.awt.event;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.lang.classfile.Label;

class calculator extends WindowAdapter implements ActionListener {
    Frame f;
    Label l1;
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0;
    Button buttonAdd, buttonSub, buttonMulti, buttonDiv, buttonMod, buttonCalc, buttonClr, buttonPts, buttonNeg,
            buttonBack;
    Double xd;
    Double num1, num2, chack;

    calculator() {
        f = new Frame("my Calculator");
        l1 = new Label();
        l1.setBackground(Color.lightGray);
        l1.setBounds(50, 50, 250, 60);

        button1 = new Button("1");
        button1.setBounds(50, 340, 50, 50);
        button2 = new Button("2");
        button2.setBounds(120, 340, 50, 50);
        button3 = new Button("3");
        button3.setBounds(190, 340, 50, 50);
        button4 = new Button("4");
        button4.setBounds(50, 270, 50, 50);
        button5 = new Button("5");
        button5.setBounds(120, 270, 50, 50);
        button6 = new Button("6");
        button6.setBounds(190, 270, 50, 50);
        button7 = new Button("7");
        button7.setBounds(50, 200, 50, 50);
        button8 = new Button("8");
        button8.setBounds(120, 200, 50, 50);
        button9 = new Button("9");
        button9.setBounds(190, 200, 50, 50);
        button0 = new Button("0");
        button0.setBounds(120, 410, 50, 50);

        buttonNeg = new Button("+/-");
        buttonNeg.setBounds(50, 410, 50, 50);
        buttonPts = new Button(".");
        buttonPts.setBounds(190, 410, 50, 50);
        buttonBack = new Button("back");
        buttonBack.setBounds(120, 130, 50, 50);

        buttonAdd=new Button("+");
        buttonAdd.setBounds(260,340,50,50);
        buttonSub=new Button("-");
        buttonSub.setBounds(260,270,50,50);
        buttonMult=new Button("*");
        buttonMult.setBounds(260,200,50,50);
        buttonDiv=new Button("/");
        buttonDiv.setBounds(260,130,50,50);
        buttonMod=new Button("%");
        buttonMod.setBounds(190,130,50,50);
        buttonCalc=new Button("=");
        buttonCalc.setBounds(245,410,65,50);
        buttonClr=new Button("CE"); 
        buttonClr.setBounds(50,130,65,50);

        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);

        buttonPts.addActionListener(this);
        buttonNeg.addActionListener(this);
        buttonBack.addActionListener(this);

        buttonSum.addActionListener(this);
        buttonSub.addActionListener(this);
        buttonMulti.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonMod.addActionListener(this);
        buttonCalc.addActionListener(this);
        buttonClr.addActionListener(this);

        f.addWindowFocusListener(this);
        f.add(l1);
        f.add(button0);
        f.add(button1);
        f.add(button2);
        f.add(button3);
        f.add(button4);
        f.add(button5);
        f.add(button6);
        f.add(button7);
        f.add(button8);
        f.add(button9);

        f.add(buttonAdd);
        f.add(buttonSub);
        f.add(buttonMult);
        f.add(buttonDiv);
        f.add(buttonMod);
        f.add(buttonCalc);

        f.add(buttonPts);
        f.add(buttonBack);
        f.add(buttonNeg);
        f.add(buttonClr)



        f.setSize(400,600);
        f.setLayout(null);
        f.setVisible(true);
        
        public void windowClosing(WindowEvent e){
            f.dispose();
        }
        public void actionPerformed(ActiveEvent e){
            String z,zt;

            if(e.getSource()==button1){
                zt = l1.getText();
                z = zt+"1";
                l1.setText(z);
            }
            if(e.getSource()==button2){
                zt = l1.getText();
                z = zt+"2";
                l1.setText(z);
            }
            if(e.getSource()==button3){
                zt = l1.getText();
                z = zt+"3";
                l1.setText(z);
            }
            if(e.getSource()==button4){
                zt = l1.getText();
                z = zt+"4";
                l1.setText(z);
            }
            if(e.getSource()==button5){
                zt = l1.getText();
                z = zt+"5";
                l1.setText(z);
            }
            if(e.getSource()==button6){
                zt = l1.getText();
                z = zt+"6";
                l1.setText(z);
            }
            if(e.getSource()==button7){
                zt = l1.getText();
                z = zt+"7";
                l1.setText(z);
            }
            if(e.getSource()==button8){
                zt = l1.getText();
                z = zt+"8";
                l1.setText(z);
            }
            if(e.getSource()==button9){
                zt = l1.getText();
                z = zt+"9";
                l1.setText(z);
            }
            if(e.getSource()==button0){
                zt = l1.getText();
                z = zt+"0";
                l1.setText(z);
            }
            if(e.getSource()==buttonPts){
                zt = l1.getText();
                z = zt+".";
                l1.setText(z);
            }
            if(e.getSource()==buttonNeg){
                zt = l1.getText();
                z = zt+"-";
                l1.setText(z);
            }
            if(e.getSource()==buttonBack){
                zt = l1.getText();
                try{
                    z=zt.substring(0, zt.length()-1);
                    }
                    catch(StringIndexOutOfBoundsException f){
                        return;
                    }
                  l1.setText(z);
            }
            if(e.getSource()==buttonAdd){                     //FOR ADDITION
                try{
                  num1=Double.parseDouble(l1.getText());
                  }catch(NumberFormatException f){
                    l1.setText("Invalid Format");
                    return;
                  }
                z="";
                l1.setText(z);
                check=1;
              }
        }
    }

    public static void main(String[] args) {
        new calculator();

    }
}