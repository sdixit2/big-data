/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;


import javax.swing.*;

/**
 *
 * @author harsh
 */
public class CQuiz extends Thread implements ActionListener{
JLabel que1,que2,que3,que4,que5,que6,que7,que8,que9,que10,name,tr;
    JFrame main;
    JTextField hh;
    JButton next,next1,next2,next3,next4,next5,next6,next7,next8,submit,ok,restart,resq;
    JRadioButton que11,que12,que13,que14,que21,que22,que23,que24,que31,que32,que33,que34,que41,que42,que43,que44,que51,que52,que53,que54,que61,que62,que63,que64,que71,que72,que73,que74,que81,que82,que83,que84,que91,que92,que93,que94,que101,que102,que103,que104;
    int i=0,p=1,g;
     JProgressBar oo;
    
    @Override
public void run()
    {
    do
        {
           try
        {
          Thread.sleep(1000);
           }catch(Exception kl){System.out.println(kl);}
        oo.setValue(p);
         p++;
         if(g==9)
                  {
                try {
                    Thread.sleep(1000000);
                } catch (Exception ex) {
                    System.out.println(ex);
                }
         }

        } while (p <= 60);
JOptionPane.showMessageDialog(main,"Oops! Time's Up");
main.setVisible(false);
   String hj=JOptionPane.showInputDialog(main,"Enter your name");
   if(hj.length()>0)
   {
            try
            {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection gt=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
        PreparedStatement ty=gt.prepareStatement("insert into javatest values(?,?,?)");
          Date io1=new Date();
      String i1=io1.toString();
        ty.setString(1, hj);
        ty.setInt(2, i);
        ty.setString(3, i1);
        ty.executeUpdate();
        gt.close();
           }catch(Exception y){System.out.print(y);}
             JOptionPane.showMessageDialog(main,"Your score is : "+String.valueOf(i));
    }
 else
   {
       JOptionPane.showMessageDialog(main, "Enter the name");
 }
}
    void dis()
    {
        main=new JFrame("C quiz for beginner's");
        que1=new JLabel("Que 1: Which of the following is not a character constant?");
        que2=new JLabel("Que 2: C language has been developed by?");
        que3=new JLabel("Que 3: A C variable cannot start with ?");
        que4=new JLabel("Que 4: The maximun value that an integer constant can have is ?");
        que5=new JLabel("Que 5: The real constant in C can be expressed which of the following forms ?");
        que6=new JLabel("Que 6: A character variable can at a time score?");
        que7=new JLabel("Que 7: Which of the following statements is wrong ?");
        que8=new JLabel("Que 8: C programs are convrted into the machine language with the help of?");
        que9=new JLabel("Que 9: C can be used on ?");
        que10=new JLabel("Que 10: Which of the following is not a character constant ? ");
        next=new JButton("next");
        next1=new JButton("next");
        next2=new JButton("next");
        next3=new JButton("next");
        next4=new JButton("next");
        next5=new JButton("next");
        next6=new JButton("next");
        next7=new JButton("next");
        next8=new JButton("next");
        resq=new JButton("Restart Quiz");
        restart=new JButton("restart");
        que11=new JRadioButton("Z along with the single inverted commas");
        que12=new JRadioButton("Both (1) and (2)");
        que13=new JRadioButton("ASCII value of Z");
        que14=new JRadioButton("The character Z");
        que21=new JRadioButton("Dennis Ritchie");
        que22=new JRadioButton("Peter Norton");
        que23=new JRadioButton("Martin Richards");
        que24=new JRadioButton("Ken Thompson");
        que31=new JRadioButton("A special symbol other than underscore");
        que32=new JRadioButton("An alphabet");
        que33=new JRadioButton("Both (A) and (D)");
        que34=new JRadioButton("A number");
        que41=new JRadioButton("32767");
        que42=new JRadioButton("1.7014e+38");
        que43=new JRadioButton("-1.7014e+38");
        que44=new JRadioButton("-32767");
        que51=new JRadioButton("ASCII form only");
        que52=new JRadioButton("Fractional form only");
        que53=new JRadioButton("Exponetial form only");
        que54=new JRadioButton("Both Fractional and Exponetial");
        que61=new JRadioButton("254 characters");
        que62=new JRadioButton("8 characters");
        que63=new JRadioButton("1 character");
        que64=new JRadioButton("None of the above");
        que71=new JRadioButton("Count+5=res;");
        que72=new JRadioButton("Is=20 * 'T'");
        que73=new JRadioButton("Val='A' * 'B';");
        que74=new JRadioButton("INT=123;");
        que81=new JRadioButton("An operating system");
        que82=new JRadioButton("An editor");
        que83=new JRadioButton("Compiler");
        que84=new JRadioButton("None of the above");
        que91=new JRadioButton("Only Linux");
        que92=new JRadioButton("Only window");
        que93=new JRadioButton("Only MS-DOS");
        que94=new JRadioButton("All of the above");
        que101=new JRadioButton("'23.56e-03'");
        que102=new JRadioButton("'quest videos- IT Learning at its best'");
        que103=new JRadioButton("'Thank You'");
        que104=new JRadioButton("All of the above");
        submit=new JButton("Submit");

        ok=new JButton("ok");
        hh=new JTextField();
        name=new JLabel("Enter your name");

oo=new JProgressBar(0,120);

oo.setBounds(1100, 300, 200, 40);
  tr=new JLabel("Time passed");
tr.setBounds(920,300, 300, 40);
main.add(tr);
tr.setFont(new Font("Arabic roman",Font.BOLD,26));
tr.setForeground(Color.RED);
main.add(oo);

            que1.setFont(new Font("ARABIC BLACK",Font.BOLD,24));
            que2.setFont(new Font("ARABIC BLACK",Font.BOLD,24));
            que3.setFont(new Font("ARABIC BLACK",Font.BOLD,24));
            que4.setFont(new Font("ARABIC BLACK",Font.BOLD,24));
            que5.setFont(new Font("ARABIC BLACK",Font.BOLD,24));
            que6.setFont(new Font("ARABIC BLACK",Font.BOLD,24));
            que7.setFont(new Font("ARABIC BLACK",Font.BOLD,24));
            que8.setFont(new Font("ARABIC BLACK",Font.BOLD,24));
            que9.setFont(new Font("ARABIC BLACK",Font.BOLD,24));
            que10.setFont(new Font("ARABIC BLACK",Font.BOLD,24));

            que1.setForeground(Color.DARK_GRAY);
             que2.setForeground(Color.DARK_GRAY);
            que3.setForeground(Color.DARK_GRAY);
            que4.setForeground(Color.DARK_GRAY);
            que5.setForeground(Color.DARK_GRAY);
            que6.setForeground(Color.DARK_GRAY);
            que7.setForeground(Color.DARK_GRAY);
            que8.setForeground(Color.DARK_GRAY);
            que9.setForeground(Color.DARK_GRAY);
            que10.setForeground(Color.DARK_GRAY);


          
        main.setBounds(0, 0, 1500, 550);
        main.setLayout(null);
      next.setBounds(210, 410, 70, 30);
      submit.setBounds(210, 410, 100, 30);
      next1.setBounds(210, 410, 70, 30);
      next2.setBounds(210, 410, 70, 30);
      next3.setBounds(210, 410, 70, 30);
      next4.setBounds(210, 410, 70, 30);
      next5.setBounds(210, 410, 70, 30);
      next6.setBounds(210,410, 70, 30);
      next7.setBounds(210, 410, 70, 30);
      next8.setBounds(210, 410, 70, 30);
      restart.setBounds(340, 410, 100, 30);
      resq.setBounds(470, 410, 150, 30);
      que11.setBounds(120, 180, 300, 30);
      que12.setBounds(120,230,300,30);
      que13.setBounds(120,280,300,30);
      que14.setBounds(120,330,300,30);
       que21.setBounds(120, 180, 300, 30);
      que22.setBounds(120,230,300,30);
      que23.setBounds(120,280,300,30);
      que24.setBounds(120,330,300,30);
       que31.setBounds(120, 180, 300, 30);
      que32.setBounds(120,230,300,30);
      que33.setBounds(120,280,300,30);
      que34.setBounds(120,330,300,30);
       que41.setBounds(120, 180, 300, 30);
      que42.setBounds(120,230,300,30);
      que43.setBounds(120,280,300,30);
      que44.setBounds(120,330,300,30);
       que51.setBounds(120, 180, 300, 30);
      que52.setBounds(120,230,300,30);
      que53.setBounds(120,280,300,30);
      que54.setBounds(120,330,300,30);
       que61.setBounds(120, 180, 300, 30);
      que62.setBounds(120,230,300,30);
      que63.setBounds(120,280,300,30);
      que64.setBounds(120,330,300,30);
       que71.setBounds(120, 180, 300, 30);
      que72.setBounds(120,230,300,30);
      que73.setBounds(120,280,300,30);
      que74.setBounds(120,330,300,30);
       que81.setBounds(120, 180, 300, 30);
      que82.setBounds(120,230,300,30);
      que83.setBounds(120,280,300,30);
      que84.setBounds(120,330,300,30);
       que91.setBounds(120, 180, 300, 30);
      que92.setBounds(120,230,300,30);
      que93.setBounds(120,280,300,30);
      que94.setBounds(120,330,300,30);
      que101.setBounds(120, 180, 300, 30);
      que102.setBounds(120,230,300,30);
      que103.setBounds(120,280,300,30);
      que104.setBounds(120,330,300,30);

      ok.setBounds(130, 200,80 ,30);
      name.setBounds(20, 80, 100, 30);
      hh.setBounds(170, 80,100 , 30);

      ButtonGroup ques1=new ButtonGroup();
      ques1.add(que11);
      ques1.add(que12);
      ques1.add(que13);
      ques1.add(que14);
      ButtonGroup ques2=new ButtonGroup();
      ques2.add(que21);
      ques2.add(que22);
      ques2.add(que23);
      ques2.add(que24);
      ButtonGroup ques3=new ButtonGroup();
      ques3.add(que31);
      ques3.add(que32);
      ques3.add(que33);
      ques3.add(que34);
      ButtonGroup ques4=new ButtonGroup();
      ques4.add(que41);
      ques4.add(que42);
      ques4.add(que43);
      ques4.add(que44);
      ButtonGroup ques5=new ButtonGroup();
      ques5.add(que51);
      ques5.add(que52);
      ques5.add(que53);
      ques5.add(que54);
      ButtonGroup ques6=new ButtonGroup();
      ques6.add(que61);
      ques6.add(que62);
      ques6.add(que63);
      ques6.add(que64);
      ButtonGroup ques7=new ButtonGroup();
      ques7.add(que71);
      ques7.add(que72);
      ques7.add(que73);
      ques7.add(que74);
      ButtonGroup ques8=new ButtonGroup();
      ques8.add(que81);
      ques8.add(que82);
      ques8.add(que83);
      ques8.add(que84);
      ButtonGroup ques9=new ButtonGroup();
      ques9.add(que91);
      ques9.add(que92);
      ques9.add(que93);
      ques9.add(que94);
      ButtonGroup ques10=new ButtonGroup();
      ques10.add(que101);
      ques10.add(que102);
      ques10.add(que103);
      ques10.add(que104);
      que1.setBounds(120, 90, 1000, 90);
 que2.setBounds(120, 90, 1000, 90);
 que3.setBounds(120, 90, 1000, 90);
que4.setBounds(120, 90, 1000, 90);
que5.setBounds(120, 90, 1000, 90);
que6.setBounds(120, 90, 1000, 90);
que7.setBounds(120, 90, 1000, 90);
que8.setBounds(120, 90, 1000, 90);
que9.setBounds(120, 90, 1000, 90);
que10.setBounds(120, 90, 1000, 90);

main.add(resq);
resq.setVisible(false);
restart.setVisible(false);
        main.add(que1);
        main.add(next);
        main.add(que2);
        main.add(que3);
        main.add(que4);
        main.add(que5);
        main.add(que6);
        main.add(que7);
        main.add(que8);
        main.add(que9);
        main.add(que10);
        main.add(next1);
        main.add(next2);
        main.add(next3);
        main.add(next4);
        main.add(next5);
        main.add(next6);
        main.add(next7);
        main.add(next8);
        main.add(que11);
        main.add(que12);
        main.add(que13);
        main.add(que14);
        main.add(que11);
        main.add(que12);
        main.add(que13);
        main.add(que14);
        main.add(que21);
        main.add(que22);
        main.add(que23);
        main.add(que24);
        main.add(que31);
        main.add(que32);
        main.add(que33);
        main.add(que34);
        main.add(que41);
        main.add(que42);
        main.add(que43);
        main.add(que44);
        main.add(que51);
        main.add(que52);
        main.add(que53);
        main.add(que54);
        main.add(que61);
        main.add(que62);
        main.add(que63);
        main.add(que64);
        main.add(que71);
        main.add(que72);
        main.add(que73);
        main.add(que74);
        main.add(que81);
        main.add(que82);
        main.add(que83);
        main.add(que84);
        main.add(que91);
        main.add(que92);
        main.add(que93);
        main.add(que94);
        main.add(que101);
        main.add(que102);
        main.add(que103);
        main.add(que104);
        main.add(submit);
main.add(restart);
next.setVisible(true);
         JOptionPane.showMessageDialog(main,"There are 10 questions and each carry 1 mark");
         JOptionPane.showMessageDialog(main,"You have 1 min to complete this quiz");
         que2.setVisible(false);
         que3.setVisible(false);
         que4.setVisible(false);
         que5.setVisible(false);
         que6.setVisible(false);
         que7.setVisible(false);
         resq.addActionListener(this);
         que8.setVisible(false);
         que9.setVisible(false);
         que10.setVisible(false);
         next1.setVisible(false);
         next2.setVisible(false);
         next3.setVisible(false);
         next4.setVisible(false);
         next5.setVisible(false);
         next6.setVisible(false);
         next7.setVisible(false);
         next8.setVisible(false);
         que21.setVisible(false);
         que22.setVisible(false);
         que23.setVisible(false);
         que24.setVisible(false);
         que31.setVisible(false);
         que32.setVisible(false);
         que33.setVisible(false);
         que34.setVisible(false);
         que41.setVisible(false);
         que42.setVisible(false);
         que43.setVisible(false);
         que44.setVisible(false);
         que51.setVisible(false);
         que52.setVisible(false);
         que53.setVisible(false);
         que54.setVisible(false);
         que61.setVisible(false);
         que62.setVisible(false);
         que63.setVisible(false);
         que64.setVisible(false);
         que71.setVisible(false);
         que72.setVisible(false);
         que73.setVisible(false);
         que74.setVisible(false);
         que81.setVisible(false);
         que82.setVisible(false);
         que83.setVisible(false);
         que84.setVisible(false);
         que91.setVisible(false);
         que92.setVisible(false);
         que93.setVisible(false);
         que94.setVisible(false);
         que101.setVisible(false);
         que102.setVisible(false);
         que103.setVisible(false);
         que104.setVisible(false);
         submit.setVisible(false);

next.addActionListener(this);
next1.addActionListener(this);
next2.addActionListener(this);
next3.addActionListener(this);
next4.addActionListener(this);
next5.addActionListener(this);
next6.addActionListener(this);
next7.addActionListener(this);
next8.addActionListener(this);
submit.addActionListener(this);
ok.addActionListener(this);
restart.addActionListener(this);
main.setVisible(true);
main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
   

    public void actionPerformed(ActionEvent u)
    {
        if(u.getSource()==next)
        {
             if(que11.isSelected()||que12.isSelected()||que13.isSelected()||que14.isSelected())
               {
            resq.setVisible(false);
            que11.setVisible(false);
            que12.setVisible(false);
            que13.setVisible(false);
            que14.setVisible(false);
            que1.setVisible(false);
             next.setVisible(false);
             que2.setVisible(true);
             next1.setVisible(true);
             que21.setVisible(true);
         que22.setVisible(true);
               restart.setVisible(false);
         que23.setVisible(true);
         que24.setVisible(true);
            }
             if(que11.isSelected())
             {
                 JOptionPane.showMessageDialog(main,"Wrong Answer");

             }
 else if (que12.isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
             }
 else if (que13.isSelected())
             {
              JOptionPane.showMessageDialog(main,"Right Answer");
              i++;
            }
 else if (que14.isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
            }
            else
          {
            JOptionPane.showMessageDialog(main,"Choose Any Option");
          }
        }
        if(u.getSource()==next1)
        {
             if(que21.isSelected()||que22.isSelected()||que23.isSelected()||que24.isSelected())
               {
            resq.setVisible(false);
            que21.setVisible(false);
         que22.setVisible(false);
         que23.setVisible(false);
         que24.setVisible(false);
         que2.setVisible(false);
            next1.setVisible(false);
            que3.setVisible(true);
            next2.setVisible(true);
            que31.setVisible(true);
         que32.setVisible(true);
               restart.setVisible(false);
         que33.setVisible(true);
         que34.setVisible(true);
            }
          if(que21.isSelected())
             {
                 JOptionPane.showMessageDialog(main,"Right Answer");
i++;
             }
 else if (que22.isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
             }
 else if (que23.isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
              
            }
          else if(que24.isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
            }
            else
          {
            JOptionPane.showMessageDialog(main,"Choose Any Option");
          }
        }
         if(u.getSource()==next2)
        {
              if(que31.isSelected()||que32.isSelected()||que33.isSelected()||que34.isSelected())
               {

             resq.setVisible(false);
              que31.setVisible(false);
         que32.setVisible(false);
         que33.setVisible(false);
         que34.setVisible(false);
             que3.setVisible(false);
            next2.setVisible(false);
            que4.setVisible(true);
            next3.setVisible(true);
             que41.setVisible(true);
         que42.setVisible(true);
         que43.setVisible(true);
               restart.setVisible(false);
         que44.setVisible(true);
            }
          if(que31.isSelected())
             {
                 JOptionPane.showMessageDialog(main,"Wrong Answer");
                 

             }
 else if (que32.isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
             }
 else if (que33.isSelected())
             {
              JOptionPane.showMessageDialog(main,"Right Answer");
              i++;
            }
 else if (que34.isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
            }
            else
          {
            JOptionPane.showMessageDialog(main,"Choose Any Option");
          }

         }
         if(u.getSource()==next3)
        {
              if(que41.isSelected()||que42.isSelected()||que43.isSelected()||que44.isSelected())
               {

             resq.setVisible(false);
             que41.setVisible(false);
         que42.setVisible(false);
         que43.setVisible(false);
         que44.setVisible(false);
             que4.setVisible(false);
            next3.setVisible(false);
            que5.setVisible(true);
            next4.setVisible(true);
             que51.setVisible(true);
         que52.setVisible(true);
         que53.setVisible(true);
               restart.setVisible(false);
         que54.setVisible(true);
            }
          if(que41.isSelected())
             {
                 JOptionPane.showMessageDialog(main,"Right Answer");
                 i++;

             }
 else if (que42.isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
             }
 else if (que43.isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
            }
 else if (que44.isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
            }
            else
          {
            JOptionPane.showMessageDialog(main,"Choose Any Option");
          }
         }
         if(u.getSource()==next4)
        {
              if(que51.isSelected()||que52.isSelected()||que53.isSelected()||que54.isSelected())
               {

             resq.setVisible(false);
               que51.setVisible(false);
         que52.setVisible(false);
         que53.setVisible(false);
         que54.setVisible(false);
             que5.setVisible(false);
            next4.setVisible(false);
            que6.setVisible(true);
            next5.setVisible(true);
             que61.setVisible(true);
         que62.setVisible(true);
         que63.setVisible(true);
         que64.setVisible(true);
               restart.setVisible(false);
            }
          if(que51.isSelected())
             {
                 JOptionPane.showMessageDialog(main,"Wrong Answer");

             }
 else if (que52.isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
             }
 else if (que53.isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
            }
 else if (que54.isSelected())
             {
              JOptionPane.showMessageDialog( main,"Right Answer");
              i++;
            }
                  else
          {
            JOptionPane.showMessageDialog(main,"Choose Any Option");
          }
         }
         if(u.getSource()==next5)
        {

          if(que61.isSelected()||que62.isSelected()||que63.isSelected()||que64.isSelected())
               {
             resq.setVisible(false);
                que61.setVisible(false);
         que62.setVisible(false);
         que63.setVisible(false);
         que64.setVisible(false);
             que6.setVisible(false);
            next5.setVisible(false);
            que7.setVisible(true);
            next6.setVisible(true);
              que71.setVisible(true);
         que72.setVisible(true);
         que73.setVisible(true);
         que74.setVisible(true);
               restart.setVisible(false);
            }
          if(que61.isSelected())
             {
                 JOptionPane.showMessageDialog(main,"Wrong Answer");

             }
 else if (que62.isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
             }
 else if (que63.isSelected())
             {
              JOptionPane.showMessageDialog(main,"Right Answer");
              i++;
             }
 else if (que64.isSelected())

             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
              }
                  else
          {
            JOptionPane.showMessageDialog(main,"Choose Any Option");
          }
         }
         if(u.getSource()==next6)
        {
              if(que71.isSelected()||que72.isSelected()||que73.isSelected()||que74.isSelected())
               {

             resq.setVisible(false);
              que71.setVisible(false);
         que72.setVisible(false);
         que73.setVisible(false);
         que74.setVisible(false);
             que7.setVisible(false);
            next6.setVisible(false);
            que8.setVisible(true);
            next7.setVisible(true);
             que81.setVisible(true);
         que82.setVisible(true);
         que83.setVisible(true);
         que84.setVisible(true);
               restart.setVisible(false);
            }
          if(que71.isSelected())
             {
                 JOptionPane.showMessageDialog(main,"Right Answer");
                 i++;

             }
 else if (que72.isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
             }
 else if (que73.isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
            }
 else if (que74.isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
            }
                  else
          {
            JOptionPane.showMessageDialog(main,"Choose Any Option");
          }
         }
         if(u.getSource()==next7)
        {

          if(que81.isSelected()||que82.isSelected()||que83.isSelected()||que84.isSelected())
               {
             resq.setVisible(false);
               que81.setVisible(false);
         que82.setVisible(false);
         que83.setVisible(false);
         que84.setVisible(false);
             next7.setVisible(false);
            que8.setVisible(false);
            que9.setVisible(true);
            next8.setVisible(true);
             que91.setVisible(true);
         que92.setVisible(true);
         que93.setVisible(true);
         que94.setVisible(true);
         restart.setVisible(false);
            }
          if(que81.isSelected())
             {
                 JOptionPane.showMessageDialog(main,"Wrong Answer");
             }
 else if (que82.isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
             }
 else if (que83.isSelected())
             {
              JOptionPane.showMessageDialog(main,"Right Answer");
              i++;
              
            }
 else if (que84.isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");

            }
            else
          {
            JOptionPane.showMessageDialog(main,"Choose Any Option");
          }

         }
        if(u.getSource()==resq)
        {
            JavaQuiz pp=new JavaQuiz();
            pp.qe();
            main.setVisible(false);
        }
         if(u.getSource()==next8)
        {

          if(que91.isSelected()||que92.isSelected()||que93.isSelected()||que94.isSelected())
               {
             
               que91.setVisible(false);
         que92.setVisible(false);
         que93.setVisible(false);
         que94.setVisible(false);
             que9.setVisible(false);
             que10.setVisible(true);
              next8.setVisible(false);
               que101.setVisible(true);
         que102.setVisible(true);
         que103.setVisible(true);
         que104.setVisible(true);
         submit.setVisible(true);
            }
          if(que91.isSelected())
             {
                 JOptionPane.showMessageDialog(main,"Wrong Answer");

             }
 else if (que92.isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");

            }
 else if (que93.isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
              
            }
 else if (que94.isSelected())
             {
              JOptionPane.showMessageDialog(main,"Right Answer");
              i++;
            }
            else
          {
            JOptionPane.showMessageDialog(main,"Choose Any Option");
          }
         }
        if(u.getSource()==submit)
        {

resq.setVisible(true);
         if(que101.isSelected()||que102.isSelected()||que103.isSelected()||que104.isSelected())
               {
g=9;
            if(que104.isSelected())
            {
                i++;
            }
             if(i>6)
            {
                JOptionPane.showMessageDialog(main,"Qualified as a Beginner");
            }
 else
             {
 JOptionPane.showMessageDialog( main,"Work on your basics");
 }
           String hj=JOptionPane.showInputDialog(main,"Enter your name");
           if(hj.length()>0)
           {
            try
            {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection gt=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
        PreparedStatement ty=gt.prepareStatement("insert into Ctest values(?,?,?)");
          Date io1=new Date();
      String i1=io1.toString();
        ty.setString(1, hj);
        ty.setInt(2, i);
        ty.setString(3, i1);
        ty.executeUpdate();
        gt.close();
           }catch(Exception y){System.out.print(y);}
           restart.setVisible(true);
            JOptionPane.showMessageDialog(main,"Your score is : "+String.valueOf(i));
            }
      else
           {
                
                JOptionPane.showMessageDialog(main, "Enter a name");
            }
            }
 else {

                JOptionPane.showMessageDialog(main, "Choose Any Option");
           }
        }
        if(u.getSource()==restart)
        {
            main.setVisible(false);
            JavaQuiz1 yu=new JavaQuiz1();
            yu.dis();
            yu.start();
        }

        }
    public static void main(String[] args) {
       CQuiz ui=new CQuiz();
     ui.dis();
       ui.start();

    }
}
