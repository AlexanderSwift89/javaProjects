import Userslib.*;
import Libraryusers.*;

/**
 * Java. Library.
 *
 * @author Aleksandr Liapunov
 * @version 1.11.1 date April 21, 2020
 */

public class Main {
    public static void main(String[] args) {
        ReaderAndSupplier userOne = new ReaderAndSupplier("Александр");
        AdministratorAndLibrarian userTwo = new AdministratorAndLibrarian("Сергей");

        ((Administrator) userTwo).findBook((Reader) userOne);
        ((Administrator) userTwo).giveBook((Reader) userOne);
        ((Reader) userOne).takeBook((Administrator) userTwo);
        ((Reader) userOne).returnBook((Administrator) userTwo);
        ((Administrator) userTwo).timeOverBook((Reader) userOne);
        ((Librarian) userTwo).orderBook((Supplier) userOne);
    }
}