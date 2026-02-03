package GUIS;

import javax.swing.JFrame;

public class Imagens 
{
    public static void main(String[] args)
    {
        Caixa caixa = new Caixa();
        DrawPanel draw = new DrawPanel();

        caixa.box();
        caixa.userBox();

        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(draw);
        application.setSize(250,250);
        application.setVisible(true);
    }
}
