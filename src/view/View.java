package view;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class View extends JFrame{
    private Panel panel;

    public View() {
        super("Triangulo Sierpienski");
        this.setSize(new Dimension(700, 700));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        this.setVisible(true);
    }

    private void initComponents() {
       panel = new Panel(selectLevel());
       add(panel);
    }

    private int selectLevel(){
        return Integer.parseInt(JOptionPane.showInputDialog("Ingrese nivel: "));
    }

}
