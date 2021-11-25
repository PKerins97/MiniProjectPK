
import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class CarRentalApp extends JFrame implements ActionListener {

    private static JButton button;
    private static JButton loginButton;
    private static JLabel passwordLabel;
    private static JLabel userLabel;
    private static JLabel success;
    private static JPasswordField passwordText;
    private static  JTextField userText;
    //JLabel displayField;
    //ImageIcon image;

 public  CarRentalApp(){


        JFrame frame = new JFrame("Menu");
        frame.setVisible(true);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        /*JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);

        JMenu car = new JMenu("Car");
        menubar.add(car);
        JMenuItem addCar = new JMenuItem("Add Car");
        JMenuItem updateCar = new JMenuItem("Update Car");
        car.add(addCar);
        car.add(updateCar);


        JMenu rental = new JMenu("Rent");
        menubar.add(rental);
        JMenuItem makeRes = new JMenuItem("Make Reservation");
        rental.add(makeRes);*/

    JPanel panel = new JPanel();
    frame.add(panel);
    loginButton = new JButton("Login");
    loginButton.setBackground(Color.cyan);
    panel.add(loginButton);
    loginButton.addActionListener(new loginAction());


   /* try{
        image = new ImageIcon(getClass().getResource("logo.png"));
        displayField = new JLabel(image);
        frame.add(displayField);
    }
    catch(Exception e){
        System.out.println("Image cannot be found!");
    }*/

}

    @Override
    public void actionPerformed(ActionEvent e) {

    }


    static class loginAction implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        JFrame loginFrame = new JFrame("Login ");

        loginFrame.setSize(300, 300);


        JPanel panel = new JPanel();
        loginFrame.add(panel);
        userLabel = new JLabel("UserName");
        userLabel.setBounds(10, 50, 80, 25);
        panel.add(userLabel);
        userText = new JTextField(20);
        userText.setBounds(100, 50, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        userLabel.setBounds(10, 80, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);


        button = new JButton("Login");
        button.setBounds(100, 80, 80, 25);
        button.addActionListener(new LoggingIn());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        loginFrame.setVisible(true);
    }

        class LoggingIn implements ActionListener {

            public void actionPerformed(ActionEvent e) {

                String user = userText.getText();
                String password = passwordText.getText();

                if(user.equals("user")&& password.equals("password")){
                    success.setText("Login successful!!");
                }
                else {
                    success.setText("Invalid username or password. Try Again!!");
                }

            }
        }

    }


    public static void main(String[] args) {new CarRentalApp();}



}
