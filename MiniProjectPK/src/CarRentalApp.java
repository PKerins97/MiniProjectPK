

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class CarRentalApp extends JFrame implements ActionListener {

    private static JButton button;
    private static JButton loginButton;
    private static JLabel passwordLabel;
    private static JLabel label;
    private static JLabel welcomeLabel;
    private static JLabel success;
    private static JLabel imgLabel;
    private static JLabel background;
    private static JPasswordField passwordText;
    private static JTextField Text;
    private static JButton addButton;
    private static JButton displayButton;
    private static JButton carButton;
    private static JButton resButton;
    private static JButton deleteButton;
    private static JButton makeResButton;
    private static JButton cancelResButton;
    Container cPane = getContentPane();
    ImageIcon imgicon;

    //JLabel displayField;



    ArrayList<Car> cars = new ArrayList<>();
    private Car car;



    public CarRentalApp() {


        JFrame frame = new JFrame("Menu");
        setBounds(400, 100, 500, 500);
        frame.setSize(600, 400);
        setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.add(Box.createVerticalStrut(10));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        ImageIcon imgicon = new ImageIcon("logo.png");
        Container cPane = getContentPane();
        welcomeLabel = new JLabel("Welcome to the System");
        welcomeLabel.setFont(new Font("serif",3,20));
        welcomeLabel.setForeground(Color.RED);

        welcomeLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(welcomeLabel);
        panel.add(Box.createVerticalStrut(35));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        loginButton = new JButton("Login");
       loginButton.setPreferredSize(new Dimension(590, 100));

        loginButton.setLayout(new GridLayout(1,3));
        loginButton.setBackground(Color.cyan);
        loginButton.setForeground(Color.BLACK);
        panel.add(loginButton);
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        loginButton.addActionListener(new loginAction());



        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent p) {

        //here you can put the code to decide what will happen should the user click on the
        //"Car" or "Make Reservation" buttons

        //System.out.println("Pressed one of the buttons!"); //just a bit of test code
        if(p.getSource()== addButton){
            addCar();
        }
        else if(p.getSource()== displayButton){

            displayCar();
        }
        else if(p.getSource()== deleteButton){
            deleteCar();
        }




    }


    class loginAction implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            JFrame loginFrame = new JFrame("Login ");
            setBounds(400, 100, 500, 500);
            loginFrame.setSize(300, 300);
            setLayout(new FlowLayout());
            loginFrame.setLocationRelativeTo(null);


            JPanel panel = new JPanel();
            loginFrame.add(panel);
            label = new JLabel("UserName");
            label.setBounds(10, 50, 80, 25);
            panel.add(label);
            Text = new JTextField(20);
            Text.setBounds(100, 50, 165, 25);
            panel.add(Text);

            passwordLabel = new JLabel("Password");
            label.setBounds(10, 80, 80, 25);
            panel.add(passwordLabel);

            passwordText = new JPasswordField(20);
            passwordText.setBounds(100, 50, 165, 25);
            panel.add(passwordText);


            button = new JButton("Login");
            button.setBounds(100, 80, 80, 25);
            button.addActionListener(new LoggedIn());
            panel.add(button);

            success = new JLabel("");
            success.setBounds(10, 110, 300, 25);
            panel.add(success);

            loginFrame.setVisible(true);
        }
    }//end of class loginAction - closing } added by JB

    class LoggedIn implements ActionListener {


        public void actionPerformed(ActionEvent e) {

            String user = Text.getText();
            String password = passwordText.getText();

            if (user.equals("user") && password.equals("password")) {
                JFrame frame = new JFrame("Main Menu ");
                setBounds(400, 100, 500, 500);
                frame.setSize(700, 700);
                frame.setLocationRelativeTo(null);
                setLayout(new FlowLayout());
                JPanel panel = new JPanel();
                frame.add(panel);


                JButton carButton = new JButton("Cars");
                carButton.setBounds(100, 80, 80, 25);
                carButton.setBackground(Color.cyan);
                carButton.addActionListener(new CarMenu()); //JB modified original code here
                panel.add(carButton);


                JButton resButton = new JButton("Reservations");
                resButton.setBounds(100, 80, 80, 25);
                resButton.setBackground(Color.cyan);
                resButton.addActionListener(new ReservationMenu()); //JB modified original code here
                panel.add(resButton);

                frame.setVisible(true);
            } else {
                success.setText("Invalid username or password. Try Again!!");
            }

        }

        class CarMenu implements ActionListener {


            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Car Menu");
                setBounds(400, 100, 500, 500);
                frame.setSize(600, 400);
                frame.setLocationRelativeTo(null);
                setLayout(new FlowLayout());
                JPanel panel = new JPanel();
                frame.add(panel);

                JButton addButton = new JButton("Add Car");
                addButton.setBounds(100, 80, 80, 25);
                addButton.setBackground(Color.cyan);
                panel.add(addButton);
                addButton.addActionListener(this);


                displayButton = new JButton("Display Cars");
                displayButton.setBounds(100, 80, 80, 25);
                displayButton.setBackground(Color.cyan);
                panel.add(displayButton);
                displayButton.addActionListener(this);//JB modified original code here

                deleteButton = new JButton("Display Cars");
                deleteButton.setBounds(100, 80, 80, 25);
                deleteButton.setBackground(Color.cyan);
                panel.add(deleteButton);
                deleteButton.addActionListener(this);

                imgLabel = new JLabel();
                imgLabel.setIcon(new ImageIcon(getClass().getResource("logo.png")));
                panel.add(imgLabel);
                                                                                                    //image code
                                                                                                    //code gotten from sample project
                                                                                                    // Written by DJ Yeong
                                                                                                    //date - 2/12/21


                frame.setVisible(true);

            }

        }
        class ReservationMenu implements ActionListener {


            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Reservation Menu");
                setBounds(400, 100, 500, 500);
                frame.setSize(600, 400);
                frame.setLocationRelativeTo(null);
                setLayout(new FlowLayout());
                JPanel panel = new JPanel();
                frame.add(panel);

                makeResButton = new JButton("Make Reservation ");
                makeResButton.setBounds(100, 80, 80, 25);
                makeResButton.setBackground(Color.cyan);
                panel.add(makeResButton);
                makeResButton.addActionListener(this);

                cancelResButton= new JButton("Cancel Reservation ");
                cancelResButton.setBounds(100, 80, 80, 25);
                cancelResButton.setBackground(Color.cyan);
                panel.add(cancelResButton);
                cancelResButton.addActionListener(this);

                frame.setVisible(true);
            }
        }
        class MakingReservation implements ActionListener {


            public void actionPerformed(ActionEvent e) {



            }

        }

    }





    public static void main(String[] args) {
        new CarRentalApp();
    }
    public void addCar() {

        final String[] carsCategory = {"Sports", "Economy", "Premium"};
        String category;
        String make;
        String model;
        String resNumber;
        double price;

        category = (String) JOptionPane.showInputDialog(null, "Add Car", "Car", JOptionPane.QUESTION_MESSAGE, null, carsCategory, carsCategory[0]);

        make = JOptionPane.showInputDialog("Enter car Make");
        if(!make.matches("[a-zA-Z_]+")){
            JOptionPane.showMessageDialog(null,"Invalid Make entered. Must be only letters ","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        model = JOptionPane.showInputDialog("Enter car Model");
        if(!model.matches("[a-zA-Z_]+")){
            JOptionPane.showMessageDialog(null,"Invalid Model entered. Must be only letters ","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        resNumber = JOptionPane.showInputDialog("Enter car Registration Number");
        if(!resNumber.matches("[0-9]")){
            JOptionPane.showMessageDialog(null,"Invalid Registration Number Added","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        price = Double.parseDouble(JOptionPane.showInputDialog("Enter Car Price Per Day"));
        //validation that a price has been entered

        car = new Car(category, make, model, resNumber, price);
        cars.add(car);

        JOptionPane.showMessageDialog(null, "Car '" + make +" "+ model + "' added to the system");



    }

    public void displayCar() {
        JComboBox carCombo = new JComboBox();
        JTextArea output = new JTextArea();

        output.setText("Car Details:\n\n");

        if (cars.size() < 1) {
            JOptionPane.showMessageDialog(null, "No Cars have been added to the system yet.", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Iterator<Car> iterator = cars.iterator();

            while (iterator.hasNext()) {
                carCombo.addItem(iterator.next().getCarMake() + (iterator.next().getCarModel()));
            }
            JOptionPane.showMessageDialog(null, carCombo, "Select Car to view details", JOptionPane.PLAIN_MESSAGE);
            int selected = carCombo.getSelectedIndex();
            output.append(cars.get(selected).toString());

            JOptionPane.showMessageDialog(null, output, "Car Details", JOptionPane.PLAIN_MESSAGE);
        }

    }

    public void deleteCar() {

        JComboBox carList = new JComboBox();

        for (Car c : cars) {
            carList.addItem((c.getCarMake() + c.getCarModel()));
        }
        JOptionPane.showMessageDialog(null, "Select car to be removed", "Remove Car", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, carList, "Remove Car", JOptionPane.INFORMATION_MESSAGE);

        int selected = carList.getSelectedIndex();

        cars.remove(selected);

        JOptionPane.showMessageDialog(null, "Car Removed", "Removed", JOptionPane.INFORMATION_MESSAGE);

    }





}

//closing } removed here by JB
