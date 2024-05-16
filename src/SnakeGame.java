
import java.awt.EventQueue;
import javax.swing.JFrame;
//Main Snake class
public class SnakeGame extends JFrame {
    public static Board playBoard;
    public SnakeGame() {

        initUI();
    }

    public void initUI() {
        playBoard = new Board();
        add(playBoard);

        setResizable(false);
        pack();

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            JFrame ex = new SnakeGame();
            ex.setVisible(true);

        });
    }
}
