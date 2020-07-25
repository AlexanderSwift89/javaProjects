public class FromBorrowedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (book.status) {
            case BORROWED:
                System.out.println("Moving status to " + requestedStatus);
                switch (requestedStatus) {
                    case AVAILABLE:
                        book.setStatus(Status.AVAILABLE);
                        break;
                    case OVERDUE:
                        book.setStatus(Status.OVERDUE);
                        break;
                    case ARCHIEVED:
                        book.setStatus(Status.ARCHIEVED);
                        break;
                    case BORROWED:
                        System.out.println("Вы ввели текущий статус книги BORROWED, статус книги изменен не будет.");
                        break;
                }
                break;
            default:
                System.out.println("Неверный статус книги, статус книги должен быть BORROWED.");
        }
    }
}