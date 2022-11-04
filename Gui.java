import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Primitives.PrimitiveTypes;

public class Gui implements ActionListener {
    private JFrame frame = new JFrame();

    private JLabel mouse = new JLabel();
    private DrawingPanel panel = new DrawingPanel(mouse);

    private JToolBar toolbar = new JToolBar(JToolBar.HORIZONTAL);

    private JButton cube = new JButton("Cubo");

    public Gui(int width, int height, String title) {

        // configura o frame
        frame.setSize(width, height);
        frame.setTitle(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(200, 200);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        cube.addActionListener(this);

        toolbar.add(cube);

        frame.add(toolbar, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.add(mouse, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cube) panel.setPrimitiveType(PrimitiveTypes.CUBE);
    }
}
