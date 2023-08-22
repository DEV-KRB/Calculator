import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Application extends WindowAdapter implements ActionListener {

    Frame frame;
    Label label;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20;

    public Application() {

        frame = new Frame("My Calculator");
        label = new Label();
        label.setBackground(Color.GRAY);
        label.setBounds(50,50,260,60);

        b1 = new Button("0");
        b1.setBounds(120, 410, 50, 50);
        b2 = new Button("1");
        b2.setBounds(50, 340, 50, 50);
        b3 = new Button("2");
        b3.setBounds(120, 340, 50, 50);
        b4 = new Button("3");
        b4.setBounds(190, 340, 50, 50);
        b5 = new Button("4");
        b5.setBounds(50, 270, 50, 50);
        b6 = new Button("5");
        b6.setBounds(120, 270, 50, 50);
        b7 = new Button("6");
        b7.setBounds(190, 270, 50, 50);
        b8 = new Button("7");
        b8.setBounds(50, 200, 50, 50);
        b9 = new Button("8");
        b9.setBounds(120, 200, 50, 50);
        b10 = new Button("9");
        b10.setBounds(190, 200, 50, 50);
        b11 = new Button("+/-");
        b11.setBounds(50, 410, 50, 50);
        b12 = new Button(".");
        b12.setBounds(190, 410, 50, 50);
        b13 = new Button("=");
        b13.setBounds(260, 410, 50, 50);
        b14 = new Button("+");
        b14.setBounds(260, 340, 50, 50);
        b15 = new Button("-");
        b15.setBounds(260, 270, 50, 50);
        b16 = new Button("*");
        b16.setBounds(260, 200, 50, 50);
        b17 = new Button("/");
        b17.setBounds(260, 130, 50, 50);
        b18 = new Button("%");
        b18.setBounds(190, 130, 50, 50);
        b19 = new Button("back");
        b19.setBounds(120, 130, 50, 50);
        b20 = new Button("CE");
        b20.setBounds(50, 130, 50, 50);


        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b12.addActionListener(this);
        b11.addActionListener(this);
        b19.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b13.addActionListener(this);
        b20.addActionListener(this);
        b11.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);

        frame.add(label);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(b10);
        frame.add(b14);
        frame.add(b15);
        frame.add(b16);
        frame.add(b17);
        frame.add(b13);
        frame.add(b18);
        frame.add(b20);
        frame.add(b19);
        frame.add(b11);
        frame.add(b12);

        frame.addWindowListener(this);

        frame.setSize(360, 500);
        frame.setVisible(true);
        frame.setLayout(null);
    }

    public void windowClosing(WindowEvent e) {
        frame.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String z,zt;

        if(e.getSource()==b1){
            zt=label.getText();
            z=zt+"1";
            label.setText(z);
        }

        if(e.getSource()==b2){
            zt=label.getText();
            z=zt+"1";
            label.setText(z);
        }

        if(e.getSource()==b3){
            zt=label.getText();
            z=zt+"1";
            label.setText(z);
        }

        if(e.getSource()==b4){
            zt=label.getText();
            z=zt+"1";
            label.setText(z);
        }

        if(e.getSource()==b5){
            zt=label.getText();
            z=zt+"1";
            label.setText(z);
        }

        if(e.getSource()==b6){
            zt=label.getText();
            z=zt+"1";
            label.setText(z);
        }

        if(e.getSource()==b7){
            zt=label.getText();
            z=zt+"1";
            label.setText(z);
        }

        if(e.getSource()==b8){
            zt=label.getText();
            z=zt+"1";
            label.setText(z);
        }

        if(e.getSource()==b9){
            zt=label.getText();
            z=zt+"1";
            label.setText(z);
        }

        if(e.getSource()==b10){
            zt=label.getText();
            z=zt+"1";
            label.setText(z);
        }

        if(e.getSource()==b12){  //ADD DECIMAL PTS
            zt=label.getText();
            z=zt+".";
            label.setText(z);
        }
        if(e.getSource()==b15){ //FOR NEGATIVE
            zt=label.getText();
            z="-"+zt;
            label.setText(z);
        }

    }

    public static void main(String[]args){
        Application application = new Application();
    }
}

