package assessmet;

public class Library {
    private String name;
    private String address;
    private String librarian;
    private int numberEmployees;
    private Book[] books;


    public Library(String name, String address, String librarian, int numberEmployees, Book[] books) {
        setName(name);
        setAddress(address);
        setLibrarian(librarian);
        setNumberEmployees(numberEmployees);
        setBooks(books);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLibrarian() {
        return librarian;
    }

    public void setLibrarian(String librarian) {
        this.librarian = librarian;
    }

    public int getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(int numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
    
    public int getBookCount(int bookCount){
        int bookcount =0;
        /*for(int i =0;i<=bookcount;i++);
            if (bookcount == null || bookcount <0);
                else

        return bookcount;*/
        return bookcount;
    }

    public Book findBook(String Book[]){

        return null;
    }

    public void addBook(){

    }
    

    @Override
    public String toString() {
        return
                "Name: " + getName() +
                " Address:" + getAddress() +
                "  Librarian: " + getLibrarian() +
                "  NumberEmployees: " + getNumberEmployees() +
                "  Books" + getBooks() ;
    }
}
