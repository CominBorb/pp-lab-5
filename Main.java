import company.utils.*;

import company.exception.*;

import company.implementations.*;

import company.beans.*;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];

        final int b = 10;

        try {
            people[0] = new Person("Maciek Mastowski", 30);
            people[1] = new Person("Jan Kraszewski", 25);
            people[2] = new Person("Kacper Barka", 40);
            people[3] = new Person("Tymek Temorek", 34);
            people[4] = new Person("Michał Dżordan", 28);

            for (Person person : people) {
                int age = person.getAge();
                int value = MathUtils.add(age, b);

                String message = "Pan/Pani " + person.getName() + " ma " + value + " lat";

                EmailMessenger emailMessenger = new EmailMessenger();
                emailMessenger.sendMessage(message);
            }
        } catch (InvalidAgeException e) {
            System.out.println("Blad " + e.getMessage());
        }
    }
}