public class App {
    public static void main(String[] args) {
        Author authorGogol = new Author("Николай", "Гоголь");
        Author authorTolstoy = new Author("Лев", "Толстой");

        Book bookDeadSouls = new Book("Мертвые души", authorGogol, 2026);
        Book bookWarAndPeace = new Book("Война и мир", authorTolstoy, 1869);

        bookDeadSouls.setPublicationYear(1841);

        System.out.println("Автор: " + bookWarAndPeace.getAuthor().getFirstName() + " " + bookWarAndPeace.getAuthor().getLastName());
        System.out.println("Книга: " + bookWarAndPeace.getTitle());
        System.out.println("Год публикации: " + bookWarAndPeace.getPublicationYear());
        System.out.println();
        System.out.println("Автор: " + bookDeadSouls.getAuthor().getFirstName() + " " + bookDeadSouls.getAuthor().getLastName());
        System.out.println("Книга: " + bookDeadSouls.getTitle());
        System.out.println("Год публикации: " + bookDeadSouls.getPublicationYear());
    }
}
