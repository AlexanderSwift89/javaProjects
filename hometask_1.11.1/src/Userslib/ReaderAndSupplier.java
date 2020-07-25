package Userslib;

import Libraryusers.*;

public class ReaderAndSupplier extends UserBasic implements Reader, Supplier {
    private String name;

    public ReaderAndSupplier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void takeBook(Administrator administrator) {
        System.out.println("Читатель Александр взял книгу");
    }

    @Override
    public void returnBook(Administrator administrator) {
        System.out.println("Читатель Александр вернул книгу");
    }

    @Override
    public void bringBook(Librarian librarian) {
        System.out.println("Поставщик книг Александр доставил книги");
    }
}