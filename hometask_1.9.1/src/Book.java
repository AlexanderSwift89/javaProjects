class Book {
    String title;
    Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Book() {
        this.title = "UNDEFINED";
        this.status = Status.UNDEFINED;
    }

    public Book(String title) {
        this.title = title;
        this.status = Status.AVAILABLE;
    }

    public Book(String title, Status status) {
        this.title = title;
        this.status = status;
    }
}