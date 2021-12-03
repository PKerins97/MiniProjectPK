package problemsolvingweek8.exercisea;

//RestaurantApp.java
/*Written by DJ Yeong in 2016 for his Java mini-project and modified by JB in 2020
  for use as a demonstration of a partial project implementation. Much code has been
  removed, but very little code has been modified*/


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.TitledBorder;
import java.io.*;
import java.util.*;

public class RestaurantApp extends JFrame implements ActionListener {

    //JB observation - these attributes of the class should be private really - always use private unless
    //there is a good reason not to - especially in the case of attributes

    JMenu staffMenu;
    JMenu dishMenu;
    JMenu salesMenu;
    JLabel imgLabel;
    JLabel welcomeLabel;
    JPanel buttonC;
    JPanel wlcPanel;
    JButton staffButton;
    JButton dishButton;
    JButton salesButton;

    TitledBorder titledBorder;
    ArrayList<Cuisine> cuisines = new ArrayList<>();
    private Cuisine cuisine;


    public RestaurantApp() {

        setTitle("DJs Restaurant System");
        setSize(400, 310);
        setLocationRelativeTo(null);
        setResizable(false);

        setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());

        Container cPane = getContentPane();
        setLayout(new FlowLayout());

        createFileMenu(); //code removed by JB as it was flawed design-wise
        createStaffMenu(); //code for associated menu-items removed by JB
        createDishMenu();
        createSalesMenu(); //code for associated menu-items removed by JB

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.setBackground(Color.LIGHT_GRAY);

        //addition of file menu removed by JB completely fdr design reasons
        menuBar.add(staffMenu);
        menuBar.add(dishMenu);
        menuBar.add(salesMenu);

        wlcPanel = new JPanel();
        wlcPanel.add(Box.createVerticalStrut(10));
        wlcPanel.setLayout(new BoxLayout(wlcPanel, BoxLayout.Y_AXIS));

        welcomeLabel = new JLabel("Welcome to the System");
        welcomeLabel.setFont(new Font("serif",3,20));
        welcomeLabel.setForeground(Color.BLUE);

        welcomeLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        wlcPanel.add(welcomeLabel);
        wlcPanel.add(Box.createVerticalStrut(35));

        //add images
        /*******************************************************************
         *Title: How to center a JFrame on screen
         *Author: MadProgrammer
         *Site owner/sponsor: stackoverflow.com
         *Date: Mar 4 2014
         *Code Version: Jul 13 2015
         *Availability: http://stackoverflow.com/questions/22162398/how-to-set-a-background-picture-in-jpanel (Accessed: 16/11/2016)
         *Modified: Code refactored
         *******************************************************************/


        try {
            imgLabel = new JLabel();
            imgLabel.setIcon(new ImageIcon(getClass().getResource("panda.png")));

            imgLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            wlcPanel.add(imgLabel);
        }
        catch(Exception ex) {

            JOptionPane.showMessageDialog(null,"Invalid Image File in Main Screen");
        }

        wlcPanel.add(Box.createVerticalStrut(30));

        /*******************************************************************
         *Title: How to use Borders
         *Author: Oracle
         *Site owner/sponsor: docs.oracle.com
         *Date: -
         *Code Version: -
         *Availability: https://docs.oracle.com/javase/tutorial/uiswing/components/border.html (Accessed: 16/11/2016)
         *Modified: References
         *******************************************************************/

        buttonC = new JPanel();

        titledBorder = new TitledBorder("Shortcut Button");
        titledBorder.setTitleColor(Color.RED);

        //buttonC.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY)); //commented out by JB

        buttonC.setPreferredSize(new Dimension(390, 50));
        buttonC.setBorder(titledBorder);
        buttonC.setLayout(new GridLayout(1,3));

        staffButton = new JButton("Register Staff");
        staffButton.addActionListener(this);
        buttonC.add(staffButton);

        dishButton = new JButton("Add Cuisine");
        dishButton.addActionListener(this);
        buttonC.add(dishButton);

