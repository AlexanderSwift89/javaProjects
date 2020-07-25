/**
 * Java. Online reader.
 *
 * @author Aleksandr Liapunov
 * @version 1.00 date April 19, 2020
 */

class Main {
    public static void main(String[] args) {
        Book Book1 = new Book("Толстой Лев Николаевич", "АСТ", 2019, 1360);
        Book Book2 = new Book("Грибоедов Александр Сергеевич", "Эксмо", 2020, 160);
        Book Book3 = new Book("Достоевский Федор Михайлович", "Азбука", 2020, 608);
        Book1.printAtributes();
        Book2.printToString();
        Book3.setAuthor("Пелевеин Виктор Олегович");
        Book3.printAtributes();
        equalsOfPages(Book1.numOfPages, Book2.numOfPages);
    }

    public static void equalsOfPages(int numOfPages1, int numOfPages2) {
        if (numOfPages1 > numOfPages2) {
            System.out.println("Страниц в первой книге больше чем во второй.");
            System.out.println("--------------------------------------------------");
        } else if (numOfPages1 < numOfPages2) {
            System.out.println("Страниц во второй книге больше чем в первой.");
            System.out.println("--------------------------------------------------");
        } else {
            System.out.println("Количество страниц в обоих книгах равно.");
            System.out.println("--------------------------------------------------");
        }
    }
}