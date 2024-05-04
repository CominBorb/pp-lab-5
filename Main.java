import company.utils.MathUtils;

import company.implementations.*;

public class Main {
    public static void main(String[] args) {
        int result = MathUtils.add(31, 22);
        
        System.out.println(result);
        
        EmailMessenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("Wynik dodawania = " + result);
    }
}