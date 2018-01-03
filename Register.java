/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author harsh
 */
public class Register extends JFrame implements ActionListener{
    JFrame reg;
    JLabel use,pass,pass1;
    JTextField qw;
    JPasswordField qw1,qw2;
    JButton ty,ty1;
public void ty()
    {
reg=new JFrame("Register");
reg.setBounds(0, 0, 1366, 700);
reg.setLayout(null);
use=new JLabel("Create Username");
use.setBounds(100, 100, 100, 90);
reg.add(use);
pass=new JLabel("Create Password");
pass.setBounds(100,190,100,90);
reg.add(pass);
qw=new JTextField();
qw.setBounds(210, 135,100,30);
reg.add(qw);
qw1=new JPasswordField();
qw1.setBounds(210, 230, 100,30);
reg.add(qw1);
pass1=new JLabel("Confirm Password");
pass1.setBounds(100,280,150,90);
reg.add(pass1);
qw2=new JPasswordField();
qw2.setBounds(210, 320, 100,30);
reg.add(qw2);
ty=new JButton("Register");
ty.setBounds(260, 400, 100,30);
reg.add(ty);
ty.addActionListener(this);
ty1=new JButton("Clear");
ty1.setBounds(390, 400, 100,30);
reg.add(ty1);
ty1.addActionListener(this);
reg.setVisible(true);
    reg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ty)
        {
            if((qw.getText()).equals("")||(qw1.getText()).equals("")||(qw2.getText()).equals(""))
            {
                JOptionPane.showMessageDialog(this,"Fill in the complete details");
            }
           else
            {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection yu=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
                PreparedStatement t=yu.prepareStatement("insert into satyaki values(?,?)");
                String yy=qw.getText();
                String yy1=qw2.getText();
                String yy2=qw1.getText();
                if(yy1.equals(yy2))
                {
                    t.setString(1, yy);
                    t.setString(2, yy1);
                    t.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Registered");
                    reg.setVisible(false);
                     JavaQuiz p=new JavaQuiz();
       p.qe();
       
                }
 else
                {
                    JOptionPane.showMessageDialog(this, "Confirm and Create Password do not match");
                    qw.setText(" ");
                    qw1.setText("");
                    qw2.setText("");
 }
            } catch (Exception ex) {
               System.out.print(ex);}
            }
            }

        
        if(e.getSource()==ty1)
        {
             reg.setVisible(false);
            Register ui=new Register();
            ui.ty();
          }
    }

}
