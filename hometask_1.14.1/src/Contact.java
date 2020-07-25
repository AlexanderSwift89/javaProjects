import java.lang.Comparable;
import java.util.List;
import java.util.*;

public class Contact implements Comparable<Contact> {
    String name;
    String phoneNumber;
    private List list;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact contact = (Contact) o;
        return Objects.equals(getName(), contact.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public int compareTo(Contact o) {
        int result = this.name.compareTo(o.name);
        return result;
    }
}