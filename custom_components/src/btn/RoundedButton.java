/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btn;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;

public class RoundedButton extends JButton {

    private Color backgroundColor;
    private Color hoverColor;
    private Color pressedColor;

    public RoundedButton() {
        super();
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setPreferredSize(new Dimension(100, 30));
        setFocusPainted(false);

        backgroundColor = new Color(240, 240, 240);
        hoverColor = new Color(220, 220, 220);
        pressedColor = new Color(200, 200, 200);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        if (getModel().isPressed()) {
            g2.setColor(pressedColor);
        } else if (getModel().isRollover()) {
            g2.setColor(hoverColor);
        } else {
            g2.setColor(backgroundColor);
        }

        int width = getWidth();
        int height = getHeight();
        int radius = Math.min(width, height);

        g2.fillRoundRect(0, 0, width, height, radius, radius);
        g2.dispose();

        super.paintComponent(g);
    }
}
