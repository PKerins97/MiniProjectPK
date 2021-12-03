package exercise1;

public class Book {
    private String title;
    private double price;
    private String ISBN;
    private int pages;


    public Book() {
        this ( "Not available",0,"Not available",0);
    }

    public Book(String title, double price, String ISBN, int pages) {
        setTitle(title);
        setPrice(price);
        setISBN(ISBN);
        setPages(pages);

    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getPages() {
        return pages;
    }

    //sets the title to be no valid title if its left empty
    public void setTitle(String title) {
        if(title == null || title.equals(""))
            this.title = "No Valid Title Supplied";
        else
            this.title = title;
    }
    //sets price to not be able to be less than 0 or more the 50k
    public void setPrice(double price) {
        if(price<0 || price>50000)
            this.price = 0;
        else
            this.price = price;
    }
    //sets isbn to be null if nothing is entered
    public void setISBN (String ISBN) {
        if(ISBN == null || ISBN.equals(""))
            this.ISBN = "No Valid ISBN Supplied";
        else
            this.ISBN = ISBN;
    }
    //sets pages to have to be greater than 0 and less than 4000
    public void setPages(int pages) {
        if(pages<0 || pages>4000)
            this.pages = 0;
        else
            this.pages = pages;
    }
    public String toString() {
        return  "Title: " + getTitle() + "   Price: " + getPrice() + "   ISBN: " + getISBN() +
                "   Pages: " + getPages();
    }
}


