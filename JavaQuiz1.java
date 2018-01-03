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


    /**
     * @param args the command line arguments
/**
 *
 * @author harsh
 */
public class JavaQuiz1 extends Thread implements ActionListener {
   JLabel que[]=new JLabel[10];
    JLabel tr,name;
    JFrame main;
    JTextField hh;
    ButtonGroup que1r;
    JProgressBar oo;
    JButton next[]=new JButton[9];
    JButton submit,ok,restart,resq;
    JRadioButton que1[]=new JRadioButton[40];
    int i=0,p=1,g;
    @Override
public void run()
    {do
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
        Connection gt=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
        PreparedStatement ty=gt.prepareStatement("insert into JAVATEST values(?,?,?)");
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
        main=new JFrame("Java quiz for beginner's");
        que[0]=new JLabel("Que 1: Which data type value is returned by all transcendental math functions?");
        que[1]=new JLabel("Que 2: Which of these operators is used to allocate memory to array variable in Java?");
        que[2]=new JLabel("Que 3: Which of these is necessary to specify at time of array initialization?");
        que[3]=new JLabel("Que 4: Which method can be defined only once in a program?");
        que[4]=new JLabel("Que 5: Which keyword is used by method to refer to the object that invoked it?");
        que[5]=new JLabel("Que 6: Which of these class is superclass of all other classes?");
        que[6]=new JLabel("Que 7: Which of these data type value is returned by equals() method of String class?");
        que[7]=new JLabel("Que 8: Which of these interface is not a member of java.io package?");
        que[8]=new JLabel("Que 9: Which of these is specified by a File object?");
        que[9]=new JLabel("Que 10: Which of these class is used to encapsulate IP address and DNS?");
       
        oo=new JProgressBar(0,60);
main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
oo.setBounds(1100, 300, 200, 40);
  tr=new JLabel("Time passed");
tr.setBounds(920,300, 300, 40);
main.add(tr);
tr.setFont(new Font("Arabic roman",Font.BOLD,26));
tr.setForeground(Color.RED);
main.add(oo);
for(int e=0;e<9;e++)
{
        next[e]=new JButton("next");
        }
        restart=new JButton("restart");
        que1[0]=new JRadioButton("int");
        que1[1]=new JRadioButton("float");
        que1[2]=new JRadioButton("double");
           resq=new JButton("Restart Quiz");
               resq.setBounds(470, 410, 150, 30);
               main.add(resq);
resq.setVisible(false);
        que1[3]=new JRadioButton("long");
        que1[4]=new JRadioButton("malloc");
        que1[5]=new JRadioButton("alloc");
        que1[6]=new JRadioButton("new");
        que1[7]=new JRadioButton("new malloc");
        que1[8]=new JRadioButton("Row");
        que1[9]=new JRadioButton("Column");
        que1[10]=new JRadioButton("Both Row and Column");
        que1[11]=new JRadioButton("None of the mentioned");
        que1[12]=new JRadioButton("main method");
        que1[13]=new JRadioButton("finalize method");
        que1[14]=new JRadioButton("static method");
        que1[15]=new JRadioButton("private method");
        que1[16]=new JRadioButton("import");
        que1[17]=new JRadioButton("catch");
        que1[18]=new JRadioButton("abstract");
        que1[19]=new JRadioButton("this");
        que1[20]=new JRadioButton("Math");
        que1[21]=new JRadioButton("Process");
        que1[22]=new JRadioButton("System");
        que1[23]=new JRadioButton("Object");
        que1[24]=new JRadioButton("char");
        que1[25]=new JRadioButton("int");
        que1[26]=new JRadioButton("boolean");
        que1[27]=new JRadioButton("All of the mentioned");
        que1[28]=new JRadioButton("DataInput");
        que1[29]=new JRadioButton("ObjectInput");
        que1[30]=new JRadioButton("ObjectFilter");
        que1[31]=new JRadioButton("FileFilter");
        que1[32]=new JRadioButton("a file in disk");
        que1[33]=new JRadioButton("directory path");
        que1[34]=new JRadioButton("directory in disk");
        que1[35]=new JRadioButton("None of the mentioned");
        que1[36]=new JRadioButton("DatagramPacket");
        que1[37]=new JRadioButton("URL");
        que1[38]=new JRadioButton("InetAddress");
        que1[39]=new JRadioButton("ContentHandler");
        submit=new JButton("Submit");

        ok=new JButton("ok");
        hh=new JTextField();
        name=new JLabel("Enter your name");
 for(int u=0;u<10;u++)
      {
      que[u].setBounds(120, 90, 1000, 90);
      que[u].setFont(new Font("Arabic black",Font.BOLD,24));
      que[u].setForeground(Color.DARK_GRAY);
      main.add(que[u]);
        }
        main.setBounds(0, 0, 1500, 550);
        main.setLayout(null);
        submit.setBounds(210, 410, 100, 30);
     for(int i1=0;i1<9;i1++)
     {
       next[i1].setBounds(210, 410, 70, 30);
       main.add(next[i1]);
      next[i1].addActionListener(this);
        }

      restart.setBounds(340, 410, 100, 30);
     
      for(int y=0;y<40;y=y+4)
 {
           que1[y].setBounds(120, 180, 300, 30);
      }
      for(int y=1;y<40;y=y+4)
      {
           que1[y].setBounds(120,230,300,30);
      }
     for(int y=2;y<40;y=y+4)
     {
         que1[y].setBounds(120,280,300,30);
     }
      for(int y=3;y<40;y=y+4)
      {
           que1[y].setBounds(120,330,300,30);
      }
      
      ok.setBounds(130, 200,80 ,30);
      name.setBounds(20, 80, 100, 30);
      hh.setBounds(170, 80,100 , 30);

      ButtonGroup ques1=new ButtonGroup();
      ques1.add(que1[0]);
      ques1.add(que1[1]);
      ques1.add(que1[2]);
      ques1.add(que1[3]);
      ButtonGroup ques2=new ButtonGroup();
      ques2.add(que1[4]);
      ques2.add(que1[5]);
      ques2.add(que1[6]);
      ques2.add(que1[7]);
      ButtonGroup ques3=new ButtonGroup();
      ques3.add(que1[8]);
      ques3.add(que1[9]);
      ques3.add(que1[10]);
      ques3.add(que1[11]);
      ButtonGroup ques4=new ButtonGroup();
      ques4.add(que1[12]);
      ques4.add(que1[13]);
      ques4.add(que1[14]);
      ques4.add(que1[15]);
      ButtonGroup ques5=new ButtonGroup();
      ques5.add(que1[16]);
      ques5.add(que1[17]);
      ques5.add(que1[18]);
      ques5.add(que1[19]);
      ButtonGroup ques6=new ButtonGroup();
       ques6.add(que1[20]);
        ques6.add(que1[21]);
        ques6.add(que1[22]);
        ques6.add(que1[23]);
      ButtonGroup ques7=new ButtonGroup();
      ques7.add(que1[24]);
      ques7.add(que1[25]);
      ques7.add(que1[26]);
      ques7.add(que1[27]);
      ButtonGroup ques8=new ButtonGroup();
      ques8.add(que1[28]);
      ques8.add(que1[29]);
      ques8.add(que1[30]);
      ques8.add(que1[31]);
      ButtonGroup ques9=new ButtonGroup();
      ques9.add(que1[32]);
       ques9.add(que1[33]);
       ques9.add(que1[34]);
       ques9.add(que1[35]);
      ButtonGroup ques10=new ButtonGroup();
       ques10.add(que1[36]);
        ques10.add(que1[37]);
ques10.add(que1[38]);
ques10.add(que1[39]);

restart.setVisible(false);

       for(int q=0;q<40;q++)
       {
        main.add(que1[q]);
        }
      
        main.add(submit);
main.add(restart);
next[0].setVisible(true);
         JOptionPane.showMessageDialog(main,"There are 10 questions and each carry 1 mark");
         JOptionPane.showMessageDialog(main,"You have 1 min to complete this quiz");
      for(int h=1;h<10;h++)
      {
        que[h].setVisible(false);
       }
         for(int h=1;h<9;h++)
         {
             next[h].setVisible(false);
        }
         for(int u=4;u<40;u++)
         {
         que1[u].setVisible(false);
        }
         submit.setVisible(false);


submit.addActionListener(this);
ok.addActionListener(this);
restart.addActionListener(this);
resq.addActionListener(this);
  main.setVisible(true);
     }

