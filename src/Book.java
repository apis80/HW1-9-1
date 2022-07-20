public class Book {
    private String name;
    private Author author;
    private int year;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public int hashCode()
    {
        return this.name.hashCode() + this.author.hashCode();

    }
    public boolean equals(Object obj) {
        Book ob = (Book) obj;
        if (this == obj) return true;
        if (this.hashCode() == ob.hashCode() && this.year == ob.year) return  true;
        else return false;
    }
}

