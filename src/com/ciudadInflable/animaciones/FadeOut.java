/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ciudadInflable.animaciones;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.Timer;


/**
 *
 * @author Alejandro
 */
public class FadeOut extends JLabel {
        private static final float THRESHOLD = .1f;

    private final ImageIcon image;

    private float opacity = 1f;
    private Timer timer;

    public FadeOut(final ImageIcon image) throws IOException {
        this.image = image;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        final Graphics2D g2d = (Graphics2D) g;
        AlphaComposite composite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacity);

        g2d.setComposite(composite);
        g2d.drawImage(image.getImage(), 0, 0, null);
    }

    public void fadeOut() {
        timer = new Timer(50, event -> {
            opacity -= .1f;
            if(opacity < THRESHOLD) {
                timer.stop();
                opacity = 0;
            }
            repaint();
        });
        timer.start();
    }
}
