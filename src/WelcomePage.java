import javax.swing.*;
import java.awt.*;

public class WelcomePage {
    private final JFrame frame = new JFrame();
    private final JLabel welcomeLabel = new JLabel("Welcome !");
    private final JLabel additionalTextLabel = new JLabel();


    public WelcomePage(String userId) {
        welcomeLabel.setBounds(50,50,200,35);
        welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
        additionalTextLabel.setBounds(50, 90, 300, 20);  // Adjusted bounds for additionalTextLabel
        additionalTextLabel.setFont(new Font(null, Font.ITALIC, 25));

        additionalTextLabel.setText("Hallo "+ userId + "!");

        frame.add(additionalTextLabel);
        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(420, 300);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
