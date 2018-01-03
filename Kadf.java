package quiz;
import javax.swing.*;
public class Kadf extends Thread{

JFrame yu;
JProgressBar oo;
int i=3;


    void man()
    {

yu=new JFrame("frame");
yu.setBounds(0, 0, 400, 400);

yu.setLayout(null);
oo=new JProgressBar(0,10);
oo.setValue(2);
oo.setBounds(100, 100, 100, 40);

yu.add(oo);

yu.setVisible(true);
}
    @Override
    public void run()
    {
        
        do
        {
        try
        {
            Thread.sleep(1000);
        }catch(Exception kl){System.out.println(kl);}
        oo.setValue(i);
        i++;
        } while (i <= 10);
       yu.setVisible(false);

    }
    public static void main(String klp[])
    {
        Kadf po=new Kadf();
        po.start();
        po.man();
    }
}
