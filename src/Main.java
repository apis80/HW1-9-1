public class Main {
    public static void main(String[] args) {
       Author dostoyevsky = new Author( "Федоор", "Достоевский");
       Author puskkin = new Author("Александр", "Пушкин");
       Book book1 = new Book("Карамазовы", dostoyevsky, 1876);
       Book book2 = new Book("Boris Godunov", puskkin, 1836);
       book2.setYear(1950);
        System.out.println(book2.getName() + "," + book2.getAuthor()+ "," + book2.getYear());
        System.out.println(puskkin.equals(dostoyevsky));
        System.out.println(book1.equals(book2));

    }
}