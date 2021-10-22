package exercise4;


import javax.swing.*;
import java.awt.*;

public class TestBook {
    public static void main(String[] args) {
        String title,ISBN,output ="";
        double price;
        int pages;

        JTextArea textArea = new JTextArea();
        Font font = new Font("monoscaped",Font.PLAIN,12);
        textArea.setFont(font);

        textArea.setText(String.format("%-25s%-9s%-15s%s","Title","Price","ISBN","Pages"));

        title = JOptionPane.showInputDialog("Please enter the title of your favourite book ");
        price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your favourite book"));

        ISBN= JOptionPane.showInputDialog("Please enter the ISBN of your favourite book");
        pages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages in your favourite book "));

        Book favouriteBook = new Book(title,price,ISBN,pages);

        output +=String.format("\n\n%-25s%-9s%-15s%s",favouriteBook.getTitle(),
                favouriteBook.getPrice(),favouriteBook.getISBN(),favouriteBook.getPages()
                );

        title = JOptionPane.showInputDialog("Please enter the title of your least book ");
        price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your least book"));

        ISBN= JOptionPane.showInputDialog("Please enter the ISBN of your least book");
        pages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages in your least book "));

        Book leastBook = new Book(title,price,ISBN,pages);

        output +=String.format("\n\n%-25s%-9s%-15s%s",leastBook.getTitle(),
                leastBook.getPrice(),leastBook.getISBN(),leastBook.getPages());
        textArea.append(output);

        JOptionPane.showMessageDialog(null,textArea,"Book Object Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
