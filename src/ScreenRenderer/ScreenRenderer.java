package ScreenRenderer;
import ScreenRenderer.Shapes.Shape;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

/**
 * This is a class
 * Created 2021-10-18
 *
 * @author Magnus Silverdal
 */

/**
 * A system for drawing pixelgraphics to the screen using native Java.
 * Created 2021-03-31
 *
 * @author Magnus Silverdal
 */
public class ScreenRenderer extends Canvas {
    private int WIDTH;
    private int HEIGTH;
    private int scale;

    private BufferedImage image;
    private Screen screen;

    public ScreenRenderer(int width, int height, int scale) {
        // Screen data
        this.WIDTH = width;
        this.HEIGTH = height;
        this.scale = scale;
        image = new BufferedImage(WIDTH/scale, HEIGTH/scale, BufferedImage.TYPE_INT_RGB);
        screen = new Screen(((DataBufferInt) image.getRaster().getDataBuffer()).getData(),image.getWidth(),
                image.getHeight());
        setPreferredSize(new Dimension(WIDTH, HEIGTH));
    }

    public void render() {
        BufferStrategy bs = getBufferStrategy();
        if (bs == null) {
            createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();
        g.drawImage(image, 0, 0, WIDTH, HEIGTH, null);
        g.dispose();
        bs.show();
    }

    public Screen getScreen() {
        return screen;
    }

    public void draw(Shape[] shapes) {

    }
}