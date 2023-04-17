package userInterface;

import javax.swing.*;
import java.awt.*;

public class JFrameTest {
    //1. Create the frame.

    //2. Optional: What happens when the frame closes?
    public void createFrame() {
//1. Create the frame.
        JFrame frame = new JFrame("FrameDemo");

//2. Optional: What happens when the frame closes?
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//3. Create components and put them in the frame.
//...create emptyLabel...

        JLabel emptyLabel = new JLabel("食べます");
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

//4. Size the frame.
        frame.pack();

//5. Show it.
        frame.setVisible(true);
    }
}