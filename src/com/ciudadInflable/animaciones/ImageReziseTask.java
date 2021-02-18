/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ciudadInflable.animaciones;

import java.awt.Component;
import java.awt.Dimension;
import java.util.Timer;
import java.util.TimerTask;
import java.util.function.BiPredicate;

/**
 *
 * @author Home
 */
class ImageResizeTask extends TimerTask {
        public static final int STEP_SIZE = -10;

        private final Component target;
        private final BiPredicate<Integer, Integer> cancelCondition;
        private final boolean increase;

        private int currentHeight;
        private int currentWidth;

        private Timer timer;
        private boolean isRunning;

        public ImageResizeTask(Component target, BiPredicate<Integer, Integer> cancelCondition, boolean increase, int currentWidth, int currentHeight) {
            this.target = target;
            this.cancelCondition = cancelCondition;
            this.increase = increase;
            this.currentWidth = currentWidth;
            this.currentHeight = currentHeight;

            timer = new Timer();
        }

        @Override
        public void run() {
            if (cancelCondition.test(currentWidth, currentHeight)) {
                timer.cancel();
                isRunning = false;
                return;
            }

            currentWidth += (increase ? -1 * STEP_SIZE : STEP_SIZE);
            currentHeight += (increase ? -1 * STEP_SIZE : STEP_SIZE);

            target.setPreferredSize(new Dimension(currentWidth, currentHeight));
            target.repaint();
            target.revalidate();
        }

        public void start() {
            timer = new Timer();
            isRunning = true;
            timer.scheduleAtFixedRate(this, 0, 25L);
        }

        public void stop() {
            if(isRunning) {
                timer.cancel();
                isRunning = false;
            }
        }

        public boolean isRunning() {
            return isRunning;
        }
    }
