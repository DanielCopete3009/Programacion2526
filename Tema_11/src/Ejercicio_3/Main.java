package Ejercicio_3;

import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // BorderLayout
        JFrame border = new JFrame("BorderLayout");
        border.setLayout(new BorderLayout());
        border.add(new JButton("Norte"), BorderLayout.NORTH);
        border.add(new JButton("Centro"), BorderLayout.CENTER);
        border.setSize(300, 200);
        border.setVisible(true);

        // FlowLayout
        JFrame flow = new JFrame("FlowLayout");
        flow.setLayout(new FlowLayout());
        flow.add(new JButton("Botón 1"));
        flow.add(new JButton("Botón 2"));
        flow.setSize(300, 200);
        flow.setVisible(true);

        // GridLayout
        JFrame grid = new JFrame("GridLayout");
        grid.setLayout(new GridLayout(2, 2));
        grid.add(new JButton("1"));
        grid.add(new JButton("2"));
        grid.add(new JButton("3"));
        grid.add(new JButton("4"));
        grid.setSize(300, 200);
        grid.setVisible(true);

        // CardLayout
        JFrame card = new JFrame("CardLayout");
        JPanel panel = new JPanel(new CardLayout());
        panel.add(new JLabel("Tarjeta 1"));
        panel.add(new JLabel("Tarjeta 2"));
        card.add(panel);
        card.setSize(300, 200);
        card.setVisible(true);
    }
}