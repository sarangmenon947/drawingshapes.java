import javax.swing.*;
import java.awt.*;

public class drawingshapes extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw A Rectangle
        g.setColor(Color.BLUE);
        g.fillRect(50, 50, 100, 50); // x, y, width, height

        // Draw An Oval
        g.setColor(Color.RED);
        g.fillOval(200, 50, 100, 50); // x, y, width, height

        // Draw A Line
        g.setColor(Color.GREEN);
        g.drawLine(50, 150, 250, 150); // x1, y1, x2, y2

        // Draw A Triangle
        g.setColor(Color.MAGENTA);
        int[] xPoints = {150, 100, 200}; // x coordinates of the triangle vertices
        int[] yPoints = {200, 300, 300}; // y coordinates of the triangle vertices
        g.fillPolygon(xPoints, yPoints, 3); // draw filled triangle
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shape Drawer");
        drawingshapes panel = new drawingshapes();

        frame.add(panel);
        frame.setSize(400, 400); // Set the size of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
