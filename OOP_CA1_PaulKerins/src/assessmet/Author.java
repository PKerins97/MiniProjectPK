package assessmet;

public class Author {
    private static int authorID;
    private int authorNumber;
    private String firstname;
    private String surname;

    public Author(String firstname, String surname) {
        authorID++;
        setAuthorNumber();
        setFirstname(firstname);
        setSurname(surname);
    }


    public int getAuthorNumber() {
        return authorNumber;
    }

    public void setAuthorNumber() {
        this.authorNumber = authorID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return
                "Author Number " + getAuthorNumber() +'\'' +
                "  Firstname: " + getFirstname()+'\'' +
                " Surname: " + getSurname()
                ;
    }
}
