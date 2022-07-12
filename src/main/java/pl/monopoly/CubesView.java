package pl.monopoly;

import javax.swing.*;
import java.awt.*;

public class CubesView {
    private Cubes cubes = new Cubes();
    private final ImageIcon imageIcon = new ImageIcon("src\\main\\java\\pl\\monopoly\\images\\cubeImage.png");
    private final int positionX = 480;
    private final int positionY = 480;
    private final int width = 100;
    private final int height = 100;

    // methods
    public void render(Graphics g) {

        g.drawImage(imageIcon.getImage(), positionX, positionY, 100, 100, null);
        g.drawImage(imageIcon.getImage(), positionX-60, positionY+60, 100, 100, null);

        if (cubes.getLastRoll() != 0) {
            g.drawString(String.valueOf(cubes.getLastRoll()), positionX + width + 10, positionY);
        }

    }

    public void roll() {

        cubes.rollTheDice();

    }

    // get/set
    public ImageIcon getImageIcon() {
        return imageIcon;
    }

    public Rectangle getBounds() { //todo retorn 2 recrangle, a nie 1

        Rectangle rectangle = new Rectangle(positionX, positionY, width, height);
        return rectangle;
    }

}