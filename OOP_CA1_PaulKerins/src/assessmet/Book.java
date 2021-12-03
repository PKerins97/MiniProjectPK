package assessmet;

import javax.swing.*;
import java.util.Arrays;

public class Book {
    private String ISBN;
    private String title;
    private Author[] authors;
    private int numberCopies;


    public Book(String ISBN, String title, Author[] authors, int numberCopies) {
        setISBN(ISBN);
        setTitle(title);
        setAuthors(authors);
        setNumberCopies(numberCopies);
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public int getNumberCopies() {
        return numberCopies;
    }

    public void setNumberCopies(int numberCopies) {
        if(numberCopies<0)
            JOptionPane.showMessageDialog(null,"Number of copies must be positive!!!", "Bad Input",JOptionPane.ERROR_MESSAGE);
        else
        this.numberCopies = numberCopies;
    }

    @Override
    public String toString() {
        return
                " ISBN:" + ISBN + '\'' +
                " Title" + getTitle() + '\'' +
                " Authors=" + Arrays.toString(getAuthors()) +
                " Number Copies:" + getNumberCopies()
                ;
    }
}
