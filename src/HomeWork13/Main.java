package HomeWork13;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Дмитрий ", "Рус");
        Book book = new Book("Играть чтобы жить ", author, 2013);
        System.out.println("Книга: " + book.getPublisher());
        System.out.println("Автор: " + author);
        System.out.println("год издания: " + book.getPublicationYear());
        System.out.println(book);
        System.out.println(book.hashCode());

        Book.delimiter();

        Author author1 = new Author("Анджей ", "Ясинский");
        Book book1 = new Book("НИК", author1,  2009);
        System.out.println("Книга: " + book1.getPublisher());
        System.out.println("Автор: " + author1);
        System.out.println("Год издания: " + book1.getPublicationYear());
        System.out.println(book1);
        System.out.println(book1.hashCode());

        Book.delimiter();

        Author author2 = new Author("Дмитрий ", "Рус");
        Book book2 = new Book("Играть чтобы жить ", author2, 2014);
        System.out.println(book2 + " 'вторая часть'");
        System.out.println(book2.hashCode());

        Book.delimiter();

        System.out.println("Проверяем работу метода сравнения: ");
        System.out.println("Одинакова ли первая книга с третьей: " + book2.equals(book));
    }
}
