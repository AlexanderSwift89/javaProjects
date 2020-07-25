public class FromArchievedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (book.status) {
            case ARCHIEVED:
                System.out.println("Moving status to " + requestedStatus);
                switch (requestedStatus) {
                    case AVAILABLE:
                        book.setStatus(Status.AVAILABLE);
                        break;
                    case OVERDUE:
                        System.out.println("Перевод книги из статуса 'ARCHIEVED' в статус 'OVERDUE' невозможен");
                        break;
                    case BORROWED:
                        System.out.println("Перевод книги из статуса 'ARCHIEVED' в статус 'BORROWED' невозможен");
                        break;
                    case ARCHIEVED:
                        System.out.println("Вы ввели текущий статус книги ARCHIEVED");
                        break;
                }
                break;
            default:
                System.out.println("Неверный статус книги, статус книги должен быть ARCHIEVED.");
        }
    }
}