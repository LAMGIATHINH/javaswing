/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaswing;

import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class HelloSwing {

    public HelloSwing() {
        JFrame frame = new JFrame("Hello");
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new HelloSwing();
    }
}
