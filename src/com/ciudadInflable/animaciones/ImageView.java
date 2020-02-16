/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ciudadInflable.animaciones;

/**
 *
 * @author Home
 */
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

public class ImageView extends JPanel {

    private Image image;

    private int minWidth;
    private int minHeight;

    private int maxWidth;
    private int maxHeight;

    private ImageResizeTask currentTask;

    public ImageView() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (currentTask != null && currentTask.isRunning()) {
                    currentTask.stop();
                }
                final Dimension prefDim = getPreferredSize();
                currentTask = new ImageResizeTask(ImageView.this,
                        (width, height) -> width >= maxWidth && height >= maxHeight, true, prefDim.width, prefDim.height);
                currentTask.start();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (currentTask != null && currentTask.isRunning()) {
                    currentTask.stop();
                }
                final Dimension prefDim = getPreferredSize();
                currentTask = new ImageResizeTask(ImageView.this,
                        (width, height) -> width <= minWidth && height <= minHeight, false, prefDim.width, prefDim.height);
                currentTask.start();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, getPreferredSize().width, getPreferredSize().height, null);
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void setScale(double scaleFactor) {
        if (image != null) {
            this.maxWidth = image.getWidth(null);
            this.maxHeight = image.getHeight(null);

            this.minWidth = (int) (maxWidth * scaleFactor);
            this.minHeight = (int) (maxHeight * scaleFactor);

            setPreferredSize(new Dimension(minWidth, minHeight));
        }
    }
}
