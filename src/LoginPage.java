import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {
    private final  JFrame frame = new JFrame();
    private final JButton loginButton = new JButton("Login");
    private final JButton resetButton = new JButton("Reset");
    private final JTextField userIDField = new JFormattedTextField();
    private final JPasswordField userPasswordField  = new JPasswordField();
    private final JLabel userIdLabel = new JLabel("UserId:");
    private final JLabel userPassLabel = new JLabel("Password:");
    private final JLabel messageLabel = new JLabel();
    private HashMap<String,String> login;
    public LoginPage(HashMap<String, String> login) {
        this.login = login;

        userIdLabel.setBounds(50,100,75,25);
        userPassLabel.setBounds(50,150,75,25);

        messageLabel.setBounds(125,250,250,35);
        messageLabel.setFont(new Font(null,Font.ITALIC,25));

        userIDField.setBounds(125,100,200,25);
        userPasswordField.setBounds(125,150,200,25);

        loginButton.setBounds(125,200,100,25);
        loginButton.addActionListener(this);

        resetButton.setBounds(225,200,100,25);
        resetButton.addActionListener(this);

        frame.add(userIdLabel);
        frame.add(userPassLabel);
        frame.add(messageLabel);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==resetButton){
            userIDField.setText("");
            userPasswordField.setText("");
        }

        if(e.getSource()==loginButton){
            String userId = userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            if(login.containsKey(userId)){
                if(login.get(userId).equals(password)){
                    messageLabel.setForeground(Color.GREEN);
                    messageLabel.setText("Login successful!");
                    frame.dispose();
                    WelcomePage welcomePage= new WelcomePage(userId);

                }else{
                    messageLabel.setForeground(Color.RED);
                    messageLabel.setText("Login attempt was not successful!! Please try again  with another password...");
                }

            }else{
                messageLabel.setForeground(Color.RED);
                messageLabel.setText("Username not found !");
            }
        }
    }
}
