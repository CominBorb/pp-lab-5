import company.beans.Person;
import company.exception.InvalidAgeException;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Maciek", 40);

            System.out.println("Imię: " + person.getName());
            System.out.println("Wiek: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
