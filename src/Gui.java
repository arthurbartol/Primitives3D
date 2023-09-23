import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame implements ActionListener {
    private JToolBar toolbar;
    private JButton cubeBt;
    private JLabel cursorPos;

    public Gui() {
        toolbar = new JToolBar(JToolBar.HORIZONTAL);
        cubeBt = new JButton("Cube");
        cursorPos = new JLabel();
    }

    public void create(int width, int height, String title) {
        // frame configuration
        super.setSize(width, height);
        super.setTitle(title);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setLayout(new BorderLayout());
        super.setVisible(true);

        // to the toolbar
        toolbar.add(cubeBt);

        // to the frame
        super.add(toolbar, BorderLayout.NORTH);
        super.add(cursorPos, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
