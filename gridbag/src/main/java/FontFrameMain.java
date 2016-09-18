import javax.swing.*;
import java.awt.*;

/**
 * Created by ScorpionOrange on 2016/09/16.
 */
public class FontFrameMain {
    public static void main(String[] agrs){
        EventQueue.invokeLater(() -> {
            JFrame frame = new FontFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Font Frame Main");
            frame.setSize(400, 300);
            frame.setVisible(true);
        });
    }
}
