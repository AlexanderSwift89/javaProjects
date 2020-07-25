import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.*;

class PhoneContacts {
    public HashMap<String, List<Contact>> groups = new HashMap<>();

    public void addGroup(String group) {
        List<Contact> contacts = new ArrayList();
        groups.put(group, contacts);
    }

    public void addContact(String group, Contact contact) {
        List<Contact> contacts = new ArrayList();
        contacts = groups.get(group);
        contacts.add(contact);
        Collections.sort(contacts);
        groups.put(group, contacts);
    }
}