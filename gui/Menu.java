package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

import util.Log;

public class Menu implements Runnable {

    private Log log = null;
    private Window frame = null;
    private LinkedList<JComponent> buttons = new LinkedList<JComponent>();

    //Main
    public Menu(Log log, Window frame) {
        this.log = log;
        this.log.debug("New " + this.getClass().getName() + " instance.");
        this.frame = frame;
    }

    //Main
    public void run() {

    }
}