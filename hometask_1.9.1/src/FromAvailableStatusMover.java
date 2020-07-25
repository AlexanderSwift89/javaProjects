public class FromAvailableStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (book.status) {
            case AVAILABLE:
                System.out.println("Moving status to " + requestedStatus);
                switch (requestedStatus) {
                    case ARCHIEVED:
                        book.setStatus(Status.ARCHIEVED);
                        break;
                    case BORROWED:
                        book.setStatus(Status.BORROWED);
                        break;
                    case OVERDUE:
                        System.out.println("Перевод книги из статуса 'AVAILABLE' в статус 'OVERDUE' невозможен");
                        break;
                    case AVAILABLE:
                        System.out.println("Вы ввели текущий статус книги AVAILABLE");
                        break;
                }
                break;
            default:
                System.out.println("Неверный статус книги, статус книги должен быть AVAILABLE.");
                break;
        }
    }
}