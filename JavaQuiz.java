/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



/**
 *
 * @author harsh
 */
public class JavaQuiz extends Thread implements ActionListener {
    JFrame ui;
    JLabel we,iop;
    int op=9;

    JButton cquiz,cplquiz,javaq;
int i=10;

   void qe()
    {

     ui=new JFrame("Quiz");
     ui.setBounds(0, 0, 800, 500);
     ui.setVisible(true);
     ui.setLayout(null);
     we=new JLabel("Which quiz you would like to try?");
     we.setFont(new Font("Arabic black",Font.BOLD,28));
     we.setForeground(Color.BLUE);
     cquiz=new JButton("C quiz");
     cplquiz=new JButton("C++ quiz");
     javaq=new JButton("Java Quiz");
    we.setBounds(100, 100, 500, 40);
    cquiz.setBounds(100, 200, 150,40);
    cplquiz.setBounds(100,270, 150, 40);
     javaq.setBounds(100, 340, 150, 40);
     ui.add(we);

     ui.add(cquiz);

     ui.add(cplquiz);

     ui.add(javaq);


javaq.addActionListener(this);
cquiz.addActionListener(this);
cplquiz.addActionListener(this);
   }



   public void actionPerformed(ActionEvent f)
    {
       if(f.getSource()==javaq)
       {
        JavaQuiz1 l=new JavaQuiz1();
        l.start();
        l.dis();
        ui.setVisible(false);
        }
       if(f.getSource()==cquiz)
       {
            CQuiz l=new CQuiz();
            l.start();
        l.dis();
         ui.setVisible(false);
       }
       if(f.getSource()==cplquiz)
       {

            Cplquiz l=new Cplquiz();
            l.start();
            l.dis();
            ui.setVisible(false);
       }

   }
   public static void main(String k[])
    {


       JavaQuiz p=new JavaQuiz();
       p.qe();

   }



       }






