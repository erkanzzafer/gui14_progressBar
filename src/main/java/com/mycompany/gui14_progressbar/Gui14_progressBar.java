/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gui14_progressbar;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

/**
 *
 * @author zafer
 */
public class Gui14_progressBar {

    public static void main(String[] args) {
        JFrame frame = new JFrame("ProgressBar Örneği");
        JProgressBar jb = new JProgressBar(0, 2000);
        jb.setBounds(40, 40, 160, 30);
        jb.setValue(0);
        jb.setStringPainted(true);

        frame.add(jb);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

        int i = 0;
        while (i <= 2000) {
            jb.setValue(i);
            i = i + 200;
            try {
                Thread.sleep(150);
            } catch(InterruptedException e)  {
                    e.printStackTrace();
                }
            }
        }
    }
