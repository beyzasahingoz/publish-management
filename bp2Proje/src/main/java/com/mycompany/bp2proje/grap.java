package com.mycompany.bp2proje;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ayza
 */
public class grap extends JButton {

    public grap() {
        Dimension size = getPreferredSize();
        size.width = size.height = Math.max(size.height, size.width);
        setPreferredSize(size);
        setContentAreaFilled(false);
    }

    //changed color of button
    @Override
    public void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(new java.awt.Color(255, 102, 102));
        } else {
            g.setColor(getBackground());
        }
        g.fillOval(0, 0, getSize().width - 1, getSize().height - 1);
        super.paintComponents(g);
    }

    //drawed oval and adjusted the color of button.
    @Override
    public void paintBorder(Graphics g) {
        g.setColor(Color.WHITE);
        g.drawOval(0, 0, getSize().width - 1, getSize().height - 1);
    }
    Shape shape = null;

    //drawed 2D ellipse.
    @Override
    public boolean contains(int x, int y) {
        if (shape == null || !shape.getBounds().equals(getBounds())) {
            shape = new Ellipse2D.Float(0, 0, getSize().width - 1, getSize().height - 1);
        }
        return shape.contains(x, y);
    }
}