        salesButton = new JButton("Add Sales");
        salesButton.addActionListener(this);
        buttonC.add(salesButton);

        add(wlcPanel);
        add(buttonC);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        open(); //added by JB to rectify design flaw in original version
    }


    public void createFileMenu() {
        //all code here removed by JB - flawed design-wise

        //anonymous inner class
        //code modified by JB here to use a WindowListener instead of the original ActionListener
        //that was attached to a menu item in a "File" menu - flawed design-wise

        addWindowListener(new WindowAdapter()  {
            @Override
            public void windowClosing(WindowEvent e) {
                int option = JOptionPane.showConfirmDialog(null,"Are you sure you want to exit?","Confirmation",JOptionPane.YES_NO_OPTION);

                if(option == JOptionPane.YES_OPTION) {
                    try {
                        save();
                        JOptionPane.showMessageDialog(null,"Data saved successfully","Saved",JOptionPane.INFORMATION_MESSAGE);
                    } catch (IOException e1) {
                        JOptionPane.showMessageDialog(null,"Not able to save the file");
                        e1.printStackTrace();
                    }

                    System.exit(0);
                }
            }
        });

    }

    public static void main(String[] args) {
        new RestaurantApp();
    }


    public void createStaffMenu() {
        JMenuItem item;

        staffMenu = new JMenu("Staff");
        staffMenu.setMnemonic(KeyEvent.VK_S);

        //JB removed Menu Items here
    }


    public void createDishMenu() {
        JMenuItem item;

        dishMenu = new JMenu("Cuisine");
        dishMenu.setMnemonic(KeyEvent.VK_C);

        item = new JMenuItem("Add Cuisine");
        item.setMnemonic(KeyEvent.VK_A);
        item.addActionListener(this);
        dishMenu.add(item);

        item = new JMenuItem("Delete Cuisine");
        item.setMnemonic(KeyEvent.VK_D);
        item.addActionListener(this);
        dishMenu.add(item);

        item = new JMenuItem("View Cuisine");
        item.setMnemonic(KeyEvent.VK_V);
        item.addActionListener(this);
        dishMenu.add(item);
    }


    public void createSalesMenu() {
        JMenuItem item;

        salesMenu = new JMenu("Sales");
        salesMenu.setMnemonic(KeyEvent.VK_L); //JB changed mnemonic here as it conflicts with the one for "Staff"

        //JB removed Menu Items here
    }

    /*******************************************************************
     *Title: Java Eclipse GUI Tutorial 23 # Show System Date and Time in JFrame ( Dynamic Clock )
     *Author: ProgrammingKnowledge
     *Site owner/sponsor: youtube.com
     *Date: Aug 1, 2014
     *Code Version: -
     *Availability: https://www.youtube.com/watch?v=tpQAslXjNKU (Accessed: 16/11/2016)
     *Modified: Code Refactored
     *******************************************************************/

    //JB removed all this dynamic clock functionality

    public void save() throws IOException {
        //JB removed code here which writes to a file containing staff data

        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("cuisines.dat"));
        os.writeObject(cuisines);
        os.close();

        //JB removed code here which writes to a file containing sales data

    }


    public void open() {
        try {
            //JB removed code here which reads a file containing staff data

            File file = new File("cuisines.dat"); //added by JB

            if(file.exists()) { //this if-else added by JB

                //the 3 lines below are DJ's
                ObjectInputStream is = new ObjectInputStream(new FileInputStream(file));
                cuisines = (ArrayList<Cuisine>) is.readObject();
                is.close();

                //JB removed code here which reads a file containing sales data

                JOptionPane.showMessageDialog(null, file.getName() + " file loaded into the system", "Open", JOptionPane.INFORMATION_MESSAGE);
            }
            else{ //This code added by JB
                file.createNewFile();
                JOptionPane.showMessageDialog(null, "File just created!!", "Created " + file.getName() + " file", JOptionPane.INFORMATION_MESSAGE);
            }
        } //these individual catch clauses added by JB, replacing a single "Exception" catch clause
        catch(ClassNotFoundException cce) {
            JOptionPane.showMessageDialog(null,"Class of object deserialised not a match for anything used in this application","Error",JOptionPane.ERROR_MESSAGE);
            cce.printStackTrace();
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null,"File not found","Error",JOptionPane.ERROR_MESSAGE);
            fnfe.printStackTrace();
        }
        catch (IOException ioe) {
            JOptionPane.showMessageDialog(null,"Problem reading from the file","Error",JOptionPane.ERROR_MESSAGE);
            ioe.printStackTrace();
        }
    }


    public void addStaff() {
        //JB removed code here

    }


    public void displayStaff() {
        //JB removed code here
    }


    public void deleteStaff() {
        //JB removed code here
    }


    public void addCuisine() {

        final String [] cuisineList = {"Irish","America","Malaysia","Thailand","Korea","Nyonya","Vietnam"}; //constant
        String category;
        String dish;
        String description;
        double price;

        category = (String) JOptionPane.showInputDialog(null,"Cuisine","Cuisine",JOptionPane.QUESTION_MESSAGE,null,cuisineList,cuisineList[0]);

        dish = JOptionPane.showInputDialog("Enter Dish's Name");
        description = JOptionPane.showInputDialog("Enter Dish's Description");

        //Validation code on price removed by JB

        price = Double.parseDouble(JOptionPane.showInputDialog("Enter Dish's Price"));

        //JB removed validation and exception-handling code here

        cuisine = new Cuisine(category,dish,description,price);
        cuisines.add(cuisine);

        JOptionPane.showMessageDialog(null,"Cuisine '" + dish + "' added to the system");
    }


    public void displayCuisine() {
        JComboBox cuisineCombo = new JComboBox();
        JTextArea output = new JTextArea();

        output.setText("Cuisine Details:\n\n");

        if(cuisines.size() < 1) {
            JOptionPane.showMessageDialog(null,"No cuisines are added to the system yet. Feel free to 'Add' new cuisines.","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else {
            Iterator<Cuisine> iterator = cuisines.iterator();

            while(iterator.hasNext()) {
                cuisineCombo.addItem(iterator.next().getDish() + "\n");
            }

            JOptionPane.showMessageDialog(null,cuisineCombo,"Select cuisine to view details",JOptionPane.PLAIN_MESSAGE);

            int selected = cuisineCombo.getSelectedIndex();
            output.append(cuisines.get(selected).toString());

            JOptionPane.showMessageDialog(null,output,"Cuisine Details",JOptionPane.PLAIN_MESSAGE);
        }
    }


    public void deleteCuisine() {

        JComboBox cuisineList = new JComboBox();

        for(Cuisine c : cuisines) {
            cuisineList.addItem(c.getDish());
        }

        JOptionPane.showMessageDialog(null,"Select cuisine to be removed","Remove Cuisine",JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,cuisineList,"Remove Cuisine",JOptionPane.INFORMATION_MESSAGE);

        int selected = cuisineList.getSelectedIndex();

        cuisines.remove(selected);

        JOptionPane.showMessageDialog(null,"Cuisine Removed","Removed",JOptionPane.INFORMATION_MESSAGE);
    }


    public void addSales() {
        //functionality removed by JB
    }

    public void viewSales() {
       //functionality removed by JB
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String menuName = e.getActionCommand();

        //JB observation - got away with the String comparisons using == here but really
        //should have used equals()

        if(menuName == "Register Staff" || e.getSource() == staffButton) {
            addStaff();
        }
        //Other staff functionality removed by JB

        //File functionality removed by JB - flawed design-wise

        else if (menuName == "Add Cuisine" || e.getSource() == dishButton) {
            addCuisine();
        } else if(menuName == "View Cuisine") {
            displayCuisine();
        } else if(menuName == "Delete Cuisine") {
            deleteCuisine();
        }
        //Sales functionality removed by JB
    }
}