    public void actionPerformed(ActionEvent u)
    {
        if(u.getSource()==next[0])
        {
             if(que1[0].isSelected())
             {
                 JOptionPane.showMessageDialog(main,"Wrong Answer");

             }
 else if (que1[1].isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
             }
else if (que1[2].isSelected())
             {
              JOptionPane.showMessageDialog(main,"Right Answer");
              i++;
            }
 else if (que1[3].isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
            }
 else
             {
             JOptionPane.showMessageDialog(main,"Choose Any Option");

            }
               if(que1[0].isSelected()||que1[1].isSelected()||que1[2].isSelected()||que1[3].isSelected())
               {
                 que[1].setVisible(true);
             next[1].setVisible(true);
             que1[4].setVisible(true);
         que1[5].setVisible(true);
 que1[6].setVisible(true);
         que1[7].setVisible(true);
           que1[0].setVisible(false);
            que1[1].setVisible(false);
            que1[2].setVisible(false);
            que1[3].setVisible(false);
            que[0].setVisible(false);
            next[0].setVisible(false);
            }
        }
        if(u.getSource()==next[1])
        {
            if(que1[4].isSelected()||que1[5].isSelected()||que1[6].isSelected()||que1[7].isSelected())
            {
            que1[4].setVisible(false);
         que1[5].setVisible(false);
         que1[6].setVisible(false);
         que1[7].setVisible(false);
         que[1].setVisible(false);
         resq.setVisible(false);
            next[1].setVisible(false);
            que[2].setVisible(true);
            next[2].setVisible(true);
            que1[8].setVisible(true);
         que1[9].setVisible(true);
               restart.setVisible(false);
         que1[10].setVisible(true);
         que1[11].setVisible(true);
            }
          if(que1[4].isSelected())
             {
                 JOptionPane.showMessageDialog(main,"Wrong Answer");

             }
            else if(que1[5].isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
             }
 else if (que1[6].isSelected())
             {
              JOptionPane.showMessageDialog(main,"Right Answer");
              i++;
            }
         else if(que1[7].isSelected())
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
         if(u.getSource()==next[2])
        {
             if(que1[8].isSelected()||que1[9].isSelected()||que1[10].isSelected()||que1[11].isSelected())
             {
              que1[8].setVisible(false);
         que1[9].setVisible(false);
         que1[10].setVisible(false);
         que1[11].setVisible(false);
             que[2].setVisible(false);
            next[2].setVisible(false);
            que[3].setVisible(true);
            next[3].setVisible(true);
             que1[12].setVisible(true);
         que1[13].setVisible(true);
         resq.setVisible(false);
         que1[14].setVisible(true);
               restart.setVisible(false);
         que1[15].setVisible(true);
            }
          if(que1[8].isSelected())
             {
                 JOptionPane.showMessageDialog(main,"Right Answer");
                 i++;

             }
 else if (que1[9].isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
             }
 else if (que1[10].isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
            }
 else if (que1[11].isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
            }
else
          {
            JOptionPane.showMessageDialog(main,"Choose Any Option");
          }
         }
         if(u.getSource()==next[3])
        {
             if(que1[12].isSelected()||que1[13].isSelected()||que1[14].isSelected()||que1[15].isSelected())
             {
             que1[12].setVisible(false);
         que1[13].setVisible(false);
         que1[14].setVisible(false);
         que1[15].setVisible(false);
             que[3].setVisible(false);
            next[3].setVisible(false);
            resq.setVisible(false);
            que[4].setVisible(true);
            next[4].setVisible(true);
             que1[16].setVisible(true);
         que1[17].setVisible(true);
         que1[18].setVisible(true);
               restart.setVisible(false);
         que1[19].setVisible(true);
            }
            if (que1[12].isSelected())
             {
                 JOptionPane.showMessageDialog(main,"Right Answer");
                 i++;

             }
 else if (que1[13].isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
             }
 else if (que1[14].isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
            }
 else if (que1[15].isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
            }
         else
          {
            JOptionPane.showMessageDialog(main,"Choose Any Option");
          }
         }
         if(u.getSource()==next[4])
        {
             if(que1[16].isSelected()||que1[17].isSelected()||que1[18].isSelected()||que1[19].isSelected())
             {
               que1[16].setVisible(false);
         que1[17].setVisible(false);
         que1[18].setVisible(false);
         que1[19].setVisible(false);
             que[4].setVisible(false);
            next[4].setVisible(false);
            que[5].setVisible(true);
            resq.setVisible(false);
            next[5].setVisible(true);
             que1[20].setVisible(true);
         que1[21].setVisible(true);
         que1[22].setVisible(true);
         que1[23].setVisible(true);
               restart.setVisible(false);
            }
            if (que1[16].isSelected())
             {
                 JOptionPane.showMessageDialog(main,"Wrong Answer");

             }
 else if (que1[17].isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
             }
 else if (que1[18].isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
            }
 else if (que1[19].isSelected())
             {
              JOptionPane.showMessageDialog(main,"Right Answer");
              i++;
            }
               else
          {
            JOptionPane.showMessageDialog(main,"Choose Any Option");
          }
         }
         if(u.getSource()==next[5])
        {
             if(que1[20].isSelected()||que1[21].isSelected()||que1[22].isSelected()||que1[23].isSelected())
             {
                que1[20].setVisible(false);
         que1[21].setVisible(false);
         que1[22].setVisible(false);
         que1[23].setVisible(false);
             que[5].setVisible(false);
            next[5].setVisible(false);
            que[6].setVisible(true);
            next[6].setVisible(true);
              que1[24].setVisible(true);
              resq.setVisible(false);
         que1[25].setVisible(true);
         que1[26].setVisible(true);
         que1[27].setVisible(true);
              restart.setVisible(false);
            }
            if (que1[20].isSelected())
             {
                 JOptionPane.showMessageDialog(main,"Wrong Answer");

             }
 else if (que1[21].isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
             }
 else if (que1[22].isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
             }
           else  if(que1[23].isSelected())
             {
              JOptionPane.showMessageDialog(main,"Right Answer");
              i++;
            }
               else
          {
            JOptionPane.showMessageDialog(main,"Choose Any Option");
          }
         }
         if(u.getSource()==next[6])
        {
             if(que1[24].isSelected()||que1[25].isSelected()||que1[26].isSelected()||que1[27].isSelected())
             {
              que1[24].setVisible(false);
         que1[25].setVisible(false);
         que1[26].setVisible(false);
         que1[27].setVisible(false);
             que[6].setVisible(false);
            next[6].setVisible(false);
            que[7].setVisible(true);
            next[7].setVisible(true);
             que1[28].setVisible(true);
         que1[29].setVisible(true);
         que1[30].setVisible(true);
         resq.setVisible(false);
         que1[31].setVisible(true);
               restart.setVisible(false);
            }
          if(que1[24].isSelected())
             {
                 JOptionPane.showMessageDialog(main,"Wrong Answer");

             }
 else if (que1[25].isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
             }
 else if (que1[26].isSelected())
             {
              JOptionPane.showMessageDialog(main,"Right Answer");
              i++;
            }
 else if (que1[27].isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
            }
               else
          {
            JOptionPane.showMessageDialog(main,"Choose Any Option");
          }
         }
         if(u.getSource()==next[7])
        {
             if(que1[28].isSelected()||que1[29].isSelected()||que1[30].isSelected()||que1[31].isSelected())
             {
               que1[28].setVisible(false);
         que1[29].setVisible(false);
         que1[30].setVisible(false);
         que1[31].setVisible(false);
             next[7].setVisible(false);
            que[7].setVisible(false);
            que[8].setVisible(true);
            resq.setVisible(false);
            next[8].setVisible(true);
             que1[32].setVisible(true);
         que1[33].setVisible(true);
         que1[34].setVisible(true);
         que1[35].setVisible(true);
         restart.setVisible(false);
            }
          if(que1[28].isSelected())
             {
                 JOptionPane.showMessageDialog(main,"Wrong Answer");
             }
          else   if(que1[29].isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
             }
 else if (que1[30].isSelected())
             {
              JOptionPane.showMessageDialog(main,"Right Answer");
              i++;
            }
 else if (que1[31].isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
            }
else
          {
            JOptionPane.showMessageDialog(main,"Choose Any Option");
          }
         }
         if(u.getSource()==next[8])
        {
             if(que1[32].isSelected()||que1[33].isSelected()||que1[34].isSelected()||que1[35].isSelected())
             {
               que1[32].setVisible(false);
         que1[33].setVisible(false);
         que1[34].setVisible(false);
         que1[35].setVisible(false);
             que[8].setVisible(false);
             que[9].setVisible(true);
              next[8].setVisible(false);
               que1[36].setVisible(true);
               resq.setVisible(true);
         que1[37].setVisible(true);
         que1[38].setVisible(true);
         que1[39].setVisible(true);
         submit.setVisible(true);
            }
          if(que1[32].isSelected())
             {
                 JOptionPane.showMessageDialog(main,"Wrong Answer");

             }
 else if (que1[33].isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");

            }
 else if (que1[34].isSelected())
             {
              JOptionPane.showMessageDialog(main,"Right Answer");
              i++;
            }
 else if (que1[35].isSelected())
             {
              JOptionPane.showMessageDialog(main,"Wrong Answer");
            }
         else
          {
            JOptionPane.showMessageDialog(main,"Choose Any Option");
          }
         }
        if(u.getSource()==submit)
        {
           g=9;
           resq.setVisible(true);
            if(que1[36].isSelected()||que1[37].isSelected()||que1[38].isSelected()||que1[39].isSelected())
            {
            if(que1[38].isSelected())
            {
                i++;
            }

             if(i>6)
            {
                JOptionPane.showMessageDialog(main,"Qualified as a Beginner");
            }
 else
             {
 JOptionPane.showMessageDialog(main,"Work on your basics");
 }
           String hj=JOptionPane.showInputDialog(main,"Enter your name");

          if(hj.length()>0)
          {
            try
            {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection gt=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
        PreparedStatement ty=gt.prepareStatement("insert into JAVATEST values(?,?,?)");
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
           else
  {
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

       JavaQuiz1 ui=new JavaQuiz1();
       ui.dis();
       ui.start();

    }


}
