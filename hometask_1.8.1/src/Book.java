class Book {
    String author;
    String publisher;
    int publisYear;
    int numOfPages;

    public void printAtributes() {
        System.out.println("Имя автора книги - " + this.author);
        System.out.println("Название издательства - " + this.publisher);
        System.out.println("Год издетельства - " + this.publisYear + " год");
        System.out.println("Количество страниц - " + this.numOfPages + " стр.");
        System.out.println("--------------------------------------------------");
    }

    public void printToString() {
        System.out.println("Имя автора книги - " + this.author + "; Название издательства - " + this.publisher + "; Год издетельства - " + this.publisYear + " год" + "; Количество страниц - " + this.numOfPages + " стр.");
        System.out.println("--------------------------------------------------");
    }

    void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public Book(String author, String publisher, int publisYear, int numOfPages) {
        this.author = author;
        this.publisher = publisher;
        this.publisYear = publisYear;
        this.numOfPages = numOfPages;
    }
}