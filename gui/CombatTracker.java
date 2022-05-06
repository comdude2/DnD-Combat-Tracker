package gui;

import util.Log;

import javax.swing.*;
import java.util.LinkedList;

public class CombatTracker implements Runnable {

    private Log log = null;
    private Window frame = null;
    private LinkedList<JComponent> buttons = new LinkedList<JComponent>();

    //Main
    public CombatTracker(Log log, Window frame) {
        this.log = log;
        this.log.debug("New " + this.getClass().getName() + " instance.");
        this.frame = frame;
    }

    //Main
    public void run() {
        log.debug(this.getClass().getName() + "'s Run() method called.");
        JPanel pane = new JPanel();
        this.frame.setLocationByPlatform(true);

        //Set look and feel
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e){//Use default
        }

        pane.setLayout(null);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add pane
        this.frame.add(pane);

        //Display
        frame.setSize(300, 300);
        frame.setResizable(false);
        log.debug("Frame ready for class: " + this.getClass().getName());
    }
}