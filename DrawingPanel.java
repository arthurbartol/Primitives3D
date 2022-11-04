import java.awt.Graphics;
import java.awt.event.*;

import javax.swing.JPanel;
import javax.swing.JLabel;

import Primitives.PrimitiveTypes;

public class DrawingPanel extends JPanel implements MouseListener, MouseMotionListener {
    private PrimitiveTypes type = PrimitiveTypes.NONE;

    private JLabel mouseLabel;
    
    public DrawingPanel(JLabel mouseLabel) {
        this.mouseLabel = mouseLabel;
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public void setPrimitiveType(PrimitiveTypes type) { this.type = type; }
    public PrimitiveTypes getPrimitiveType() { return this.type; }

    @Override
    public void mouseMoved(MouseEvent e) {
        mouseLabel.setText(" (" + e.getX() + "," + e.getY() + ") ");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Graphics g = getGraphics();

        switch (type) {
            case CUBE:
                // todo
                DrawPrimitives.drawCube(g);
                break;

            default:
                // NONE
        }
    }

    @Override public void mouseDragged(MouseEvent e) {}
    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}
}
