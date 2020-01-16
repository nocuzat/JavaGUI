/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

/**
 *
 * @author Thulani
 */
import javax.swing.*;
import java.awt.*;
public class Gui {
JFrame frame=new JFrame("gui");
JPanel Panel=new JPanel(new GridLayout(8,2,5,5));
JLabel Label1=new JLabel("dev112");
JLabel Label2=new JLabel("inf112");
JLabel Label3=new JLabel("ptp112");
JLabel Label4=new JLabel("sys112");
JButton btn1=new JButton("Average");
JButton btn2=new JButton("No Of passes");
JButton btn3=new JButton("No Of Fail");
JButton btn4=new JButton("progress R");
JTextField txt1=new JTextField();
JTextField txt2=new JTextField();
JTextField txt3=new JTextField();
JTextField txt4=new JTextField();
JTextField txt5=new JTextField();
JTextField txt6=new JTextField();
JTextField txt7=new JTextField();
JTextField txt8=new JTextField();
public void showApp(){
    frame.getContentPane().add(Panel);
    Panel.add(Label1);
    Panel.add(txt1);
    Panel.add(Label2);
    Panel.add(txt2);
    Panel.add(Label3);
    Panel.add(txt3);
    Panel.add(Label4);
    Panel.add(txt4);
    Panel.add(btn1);
    Panel.add(txt5);
    Panel.add(btn2);
    Panel.add(txt6);
    Panel.add(btn3);
    Panel.add(txt7);
    Panel.add(btn4);
    Panel.add(txt8);
    
    frame.setSize(450,450);
    frame.setLocation(300,200);
    frame.setVisible(true);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gui frame = new Gui();
        frame.showApp();
    }
    
}
