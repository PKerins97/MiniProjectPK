
import javax.swing.*;
import java.awt.Event.*;
import java.util.*;

public class CarRentalApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu");
        frame.setVisible(true);
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menubar = new JMenuBar();
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
        rental.add(makeRes);


        ArrayList<Car> cars = new ArrayList<>();

    }
}
