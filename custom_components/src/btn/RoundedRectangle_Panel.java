/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btn;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class RoundedRectangle_Panel extends JPanel {

    private Color backgroundColor;
    private Color borderColor;

    public RoundedRectangle_Panel() {
        super();
        setOpaque(false);

        backgroundColor = new Color(240, 240, 240);
        borderColor = new Color(200, 200, 200);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(backgroundColor);
        g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 10, 10);

        g2.setColor(borderColor);
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 10, 10);

        g2.dispose();

        super.paintComponent(g);
    }
}
