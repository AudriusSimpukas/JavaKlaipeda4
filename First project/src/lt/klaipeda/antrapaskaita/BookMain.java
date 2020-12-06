package lt.klaipeda.antrapaskaita;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();

        book1.setAuthor("First Author");
        book2.setAuthor("Second Author");

        System.out.println(book1.getAuthor() == book2.getAuthor());

        Book book3 = new Book(52);
        System.out.println(book1.getPages() == book2.getPages());

        Book book4 = new Book("Author", "Name", 52);
        System.out.println(book4.getAuthor());
        System.out.println(book4.getPages() == book1.getPages());
    }


}
