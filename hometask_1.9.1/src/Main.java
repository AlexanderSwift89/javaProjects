/**
 * Java. Hierarchy “Statuses of books”.
 *
 * @author Aleksandr Liapunov
 * @version 1.9.1 date April 21, 2020
 */

class Main {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings");
        System.out.println("Книга - " + book.title + ". была переведена в следующие состояния (статусы).");

        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        BookMover fromBorrowedStatusMover = new FromBorrowedStatusMover();
        BookMover fromOverdueStatusMover = new FromOverdueStatusMover();
        BookMover fromArchievedStatusMover = new FromArchievedStatusMover();
        //проверка малой петли
        fromAvailableStatusMover.moveToStatus(book, Status.BORROWED);
        System.out.println(book.getStatus());
        fromBorrowedStatusMover.moveToStatus(book, Status.ARCHIEVED);
        System.out.println(book.getStatus());
        fromArchievedStatusMover.moveToStatus(book, Status.AVAILABLE);
        System.out.println(book.getStatus());
        //проверка большой петли
        fromAvailableStatusMover.moveToStatus(book, Status.BORROWED);
        System.out.println(book.getStatus());
        fromBorrowedStatusMover.moveToStatus(book, Status.OVERDUE);
        System.out.println(book.getStatus());
        fromOverdueStatusMover.moveToStatus(book, Status.AVAILABLE);
        System.out.println(book.getStatus());
        //проверка перехода из состояния AVAILABLE в ARCHIEVED, а также
        //попытка пройти по неправильным путям
        fromAvailableStatusMover.moveToStatus(book, Status.ARCHIEVED);
        System.out.println(book.getStatus());
        fromArchievedStatusMover.moveToStatus(book, Status.BORROWED);
        System.out.println(book.getStatus());
        fromArchievedStatusMover.moveToStatus(book, Status.OVERDUE);
        System.out.println(book.getStatus());
        fromArchievedStatusMover.moveToStatus(book, Status.AVAILABLE);
        System.out.println(book.getStatus());
        //проверка классов на обработку объекта (книги)
        //с неправильным (неподходщим) классом
        book.status = Status.ARCHIEVED;
        System.out.println("Статус книги на входе метода - " + book.getStatus());
        fromAvailableStatusMover.moveToStatus(book, Status.ARCHIEVED);
        book.status = Status.AVAILABLE;
        System.out.println("Статус книги на входе метода - " + book.getStatus());
        fromArchievedStatusMover.moveToStatus(book, Status.AVAILABLE);
        book.status = Status.BORROWED;
        System.out.println("Статус книги на входе метода - " + book.getStatus());
        fromOverdueStatusMover.moveToStatus(book, Status.AVAILABLE);
        book.status = Status.OVERDUE;
        System.out.println("Статус книги на входе метода - " + book.getStatus());
        fromBorrowedStatusMover.moveToStatus(book, Status.OVERDUE);
    }
}