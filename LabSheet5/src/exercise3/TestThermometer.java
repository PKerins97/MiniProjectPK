package exercise3;

import javax.swing.*;
import java.awt.*;

public class TestThermometer {
    public static void main (String args[])
    {
        int temperature;
        String temperatureAsString;

        String text;

        text = "Calling the single-argument constructor....." +
                "setting the temperature of first thermometer to 35C";

        Thermometer firstThermometer = new Thermometer(35);

        text += "\nFirst Thermometer: \n" + firstThermometer;

        text += "\nCalling the no-argument constructor....." +
                "setting the temperature of second thermometer to 0C";

        Thermometer secondThermometer = new Thermometer();

        text += "\nSecond Thermometer: \n" + secondThermometer;

        text += "\nCalling setTemperature()....." +
                "setting the temperature of second thermometer to 25C";


        secondThermometer.setTemperature(25);

        text += "\nSecond Thermometer:\n" + secondThermometer;

        JOptionPane.showMessageDialog(null,"*****Thermometer Testing*****\n\n" + text,"",
                JOptionPane.INFORMATION_MESSAGE);


        temperatureAsString = JOptionPane.showInputDialog("Please enter the current " +
                "temperature of the first thermometer: ");

        temperature = Integer.parseInt(temperatureAsString);

        text = "Calling setTemperature()....." +
                "setting the temperature of first thermometer to " + temperature + "C";
        firstThermometer.setTemperature(temperature);

        text += "\nFirst Thermometer: \n"+ firstThermometer;

        JOptionPane.showMessageDialog(null,"*****Thermometer Testing*****\n\n" + text,"",
                JOptionPane.INFORMATION_MESSAGE);
    }
}


