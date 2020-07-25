public class FromOverdueStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (book.status) {
            case OVERDUE:
                System.out.println("Moving status to " + requestedStatus);
                switch (requestedStatus) {
                    case AVAILABLE:
                        book.setStatus(Status.AVAILABLE);
                        break;
                    case ARCHIEVED:
                        book.setStatus(Status.ARCHIEVED);
                        break;
                    case BORROWED:
                        System.out.println("Перевод книги из статуса 'OVERDUE' в статус 'BORROWED' невозможен");
                        break;
                    case OVERDUE:
                        System.out.println("Вы ввели текущий статус книги OVERDUE");
                        break;
                }
                break;
            default:
                System.out.println("Неверный статус книги, статус книги должен быть OVERDUE.");
                break;
        }
    }
}