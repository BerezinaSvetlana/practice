package ru.ssau.tk.berezinasvetlana.practice.Task1.Snake;

import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320,345);
        setLocation(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {

        MainWindow mv = new MainWindow();
    }
}
