import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, Set<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        if (phoneBook.containsKey(lastName)) {
            phoneBook.get(lastName).add(phoneNumber);
        } else {
            Set<String> phoneNumbers = new HashSet<>();
            phoneNumbers.add(phoneNumber);
            phoneBook.put(lastName, phoneNumbers);
        }
    }

    public Set<String> get(String lastName) {
        return phoneBook.get(lastName);
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Smith", "123456789");
        phoneBook.add("Johnson", "987654321");
        phoneBook.add("Smith", "555555555");

        System.out.println("Smith's phone numbers: " + phoneBook.get("Smith"));
        System.out.println("Johnson's phone numbers: " + phoneBook.get("Johnson"));
    }
}