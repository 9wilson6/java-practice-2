/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gauble;

/**
 *
 * @author WILSON
 */
import java .awt.*;
import javax.swing.*;
import java.awt.event.*;
public class GAUBLE extends JFrame {
        private JLabel label1 ,label2, lab;
        private JTextField field;
        private JButton btn;
        //private ImageIcon image;
       private int y,z;
    public GAUBLE(){
    setLayout(new FlowLayout ());
    btn= new JButton("Guess");
    add(btn);
    
    label1=new JLabel("Enter a random number between 1-10");
    add(label1);
    
    label2=new JLabel("");
    add(label2);
    
    field=new JTextField(10);
    add(field);
    
    event ev=new event();
    btn.addActionListener(ev);
    
   // image=new ImageIcon(getClass().getResource("willie.jpg"));
   // lab =new JLabel(image);
   // add(lab);
    
    }
    
    public class event implements ActionListener{
    
        public void actionPerformed(ActionEvent ev){
            
     
      z= (int)(Math.random() * 10 + 1);
      try{
          if(y==z){
      
      label1.setText("You worn nigger");
      label2.setText(""); 
      }else
      if (y != z){
          
           y= Integer.parseInt(field.getText());
           if(y>10){ 
               JOptionPane.showMessageDialog(null," ONLY NUMBERS BETWEEN 1-10");
              
                label2.setText("");
           }
            
          
      //label2.setText("You lost");
       label2.setText("you lost \n"+ "The expected random number was "+ z);
      label1.setText("");
      }
     
      
      
      }
      catch(Exception ex){
         JOptionPane.showMessageDialog(null,"bad entry:");
          label1.setText("");
      
      }
      
        
        
        }
    }
    public static void main(String[] args) {
       GAUBLE gui=new  GAUBLE();
       gui.setVisible(true);
       gui.pack();
       gui.setTitle("gumble game");
       gui.setSize(400, 300);
       gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
    }
    
}
