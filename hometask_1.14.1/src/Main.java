import java.util.Scanner;

/**
 * Java. Phonebook.
 *
 * @author Aleksandr Liapunov
 * @version 1.14.1 date April 21, 2020
 */

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputContactSplit = new String[2];
        PhoneContacts myPhoneContacts = new PhoneContacts();
        System.out.println("Введите название группы контактов:");
        while (true) {
            String nameGroup = scanner.nextLine();
            if (nameGroup.equals("нет") == true) {
                break;
            }
            myPhoneContacts.addGroup(nameGroup);
            System.out.println("Создать еще одну группу (введите название или введите нет)?");
        }
        while (true) {
            System.out.println("Создать контакт (введите наименование и его номер или введите нет)?");
            String inputContact = scanner.nextLine();
            if (inputContact.equals("нет") == true) {
                break;
            }
            inputContactSplit = inputContact.split(" ");
            Contact contact = new Contact(inputContactSplit[0], inputContactSplit[1]);
            System.out.println("Укажите группы контакта через пробел:");
            String groups = scanner.nextLine();
            for (String groupIn : groups.split(" ")) {
                if (myPhoneContacts.groups.containsKey(groupIn)) {
                    myPhoneContacts.addContact(groupIn, contact);
                } else {
                    System.out.println("Вы ввели группу которй не существует");
                }
            }
        }
        System.out.println("Группы в справочнике:");
        for (String groups : myPhoneContacts.groups.keySet()) {
            System.out.println(groups);
            for (Contact myContact : myPhoneContacts.groups.get(groups)) {
                System.out.println("    – " + "Имя: " + myContact.name + ", Телефон: " + myContact.phoneNumber);
            }
        }
    }
}
