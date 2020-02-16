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
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageLoader {
    public static Image load(final String name) {
        try {
            return ImageIO.read(ImageLoader.class.getResourceAsStream("/com/ciudadInflable/image/" + name));
        } catch (IOException e) {
            System.err.println("No image with name " + name + " found.");
            return null;
        }
    }
}
