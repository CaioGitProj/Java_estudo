package GUIS;

import javax.swing.JOptionPane;

public class Caixa 
{
    public void box()
    {
        JOptionPane.showMessageDialog(null, "Welcome to Java");
    }

    public void userBox()
    {
        String name = JOptionPane.showInputDialog("what is your name?");

        String message = String.format("Welcome, %s, to Java Programming!", name);

        JOptionPane.showMessageDialog(null,message);
    }
}
