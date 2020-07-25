package Userslib;

import Libraryusers.*;

public class AdministratorAndLibrarian extends UserBasic implements Administrator, Librarian {
    private String name;

    public AdministratorAndLibrarian(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void findBook(Reader reader) {
        System.out.println("Администратор Сергей нашел книгу");
    }

    @Override
    public void giveBook(Reader reader) {
        System.out.println("Администратор Сергей выдал книгу");
    }

    @Override
    public void timeOverBook(Reader reader) {
        System.out.println("Администратор Сергей зафиксировал, что время возврата книги истекло");
    }

    @Override
    public void orderBook(Supplier supplier) {
        System.out.println("Библиотекарь Сергей заказал книги");
    }
}