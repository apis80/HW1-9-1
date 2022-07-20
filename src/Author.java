public class Author {
    private String firstName;
    private String secondName;
    public Author( String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String toString() {
    return this.firstName + this.secondName;
    }
    public int hashCode()
    {
        return this.firstName.hashCode() + this.secondName.hashCode();

    }
    public boolean equals(Object obj) {
        Author ob = (Author) obj;
        if (this == obj) return true;
        if (this.firstName == ob.firstName && this.secondName == ob.secondName && this.hashCode() ==ob.hashCode()) return  true;
        else return false;
    }

}
