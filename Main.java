import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener{
  JTextField texto;
  JLabel etiqueta;
  JButton boton;
  public Main(){
    texto=new JTextField();
    etiqueta=new JLabel();
    boton=new JButton("OK");
    this.getContentPane().setLayout(new GridLayout(3,1));
    this.getContentPane().add(texto);
    this.getContentPane().add(etiqueta);
    this.getContentPane().add(boton);
    boton.setActionCommand("ok");
    boton.addActionListener(this);
    this.pack();
    this.setVisible(true);
  }
 
  public void actionPerformed(ActionEvent e){
    if(e.getActionCommand().equals("ok")){
      etiqueta.setText(texto.getText());
      texto.setText("");
    }
  }
  

  public static void main(String[] args) {
    Main m=new Main();

  }
}